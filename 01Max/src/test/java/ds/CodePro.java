package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MaxTest</code> contains tests for the class <code>{@link Max}</code>.
 *
 * @generatedBy CodePro at 28/06/16 17:02
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Item max(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:02
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testMax_1()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1)};
		int n = 2;

		Item result = Max.max(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.Max.max(Max.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Item max(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:02
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testMax_2()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1)};
		int n = 2;

		Item result = Max.max(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.Max.max(Max.java:5)
		assertNotNull(result);
	}

	/**
	 * Run the Item max(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 17:02
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testMax_3()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Item result = Max.max(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at ds.Max.max(Max.java:4)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 17:02
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
	 * @generatedBy CodePro at 28/06/16 17:02
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
	 * @generatedBy CodePro at 28/06/16 17:02
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}