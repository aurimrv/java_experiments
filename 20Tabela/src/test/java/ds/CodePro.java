package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TabelaTest</code> contains tests for the class <code>{@link Tabela}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:28
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Tabela() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testTabela_1()
		throws Exception {

		Tabela result = new Tabela();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int binaria(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testBinaria_1()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {};
		fixture.n = 0;
		Item chave = new MeuItem(1);

		int result = fixture.binaria(chave);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int binaria(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testBinaria_2()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item chave = new MeuItem(1);

		int result = fixture.binaria(chave);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.binaria(Tabela.java:28)
		assertEquals(0, result);
	}

	/**
	 * Run the int binaria(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testBinaria_3()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item chave = new MeuItem(1);

		int result = fixture.binaria(chave);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.binaria(Tabela.java:28)
		assertEquals(0, result);
	}

	/**
	 * Run the int binaria(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testBinaria_4()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item chave = new MeuItem(1);

		int result = fixture.binaria(chave);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.binaria(Tabela.java:28)
		assertEquals(0, result);
	}

	/**
	 * Run the int binaria(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testBinaria_5()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item chave = new MeuItem(1);

		int result = fixture.binaria(chave);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.binaria(Tabela.java:28)
		assertEquals(0, result);
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsere_1()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {};
		fixture.n = 1;
		Item reg = new MeuItem(1);

		fixture.insere(reg);

		// add additional test code here
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsere_2()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item reg = new MeuItem(1);

		fixture.insere(reg);

		// add additional test code here
	}

	/**
	 * Run the int pesquisa(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testPesquisa_1()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {null};
		fixture.n = 1;
		Item reg = new MeuItem(1);

		int result = fixture.pesquisa(reg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.pesquisa(Tabela.java:15)
		assertEquals(0, result);
	}

	/**
	 * Run the int pesquisa(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testPesquisa_2()
		throws Exception {
		Tabela fixture = new Tabela();
		fixture.registros = new Item[] {new MeuItem(1)};
		fixture.n = 1;
		Item reg = new MeuItem(1);

		int result = fixture.pesquisa(reg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Tabela.pesquisa(Tabela.java:15)
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
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
	 * @generatedBy CodePro at 28/06/16 19:28
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
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}