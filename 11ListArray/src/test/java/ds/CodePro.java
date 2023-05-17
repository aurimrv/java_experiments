package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ListaTest</code> contains tests for the class <code>{@link Lista}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:24
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Lista() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test
	public void testLista_1()
		throws Exception {

		Lista result = new Lista();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.vazia());
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test
	public void testImprime_1()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {};
		fixture.primeiro = 1;
		fixture.pos = 1;

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test
	public void testImprime_2()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {};
		fixture.primeiro = 1;
		fixture.pos = 1;

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void insere(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInsere_1()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {};
		fixture.primeiro = 1;
		fixture.pos = 1;
		Object x = new Object();

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the void insere(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInsere_2()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {null};
		fixture.primeiro = 1;
		fixture.pos = 1;
		Object x = new Object();

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the boolean vazia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test
	public void testVazia_1()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {};
		fixture.primeiro = 1;
		fixture.pos = 1;

		boolean result = fixture.vazia();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean vazia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	@Test
	public void testVazia_2()
		throws Exception {
		Lista fixture = new Lista();
		fixture.ultimo = 1;
		fixture.item = new Object[] {};
		fixture.primeiro = 1;
		fixture.pos = 1;

		boolean result = fixture.vazia();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:24
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
	 * @generatedBy CodePro at 28/06/16 19:24
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
	 * @generatedBy CodePro at 28/06/16 19:24
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}