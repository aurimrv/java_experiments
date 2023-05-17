package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'4', (int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'4', (int)(short)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((int)(byte)(-1), (int)(byte)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int i8 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array11 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo6.peso = i_array11;
    int[] i_array13 = grafo6.peso;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int i5 = grafo1.numVertices();
    boolean b7 = grafo1.listaAdjVazia((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)(-1));
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(short)0);
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array14 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo9.peso = i_array14;
    int[] i_array16 = grafo9.peso;
    boolean b18 = grafo9.listaAdjVazia((int)(byte)1);
    int[] i_array19 = grafo9.cab;
    grafo5.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

}
