package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ArvoreBinariaTest</code> contains tests for the class <code>{@link ArvoreBinaria}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:28
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the ArvoreBinaria() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testArvoreBinaria_1()
		throws Exception {

		ArvoreBinaria result = new ArvoreBinaria();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testInsere_1()
		throws Exception {
		ArvoreBinaria fixture = new ArvoreBinaria();
		Item reg = new MeuItem(1);

		fixture.insere(reg);

		// add additional test code here
	}

	/**
	 * Run the Item pesquisa(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testPesquisa_1()
		throws Exception {
		ArvoreBinaria fixture = new ArvoreBinaria();
		Item reg = new MeuItem(1);

		Item result = fixture.pesquisa(reg);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void retira(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testRetira_1()
		throws Exception {
		ArvoreBinaria fixture = new ArvoreBinaria();
		Item reg = new MeuItem(1);

		fixture.retira(reg);

		// add additional test code here
	}

	/**
	 * Run the void testa() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:28
	 */
	@Test
	public void testTesta_1()
		throws Exception {
		ArvoreBinaria fixture = new ArvoreBinaria();

		fixture.testa();

		// add additional test code here
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