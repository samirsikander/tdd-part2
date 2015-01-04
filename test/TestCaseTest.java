
public class TestCaseTest extends TestCase{

	public TestCaseTest(String name) {
		super(name);
	}

	static void testTemplateMethod(){
		WasRun test = new WasRun("testMethod");
		test.run(test, test.name);
		System.out.println(test.log.toString().equals("setUp testMethod tearDown")?"True":"False");
	}
	
	public static void main(String args[]){
		testTemplateMethod();
	}
}
