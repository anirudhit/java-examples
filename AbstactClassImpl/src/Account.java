
public abstract class Account {
	
	public void openAccount() {
		System.out.println("Common account open");
	}
	
	public void closeAccount() {
		System.out.println("Common account close");
	}
	
	public abstract void calculateInterest();

}
