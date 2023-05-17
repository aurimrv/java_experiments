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


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)100, 1);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta2 = grafo0.proxAdj((int)(byte)100);
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


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)0, 10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta9 = grafo0.retiraAresta((int)(byte)100, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)0, 10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta9 = grafo0.retiraAresta((int)(short)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.primeiroListaAdj((int)(short)100);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)0, 10);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    boolean b6 = grafo0.existeAresta((int)'#', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)(-1), (int)(short)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    boolean b5 = grafo0.listaAdjVazia(0);
    boolean b8 = grafo0.existeAresta((int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo0.existeAresta((int)(byte)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)0, 10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo0.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    boolean b5 = grafo0.listaAdjVazia(0);
    boolean b8 = grafo0.existeAresta((int)(byte)0, 0);
    grafo0.imprime();
    ds.Aresta aresta11 = grafo0.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta6 = grafo0.retiraAresta((int)(short)0, 10);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    boolean b5 = grafo0.listaAdjVazia(0);
    boolean b8 = grafo0.existeAresta((int)(byte)0, 0);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    ds.Aresta aresta5 = grafo0.proxAdj((int)'a');
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

}
