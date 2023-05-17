package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AvaliaMultMatrizesTest</code> contains tests for the class <code>{@link AvaliaMultMatrizes}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:23
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test
	public void testMultmatrize_1()
		throws Exception {
		int n = 2;
		int[] d = new int[] {1, 1, 1};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
	}

	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test
	public void testMultmatrize_2()
		throws Exception {
		int n = 2;
		int[] d = new int[] {1, 1, 1};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
	}

	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMultmatrize_3()
		throws Exception {
		int n = 2;
		int[] d = new int[] {};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at ds.AvaliaMultMatrizes.multmatrize(AvaliaMultMatrizes.java:16)
	}

	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMultmatrize_4()
		throws Exception {
		int n = 2;
		int[] d = new int[] {};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at ds.AvaliaMultMatrizes.multmatrize(AvaliaMultMatrizes.java:16)
	}

	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test
	public void testMultmatrize_5()
		throws Exception {
		int n = 1;
		int[] d = new int[] {};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
	}

	/**
	 * Run the void multmatrize(int,int[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	@Test
	public void testMultmatrize_6()
		throws Exception {
		int n = 0;
		int[] d = new int[] {};

		AvaliaMultMatrizes.multmatrize(n, d);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:23
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
	 * @generatedBy CodePro at 28/06/16 19:23
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
	 * @generatedBy CodePro at 28/06/16 19:23
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}