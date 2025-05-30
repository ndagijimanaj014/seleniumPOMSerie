package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectorsVsXpath {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By register=By.cssSelector("input#input-firstname,input#input-lastname,input#input-email,input#input-telephone,input#input-password,input#input-confirm,input[name='newsletter'],input[name='agree'],.btn btn-primary");
		int RegisterAccount = driver.findElements(register).size();
		System.out.println(RegisterAccount);
		if(RegisterAccount==9) {
			System.out.println("the important Registered on account are available on page");
			
			
			
		}
		//CSS: Locator (Cascading Style Sheets)
		//1.id:#id e.g:#input-mail
		//HTMLTAG#ID e.g:input#input-email
		//2.class:.classname e.g:.form-control
		//HTMLTAG.CLASSNAME e.g:input.form-control
		//3.C1.C2.C3......CN e.g:.hidden-xs.hidden-sm.hidden-md
		//HTMLTAG.C1.C2.C3....CN eg:span.hidden-xs.hidden-md....FES
		//3.HTMLTAG#ID.CLASSNAME e.g:input#input-passwordf.form-control
		//4.ATTRIBUTE:e.g:input[id='input-email'].....CSS
		// HTMLTAG[ATTR1='VALUE'][ATTR2='VALUE'][ATTR3='VALUE']:e.g:input[name='eamil'][id='input-email']
		//input[id][name][class]
		//a[href]
		//input[name='email']#input-email]
		//input#input-email[name='email']
		//input#input-email[name='email'].form-control
		// 4.CONTAINS
		//input[id*4='password'].......CONTAINS
		//input[placeholder^='E-mail']..........STARTWITH
		//input[placeholder$='E-mail']..........ENDSWITH
		// TEXT IN CSS ....NOT AVAILABLE
		//5. PARENT TO CHILD
		//select#form-getform-country>option.....DIRECT
		//select#form-getform-country  option.....DIRECT+INDIRECT CHILD ELEMENT
		//form > div.form-group>label[for$='email']
		// CHILD TO PARENT/ANCESTOR?...NOT AVAILABLE :BACKWARD traversing in DOM is not allowed
		// 6 SIBLING IN CSS:
		//PRECEDING-SIBLING.....N/A
		//FOLLOWING- SIBLING.....YES
		//7. INDEXING IN CSS
		//HTMLTAG[ATTR='VALUE']+DIRECT SIBLING
		//option[selected='selected']+option
		//HTMLTAG[ATTR='VALUE']~IDIRECT SIBLING
		//option[selected='selected']~option[value="Albania"]
		//select#form-getform-country > option:first-child
		//select#form-getform-country > option:last-child
		//select#form-getform-country > option:nth-child(200)....START ON TOP
		//select#form-getform-country > option:nth-child(n).......All FROM TOP
		//select#form-getform-country > option:nth-last-child(3)
		//select#form-getform-country > option:nth-last-child(5)....START FROM BUTTON
		//select#form-getform-country > option:nth-child(odd)
		//select#form-getform-country > option:nth-child(even)
		//select#form-getform-country > option:nth-child(n+10).....START ON 10TH ELEMENT
		//select#form-getform-country > option:nth-child(4n)
		// NOT IN CSS: //input.form-control:not(input[name='search'])
		//input.form-control:not(input[name='search']):not(input#input-firatname)
		//      SYNTAX                 XPATH      VS CSS
		//1.  SYNTAX:                  medium         easy
		//2. PERFORMANCE               slow            faster
		//3. BACKWARD                  yes              no
		//4.  SIBLING                   yes (preceding and following)            yes: only following-sibling
		//5. TEXT()                     yes             no
		//6. INDEX                      yes              yes:better
		//7. ANCESTOR                    yes             no
		//8. STARTWITH                  yes              yes(^)
		//9.  ENDWITH                    no               yes($)
		//10. COMMA/UNION               yes(|)               yes(,)
		//11. AND                        yes               yes
		//12.  OR                       yes                 no
		//13. NOT                        yes                 yes
		//14. SVG                        yes                 no
		//15.  SHADOWDOM                  no                 yes
		
		
		

	}

}
