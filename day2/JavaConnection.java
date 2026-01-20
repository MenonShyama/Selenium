package week3.day2;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}

	@Override
	void executeQuery() {
		
		System.out.println("Execute query");
	}

}
