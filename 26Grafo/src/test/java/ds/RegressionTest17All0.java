package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array7 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    int[] i_array10 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array7 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo1.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    int i15 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta17 = grafo1.proxAdj(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array16 = grafo15.peso;
    grafo1.peso = i_array16;
    int[] i_array18 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int i14 = grafo1.numVertices();
    int i15 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array4 = grafo3.peso;
    grafo1.peso = i_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array5 = new int[] { (short)10, 0, (byte)100 };
    grafo1.cab = i_array5;
    boolean b8 = grafo1.listaAdjVazia(10);
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = grafo1.listaAdjVazia((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(0);
    grafo4.imprime();
    int[] i_array10 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo4.peso = i_array10;
    grafo1.prox = i_array10;
    boolean b15 = grafo1.existeAresta((int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = grafo1.existeAresta(10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array5 = new int[] { (short)10, 0, (byte)100 };
    grafo1.cab = i_array5;
    boolean b8 = grafo1.listaAdjVazia(10);
    grafo1.insereAresta(0, (int)(short)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array7 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)(short)0);
    int[] i_array12 = grafo11.peso;
    grafo1.cab = i_array12;
    ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int)' ', (int)'a');
    ds.Grafo grafo18 = new ds.Grafo(0);
    grafo18.imprime();
    ds.Grafo grafo21 = new ds.Grafo(0);
    grafo21.imprime();
    int[] i_array27 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo21.peso = i_array27;
    grafo18.prox = i_array27;
    grafo1.prox = i_array27;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array5 = new int[] { (short)10, 0, (byte)100 };
    grafo1.cab = i_array5;
    boolean b8 = grafo1.listaAdjVazia(10);
    int[] i_array11 = new int[] { (byte)100, 10 };
    grafo1.prox = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(0);
    grafo4.imprime();
    int[] i_array10 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo4.peso = i_array10;
    int[] i_array12 = grafo4.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(short)0);
    int[] i_array15 = grafo14.peso;
    grafo4.cab = i_array15;
    ds.Grafo.Aresta aresta19 = grafo4.retiraAresta((int)' ', (int)'a');
    ds.Grafo grafo21 = new ds.Grafo(0);
    grafo21.imprime();
    int[] i_array27 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo21.peso = i_array27;
    int[] i_array29 = grafo21.peso;
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    int[] i_array32 = grafo31.peso;
    grafo21.cab = i_array32;
    ds.Grafo.Aresta aresta36 = grafo21.retiraAresta((int)' ', (int)'a');
    int[] i_array37 = grafo21.prox;
    grafo4.prox = i_array37;
    grafo1.prox = i_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(0);
    grafo4.imprime();
    int[] i_array10 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo4.peso = i_array10;
    grafo1.prox = i_array10;
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    boolean b15 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array16 = grafo15.peso;
    grafo1.peso = i_array16;
    ds.Grafo grafo19 = new ds.Grafo(0);
    grafo19.imprime();
    int[] i_array21 = grafo19.prox;
    ds.Grafo grafo23 = new ds.Grafo(0);
    grafo23.imprime();
    int[] i_array29 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo23.peso = i_array29;
    grafo19.cab = i_array29;
    int[] i_array32 = grafo19.prox;
    grafo1.cab = i_array32;
    boolean b35 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta(0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    int i15 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(0);
    grafo4.imprime();
    int[] i_array10 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo4.peso = i_array10;
    grafo1.prox = i_array10;
    grafo1.imprime();
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo(0);
    grafo3.imprime();
    int[] i_array5 = grafo3.prox;
    grafo1.prox = i_array5;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    int[] i_array9 = new int[] { (short)10, 0, (byte)100 };
    grafo5.cab = i_array9;
    grafo1.prox = i_array9;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int)(byte)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(short)100, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array5 = new int[] { (short)10, 0, (byte)100 };
    grafo1.cab = i_array5;
    boolean b8 = grafo1.listaAdjVazia(10);
    ds.Grafo grafo10 = new ds.Grafo(0);
    grafo10.imprime();
    int[] i_array12 = grafo10.prox;
    ds.Grafo grafo14 = new ds.Grafo(0);
    grafo14.imprime();
    int[] i_array20 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo14.peso = i_array20;
    grafo10.cab = i_array20;
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    int[] i_array25 = grafo24.peso;
    grafo10.peso = i_array25;
    ds.Grafo grafo28 = new ds.Grafo(0);
    grafo28.imprime();
    int[] i_array30 = grafo28.prox;
    ds.Grafo grafo32 = new ds.Grafo(0);
    grafo32.imprime();
    int[] i_array38 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo32.peso = i_array38;
    grafo28.cab = i_array38;
    int[] i_array41 = grafo28.prox;
    grafo10.cab = i_array41;
    grafo1.cab = i_array41;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo(0);
    grafo3.imprime();
    int[] i_array5 = grafo3.prox;
    grafo1.prox = i_array5;
    int i7 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    boolean b15 = grafo1.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    grafo1.imprime();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array7 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)(short)0);
    int[] i_array12 = grafo11.peso;
    grafo1.cab = i_array12;
    ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int)' ', (int)'a');
    int[] i_array17 = grafo1.cab;
    int[] i_array18 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo5 = new ds.Grafo(0);
    grafo5.imprime();
    int[] i_array11 = new int[] { '#', (short)0, 100, (byte)100 };
    grafo5.peso = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    int i15 = grafo1.numVertices();
    int i16 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

}
