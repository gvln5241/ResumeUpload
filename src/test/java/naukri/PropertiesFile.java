package naukri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String projpath = System.getProperty("user.dir");
	static String returnValue;
	public static void main(String[] args) {
		//getProperties();
		//setProperties();
	}

	public static String getValue(String parameter) {
		try {
			InputStream input = new FileInputStream(projpath + "/config.properties");
			prop.load(input);

			returnValue = prop.getProperty(parameter);
			//System.out.println(parameter+ ": "+ returnValue + " is read from config file");
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return returnValue;
		
	}
	public static void setValue() {
		try {
			OutputStream output=new FileOutputStream(projpath + "/config.properties");
			prop.setProperty("result", "pass");
			//prop.setProperty("browser", "firefox");
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
