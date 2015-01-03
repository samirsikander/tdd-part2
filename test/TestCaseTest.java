
public class TestCaseTest extends TestCase{

	public static void main(String args[]){
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun.equals("None")?"False":"True");
		test.run(test);
		System.out.println(test.wasRun.equals("1")?"True":"False");
		new TestCaseTest("testRunning").run(test);
	}
	
	public TestCaseTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
