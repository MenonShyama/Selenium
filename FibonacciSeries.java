package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int x=0;
		int y=1;
		int result=0;
		System.out.println(x+"\n"+y);
		for(int i=1;i<range;i++) {
			result=x+y;
			System.out.println(result);
			x=y;
			y=result;
		}

	}

}
