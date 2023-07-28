import java.util.*;
import java.io.*;
class PropertiesDemo{
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("mappings.properties");
			Properties prop = new Properties();
			prop.load(fr);
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("city"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
