package logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Logg {
	
	//Factory design pattern
  
	static Logger log = Logger.getLogger(Basic_Logg.class); 
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("Debug");
		
		log.info("information");
		
		log.warn("Warning");
		
		log.error("Error");
		
		log.fatal("fatal");
	}
}
