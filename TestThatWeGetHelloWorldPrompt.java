import junit.framework.TestCase;


public class TestThatWeGetHelloWorldPrompt extends TestCase {
	
	 public TestThatWeGetHelloWorldPrompt(
		        String name) {
		        super(name);
		    }
		    public void testSay() {
		        HelloWorld hi = new HelloWorld();
		        assertEquals("Hello me!", hi.say());
		    }
		    public static void main(String[] args) {
		        junit.textui.TestRunner.run(
		            TestThatWeGetHelloWorldPrompt.class);
		    }

}
