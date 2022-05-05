package disaster;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Manmade {
	static Logger logger=Logger.getLogger(Manmade.class);

	public static void main(String[] args) {
		
		String str="Humans territory";
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		System.out.println(str);
		logger.info("the world is going to end because of humans");

	}

}
