package alpha;

import org.apache.logging.log4j.*;


public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {

		log.error("Error message");
		log.info("info message");
		log.fatal("fatal message");
		log.debug("debug message");
		
	}
}
