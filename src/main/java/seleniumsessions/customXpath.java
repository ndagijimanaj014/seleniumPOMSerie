package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXpath {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'By creating an account you will be able to shop faster,')]"));
//		System.out.println(element.getText());
		WebElement element = driver.findElement(By.xpath("(//a[@href])[last()]"));
		System.out.println(element.getText());
		WebElement element1 = driver.findElement(By.xpath("(//a[@href])[last()-5]"));
		System.out.println(element1.getText());
		WebElement element2 = driver.findElement(By.xpath("(//a[@href])[last()-1]"));
		System.out.println(element2.getText());
		WebElement element3 = driver.findElement(By.xpath("(//a[@href])[position()=70]"));
				System.out.println(element3.getText());
		driver.findElement(By.xpath(" //label[normalize-space()='No']")).click();
		driver.findElement(By.xpath(" //input[@name='agree']")).click();
		//XPATH:is the address of element HTMLDOM
		//1. ABSOLUTE XPATH:A.start with one single forward slash:/
		//                  B.start with HTMLNODE all the away to a child
		//        e.g: /html/body/div[2]/div/div/div[3]/form/div[1]/input
		//                  C. is not recommended cz if DEVELOPER make change on HTMLDOM can affected your code.
		// 2. RELATIVE XPATH OR CUSTOM XPATH:A.Start with double forward slash://
		//     FORMULA
		// xpath axes: 
		//    A. USING ATTRIBUTE IN XPATH:
		//     *//HTMLTAG[@ATTR='VALUE'];e.g://input[@name='email']
		//    * //input....14 FES
		//    * // input[@id]...6FES
		//    * //HTMLTAG[@ATTR1='VALUE'and @ATTR2='VALUE'];e.g://input[@name='firstname'and @id='email']
        //	  * //HTMLTAG[@ATTR1='VALUE'or @ATTR2='VALUE'];e.g://input[@name='firstname'or @id='email']   
        //   *//*[@attr='value'];e.g://[@name='email']
		//      B.TEXT IN XPATH
		//   *//HTMLTAG[TEXT()='VALUE'];e.g://a[text()='my account']
		//   C. CONTAINS IN XPATH
		//    CONTAINS WITH ATTRIBUTE
		//   *HTMLTAG[CONTAINS(@ATTR,'VALUE')];e.g://input[contains(@name,'email')]
		//   *HTLMTAG[CONTAINS(@ATTR1,'VALUE') AND CONTAINS(@ATTR2,'VALUE')];e.g://input[contains(@name,'lastname')and contains(@id,'email')]
		//    DYNAMIC ELEMENTS WITH DYNAMIC ATTRIBUTES
		//   D. CONTAINS WITH TEXT
		//   * HTMLTAG[CONTAINS(TEXT(),'VALUE')];e.g://label[contains(text(),'email')]
		//   E. STARTS-WITH()
		//   *HTMLTAG[STARTS-WITH(@ATTR,'VALUE)];e.g://input[starts-with(@placeholder,'firstname')]
		//                                          //a[starts-with(text(),'address')]
		//                                          //a[starts-with(text(),'R')]
		// END-WITH(NOT AVAILABLE
        //   F. LAST()
		//   *(//input[@id])[last()]
	    //   *(//input[@id])[last()-1]
	    //   *(//input[@id])[last()-2]
	    //   *(//input[@id])[last()-last()+1]
		//   G.INDEXING IN XPATH
		//    *//a[text()='forgetten password'])[2]
		//    *(//input[@class])[4]
		//   K. POSITION()
		//   *(//input[@id])[position()=1]
		//   *(//input[@id])[position()=last()-1]
		//  L.TEXT WITH SPACE
		//  label[normalize-space()='yes']
		
		
	}

}
