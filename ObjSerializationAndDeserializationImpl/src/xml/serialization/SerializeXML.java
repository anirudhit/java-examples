package xml.serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import xml.common.College;
import xml.common.Student;

public class SerializeXML {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("John");
		s1.setLastName("Doe");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstName("Scott");
		s2.setLastName("Tiger");
		
		List<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		
		College c = new College();
		c.setStudents(s);
		
		File f = new File("collegeData.xml");
		try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(f)));
			x.writeObject(c);
			x.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
