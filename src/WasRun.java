
public class WasRun extends TestCase{

	String wasRun;
	String wasSetUp;	

	public WasRun(String name) {
		super(name);
	}
	
	void testMethod(){
		wasRun = "1";
	}
	
	void setUp(){
		wasRun = "None";
		wasSetUp = "1";
	}
}
