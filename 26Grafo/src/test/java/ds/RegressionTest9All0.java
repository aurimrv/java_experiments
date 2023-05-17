package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(100);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b3 = grafo1.listaAdjVazia((int)'#');
    int[] i_array4 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.listaAdjVazia((int)(byte)(-1));
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo(0);
    int[] i_array9 = grafo8.prox;
    grafo1.prox = i_array9;
    boolean b13 = grafo1.existeAresta((int)(short)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    grafo1.imprime();
    int[] i_array7 = grafo1.prox;
    ds.Grafo grafo9 = new ds.Grafo(0);
    boolean b11 = grafo9.listaAdjVazia((int)'#');
    int[] i_array12 = grafo9.cab;
    grafo1.prox = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta((int)(short)1, 10, (int)(short)100);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'a', 100);
    grafo1.insereAresta((int)(byte)10, (-1), (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    grafo1.insereAresta((int)'4', 1, 1);
    boolean b9 = grafo1.existeAresta((int)(short)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    grafo1.insereAresta((int)(short)100, (int)(short)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    ds.Grafo grafo6 = new ds.Grafo(0);
    grafo6.imprime();
    ds.Grafo.Aresta aresta10 = grafo6.retiraAresta((int)'a', 100);
    boolean b12 = grafo6.listaAdjVazia((int)'#');
    int[] i_array13 = grafo6.cab;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test17"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    grafo1.insereAresta((int)'4', 1, 1);
    ds.Grafo grafo8 = new ds.Grafo(0);
    grafo8.imprime();
    ds.Grafo.Aresta aresta12 = grafo8.retiraAresta((int)'a', 100);
    ds.Grafo grafo14 = new ds.Grafo(0);
    boolean b17 = grafo14.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array18 = grafo14.prox;
    int[] i_array19 = grafo14.cab;
    ds.Grafo grafo21 = new ds.Grafo(0);
    int[] i_array22 = grafo21.prox;
    grafo14.prox = i_array22;
    ds.Grafo grafo25 = new ds.Grafo(0);
    boolean b28 = grafo25.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array29 = grafo25.prox;
    grafo14.prox = i_array29;
    grafo8.cab = i_array29;
    grafo1.prox = i_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'a', 100);
    boolean b7 = grafo1.listaAdjVazia((int)'#');
    int[] i_array8 = grafo1.cab;
    boolean b10 = grafo1.listaAdjVazia(1);
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'a', 100);
    boolean b7 = grafo1.listaAdjVazia((int)'#');
    int[] i_array8 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo1.existeAresta((int)(short)(-1), (int)(byte)0);
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'a', 100);
    boolean b7 = grafo1.listaAdjVazia((int)'#');
    int[] i_array8 = grafo1.cab;
    boolean b10 = grafo1.listaAdjVazia(1);
    int[] i_array11 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = null;
    grafo1.peso = i_array5;
    int i7 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo(0);
    int[] i_array9 = grafo8.prox;
    grafo1.prox = i_array9;
    ds.Grafo grafo12 = new ds.Grafo(0);
    boolean b15 = grafo12.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array16 = grafo12.prox;
    grafo1.prox = i_array16;
    ds.Grafo grafo19 = new ds.Grafo(0);
    int[] i_array20 = grafo19.cab;
    ds.Grafo grafo22 = new ds.Grafo(0);
    boolean b24 = grafo22.listaAdjVazia((int)'#');
    int[] i_array25 = grafo22.prox;
    grafo19.prox = i_array25;
    grafo1.cab = i_array25;
    ds.Grafo grafo29 = new ds.Grafo(0);
    boolean b31 = grafo29.listaAdjVazia((int)'#');
    int[] i_array32 = grafo29.prox;
    int[] i_array33 = grafo29.cab;
    ds.Grafo grafo35 = new ds.Grafo(0);
    int[] i_array36 = grafo35.prox;
    grafo29.cab = i_array36;
    grafo1.prox = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo(0);
    int[] i_array9 = grafo8.prox;
    grafo1.prox = i_array9;
    ds.Grafo grafo12 = new ds.Grafo(0);
    boolean b15 = grafo12.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array16 = grafo12.prox;
    grafo1.prox = i_array16;
    ds.Grafo grafo19 = new ds.Grafo(0);
    int[] i_array20 = grafo19.cab;
    ds.Grafo grafo22 = new ds.Grafo(0);
    boolean b24 = grafo22.listaAdjVazia((int)'#');
    int[] i_array25 = grafo22.prox;
    grafo19.prox = i_array25;
    grafo1.cab = i_array25;
    ds.Grafo.Aresta aresta30 = grafo1.retiraAresta((int)(short)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta30);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo3 = new ds.Grafo(0);
    boolean b6 = grafo3.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array7 = grafo3.prox;
    int[] i_array8 = grafo3.cab;
    ds.Grafo grafo10 = new ds.Grafo(0);
    int[] i_array11 = grafo10.prox;
    grafo3.prox = i_array11;
    ds.Grafo grafo14 = new ds.Grafo(0);
    boolean b17 = grafo14.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array18 = grafo14.prox;
    grafo3.prox = i_array18;
    grafo1.prox = i_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    grafo1.insereAresta((int)(short)100, (int)'a', (int)' ');
    boolean b10 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    boolean b4 = grafo1.existeAresta(10, (int)(byte)0);
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b3 = grafo1.listaAdjVazia((int)'#');
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;
    int[] i_array4 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)10, (int)'#', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo(0);
    boolean b6 = grafo4.listaAdjVazia((int)'#');
    int[] i_array7 = grafo4.prox;
    grafo1.prox = i_array7;
    ds.Grafo grafo10 = new ds.Grafo(0);
    int[] i_array11 = grafo10.cab;
    grafo1.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    boolean b4 = grafo1.existeAresta(10, (int)(byte)0);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.insereAresta(1, (int)(byte)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    grafo1.imprime();
    int[] i_array7 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;
    int[] i_array4 = grafo1.peso;
    ds.Grafo grafo6 = new ds.Grafo(0);
    int[] i_array7 = grafo6.cab;
    grafo1.prox = i_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo(0);
    int[] i_array9 = grafo8.prox;
    grafo1.prox = i_array9;
    ds.Grafo grafo12 = new ds.Grafo(0);
    boolean b15 = grafo12.existeAresta((int)'#', (int)(short)(-1));
    int[] i_array16 = grafo12.prox;
    grafo1.prox = i_array16;
    boolean b20 = grafo1.existeAresta((int)'a', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

}
