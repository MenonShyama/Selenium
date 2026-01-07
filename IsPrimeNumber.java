package week1.day3;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=18;
		int flag=0;
		for(int i= 2;i<=input/2;i++) {
			if(input%i==0) {
				flag++;
				
			}
		}
		if(flag>1)
		{
			System.out.println("Given number is Not prime");
		}else {
			System.out.println("Given number is prime");
		}
		
	}

}
