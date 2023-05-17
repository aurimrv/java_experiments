package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FPHeapMaxTest</code> contains tests for the class <code>{@link FPHeapMax}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:27
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the FPHeapMax(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testFPHeapMax_1()
		throws Exception {
		int maxTam = 1;

		FPHeapMax result = new FPHeapMax(maxTam);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.max());
	}

	/**
	 * Run the void aumentaChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testAumentaChave_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int i = 1;
		Object chaveNova = null;

		fixture.aumentaChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void aumentaChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testAumentaChave_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.aumentaChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void aumentaChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testAumentaChave_3()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.aumentaChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void aumentaChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testAumentaChave_4()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.aumentaChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void aumentaChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testAumentaChave_5()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int i = 1;
		Object chaveNova = new Object();

		fixture.aumentaChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void constroi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testConstroi_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));

		fixture.constroi();

		// add additional test code here
	}

	/**
	 * Run the void constroi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testConstroi_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));

		fixture.constroi();

		// add additional test code here
	}

	/**
	 * Run the void copia(Item[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testCopia_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		Item[] v = new Item[] {null, new MeuItem(1)};

		fixture.copia(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at ds.FPHeapMax.copia(FPHeapMax.java:60)
	}

	/**
	 * Run the void copia(Item[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testCopia_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		Item[] v = new Item[] {};

		fixture.copia(v);

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testImprime_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testImprime_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInsere_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		Item x = new MeuItem(1);

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInsere_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		Item x = new MeuItem(1);

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the void insere(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testInsere_3()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		Item x = new MeuItem(1);

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the Item max() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testMax_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));

		Item result = fixture.max();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(1), result.recuperaChave());
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_3()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_4()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_5()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_6()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRefaz_7()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
	}

	/**
	 * Run the Item retiraMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testRetiraMax_1()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);
		fixture.insere(new MeuItem(1));

		Item result = fixture.retiraMax();

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(1), result.recuperaChave());
	}

	/**
	 * Run the Item retiraMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetiraMax_2()
		throws Exception {
		FPHeapMax fixture = new FPHeapMax(1);

		Item result = fixture.retiraMax();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
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
	 * @generatedBy CodePro at 28/06/16 19:27
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
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}