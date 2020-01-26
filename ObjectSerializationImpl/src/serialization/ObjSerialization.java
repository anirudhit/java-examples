package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjSerialization {

	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SaveObj obj = new SaveObj();
		obj.i = 4;
		System.out.println("obj: "+obj.toString());
		
		File f = new File("ObjData.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SaveObj obj1 =  (SaveObj)ois.readObject();
		System.out.println("obj1: "+obj1.toString());
		ois.close();
		
		
	}

}

class SaveObj implements Serializable{
	int i;

	@Override
	public String toString() {
		return "SaveObj [i=" + i + "]";
	}
	
}
