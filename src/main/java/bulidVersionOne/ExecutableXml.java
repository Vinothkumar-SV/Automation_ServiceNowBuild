package bulidVersionOne;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ExecutableXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XmlSuite suite = new XmlSuite();
		suite.setName("Suite");

		XmlTest test = new XmlTest(suite);
		test.setName("Test");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		classes.add(new XmlClass("bulidVersionOne.CredentialsCheck"));

		test.setXmlClasses(classes) ;
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();

	}

}
