package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MaxMin4Test</code> contains tests for the class <code>{@link MaxMin4}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:22
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the int[] maxMin4(int[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:22
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMaxMin4_1()
		throws Exception {
		int[] v = new int[] {};
		int linf = 1;
		int lsup = 1;

		int[] result = MaxMin4.maxMin4(v, linf, lsup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.MaxMin4.maxMin4(MaxMin4.java:6)
		assertNotNull(result);
	}

	/**
	 * Run the int[] maxMin4(int[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:22
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMaxMin4_2()
		throws Exception {
		int[] v = new int[] {};
		int linf = 1;
		int lsup = 1;

		int[] result = MaxMin4.maxMin4(v, linf, lsup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.MaxMin4.maxMin4(MaxMin4.java:6)
		assertNotNull(result);
	}

	/**
	 * Run the int[] maxMin4(int[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:22
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMaxMin4_3()
		throws Exception {
		int[] v = new int[] {0};
		int linf = 1;
		int lsup = 1;

		int[] result = MaxMin4.maxMin4(v, linf, lsup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.MaxMin4.maxMin4(MaxMin4.java:6)
		assertNotNull(result);
	}

	/**
	 * Run the int[] maxMin4(int[],int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:22
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMaxMin4_4()
		throws Exception {
		int[] v = new int[] {0};
		int linf = 1;
		int lsup = 1;

		int[] result = MaxMin4.maxMin4(v, linf, lsup);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.MaxMin4.maxMin4(MaxMin4.java:6)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:22
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
	 * @generatedBy CodePro at 28/06/16 19:22
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
	 * @generatedBy CodePro at 28/06/16 19:22
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}