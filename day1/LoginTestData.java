package week3.day1;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter User name");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		LoginTestData ltg=new LoginTestData();
		ltg.enterCredentials();
		ltg.enterUsername();
		ltg.enterPassword();
	}

}
