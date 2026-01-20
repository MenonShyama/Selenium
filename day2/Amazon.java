package week3.day2;

public class Amazon implements Payments{

	public static void main(String[] args) {
		Amazon am=new Amazon();
		am.cashOnDelivery();
		am.upiPayments();
		am.cardPayments();
		am.internetBanking();
		System.out.println(am.ss);
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
		
	}

}
