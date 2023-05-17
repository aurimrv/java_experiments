package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)(-1), 100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo3.listaAdjVazia((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((-1), (int)(byte)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int i5 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo1.existeAresta(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b4 = grafo1.existeAresta((int)(byte)10, 10);
    grafo1.insereAresta(0, (int)(byte)(-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo3.primeiroListaAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo3.proxAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.listaAdjVazia((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
