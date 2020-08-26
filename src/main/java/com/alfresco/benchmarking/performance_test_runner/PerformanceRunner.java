package com.alfresco.benchmarking.performance_test_runner;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class PerformanceRunner 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceRunner.class);
	
	public PerformanceRunner()
	{
		 super();
	}
	 public void doSomething(JMeterVariables variables) {
	        LOGGER.info("Log from {}", PerformanceRunner.class);
	        variables.put("myVar", Long.toString(System.currentTimeMillis()));
	    }
}
