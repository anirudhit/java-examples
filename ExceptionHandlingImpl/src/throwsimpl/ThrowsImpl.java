package throwsimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsImpl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i = 8;
		System.out.println("Enter j value: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j = Integer.parseInt(br.readLine());
		
		int k = i/j;
		System.out.println(k);
	}

}
