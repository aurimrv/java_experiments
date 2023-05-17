package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b3 = grafo1.listaAdjVazia(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(byte)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int i8 = grafo6.numVertices();
    int[] i_array9 = grafo6.prox;
    ds.Grafo grafo11 = new ds.Grafo(0);
    int[] i_array12 = grafo11.peso;
    int[] i_array13 = grafo11.peso;
    ds.Grafo grafo14 = grafo11.grafoTransposto();
    ds.Grafo grafo16 = new ds.Grafo(0);
    int[] i_array17 = grafo16.peso;
    int[] i_array18 = grafo16.peso;
    grafo14.prox = i_array18;
    int[] i_array20 = grafo14.prox;
    grafo6.prox = i_array20;
    grafo1.cab = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int[] i_array8 = grafo6.peso;
    ds.Grafo grafo9 = grafo6.grafoTransposto();
    ds.Grafo grafo11 = new ds.Grafo(0);
    int[] i_array12 = grafo11.peso;
    int[] i_array13 = grafo11.peso;
    grafo9.prox = i_array13;
    int[] i_array15 = grafo9.prox;
    grafo1.prox = i_array15;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta18 = grafo1.proxAdj((int)'a');
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo4.retiraAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo4.existeAresta((int)(byte)10, (-1));
    ds.Grafo grafo9 = new ds.Grafo(0);
    int[] i_array10 = grafo9.prox;
    grafo4.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)(short)10, (int)(byte)0, (int)'a');
    int[] i_array9 = grafo1.peso;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    grafo1.insereAresta((int)(byte)10, 10, 10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)100);
    grafo1.insereAresta(10, (int)(byte)100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int[] i_array8 = grafo6.peso;
    ds.Grafo grafo9 = grafo6.grafoTransposto();
    ds.Grafo grafo11 = new ds.Grafo(0);
    int[] i_array12 = grafo11.peso;
    int[] i_array13 = grafo11.peso;
    grafo9.prox = i_array13;
    int[] i_array15 = grafo9.prox;
    grafo1.prox = i_array15;
    ds.Grafo grafo18 = new ds.Grafo(0);
    grafo18.imprime();
    int[] i_array20 = grafo18.peso;
    grafo1.cab = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    boolean b6 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)'4', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
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
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo5 = new ds.Grafo(0);
    int[] i_array6 = grafo5.peso;
    int[] i_array7 = grafo5.peso;
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    int[] i_array9 = grafo5.peso;
    grafo1.cab = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo3 = new ds.Grafo(0);
    int[] i_array4 = grafo3.peso;
    int[] i_array5 = grafo3.peso;
    ds.Grafo grafo6 = grafo3.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    int[] i_array9 = grafo8.peso;
    int[] i_array10 = grafo8.peso;
    grafo6.prox = i_array10;
    grafo1.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int[] i_array8 = grafo6.peso;
    grafo4.prox = i_array8;
    int[] i_array10 = grafo4.cab;
    boolean b12 = grafo4.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int[] i_array8 = grafo6.peso;
    grafo4.prox = i_array8;
    int[] i_array10 = grafo4.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta12 = grafo4.proxAdj(100);
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
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.prox;
    boolean b5 = grafo1.existeAresta((int)' ', (int)(byte)0);
    ds.Grafo grafo7 = new ds.Grafo(0);
    int[] i_array8 = grafo7.prox;
    ds.Grafo grafo10 = new ds.Grafo(0);
    int[] i_array11 = grafo10.peso;
    int i12 = grafo10.numVertices();
    int[] i_array13 = grafo10.prox;
    ds.Grafo grafo15 = new ds.Grafo(0);
    int[] i_array16 = grafo15.peso;
    int[] i_array17 = grafo15.peso;
    ds.Grafo grafo18 = grafo15.grafoTransposto();
    ds.Grafo grafo20 = new ds.Grafo(0);
    int[] i_array21 = grafo20.peso;
    int[] i_array22 = grafo20.peso;
    grafo18.prox = i_array22;
    int[] i_array24 = grafo18.prox;
    grafo10.prox = i_array24;
    ds.Grafo grafo27 = new ds.Grafo(0);
    int[] i_array28 = grafo27.peso;
    int[] i_array29 = grafo27.peso;
    ds.Grafo grafo30 = grafo27.grafoTransposto();
    ds.Grafo grafo32 = new ds.Grafo(0);
    int[] i_array33 = grafo32.peso;
    int[] i_array34 = grafo32.peso;
    grafo30.prox = i_array34;
    int[] i_array36 = grafo30.prox;
    grafo10.cab = i_array36;
    grafo7.prox = i_array36;
    grafo1.cab = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int[] i_array8 = grafo6.peso;
    grafo4.prox = i_array8;
    ds.Grafo.Aresta aresta12 = grafo4.retiraAresta((int)(byte)100, (int)'#');
    int i13 = grafo4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    grafo1.insereAresta((int)(short)100, (int)(short)100, (int)'#');

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo4.existeAresta((int)(byte)10, (-1));
    int[] i_array8 = grafo4.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo4.existeAresta((int)(byte)10, (-1));
    boolean b10 = grafo4.existeAresta((int)(short)10, (int)(short)0);
    ds.Grafo grafo12 = new ds.Grafo(0);
    int[] i_array13 = grafo12.peso;
    int i14 = grafo12.numVertices();
    int[] i_array15 = grafo12.prox;
    boolean b17 = grafo12.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo19 = new ds.Grafo(0);
    int[] i_array20 = grafo19.peso;
    int[] i_array21 = grafo19.peso;
    ds.Grafo grafo23 = new ds.Grafo(0);
    int[] i_array24 = grafo23.peso;
    int[] i_array25 = grafo23.peso;
    ds.Grafo grafo26 = grafo23.grafoTransposto();
    ds.Grafo grafo28 = new ds.Grafo(0);
    int[] i_array29 = grafo28.prox;
    grafo23.peso = i_array29;
    grafo19.peso = i_array29;
    grafo12.peso = i_array29;
    grafo4.cab = i_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.peso;
    int i8 = grafo6.numVertices();
    int[] i_array9 = grafo6.prox;
    grafo6.insereAresta((int)(short)10, (int)(byte)0, (int)'a');
    int[] i_array14 = grafo6.peso;
    ds.Grafo grafo15 = grafo6.grafoTransposto();
    int[] i_array16 = grafo6.cab;
    grafo1.peso = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    grafo1.insereAresta(0, (int)(short)(-1), 100);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.prox;
    grafo1.insereAresta((int)(short)10, (int)(byte)0, (int)'a');
    ds.Grafo grafo10 = new ds.Grafo(0);
    int[] i_array11 = grafo10.prox;
    grafo1.cab = i_array11;
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    int[] i_array8 = new int[] { 10, 0, (byte)1, 'a' };
    grafo1.cab = i_array8;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

}
