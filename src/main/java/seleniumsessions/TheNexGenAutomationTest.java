package seleniumsessions;

public class TheNexGenAutomationTest {

	public static void main(String[] args) {
		String BrowserName = "chromeDriver";
		String url = "https://www.TheNextGenAutomation.com";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(BrowserName);
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
