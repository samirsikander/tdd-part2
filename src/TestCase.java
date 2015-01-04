import java.lang.reflect.Method;


public class TestCase {
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public TestResult run(WasRun test, String name , TestResult result) {
		result.testStarted();	
		test.setUp();
		Method[] methods = test.getClass().getDeclaredMethods();
		for(Method method: methods){
			if (method.getName().equals(name)){
				try {
					method.invoke(test, null);
				} catch (Exception e){
					result.testFailed();
				}
			}
		}
		test.tearDown();
		return result;
	}
}
