package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=1212;
		int revNumber=0;
		int reminder=0;
		int temp=input;
		while(input!=0) {
			reminder=input%10;
			revNumber=revNumber*10+reminder;
			input=input/10;
		}
		if(revNumber==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
