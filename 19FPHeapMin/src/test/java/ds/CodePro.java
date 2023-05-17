package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FPHeapMinTest</code> contains tests for the class <code>{@link FPHeapMin}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:27
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the FPHeapMin(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testFPHeapMin_1()
		throws Exception {
		int maxTam = 1;

		FPHeapMin result = new FPHeapMin(maxTam);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.min());
	}

	/**
	 * Run the FPHeapMin(Item[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test
	public void testFPHeapMin_2()
		throws Exception {
		Item[] v = new Item[] {};

		FPHeapMin result = new FPHeapMin(v);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void constroi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testConstroi_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));

		fixture.constroi();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void constroi() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testConstroi_2()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));

		fixture.constroi();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void copia(Item[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testCopia_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		Item[] v = new Item[] {null, new MeuItem(1)};

		fixture.copia(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void copia(Item[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testCopia_2()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		Item[] v = new Item[] {};

		fixture.copia(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void diminuiChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDiminuiChave_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int i = 1;
		Object chaveNova = null;

		fixture.diminuiChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void diminuiChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDiminuiChave_2()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.diminuiChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void diminuiChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDiminuiChave_3()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.diminuiChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void diminuiChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDiminuiChave_4()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int i = 1;
		Object chaveNova = new Object();

		fixture.diminuiChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void diminuiChave(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testDiminuiChave_5()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int i = 2;
		Object chaveNova = new Object();

		fixture.diminuiChave(i, chaveNova);

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testImprime_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));

		fixture.imprime();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
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
		FPHeapMin fixture = new FPHeapMin(new Item[] {});

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
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
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
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
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
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		Item x = new MeuItem(1);

		fixture.insere(x);

		// add additional test code here
	}

	/**
	 * Run the Item min() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testMin_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));

		Item result = fixture.min();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
		assertNotNull(result);
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_2()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_3()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_4()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_5()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_6()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the void refaz(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected=java.lang.Exception.class)
	public void testRefaz_7()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));
		int esq = 1;
		int dir = 1;

		fixture.refaz(esq, dir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.Exception: Erro: heap cheio
		//       at ds.FPHeapMin.insere(FPHeapMin.java:55)
	}

	/**
	 * Run the Item retiraMin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetiraMin_1()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});

		Item result = fixture.retiraMin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Item retiraMin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:27
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRetiraMin_2()
		throws Exception {
		FPHeapMin fixture = new FPHeapMin(new Item[] {});
		fixture.insere(new MeuItem(1));

		Item result = fixture.retiraMin();

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