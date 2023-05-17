package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'a', 0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo8 = grafo1.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

}
