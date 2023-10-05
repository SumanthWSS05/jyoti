package readdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertiesFile {
	
@Test
public void getdata() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Jyoti Mishra\\Desktop\\data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	System.out.println(prop.get("Name"));
	System.out.println(prop.get("Subject"));
	System.out.println(prop.get("Students"));
}

}
