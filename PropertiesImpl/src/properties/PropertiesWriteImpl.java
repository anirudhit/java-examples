package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesWriteImpl {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("project-config.properties");
		p.setProperty("author", "anirudh");
		p.setProperty("url", "http://localhost:2468/myDb");
		p.setProperty("username", "scott");
		p.setProperty("password", "tiger");
		
		p.store(os, "Config file");
	}

}
