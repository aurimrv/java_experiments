package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((int)(byte)100, (int)' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)(-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.listaAdjVazia(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)0);
    grafo1.insereAresta((int)(byte)0, 1, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'a', 0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int i2 = grafo1.numVertices();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo3.primeiroListaAdj((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)0);
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

}
