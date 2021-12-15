package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Logg {
 
	static Logger log = Logger.getLogger(Property_Logg.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
        log.info("information");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("fatal");
	}
}
