package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FibonacciTest</code> contains tests for the class <code>{@link Fibonacci}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:21
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the int fibIter(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:21
	 */
	@Test
	public void testFibIter_1()
		throws Exception {
		int n = 1;

		int result = Fibonacci.fibIter(n);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int fibIter(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:21
	 */
	@Test
	public void testFibIter_2()
		throws Exception {
		int n = 0;

		int result = Fibonacci.fibIter(n);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:21
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:21
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 28/06/16 19:21
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}