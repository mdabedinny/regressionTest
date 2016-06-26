package uitls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

//	public static void main(String[] args) {
//		//System.out.println(loadProperty("qa"));
//		System.out.println(getTestEnv());
//		System.out.println(getBrowserName());
//		System.out.println(getEnvProperty("appUrl"));
//		
//		System.out.println(getEnvProperty("email"));
//		System.out.println(getEnvProperty("password"));
//		
//	}
	
		
	public  String getEnvProperty(String key){
		return getEnvProperties().getProperty(key);
	}
	
	public static  String getTestEnv(){
		return loadProperty("test").getProperty("testEnv");
	}
	
	public  String getBrowserType(){
		return loadProperty("test").getProperty("browserType");
	}
	
	private  Properties getEnvProperties(){
		Properties prop = null;
		String propertyFileName = loadProperty("test").getProperty("testEnv");
		prop = loadProperty(propertyFileName);
		
		return prop;
	}

	private static Properties loadProperty(String propertyFileName) {
		Properties value = null;

		File file = new File(System.getProperty("user.dir") + "/src/main/resources/properties/" + propertyFileName + ".properties");

		try {
			FileInputStream fileData = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileData);

			value = prop;
			
			

			//System.out.println(System.getProperty("user.dir"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

}
