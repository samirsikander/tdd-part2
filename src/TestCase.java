import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestCase {
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run(WasRun test, String name) {
		test.setUp();
		Method[] methods = test.getClass().getDeclaredMethods();
		for(Method method: methods){
			if (method.getName().equals(name)){
				try {
					method.invoke(test, null);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		test.tearDown();
	}
}
