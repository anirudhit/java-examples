
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount	sa	=	new SavingsAccount();
		sa.openAccount();
		sa.calculateInterest();
		sa.closeAccount();
		
		CurrentsAccount	ca	=	new CurrentsAccount();
		ca.openAccount();
		ca.calculateInterest();
		ca.closeAccount();

	}

}
