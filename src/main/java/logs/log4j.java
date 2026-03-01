package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {
	
 	private static Logger logger = LogManager.getLogger(log4j.class);
	
	public static void main(String[] args) {
		
 	System.out.println("\n Hello world .. \n");
 	
 	logger.info("This is info msg..");
 	logger.error("This is error..");
 	logger.warn("This is warn..");
 	logger.fatal("This is fatal..");
 	
 	System.out.println("\n complete .. \n");
// 	System.out.println(Logger.getRootLogger().getAllAppenders());
	}

}
