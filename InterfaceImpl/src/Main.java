
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ca	=	new CurrentsAccount();
		Account sa	=	new SavingsAccount();
		
		ca.openAccount();
		ca.calculateInterest();
		ca.closeAccount();
		
		sa.openAccount();
		sa.calculateInterest();
		sa.closeAccount();
		
	}

}
