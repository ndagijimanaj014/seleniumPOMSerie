package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	private WebDriver driver;
	 private JavascriptExecutor js;
	public JavaScriptUtil(WebDriver driver) {
		this.driver=driver;
		js= (JavascriptExecutor)this.driver;
	}
	public String getTitleByJs() {
		return js.executeScript("return document.title").toString();
		
	}
	public String getcurrentUrlByJs() {
		return js.executeScript("return document.URL").toString();
		
	}
	public void generateJsAlert(String msge) {
		js.executeScript("alert('"+msge+"')");
		try{ Thread.sleep(5000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		
	}
	public void generateJsConfirm(String msge) {
		js.executeScript("confirm('"+msge+"')");
		try{ Thread.sleep(5000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		
		
	}
	public void generateJsPrompt(String msge,String value) {
		js.executeScript("prompt('"+msge+"')");
		try{ Thread.sleep(5000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
		//alert.dismiss();
		
	}
	public void goBackWithJs() {
		js.executeScript("history.go(-1)");
	}
	public void goForwardWithJs() {
		js.executeScript("history.go(1)");
	}
	public void goRefleshWithJs() {
		js.executeScript("history.go(0)");
	}
	public String  getPageInnerText() {
		return js.executeScript("return document.documentElement.InnerText;").toString();
	}
	public void  ScrollMiddlePageDown() {
	js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}
	
	public void  ScrollPageDown() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		}
	public void  ScrollPageDown(String height) {
		js.executeScript("window.scrollTo(0,'"+height+"');");
		}
	public void  ScrollPageUp() {
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		}
	public void  ScrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
	
	public void zoomFirefoxChromeEdgeSafari(String zoompercentage) {
		String zoom= "document.body.style.zoom='"+zoompercentage+"%'";
		js.executeScript(zoom);
	}
	public void zoomFirefox(String zoompercentage) {
		String zoom= "document.body.style.MozTransform='Scale("+zoompercentage+")'";
		js.executeScript(zoom);
	}
	public void drawBorder(WebElement element) {
		js.executeScript("arguments(0).style.border='3px solid red'",element);
	}
//	public void flash(WebElement element) {
//		String bgcolor= element.getCssValue("backgroundcolor");//grey-white
//		for(int i=0;i<15;i++) {
//			changecolor=("rgb(0,200,0)",element);//green
//			changecolor(bgcolor,element);//greenwhile
//			
//		}
//	}
//	private void changecolor(String color,WebElement element) {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments(0).style.backgroundcolor='"+color+'",element);
//				try {
//				Thread.sleep(20);
//				} catcch(InterruptedException e){
//					
//				}
	
		
		//}
public void clickElementByJs(WebElement element) {
	js.executeScript("arguments(0).click();",element);
}
public void sendkeysUsingWithId(String id,String value) {
	js.executeScript("document.getElementById('"+id+"').value='"+"");
	//document.getElementById('"input-email"').value='tom@gmail.com";
}
	
	
	
	
	
	

}
