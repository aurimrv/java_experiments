package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TabelaHashTest</code> contains tests for the class <code>{@link TabelaHash}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:35
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the TabelaHash() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testTabelaHash_1()
		throws Exception {

		TabelaHash result = new TabelaHash();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TabelaHash() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testTabelaHash_2()
		throws Exception {

		TabelaHash result = new TabelaHash();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testImprime_1()
		throws Exception {
		TabelaHash fixture = new TabelaHash();

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testImprime_2()
		throws Exception {
		TabelaHash fixture = new TabelaHash();

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testImprime_3()
		throws Exception {
		TabelaHash fixture = new TabelaHash();

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void insere(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testInsere_1()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";
		Object item = new Object();

		fixture.insere(chave, item);

		// add additional test code here
	}

	/**
	 * Run the void insere(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testInsere_2()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";
		Object item = new Object();

		fixture.insere(chave, item);

		// add additional test code here
	}

	/**
	 * Run the Object pesquisa(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testPesquisa_1()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		Object result = fixture.pesquisa(chave);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object pesquisa(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testPesquisa_2()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		Object result = fixture.pesquisa(chave);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object pesquisa(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test
	public void testPesquisa_3()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		Object result = fixture.pesquisa(chave);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void retira(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetira_1()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		fixture.retira(chave);

		// add additional test code here
	}

	/**
	 * Run the void retira(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetira_2()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		fixture.retira(chave);

		// add additional test code here
	}

	/**
	 * Run the void retira(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetira_3()
		throws Exception {
		TabelaHash fixture = new TabelaHash();
		String chave = "";

		fixture.retira(chave);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:35
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
	 * @generatedBy CodePro at 28/06/16 19:35
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
	 * @generatedBy CodePro at 28/06/16 19:35
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}