package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    boolean b2 = grafo0.listaAdjVazia((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta6 = grafo0.proxAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    boolean b7 = grafo0.existeAresta((int)(byte)1, 1);
    boolean b10 = grafo0.existeAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    boolean b7 = grafo0.existeAresta((int)(byte)1, 1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)'#', (int)'a', (int)'a');
    grafo0.insereAresta((int)' ', (int)(short)10, (int)(byte)(-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    boolean b7 = grafo0.existeAresta((int)(byte)1, 1);
    grafo0.imprime();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    boolean b7 = grafo0.existeAresta((int)(byte)1, 1);
    grafo0.imprime();
    ds.Aresta aresta10 = grafo0.proxAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo0.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)'4', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)1, 10);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo5.existeAresta(100, (int)(byte)0);
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
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)1, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo0.existeAresta(100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

}
