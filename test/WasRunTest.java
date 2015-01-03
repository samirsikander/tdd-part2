public class WasRunTest {

	public static void main(String args[]) {
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run(test);
		System.out.println(test.wasRun);
	}
}
