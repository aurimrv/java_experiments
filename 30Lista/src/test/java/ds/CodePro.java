package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AgmPrimTest</code> contains tests for the class <code>{@link AgmPrim}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:42
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the AgmPrim(Grafo) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test
	public void testAgmPrim_1()
		throws Exception {
		Grafo grafo = new Grafo(1);

		AgmPrim result = new AgmPrim(grafo);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int antecessor(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testAntecessor_1()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int u = 1;

		int result = fixture.antecessor(u);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.AgmPrim.antecessor(AgmPrim.java:37)
		assertEquals(0, result);
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testImprime_1()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));

		fixture.imprime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.AgmPrim.imprime(AgmPrim.java:40)
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testImprime_2()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));

		fixture.imprime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.AgmPrim.imprime(AgmPrim.java:40)
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testImprime_3()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));

		fixture.imprime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.AgmPrim.imprime(AgmPrim.java:40)
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_1()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_2()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_3()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_4()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_5()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_6()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_7()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_8()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_9()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_10()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_11()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_12()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_13()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the void obterAgm(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testObterAgm_14()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int raiz = 1;

		fixture.obterAgm(raiz);

		// add additional test code here
	}

	/**
	 * Run the double peso(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testPeso_1()
		throws Exception {
		AgmPrim fixture = new AgmPrim(new Grafo(1));
		int u = 1;

		double result = fixture.peso(u);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.AgmPrim.peso(AgmPrim.java:38)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:42
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
	 * @generatedBy CodePro at 28/06/16 19:42
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
	 * @generatedBy CodePro at 28/06/16 19:42
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}