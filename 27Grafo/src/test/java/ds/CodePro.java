package ds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GrafoTest</code> contains tests for the class <code>{@link Grafo}</code>.
 *
 * @generatedBy CodePro at 28/06/16 19:40
 * @author Rapadura-PC
 * @version $Revision: 1.0 $
 */
public class CodePro {
	/**
	 * Run the Grafo(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafo_1()
		throws Exception {
		int numVertices = 1;

		Grafo result = new Grafo(numVertices);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.numVertices());
	}

	/**
	 * Run the Grafo(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafo_2()
		throws Exception {
		int numVertices = 0;

		Grafo result = new Grafo(numVertices);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.numVertices());
	}

	/**
	 * Run the boolean existeAresta(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testExisteAresta_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;

		boolean result = fixture.existeAresta(v1, v2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.existeAresta(Grafo.java:33)
		assertTrue(result);
	}

	/**
	 * Run the boolean existeAresta(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testExisteAresta_2()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;

		boolean result = fixture.existeAresta(v1, v2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.existeAresta(Grafo.java:33)
		assertTrue(result);
	}

	/**
	 * Run the Grafo grafoTransposto() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafoTransposto_1()
		throws Exception {
		Grafo fixture = new Grafo(1);

		Grafo result = fixture.grafoTransposto();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.numVertices());
	}

	/**
	 * Run the Grafo grafoTransposto() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafoTransposto_2()
		throws Exception {
		Grafo fixture = new Grafo(1);

		Grafo result = fixture.grafoTransposto();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.numVertices());
	}

	/**
	 * Run the Grafo grafoTransposto() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafoTransposto_3()
		throws Exception {
		Grafo fixture = new Grafo(1);

		Grafo result = fixture.grafoTransposto();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.numVertices());
	}

	/**
	 * Run the Grafo grafoTransposto() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testGrafoTransposto_4()
		throws Exception {
		Grafo fixture = new Grafo(0);

		Grafo result = fixture.grafoTransposto();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.numVertices());
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testImprime_1()
		throws Exception {
		Grafo fixture = new Grafo(1);

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testImprime_2()
		throws Exception {
		Grafo fixture = new Grafo(1);

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void imprime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testImprime_3()
		throws Exception {
		Grafo fixture = new Grafo(0);

		fixture.imprime();

		// add additional test code here
	}

	/**
	 * Run the void insereAresta(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsereAresta_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;
		int peso = 1;

		fixture.insereAresta(v1, v2, peso);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.insereAresta(Grafo.java:29)
	}

	/**
	 * Run the boolean listaAdjVazia(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testListaAdjVazia_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		boolean result = fixture.listaAdjVazia(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.listaAdjVazia(Grafo.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean listaAdjVazia(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testListaAdjVazia_2()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		boolean result = fixture.listaAdjVazia(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.listaAdjVazia(Grafo.java:36)
		assertTrue(result);
	}

	/**
	 * Run the int numVertices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test
	public void testNumVertices_1()
		throws Exception {
		Grafo fixture = new Grafo(1);

		int result = fixture.numVertices();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Grafo.Aresta primeiroListaAdj(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testPrimeiroListaAdj_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		Grafo.Aresta result = fixture.primeiroListaAdj(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.primeiroListaAdj(Grafo.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta primeiroListaAdj(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testPrimeiroListaAdj_2()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		Grafo.Aresta result = fixture.primeiroListaAdj(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.primeiroListaAdj(Grafo.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta proxAdj(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testProxAdj_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		Grafo.Aresta result = fixture.proxAdj(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.proxAdj(Grafo.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta proxAdj(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected=java.lang.ArrayIndexOutOfBoundsException.class)
	public void testProxAdj_2()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v = 1;

		Grafo.Aresta result = fixture.proxAdj(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at ds.Grafo.proxAdj(Grafo.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta retiraAresta(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRetiraAresta_1()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;

		Grafo.Aresta result = fixture.retiraAresta(v1, v2);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta retiraAresta(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRetiraAresta_2()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;

		Grafo.Aresta result = fixture.retiraAresta(v1, v2);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Grafo.Aresta retiraAresta(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRetiraAresta_3()
		throws Exception {
		Grafo fixture = new Grafo(1);
		int v1 = 1;
		int v2 = 1;

		Grafo.Aresta result = fixture.retiraAresta(v1, v2);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 28/06/16 19:40
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
	 * @generatedBy CodePro at 28/06/16 19:40
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
	 * @generatedBy CodePro at 28/06/16 19:40
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodePro.class);
	}
}