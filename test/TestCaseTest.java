import org.junit.Test;


public class TestCaseTest{

	@Test public void testTemplateMethod(){
		WasRun test = new WasRun("testMethod");
		test.run(test, test.name,new TestResult());
		System.out.println(test.log.toString().equals("setUp testMethod tearDown")?test.log.toString():"Red");
	}
	
	@Test public void testResult(){
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run(test, test.name,new TestResult());
		System.out.println(result.summary().equals("1 run, 0 failed")?result.summary():"Red");
	}
	
	@Test public void testFailedResult(){
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run(test, test.name,new TestResult());
		System.out.println(result.summary().equals("1 run, 1 failed")?result.summary():"Red");
	}
	
	@Test public void testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println(result.summary().equals("1 run, 1 failed")?result.summary():"Red");
	}
	
	@Test public void testSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		TestResult result = suite.run(suite, new TestResult());
		System.out.println(result.summary().equals("2 run, 1 failed")?result.summary():"Red");
	} 
	
//	public static void main(String args[]){
		//testTemplateMethod();
		//testResult();
		//testFailedResultFormatting();
		//testFailedResult();
		//testSuite();
//	}
}
