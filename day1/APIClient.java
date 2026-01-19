package week3.day1;
public class APIClient {
	
	public void sendRequest(String endpoint) {

		System.out.println("The sendRequest method with single argument"+"\n"+"The End Point is : "+ endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The sendRequest method with three argument"+"\n"+"The End Point is : "+ endpoint);
		System.out.println("The Request Body is : "+ requestBody);
		System.out.println("The Request Status is : "+ requestStatus);

	}

}
