package io;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;


public class OnLogBackLauncherTest extends TestCase{

	public static final Logger logger = LoggerFactory.getLogger(OnLogBackLauncherTest.class);

	public static void testLogger() throws IOException {
		logger.info("We are using info logs with Olivia");
		logger.error("We are using error logs with Olivia");
		logger.debug("We are using error logs with Olivia");
		logger.trace("We are using error logs with Olivia");
	/**
	 * Here logback-test.xml is used. It is in the src/test folder so not visible from src/main when you run with eclipse ide.
	 * 12:05:47,255 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback-test.xml] at [file:/C:/Users/HaoNguyen/workspace/HAO/2021/onLogBack/bin/test/logback-test.xml]
12:05:47,323 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
12:05:47,324 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
12:05:47,332 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [CONSOLE]
12:05:47,384 |-WARN in ch.qos.logback.core.ConsoleAppender[CONSOLE] - This appender no longer admits a layout as a sub-component, set an encoder instead.
12:05:47,384 |-WARN in ch.qos.logback.core.ConsoleAppender[CONSOLE] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
12:05:47,384 |-WARN in ch.qos.logback.core.ConsoleAppender[CONSOLE] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
12:05:47,385 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [io] to DEBUG
12:05:47,385 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting additivity of logger [io] to false
12:05:47,385 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [CONSOLE] to Logger[io]
12:05:47,386 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to ERROR
12:05:47,386 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [CONSOLE] to Logger[ROOT]
12:05:47,386 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
12:05:47,387 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7d68ef40 - Registering current configuration as safe fallback point

12:05:47.390 [main] INFO  io.OnLauncherTest - We are using info logs with Olivia
12:05:47.394 [main] ERROR io.OnLauncherTest - We are using error logs with Olivia
12:05:47.394 [main] DEBUG io.OnLauncherTest - We are using error logs with Olivia

	 * 	
	 */
	}

	



}
