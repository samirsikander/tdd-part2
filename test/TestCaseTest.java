
public class TestCaseTest{

	static void testTemplateMethod(){
		WasRun test = new WasRun("testMethod");
		test.run(test, test.name);
		System.out.println(test.log.toString().equals("setUp testMethod tearDown")?test.log.toString():"Red");
	}
	
	static void testResult(){
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run(test, test.name);
		System.out.println(result.summary().equals("1 run, 0 failed")?result.summary():"Red");
	}
	
	static void testFailedResult(){
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run(test, test.name);
		System.out.println(result.summary().equals("1 run, 1 failed")?result.summary():"Red");
	}
	
	public static void main(String args[]){
		testTemplateMethod();
		testResult();
		testFailedResult();
	}
}
