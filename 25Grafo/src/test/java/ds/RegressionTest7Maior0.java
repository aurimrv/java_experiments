package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo0.retiraAresta((int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    boolean b5 = grafo0.existeAresta(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    int i2 = grafo0.numVertices();
    grafo0.imprime();
    int i4 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    grafo0.imprime();
    boolean b5 = grafo0.listaAdjVazia((int)(byte)10);
    boolean b7 = grafo0.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    grafo0.imprime();
    boolean b5 = grafo0.listaAdjVazia((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), (int)(short)10, (-1));
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
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)(byte)0, (int)(byte)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia(0);
    int i3 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta(0, (int)(byte)(-1), (int)(short)100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    int i2 = grafo0.numVertices();
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)(-1), (int)(byte)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)'4');
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)10, (int)(short)(-1), 100);

  }

}
