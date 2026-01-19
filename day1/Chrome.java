package week3.day1;

public class Chrome extends Browser{
	 public void openIncognito() {
		 System.out.println("Open Incognito from Chrome class");
	 } 
	 public void clearCache() {
		 System.out.println("Clear Cache from Chrome class");
	 } 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ch=new Chrome();
		System.out.println(ch.browserName);
		System.out.println(ch.browserVersion);
		ch.openURL();
		ch.navigateBack();
		ch.clearCache();
		ch.closeBrowser();
		ch.openIncognito();
		

	}

}
