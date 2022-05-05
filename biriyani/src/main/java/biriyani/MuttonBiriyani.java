package biriyani;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MuttonBiriyani {
	static Logger logger=Logger.getLogger(MuttonBiriyani.class);

	public static void main(String[] args) {
		
		String str="Wee all love Biriyani";
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("cost of biriyani is Rupees 120");
		logger.warn("biriyani makes you obesee");
		logger.error("emptied");
		

	}

}
