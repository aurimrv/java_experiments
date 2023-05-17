package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MaxMin3Test</code> contains tests for the class <code>{@link MaxMin3}</code>.
 *
 * @generatedBy CodePro at 28/06/16 17:03
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the int[] maxMin3(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	@Test
	public void testMaxMin3_1()
		throws Exception {
		int[] v = new int[] {1, 1, 1, 1};
		int n = 1;

		int[] result = MaxMin3.maxMin3(v, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

	/**
	 * Run the int[] maxMin3(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	@Test
	public void testMaxMin3_2()
		throws Exception {
		int[] v = new int[] {1, 1, 1, 1};
		int n = 1;

		int[] result = MaxMin3.maxMin3(v, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

	/**
	 * Run the int[] maxMin3(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	@Test
	public void testMaxMin3_3()
		throws Exception {
		int[] v = new int[] {1, 1, 1, 1};
		int n = 3;

		int[] result = MaxMin3.maxMin3(v, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

	/**
	 * Run the int[] maxMin3(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	@Test
	public void testMaxMin3_4()
		throws Exception {
		int[] v = new int[] {1, 1, 1, 1};
		int n = 1;

		int[] result = MaxMin3.maxMin3(v, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

	/**
	 * Run the int[] maxMin3(int[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	@Test
	public void testMaxMin3_5()
		throws Exception {
		int[] v = new int[] {1, 1};
		int n = 1;

		int[] result = MaxMin3.maxMin3(v, n);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 17:03
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
	 * @generatedBy CodePro at 28/06/16 17:03
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
	 * @generatedBy CodePro at 28/06/16 17:03
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}