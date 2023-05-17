package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test04"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test05"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)100);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(short)100);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)'#', (int)(byte)1);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array11 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo6.peso = i_array11;
    int[] i_array13 = grafo6.peso;
    grafo1.prox = i_array13;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)' ');
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
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)100);
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)100);
    int[] i_array12 = null;
    grafo1.peso = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(short)0);
    int[] i_array8 = grafo5.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo5.primeiroListaAdj((int)(short)(-1));
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo12 = grafo9.grafoTransposto();
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array15 = grafo13.peso;
    grafo7.peso = i_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array11 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo6.peso = i_array11;
    int[] i_array13 = grafo6.peso;
    grafo1.prox = i_array13;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo15 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int i5 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), 10, 10);
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
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)(-1), (int)(short)1, (-1));
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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    grafo5.insereAresta((int)(short)10, 0, (int)(short)100);
    ds.Grafo grafo12 = new ds.Grafo((int)'4');
    int[] i_array17 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo12.peso = i_array17;
    int[] i_array19 = grafo12.peso;
    boolean b21 = grafo12.listaAdjVazia((int)(byte)1);
    int[] i_array22 = grafo12.cab;
    grafo5.cab = i_array22;
    boolean b25 = grafo5.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(short)0);
    int[] i_array8 = grafo5.cab;
    int[] i_array9 = grafo5.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj(52);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int i8 = grafo1.numVertices();
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array15 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo10.peso = i_array15;
    int[] i_array17 = grafo10.peso;
    boolean b19 = grafo10.listaAdjVazia((int)(byte)1);
    int[] i_array20 = grafo10.cab;
    grafo1.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test30"); }


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
    grafo5.insereAresta((int)' ', (int)(byte)100, 0);
    
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

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(1);
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    int[] i_array18 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo13.peso = i_array18;
    int[] i_array20 = grafo13.peso;
    grafo8.prox = i_array20;
    int[] i_array22 = grafo8.prox;
    int[] i_array23 = grafo8.cab;
    grafo1.prox = i_array23;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int)(short)(-1), (int)'4');
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
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    grafo5.insereAresta((int)(short)10, 0, (int)(short)100);
    ds.Grafo grafo12 = new ds.Grafo((int)'4');
    int[] i_array17 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo12.peso = i_array17;
    int[] i_array19 = grafo12.peso;
    boolean b21 = grafo12.listaAdjVazia((int)(byte)1);
    int[] i_array22 = grafo12.cab;
    grafo5.cab = i_array22;
    boolean b25 = grafo5.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b10 = grafo1.listaAdjVazia((int)(byte)1);
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo13 = grafo10.grafoTransposto();
    ds.Grafo grafo14 = grafo10.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int)(short)0);
    ds.Grafo grafo18 = new ds.Grafo((int)'4');
    int[] i_array23 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo18.peso = i_array23;
    int[] i_array25 = grafo18.peso;
    boolean b27 = grafo18.listaAdjVazia((int)(byte)1);
    int[] i_array28 = grafo18.cab;
    grafo14.prox = i_array28;
    grafo1.peso = i_array28;
    ds.Grafo grafo32 = new ds.Grafo((int)'4');
    int[] i_array37 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo32.peso = i_array37;
    int[] i_array39 = grafo32.peso;
    ds.Grafo grafo41 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta43 = grafo41.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo44 = grafo41.grafoTransposto();
    ds.Grafo grafo45 = grafo41.grafoTransposto();
    ds.Grafo.Aresta aresta47 = grafo45.proxAdj((int)(short)0);
    ds.Grafo grafo49 = new ds.Grafo((int)'4');
    int[] i_array54 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo49.peso = i_array54;
    int[] i_array56 = grafo49.peso;
    boolean b58 = grafo49.listaAdjVazia((int)(byte)1);
    int[] i_array59 = grafo49.cab;
    grafo45.prox = i_array59;
    grafo32.peso = i_array59;
    grafo1.prox = i_array59;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo12 = grafo9.grafoTransposto();
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    grafo13.insereAresta((int)(short)10, 0, (int)(short)100);
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array25 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo20.peso = i_array25;
    int[] i_array27 = grafo20.peso;
    boolean b29 = grafo20.listaAdjVazia((int)(byte)1);
    int[] i_array30 = grafo20.cab;
    grafo13.cab = i_array30;
    grafo5.peso = i_array30;
    int[] i_array33 = grafo5.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo5.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)100);
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta15 = grafo13.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo16 = grafo13.grafoTransposto();
    ds.Grafo grafo17 = grafo13.grafoTransposto();
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    ds.Grafo grafo19 = grafo17.grafoTransposto();
    int[] i_array20 = grafo19.prox;
    grafo1.prox = i_array20;
    int[] i_array22 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array6 = new int[] { (byte)(-1), (short)1, (-1), (byte)(-1) };
    grafo1.peso = i_array6;
    int[] i_array8 = grafo1.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo13 = grafo10.grafoTransposto();
    ds.Grafo grafo14 = grafo10.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    grafo14.insereAresta((int)(short)10, 0, (int)(short)100);
    int[] i_array20 = grafo14.peso;
    grafo1.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

}
