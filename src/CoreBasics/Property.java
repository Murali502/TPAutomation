package CoreBasics;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {
	public static String getProperty(String args)
	{
		Properties prop= new Properties();
		try {
			String result="";
			InputStream inputstream = null;
			String propFileName="src\\resource\\config.properties";
			inputstream =new FileInputStream(propFileName);
			prop.load(inputstream);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
			return prop.getProperty(args);	
		}
		
	}

}
