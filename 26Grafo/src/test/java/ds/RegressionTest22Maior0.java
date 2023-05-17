package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta((int)(short)0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)1, 10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)1, 10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo1.existeAresta((int)(byte)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)'a', (int)'4', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int[] i_array5 = grafo1.prox;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)' ');
    boolean b9 = grafo7.listaAdjVazia(100);
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    int[] i_array11 = grafo7.prox;
    grafo5.prox = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

}
