package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingImpl {

	public static void main(String[] args) throws Exception{
		
		File file = new File("demo.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo content");
		dos.close();
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		String rf = dis.readUTF();
		System.out.println(rf);
		fis.close();
	}

}
