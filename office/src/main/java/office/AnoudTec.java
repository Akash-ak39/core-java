package office;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AnoudTec {
	static Logger logger=Logger.getLogger(AnoudTec.class);

	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("QIC is one of the largest Insurance company in the world");

	}

}
