package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo1.existeAresta((int)(byte)(-1), 1);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo1.listaAdjVazia((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    boolean b4 = grafo1.existeAresta((int)(byte)10, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


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
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'a');
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    int[] i_array11 = grafo1.prox;
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(byte)0);
    int[] i_array16 = grafo13.prox;
    grafo13.insereAresta((int)' ', (int)'4', (int)'a');
    int[] i_array21 = grafo13.peso;
    grafo1.peso = i_array21;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    int[] i_array9 = grafo1.peso;
    grafo1.insereAresta(100, (int)(short)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    int[] i_array9 = grafo1.peso;
    boolean b11 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


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
    ds.Grafo grafo15 = grafo1.grafoTransposto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    int[] i_array6 = grafo1.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(byte)0);
    int[] i_array16 = grafo13.prox;
    grafo8.prox = i_array16;
    int[] i_array18 = grafo8.cab;
    grafo1.peso = i_array18;
    boolean b21 = grafo1.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


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
    ds.Grafo grafo16 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta18 = grafo16.proxAdj((int)(byte)0);
    int[] i_array19 = grafo16.prox;
    grafo16.insereAresta((int)' ', (int)'4', (int)'a');
    int[] i_array24 = grafo16.peso;
    grafo1.prox = i_array24;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int)(byte)0);
    int[] i_array12 = grafo9.prox;
    grafo1.prox = i_array12;
    boolean b16 = grafo1.existeAresta((int)(short)0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int)(byte)10);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    int[] i_array11 = grafo1.cab;
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int)(byte)0);
    int[] i_array12 = grafo9.prox;
    grafo1.prox = i_array12;
    boolean b16 = grafo1.existeAresta((int)(byte)100, 1);
    
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

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    int[] i_array11 = grafo1.cab;
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int)(byte)0);
    int[] i_array17 = grafo14.prox;
    int[] i_array18 = grafo14.cab;
    int[] i_array19 = grafo14.prox;
    grafo12.cab = i_array19;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo grafo3 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(byte)0);
    int[] i_array6 = grafo3.prox;
    int[] i_array7 = grafo3.cab;
    int[] i_array8 = grafo3.prox;
    grafo1.prox = i_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    int[] i_array6 = grafo1.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(byte)0);
    int[] i_array16 = grafo13.prox;
    grafo8.prox = i_array16;
    int[] i_array18 = grafo8.cab;
    grafo1.peso = i_array18;
    int[] i_array21 = new int[] { ' ' };
    grafo1.peso = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.prox;
    boolean b8 = grafo1.existeAresta((int)(byte)10, 100);
    boolean b10 = grafo1.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.peso;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'a', 0);
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo9.proxAdj((int)(byte)0);
    int[] i_array12 = grafo9.prox;
    grafo1.prox = i_array12;
    int i14 = grafo1.numVertices();
    int[] i_array15 = grafo1.peso;
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    int[] i_array6 = grafo1.prox;
    boolean b8 = grafo1.listaAdjVazia((int)'a');
    boolean b11 = grafo1.existeAresta((int)(short)10, (int)(short)100);
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(byte)0);
    int[] i_array16 = grafo13.prox;
    int[] i_array17 = grafo13.cab;
    grafo1.peso = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    int[] i_array6 = grafo1.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    int[] i_array11 = grafo8.prox;
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(byte)0);
    int[] i_array16 = grafo13.prox;
    grafo8.prox = i_array16;
    int[] i_array18 = grafo8.cab;
    grafo1.peso = i_array18;
    ds.Grafo grafo20 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta22 = grafo20.proxAdj(100);
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.existeAresta((int)(short)(-1), (-1));
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
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int)(short)100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta(0, (int)(short)(-1), (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj(10);
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    int[] i_array12 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(byte)0);
    int[] i_array9 = grafo6.prox;
    grafo1.prox = i_array9;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((-1));
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
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)' ', (int)'4', (int)'a');
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int)(short)0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

}
