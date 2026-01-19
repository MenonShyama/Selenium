package week3.day1;

public class Edge extends Browser  {
	public void takeSnap()  {
		System.out.println("Take Snap from edge class");
	}
	public void clearCookies() {
		System.out.println("Clear Cookies from edge class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge ed=new Edge();
		System.out.println(ed.browserName);
		System.out.println(ed.browserVersion);
		ed.openURL();
		ed.navigateBack();
		ed.takeSnap();
		ed.closeBrowser();
		ed.clearCookies();

	}

}
