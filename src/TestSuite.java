import java.util.ArrayList;


public class TestSuite {
	
	ArrayList<WasRun> tests;
	
	TestSuite(){
		tests = new ArrayList();
	}
	
	void add(WasRun test){
		tests.add(test);
	}
	
	TestResult run(TestSuite suite, TestResult result){
		for(WasRun test : suite.tests){
			test.run(test, test.name,result);
		}
		
		return result;
		
	}
}
