package io;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OnLogBackLauncher {

	public static final Logger logger = LoggerFactory.getLogger(OnLogBackLauncher.class);

	public static void main(String[] args) throws IOException {
		logger.info("We are using info logs with Olivia");
		logger.error("We are using error logs with Olivia");
		logger.debug("We are using error logs with Olivia");
		logger.trace("We are using error logs with Olivia");
		/** by default it would write in the console without need for logback.xml configured
*		11:26:14.843 [main] INFO io.OnLogBackLauncher - We are using info logs with Olivia
*		11:26:14.852 [main] ERROR io.OnLogBackLauncher - We are using error logs with Olivia
*		11:26:14.852 [main] DEBUG io.OnLogBackLauncher - We are using error logs with Olivia
**/
		/**
		 * Configuration files: 
		 * the logger is defined in a file in classpath: either in logback.xml / logback-test.xml. logback checks by priority:
		 * 1-logback-test.xml; 
		 * 2/logback.groovy
		 * 3-logback.xml. see src/main/resources 
		 * 
		 * See logs for evidence: 
		 * 11:30:02,816 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
		 * 11:30:02,816 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
		 * 11:30:02,816 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/C:/Users/HaoNguyen/workspace/HAO/2021/onLogBack/bin/main/logback.xml]

		 */
		/**
		 * Configuration files: 
		 * the logger is defined in a file in classpath: either in logback.xml / logback-test.xml
		 * Once found the loggers are defined by 3 parts: 
		 * - 1/ the name see a/.
		 * - 2/ the level
		 * - 3/ the appender to use: format of the line + whether log file or console to use. 
		 * a/ nameof logger and package of java: If the java class starts with the package name that coresponds to the appender
		 * b/ A ladder of statuses are defined with most important level: 
		 * error most important
		 * info
		 * debug
		 * trace
		 * So if you chose the the less important level (trace) all the more important levels for a specific appender will be written in logs of this appender.
		 *  
			 */
		
	}

	



}
