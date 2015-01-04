
public class TestCaseTest{

	static void testTemplateMethod(){
		WasRun test = new WasRun("testMethod");
		test.run(test, test.name,new TestResult());
		System.out.println(test.log.toString().equals("setUp testMethod tearDown")?test.log.toString():"Red");
	}
	
	static void testResult(){
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run(test, test.name,new TestResult());
		System.out.println(result.summary().equals("1 run, 0 failed")?result.summary():"Red");
	}
	
	static void testFailedResult(){
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run(test, test.name,new TestResult());
		System.out.println(result.summary().equals("1 run, 1 failed")?result.summary():"Red");
	}
	
	static void testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println(result.summary().equals("1 run, 1 failed")?result.summary():"Red");
	}
	
	static void testSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		TestResult result = suite.run(suite, new TestResult());
		System.out.println(result.summary().equals("2 run, 1 failed")?result.summary():"Red");
	} 
	
	public static void main(String args[]){
		testTemplateMethod();
		testResult();
		testFailedResultFormatting();
		testFailedResult();
		testSuite();
	}
}
