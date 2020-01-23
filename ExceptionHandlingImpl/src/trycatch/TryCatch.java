package trycatch;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 8;
		int j = 0;
		
		try {
			int k = i/j;
			System.out.println(k);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Division by zero. "+e);
		}
	}

}
