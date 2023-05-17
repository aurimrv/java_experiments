package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FilaTest</code> contains tests for the class <code>{@link Fila}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:25
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Fila() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testFila_1()
		throws Exception {

		Fila result = new Fila();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.vazia());
	}

	/**
	 * Run the Object desenfileira() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDesenfileira_1()
		throws Exception {
		Fila fixture = new Fila();

		Object result = fixture.desenfileira();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object desenfileira() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDesenfileira_2()
		throws Exception {
		Fila fixture = new Fila();

		Object result = fixture.desenfileira();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void enfileira(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testEnfileira_1()
		throws Exception {
		Fila fixture = new Fila();
		Object x = new Object();

		fixture.enfileira(x);

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testImprime_1()
		throws Exception {
		Fila fixture = new Fila();

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testImprime_2()
		throws Exception {
		Fila fixture = new Fila();

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the boolean vazia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testVazia_1()
		throws Exception {
		Fila fixture = new Fila();

		boolean result = fixture.vazia();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean vazia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testVazia_2()
		throws Exception {
		Fila fixture = new Fila();

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
	 * @generatedBy CodePro at 28/06/16 19:25
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
	 * @generatedBy CodePro at 28/06/16 19:25
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
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}