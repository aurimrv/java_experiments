package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PilhaTest</code> contains tests for the class <code>{@link Pilha}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:25
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Pilha() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testPilha_1()
		throws Exception {

		Pilha result = new Pilha();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.tamanho());
		assertEquals(true, result.vazia());
	}

	/**
	 * Run the Object desempilha() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testDesempilha_1()
		throws Exception {
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());

		Object result = fixture.desempilha();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object desempilha() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testDesempilha_2()
		throws Exception {
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());

		Object result = fixture.desempilha();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void empilha(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testEmpilha_1()
		throws Exception {
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());
		Object x = new Object();

		fixture.empilha(x);

		// add additional test code here
	}

	/**
	 * Run the int tamanho() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:25
	 */
	@Test
	public void testTamanho_1()
		throws Exception {
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());

		int result = fixture.tamanho();

		// add additional test code here
		assertEquals(1, result);
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
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());

		boolean result = fixture.vazia();

		// add additional test code here
		assertEquals(false, result);
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
		Pilha fixture = new Pilha();
		fixture.empilha(new Object());

		boolean result = fixture.vazia();

		// add additional test code here
		assertEquals(false, result);
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