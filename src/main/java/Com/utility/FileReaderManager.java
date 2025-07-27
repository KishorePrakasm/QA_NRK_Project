package Com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {

	private static FileInputStream fileInputstream;
	private static Properties property;

	private static void setProperty() throws IOException {

		File file = new File(
				"C:\\Users\\praka\\eclipse-workspace\\MavenProject\\mavenProject\\src\\main\\resources\\TestData.properties");

		try {
			fileInputstream = new FileInputStream(file);
			property = new Properties();
			property.load(fileInputstream);

		} catch (FileNotFoundException e) {
			Assert.fail("ERROR:OCCURE DURING FILE LOADING");
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING FILE READING");
		}
	}

	public static String getproperty(String datavalue) throws IOException {

		setProperty();
		String data = property.getProperty(datavalue);
		return data;

	}

}
