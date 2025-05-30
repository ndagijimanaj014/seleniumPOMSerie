package seleniumsessions;

import java.util.Properties;

public class ProReadTest {

	public static void main(String[] args) {

		proRead propertiesread = new proRead();
		Properties pro = propertiesread.initProperties();
		String browser=pro.getProperty("BrowserName");
		String url=pro.getProperty("url");
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser( browser);
		br.launchurl(url);
		String title = br.getPageTitle();
		System.out.println(title);
		if (title.equals("HOME | thenextgenautomation")) {
			System.out.println("title is correct");

		} else {
			System.out.println("title is not correct");
		}
		String pageurl=br.getCurrentUrl();
		System.out.println(pageurl);
		if(pageurl.contains("thenextgen")) {
			System.out.println("pageurl is correct");
			
		} else {
			System.out.println("pageurl not correct");
		}
		
		br.quitBrowser();

	}

}
