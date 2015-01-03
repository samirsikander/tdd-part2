
public class TestCase {
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run(WasRun test) {
		test.testMethod();		
	}
}
