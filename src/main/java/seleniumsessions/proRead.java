package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class proRead {
	Properties pr;

	public Properties initProperties() {
		try {
			FileInputStream file = new FileInputStream("./src/main/java/seleniumsessions/conf.properties");
			pr = new Properties();
			pr.load(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

		return pr;
	}
}
