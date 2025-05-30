package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	 private WebDriver driver;
	 public ElementUtil(WebDriver driver) {
		 this.driver= driver;
		 
	 }

		
		  public WebElement getElement(By locator) { 
			  return driver.findElement(locator);
		  
		  }
		 
	public void dosendkeys(By locator, String value) {
		getElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		  driver.findElement(locator).click();
		
	}
	public void doClick(By locator, int timeout) {
		  driver.findElement(locator).click();
		
	}
	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
		
	}
	public String doAttributeValue(By locator,String value) {
		return driver.findElement(locator).getAttribute(value);
		
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	
	}
	public int getlinkscount(By locator) {
		return getElements(locator).size();
		
	}
	public int getimagescount(By locator) {
		return getElements(locator).size();
		
	}
	public List<String> getLinksText(By locator) {
		List<WebElement>linktext=getElements(locator);
		List<String>totallink=new ArrayList<String>();
		for(WebElement e:linktext) {
			String text=e.getText();
			if(text.length()!=0) {
				totallink.add(text);
			}
			
			
		}
		return totallink;
	}
	public void getAtributeImages(By locator,String AtributeName) {
		List<WebElement>imagelist=getElements(locator);
		for(WebElement e:imagelist) {
			String image=e.getAttribute(AtributeName);
			if(image!=null) {
				System.out.println(image);
			}
			
			
		}
	
	}
	public void doSelectByIndex(By locator,int index) {
		
		Select select= new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public void doSelectVisibleText(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public void doSelectValue(By locator,String value) {
		Select select= new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	public List<String> getDropDownOptionsList(By locator) {
		Select select= new Select(getElement(locator));
		List<WebElement>List=select.getOptions();
		List<String>dropdownlist=new ArrayList<String>();
		//new ArrayList<String>();
		for(WebElement e:List) {
			String list=e.getText();
			dropdownlist.add(list);
			
		}
		return dropdownlist;
		
	}
	public  void selectValueFromDropDown(By locator, String optionText) {
		
		Select select = new Select(getElement(locator));
		
		 List<WebElement> optionsList = select.getOptions();
		 
//		System.out.println(optionsList.size()); 233
		 
		 for(WebElement e : optionsList ) {
			 String text = e.getText();
			 if(text.equals(optionText.trim())) {
				 
				 e.click();
				 
				 break;
				 
			 }
		 }
	}
public  void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
List<WebElement> elements = driver.findElements(locator);
for(WebElement e:elements) {
	String text = e.getText();
	if(text.equals(optionText.trim())) {
		e.click();
		break;
		
	}
	
}
		
	
			
	}
public  void doSearch(By searchField,String searchkey,By suggestion,String value) {
	driver.findElement(searchField).sendKeys(searchkey);
	List<WebElement> suggestionList = driver.findElements(suggestion);
	for(WebElement e:suggestionList) {
		String text = e.getText().trim();
		System.out.println(text);
		if(suggestionList.equals(value)) {
			e.click();
			break;
			
		}
		
	}
	
	
}
public  boolean isElementDisplayed(By locator,int times) {
	int elementcount = driver.findElements(locator).size();
	if( elementcount==times) {
		System.out.println("single element is displayed"+locator);
		return true;
	} else {
		System.out.println("multiple or empty element is displayed"+locator);
		return false;
	}
}
public  boolean doIsDisplayed(By locator) {
	try {
	boolean flag = getElement(locator).isDisplayed();
	System.out.println("element with locator:"+locator+"is displayed");
	return true;
	}
	catch(NoSuchElementException e){
		System.out.println("element with locator:"+locator+"is not displayed");
		return false;
	}
	
	
	}
public  void doalertHandling(By locator) throws InterruptedException {
	driver.findElement(locator).click();
	Alert alert= driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	Thread.sleep(3000);
	alert.accept();
	//alert.dismiss();
	
}
public void doConfirmHandling(By locator) throws InterruptedException {
	driver.findElement(locator).click();
	Alert alert= driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	Thread.sleep(3000);
	alert.accept();
	//alert.dismiss();
	
}
public void doPromptHandling(By locator) throws InterruptedException {
	driver.findElement(locator).click();
	Alert alert= driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.sendKeys("Happy new Year");
	Thread.sleep(3000);
	alert.accept();
	//alert.dismiss();
	
}
//.......................... USING ACTIONS..................
public  void handleParentSubMenu(By parentLocator, By childLocator) {
	 Actions act= new Actions(driver);
	 act.moveToElement(getElement(parentLocator)).perform();//selenium4.x
	 getElement(childLocator).click();
}
public void doDragAndDrop(By sourcelocator,By targetlocator) {
	WebElement sourceEle=getElement(By.id("draggable"));
	WebElement targetEle=getElement(By.id("droppable"));
	Actions act= new Actions(driver);
	act.dragAndDrop(sourceEle, targetEle).perform();
}
public  void doRightClick(By locator,String value) {
	Actions act= new Actions(driver);
	act.contextClick(getElement(locator)).perform();
	List<WebElement> optionlist = getElements(By.cssSelector("ul.context-menu-list>li.context-menu-icon>span"));
     for(WebElement e:optionlist) {
    	 String text=e.getText();
    	 System.out.println(text);
    	 if(text.equals(value)) {
    		 e.click();
    		 break;
    		 
    	 }
    	 
     }
	
}
public  void doActionsSendkeys(By locator,String value) {
	Actions act= new Actions(driver);
	act.sendKeys(getElement(locator),value).perform();
}
public  void doActionsClick(By locator) {
	Actions act= new Actions(driver);
	act.click(getElement(locator)).perform();
}
public  void doActionsSendkeysWithPause(By locator,String value, long pausetime) {
	String searchkey= value;
	Actions act= new Actions(driver);
	char ch[]=searchkey.toCharArray();
	for(char e:ch) {
	//act.sendKeys(getElement(locator),e+"").pause(pausetime).perform();
	act.sendKeys(getElement(locator),String.valueOf(e)).pause(pausetime).perform();
		
	}
	
}
//**************************element wait******************************************
//An expectation for checking that an element is present on the DOM of a page.
//This does notnecessarily mean that the element is visible.
public   WebElement WaitForElementPresence(By locator,int timeout) { 
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
  
  }
//An expectation for checking that an element is present on 
//the DOM of a page and visible.Visibility means that the element is
//not only displayed but also has a height and width that isgreater than 0.
public   WebElement WaitForElementLocated(By locator,int timeout) { 
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  
}
//An expectation for checking an element is visible and enable such that you can click it.
//@param locator
//@param timeout
public List<WebElement>WaitForElementVisible1(By locator,int timeout) { 
	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	 try {
	return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	 }catch(Exception e) {
		 return List.of();//return empty ArrayList
	 }
 
}
public  void clickWhenReady(By locator, int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

}
// is page completly loaded
// @param timeout
public void isPageLoading(int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	String frag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'")).toString();//"true"
	if(Boolean.parseBoolean(frag)) {
		System.out.println("page is complete loaded");
	} else {
		System.out.println("page is not complete loaded");
	}
}
	public   String waitForTittleContains(String titleFraction,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		try{if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		
			
		}  catch(TimeoutException e) {
			System.out.println(" title is not correct");
		}
		return driver.getTitle();
	
}
	public   String waitForTittleToBe(String titlevalue,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		try{if(wait.until(ExpectedConditions.titleIs(titlevalue))) {
			return driver.getTitle();
		}
		
			
		}  catch(TimeoutException e) {
			System.out.println(" title is not correct");
		}
		return driver.getTitle();
	
}
public   String waitForUrlContains(String urlFraction,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	try {
	if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
	
		return driver.getCurrentUrl();	
	}
	}catch(TimeoutException e) {
		
	
	System.out.println(" url is not correct");
	

	} 
		
		return driver.getCurrentUrl();
	}
public   String waitForUrlToBe(String urlFraction,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	try {
	if(wait.until(ExpectedConditions.urlToBe(urlFraction))) {
	
		return driver.getCurrentUrl();	
	}
	}catch(TimeoutException e) {
		
	
	System.out.println(" url is not correct");
	

	} 
		
		return driver.getCurrentUrl();
	}
//*********************waitforAlert utils*****************************
public  Alert WaitForJSAlert(int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.alertIsPresent());

}
public   String getAlertText(int timeout) {
	Alert alert=WaitForJSAlert(timeout);
	String text=alert.getText();
	//System.out.println(text);
	alert.accept();
	return text;
}
public  void acceptAlert(int timeout) {
	WaitForJSAlert(timeout).accept();
}
public void dismissAlert(int timeout) {
	WaitForJSAlert(timeout).dismiss();
}
public void alertsSendKeys(int timeout, String value) {
	Alert alert=WaitForJSAlert(timeout);
	alert.sendKeys(value);
	alert.accept();
	//alert.dismiss();
	
}
//************Wait for frame***************************************
// AN expectation for checking whether the given frame is available to swuitch to
// if the frame is available it switches the given driver to the specified
//@param locator
//@param timeout
public  void WaitForFrameByLocator(By locator,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
}
public  void WaitForFrameByIndex(int frameindex,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
}
public void WaitForFrameByIdorName(String NameorId,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(NameorId));
}
public void WaitForFrameByWebElement(WebElement frameElement,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
}
//******************WaitWindow********************************************
public  void WaitForWindowToBe(int totalwindow,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.numberOfWindowsToBe(totalwindow));
	
}
//**********************fluentWait*********************************
//An expectation for checking that an element is present on the DOM of a page
//and visible.Visibility means that the element is not only displayed but 
//also has a height and width that isgreater than 0.
//@param locator
//@param timeout
//@param intervaltime
public  void WaitForElementVisible(By locator, int timeout, int intervaltime) {
	Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
             .withTimeout(Duration.ofSeconds( timeout))
             .pollingEvery(Duration.ofSeconds(intervaltime))
             .ignoring(NoSuchElementException.class)
             .withMessage("=== element not found==");
wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
             
}




}
	


