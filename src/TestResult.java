
public class TestResult {
	
	int runCount = 0;
	int errorCount = 0;

	void testStarted(){
		runCount = runCount +1;
	}
	
	String summary(){
		return String.format("%d run, %d failed",runCount,errorCount);
		
	}

	void testFailed() {
		errorCount = errorCount +1;
	}
	
}
