package demo1.Functions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class CaculatorTest {
	
	Calculator cal;

	 @Before
	 /*
	 the init() method will be called for each test, such
	 testAdd() as well as testSub()
	 */
	 public void init() {

	 cal = new Calculator();

	 }

	 @Test
	 public void testAdd() {

	 int x = 20;
	 int y = 20;
	 assertEquals(40, cal.add(x, y));

	 }

	 @Test
	 public void testSub() {
	 int x = 20;
	 int y = 10;
	 assertEquals(10, cal.sub(x, y));
	 }
	
}