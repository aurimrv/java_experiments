package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.existeAresta((int)(byte)10, (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b3 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = grafo1.existeAresta((int)' ', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(short)(-1), (int)'#');
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
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b3 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

}
