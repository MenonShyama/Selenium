package week3.day1;
public class APIRequest {

	public static void main(String[] args) {
		APIClient ac=new APIClient();
		ac.sendRequest("www.google.com");
		ac.sendRequest("www.facebook.com", "{name: shyama}", true);

	} 

}
