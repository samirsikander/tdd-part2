
public class WasRun extends TestCase{

	String wasRun;
	String wasSetUp;
	StringBuffer log = new StringBuffer();

	WasRun(String name) {
		super(name);
	}
	
	void setUp(){
		wasRun = "None";
		wasSetUp = "1";
		log.append("setUp ");
	}

	void testMethod(){
		wasRun = "1";
		log.append("testMethod ");
	}
	
	void tearDown() {
		log.append("tearDown");
	}
	
	void testBrokenMethod() throws Exception{
		throw new Exception();
	}
}
