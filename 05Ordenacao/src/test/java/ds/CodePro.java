package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrdenacaoTest</code> contains tests for the class <code>{@link Ordenacao}</code>.
 *
 * @generatedBy CodePro at 28/06/16 17:04
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the void ordena(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:04
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testOrdena_1()
		throws Exception {
		int[] v = new int[] {1};
		int n = 2;

		Ordenacao.ordena(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Ordenacao.ordena(Ordenacao.java:7)
	}

	/**
	 * Run the void ordena(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:04
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testOrdena_2()
		throws Exception {
		int[] v = new int[] {1};
		int n = 2;

		Ordenacao.ordena(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Ordenacao.ordena(Ordenacao.java:7)
	}

	/**
	 * Run the void ordena(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:04
	 */
	@Test
	public void testOrdena_3()
		throws Exception {
		int[] v = new int[] {1};
		int n = 1;

		Ordenacao.ordena(v, n);

		// add additional test code here
	}

	/**
	 * Run the void ordena(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:04
	 */
	@Test
	public void testOrdena_4()
		throws Exception {
		int[] v = new int[] {};
		int n = 1;

		Ordenacao.ordena(v, n);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 17:04
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
	 * @generatedBy CodePro at 28/06/16 17:04
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
	 * @generatedBy CodePro at 28/06/16 17:04
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}