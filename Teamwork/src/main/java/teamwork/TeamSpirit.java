package teamwork;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TeamSpirit {
	static Logger logger=Logger.getLogger(TeamSpirit.class);

	public static void main(String[] args) {
		String str="Team Work makes Dream Work";
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("Team Members should always be coperative"+str);
		logger.warn("Get ready folks");
		logger.error("showing bugs on pklroject");
		
dfbvedfd

	}

}
