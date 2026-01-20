package week3.day2;

public interface Payments {
	
	
	public void cashOnDelivery();
	 public void upiPayments();
	public void cardPayments();
	void internetBanking();
	 public default void myBank() {
		 System.out.println("myBank");
		 
	 }
	 final int ss=10;
}
