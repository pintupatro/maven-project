package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        System.out.println("\n \n Dynamic port in Testcase 1 --------->");
    	runFlowAndExpect("mavenFlow", "Hello World");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
