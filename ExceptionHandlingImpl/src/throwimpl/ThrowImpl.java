package throwimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("serial")
class NumCheckException extends Exception{
	public NumCheckException(String s) {
		super(s);
	}
}

public class ThrowImpl {
	public static void main(String args[]) {
		
		
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter i value: ");
		try {
			i = Integer.parseInt(br.readLine());
			if(i < 15) {
				throw new NumCheckException("Number less than 15.");
			}else {
				System.out.println("Entered number: "+i);
			}
		}
		catch (NumCheckException e) {
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
	}
}