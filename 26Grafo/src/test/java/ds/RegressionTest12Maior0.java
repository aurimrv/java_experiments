package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)10);
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
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    boolean b4 = grafo1.existeAresta((int)(byte)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)100);
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
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo grafo3 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(byte)0);
    int[] i_array6 = grafo3.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    grafo3.prox = i_array11;
    int[] i_array13 = grafo3.prox;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo grafo3 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(byte)0);
    int[] i_array6 = grafo3.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    grafo3.prox = i_array11;
    int[] i_array13 = grafo3.prox;
    grafo1.peso = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    int[] i_array11 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    int[] i_array6 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int)(byte)0);
    int[] i_array12 = grafo9.prox;
    grafo1.prox = i_array12;
    boolean b16 = grafo1.existeAresta((int)(short)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

}
