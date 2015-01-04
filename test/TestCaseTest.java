
public class TestCaseTest extends TestCase{

	public TestCaseTest(String name) {
		super(name);
	}

	static void testSetUp() {
		WasRun test = new WasRun("setUp");
		test.run(test, test.name);
		System.out.println(test.wasSetUp.equals("1")?"True":"False");
	}

	static void testRunning(){
		WasRun test = new WasRun("testMethod");
		test.run(test, test.name);
		System.out.println(test.wasRun.equals("1")?"True":"False");
	}
	
	public static void main(String args[]){
		testSetUp();
		testRunning();
	}
}
