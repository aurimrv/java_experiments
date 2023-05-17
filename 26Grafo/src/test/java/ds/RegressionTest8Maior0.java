package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)(-1), 0);
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
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    int[] i_array7 = grafo1.cab;
    int[] i_array8 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    boolean b6 = grafo1.existeAresta((int)'#', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array8 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array4 = grafo3.prox;
    grafo1.peso = i_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.cab;
    grafo5.prox = i_array9;
    grafo1.cab = i_array9;
    int[] i_array12 = grafo1.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.cab;
    grafo1.cab = i_array15;
    grafo1.imprime();
    int i18 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(1);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = grafo10.cab;
    int[] i_array12 = grafo10.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.prox;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.cab;
    grafo14.prox = i_array18;
    grafo10.cab = i_array18;
    int[] i_array21 = grafo10.peso;
    grafo1.cab = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

}
