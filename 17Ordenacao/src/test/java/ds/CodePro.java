package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OrdenacaoTest</code> contains tests for the class <code>{@link Ordenacao}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:26
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the void heapsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.NullPointerException.class)
	public void testHeapsort_1()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), null};
		int n = 2;

		Ordenacao.heapsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ds.MeuItem.compara(MeuItem.java:11)
		//       at ds.FPHeapMax.refaz(FPHeapMax.java:13)
		//       at ds.FPHeapMax.constroi(FPHeapMax.java:22)
		//       at ds.Ordenacao.heapsort(Ordenacao.java:65)
	}

	/**
	 * Run the void heapsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testHeapsort_2()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.heapsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void insercao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testInsercao_1()
		throws Exception {
		Item[] v = new Item[] {new MeuItem(1), new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.insercao(v, n);

		// add additional test code here
	}

	/**
	 * Run the void insercao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testInsercao_2()
		throws Exception {
		Item[] v = new Item[] {new MeuItem(1), new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.insercao(v, n);

		// add additional test code here
	}

	/**
	 * Run the void insercao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testInsercao_3()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.insercao(v, n);

		// add additional test code here
	}

	/**
	 * Run the void quicksort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testQuicksort_1()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.quicksort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Ordenacao.particao(Ordenacao.java:7)
		//       at ds.Ordenacao.ordena(Ordenacao.java:19)
		//       at ds.Ordenacao.quicksort(Ordenacao.java:59)
	}

	/**
	 * Run the void selecao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testSelecao_1()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1)};
		int n = 2;

		Ordenacao.selecao(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at ds.Ordenacao.selecao(Ordenacao.java:27)
	}

	/**
	 * Run the void selecao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testSelecao_2()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1)};
		int n = 2;

		Ordenacao.selecao(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 2
		//       at ds.Ordenacao.selecao(Ordenacao.java:27)
	}

	/**
	 * Run the void selecao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testSelecao_3()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1)};
		int n = 1;

		Ordenacao.selecao(v, n);

		// add additional test code here
	}

	/**
	 * Run the void selecao(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testSelecao_4()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.selecao(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_1()
		throws Exception {
		Item[] v = new Item[] {null};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_2()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_3()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_4()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_5()
		throws Exception {
		Item[] v = new Item[] {null};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_6()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_7()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_8()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_9()
		throws Exception {
		Item[] v = new Item[] {null};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_10()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_11()
		throws Exception {
		Item[] v = new Item[] {null};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_12()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_13()
		throws Exception {
		Item[] v = new Item[] {null};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_14()
		throws Exception {
		Item[] v = new Item[] {null, new MeuItem(1), new MeuItem(1)};
		int n = 2;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testShellsort_15()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 5;

		Ordenacao.shellsort(v, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 5
		//       at ds.Ordenacao.shellsort(Ordenacao.java:49)
	}

	/**
	 * Run the void shellsort(Item[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	@Test
	public void testShellsort_16()
		throws Exception {
		Item[] v = new Item[] {};
		int n = 1;

		Ordenacao.shellsort(v, n);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:26
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
	 * @generatedBy CodePro at 28/06/16 19:26
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
	 * @generatedBy CodePro at 28/06/16 19:26
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}