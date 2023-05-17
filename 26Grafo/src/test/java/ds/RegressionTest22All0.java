package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    grafo1.imprime();
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta((int)(short)0, (-1));
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo.Aresta aresta10 = grafo6.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta12 = grafo6.primeiroListaAdj((int)(short)0);
    int[] i_array13 = grafo6.cab;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)1, 10);
    int i9 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)'a', (int)'4', 1);
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.peso;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int)' ', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.prox;
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo.Aresta aresta10 = grafo6.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta12 = grafo6.primeiroListaAdj((int)(short)0);
    int[] i_array13 = grafo6.cab;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo grafo9 = grafo6.grafoTransposto();
    int[] i_array10 = grafo6.prox;
    grafo1.prox = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    grafo1.imprime();
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo.Aresta aresta10 = grafo6.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta12 = grafo6.primeiroListaAdj((int)(short)0);
    int[] i_array13 = grafo6.cab;
    grafo1.peso = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.cab;
    grafo1.insereAresta((int)(short)1, (int)(byte)1, 0);
    
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo3 = new ds.Grafo((int)' ');
    boolean b5 = grafo3.listaAdjVazia(100);
    int[] i_array6 = grafo3.cab;
    grafo1.cab = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.cab;
    int[] i_array10 = grafo1.cab;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)1, 10);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'#');
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.cab;
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(short)10);
    int[] i_array12 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(byte)(-1));
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
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta((int)(short)0, (-1));
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo grafo9 = grafo6.grafoTransposto();
    int[] i_array10 = grafo6.prox;
    grafo1.cab = i_array10;
    boolean b14 = grafo1.existeAresta(1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)' ');
    boolean b9 = grafo7.listaAdjVazia(100);
    ds.Grafo.Aresta aresta11 = grafo7.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta13 = grafo7.primeiroListaAdj((int)(short)0);
    int[] i_array14 = grafo7.cab;
    int[] i_array15 = grafo7.cab;
    grafo5.prox = i_array15;
    ds.Grafo grafo18 = new ds.Grafo((int)' ');
    boolean b21 = grafo18.existeAresta((int)(short)0, (-1));
    ds.Grafo grafo23 = new ds.Grafo((int)' ');
    boolean b25 = grafo23.listaAdjVazia(100);
    ds.Grafo grafo26 = grafo23.grafoTransposto();
    int[] i_array27 = grafo23.prox;
    grafo18.cab = i_array27;
    grafo5.prox = i_array27;
    ds.Grafo grafo31 = new ds.Grafo((int)' ');
    boolean b33 = grafo31.listaAdjVazia(100);
    ds.Grafo grafo34 = grafo31.grafoTransposto();
    int i35 = grafo31.numVertices();
    int[] i_array36 = grafo31.peso;
    grafo5.cab = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)' ');
    boolean b9 = grafo7.listaAdjVazia(100);
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    int[] i_array11 = grafo7.prox;
    grafo5.prox = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo5.retiraAresta((int)(short)(-1), (int)'4');
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

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    boolean b7 = grafo1.existeAresta(100, (int)(short)0);
    boolean b9 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)1);
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
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)1, 10);
    boolean b10 = grafo1.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    boolean b8 = grafo1.existeAresta((int)'a', (int)(short)100);
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.cab;
    int[] i_array10 = grafo1.peso;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array8 = grafo1.peso;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(byte)0, (int)'4');
    ds.Grafo grafo13 = new ds.Grafo((int)' ');
    boolean b16 = grafo13.existeAresta((int)(short)0, (-1));
    ds.Grafo grafo17 = grafo13.grafoTransposto();
    int[] i_array18 = grafo17.peso;
    grafo1.prox = i_array18;
    boolean b21 = grafo1.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.prox;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta((int)(short)0, (-1));
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    boolean b8 = grafo6.listaAdjVazia(100);
    ds.Grafo grafo9 = grafo6.grafoTransposto();
    int[] i_array10 = grafo6.prox;
    grafo1.cab = i_array10;
    int[] i_array12 = null;
    grafo1.cab = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(byte)10);
    boolean b10 = grafo1.existeAresta((int)' ', (int)(short)100);
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo1.numVertices();
    int[] i_array6 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b3 = grafo1.listaAdjVazia(100);
    int[] i_array4 = grafo1.cab;
    boolean b7 = grafo1.existeAresta(100, (int)(short)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
