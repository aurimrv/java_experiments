package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test1"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b4 = grafo1.existeAresta((int)(byte)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test2"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test3"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    int[] i_array9 = null;
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test4"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = grafo1.existeAresta((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test5"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(short)1, 10, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test6"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test7"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test8"); }


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
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test9"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
