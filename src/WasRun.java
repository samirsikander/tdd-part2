
public class WasRun extends TestCase{

	String wasRun;	

	public WasRun(String name) {
		super(name);
		wasRun = "None";
	}
	
	void testMethod(){
		wasRun = "1";
	}
}
