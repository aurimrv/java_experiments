package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta((int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo0.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)100, 1, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta((int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta8 = grafo0.retiraAresta((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(short)0, (int)(byte)0);
    grafo0.insereAresta((int)(byte)1, (int)(short)1, 10);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), 0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), (int)(short)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(short)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta8 = grafo0.retiraAresta(100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta((int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo0.existeAresta((int)(short)(-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta7 = grafo0.retiraAresta((int)(byte)1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta((int)(byte)0, (int)(short)1);
    ds.Aresta aresta8 = grafo0.retiraAresta((int)(short)1, (int)'a');
    boolean b11 = grafo0.existeAresta((int)(short)10, 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = grafo0.existeAresta((-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(short)0, (int)(byte)0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta((int)(byte)0, (int)(short)1);
    ds.Aresta aresta8 = grafo0.retiraAresta((int)(short)1, (int)'a');
    boolean b11 = grafo0.existeAresta((int)(short)10, 0);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    boolean b15 = grafo0.existeAresta((int)(byte)1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta17 = grafo0.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

}
