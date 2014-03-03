package first;
 
import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class ArithmeticTest extends TestCase{//I had to add the extends part
        @Test
        public void testMultiply() {
               Arithmetic x=new Arithmetic();
               assertEquals("Result", 50, x.multiply(1, 5));
 
        }
 
        @Test
        public void testAdd() {
               Arithmetic x=new Arithmetic();
               assertEquals("Result", 15, x.add(10, 5));
        }
 
        @Test
        public void testDivide() {
               Arithmetic x=new Arithmetic();
               assertEquals("Result",20, x.divide(100, 5));
        }
 
        @Test
        public void testSubtract() {
               Arithmetic x=new Arithmetic();
               assertEquals("Result", 5, x.subtract(10, 5));
        }
 
}