package trycatchfinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {
	
	public static void main(String args[]) throws IOException {
		int i =10;
		int j, k;
		System.out.println("Enter j Value: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			j = Integer.parseInt(br.readLine());
			k = i/j;
			System.out.println(k);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		finally {
			br.close();
		}
	}

}
