package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    int[] i_array16 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo10.prox = i_array17;
    grafo1.peso = i_array17;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int[] i_array2 = null;
    grafo1.cab = i_array2;

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo1.prox = i_array8;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo11.cab = i_array17;
    grafo1.peso = i_array17;
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = grafo1.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    ds.Grafo.Aresta aresta17 = grafo1.proxAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'#', (-1), 100);
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
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(short)10, (int)'4', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)100);
    int[] i_array12 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo6.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array22 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo15.prox = i_array22;
    grafo6.peso = i_array22;
    grafo1.peso = i_array22;
    int i26 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo5.cab = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta17 = grafo14.retiraAresta(100, (int)' ');
    int[] i_array18 = grafo14.prox;
    grafo5.peso = i_array18;
    int i20 = grafo5.numVertices();
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)100);
    int[] i_array28 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo22.cab = i_array28;
    ds.Grafo grafo31 = new ds.Grafo((int)(byte)100);
    int[] i_array38 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo31.prox = i_array38;
    grafo22.peso = i_array38;
    int[] i_array41 = grafo22.peso;
    grafo5.cab = i_array41;
    grafo1.peso = i_array41;
    ds.Grafo.Aresta aresta45 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta45);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo3.cab = i_array9;
    grafo1.peso = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo10.prox = i_array17;
    grafo1.peso = i_array17;
    int[] i_array20 = grafo1.peso;
    ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)' ');
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo10.prox = i_array17;
    grafo1.peso = i_array17;
    int[] i_array20 = grafo1.peso;
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    int[] i_array22 = grafo21.cab;
    int i23 = grafo21.numVertices();
    grafo21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)' ');
    int[] i_array5 = grafo1.prox;
    boolean b7 = grafo1.listaAdjVazia(0);
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)'a', (int)(short)100);
    int[] i_array11 = grafo1.cab;
    int[] i_array12 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array13 = grafo9.prox;
    int i14 = grafo9.numVertices();
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array20 = grafo16.prox;
    grafo9.cab = i_array20;
    grafo1.cab = i_array20;
    int[] i_array23 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    grafo1.insereAresta((int)(short)10, (-1), (int)'4');
    int[] i_array6 = grafo1.peso;
    int[] i_array7 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array13 = grafo9.prox;
    int i14 = grafo9.numVertices();
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array20 = grafo16.prox;
    grafo9.cab = i_array20;
    grafo1.cab = i_array20;
    // The following exception was thrown during execution in test generation
    try {
    boolean b24 = grafo1.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    boolean b7 = grafo1.listaAdjVazia(10);
    boolean b9 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    int[] i_array9 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    int i16 = grafo1.numVertices();
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)100);
    int[] i_array24 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo18.cab = i_array24;
    ds.Grafo grafo27 = new ds.Grafo((int)(byte)100);
    int[] i_array34 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo27.prox = i_array34;
    grafo18.peso = i_array34;
    int[] i_array37 = grafo18.peso;
    grafo1.cab = i_array37;
    boolean b40 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo41 = grafo1.grafoTransposto();
    ds.Grafo grafo43 = new ds.Grafo((int)(byte)100);
    int[] i_array49 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo43.cab = i_array49;
    int[] i_array51 = grafo43.peso;
    ds.Grafo grafo53 = new ds.Grafo((int)(byte)100);
    int[] i_array60 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo53.prox = i_array60;
    grafo43.peso = i_array60;
    grafo1.peso = i_array60;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta65 = grafo1.primeiroListaAdj((-1));
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
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, (int)(byte)(-1), (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo8.cab = i_array14;
    grafo1.peso = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    int i16 = grafo1.numVertices();
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)100);
    int[] i_array24 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo18.cab = i_array24;
    ds.Grafo grafo27 = new ds.Grafo((int)(byte)100);
    int[] i_array34 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo27.prox = i_array34;
    grafo18.peso = i_array34;
    int[] i_array37 = grafo18.peso;
    grafo1.cab = i_array37;
    boolean b40 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo41 = grafo1.grafoTransposto();
    boolean b43 = grafo1.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array12 = grafo8.prox;
    grafo1.cab = i_array12;
    int i14 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

}
