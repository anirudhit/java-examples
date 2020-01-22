
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account	sa	=	new SavingsAccount();
		sa.openAccount();
		sa.calculateInterest();
		sa.closeAccount();
		
		Account	ca	=	new CurrentsAccount();
		ca.openAccount();
		ca.calculateInterest();
		ca.closeAccount();

	}

}
