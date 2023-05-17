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


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    boolean b4 = grafo1.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo grafo3 = new ds.Grafo((int)(short)1);
    int[] i_array4 = grafo3.prox;
    grafo1.cab = i_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    int[] i_array6 = null;
    grafo1.cab = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(byte)1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(short)1);
    int[] i_array5 = grafo4.prox;
    int[] i_array6 = grafo4.peso;
    grafo1.prox = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta(100, (int)(short)0);
    int[] i_array8 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array8);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

}
