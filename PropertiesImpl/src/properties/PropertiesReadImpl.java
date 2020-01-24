package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReadImpl {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		Properties p = new Properties();
		InputStream is = new FileInputStream("project-config.properties");
		p.load(is);
		System.out.println(p.getProperty("username"));
		p.list(System.out);
		
	}
}
