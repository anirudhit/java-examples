package xml.deserialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import xml.common.College;
import xml.common.Student;

public class DeSerializeXML {

	public static void main(String[] args) {
		File f = new File("collegeData.xml");
		try {
			XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream(f)));
			College c = (College) x.readObject();
			List<Student> s = c.getStudents();
			
			for(Student value: s) {
				System.out.println(value.toString());
			}
			
			x.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
