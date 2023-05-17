package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = grafo1.existeAresta((int)(byte)(-1), 0);
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
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(short)1, 10, (int)(byte)1);
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

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test05"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta36 = grafo1.proxAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    int[] i_array3 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo12 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int)(short)1, (int)(byte)10);
    grafo12.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta21 = grafo12.primeiroListaAdj((int)(byte)0);
    int[] i_array22 = grafo12.peso;
    grafo1.prox = i_array22;
    ds.Grafo grafo25 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta28 = grafo25.retiraAresta((int)(short)1, (int)(byte)10);
    grafo25.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta34 = grafo25.primeiroListaAdj((int)(byte)0);
    int[] i_array35 = grafo25.peso;
    int[] i_array36 = grafo25.cab;
    grafo1.peso = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo6 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int)(short)1, (int)(byte)10);
    grafo6.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta15 = grafo6.primeiroListaAdj((int)(byte)0);
    int[] i_array16 = grafo6.peso;
    grafo1.prox = i_array16;
    ds.Grafo grafo19 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int)(short)1, (int)(byte)10);
    grafo19.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta28 = grafo19.primeiroListaAdj((int)(byte)0);
    int[] i_array29 = grafo19.peso;
    grafo1.peso = i_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo12 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int)(short)1, (int)(byte)10);
    grafo12.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta21 = grafo12.primeiroListaAdj((int)(byte)0);
    int[] i_array22 = grafo12.peso;
    grafo1.prox = i_array22;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj((int)(byte)100);
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
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    int[] i_array9 = null;
    grafo1.prox = i_array9;
    int[] i_array11 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array11);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)100, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array11 = grafo1.peso;
    boolean b14 = grafo1.existeAresta(100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    int[] i_array36 = new int[] { (short)1 };
    grafo1.peso = i_array36;
    boolean b39 = grafo1.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array11 = grafo1.peso;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    int i4 = grafo3.numVertices();
    grafo3.insereAresta((int)'a', (int)'4', 10);
    boolean b10 = grafo3.listaAdjVazia((int)(byte)0);
    int[] i_array11 = grafo3.peso;
    grafo1.prox = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 10);
    ds.Grafo grafo10 = new ds.Grafo(10);
    ds.Grafo grafo12 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta15 = grafo12.retiraAresta((int)(short)1, (int)(byte)10);
    grafo12.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta21 = grafo12.primeiroListaAdj((int)(byte)0);
    int[] i_array22 = grafo12.peso;
    int[] i_array23 = grafo12.cab;
    grafo10.prox = i_array23;
    grafo1.peso = i_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array11 = grafo1.peso;
    int[] i_array12 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo.Aresta aresta23 = grafo1.retiraAresta((int)'a', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    grafo1.insereAresta((int)'#', (int)(short)10, (int)(byte)0);
    ds.Grafo.Aresta aresta27 = grafo1.retiraAresta(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta27);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    int[] i_array36 = new int[] { (short)1 };
    grafo1.peso = i_array36;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo6 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int)(short)1, (int)(byte)10);
    grafo6.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta15 = grafo6.primeiroListaAdj((int)(byte)0);
    int[] i_array16 = grafo6.peso;
    grafo1.prox = i_array16;
    boolean b19 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    grafo1.insereAresta((int)'#', (int)(short)10, (int)(byte)0);
    int i25 = grafo1.numVertices();
    boolean b28 = grafo1.existeAresta((int)(short)1, 10);
    int[] i_array29 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    grafo1.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array11 = grafo1.peso;
    int[] i_array12 = null;
    grafo1.peso = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b4 = grafo1.existeAresta((int)(byte)100, 0);
    ds.Grafo grafo6 = new ds.Grafo(10);
    int i7 = grafo6.numVertices();
    ds.Grafo grafo9 = new ds.Grafo(10);
    ds.Grafo grafo11 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta14 = grafo11.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo16 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((int)(short)1, (int)(byte)10);
    grafo16.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta25 = grafo16.primeiroListaAdj((int)(byte)0);
    int[] i_array26 = grafo16.peso;
    grafo11.prox = i_array26;
    grafo9.cab = i_array26;
    grafo6.cab = i_array26;
    grafo1.prox = i_array26;
    ds.Grafo.Aresta aresta32 = grafo1.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta32);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    int i35 = grafo1.numVertices();
    ds.Grafo.Aresta aresta37 = grafo1.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta37);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    ds.Grafo grafo22 = new ds.Grafo(10);
    ds.Grafo grafo24 = new ds.Grafo(10);
    int i25 = grafo24.numVertices();
    grafo24.insereAresta((int)'a', (int)'4', 10);
    boolean b31 = grafo24.listaAdjVazia((int)(byte)0);
    int[] i_array32 = grafo24.peso;
    grafo22.prox = i_array32;
    grafo1.prox = i_array32;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta36 = grafo1.primeiroListaAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)1, (int)(byte)10);
    grafo8.insereAresta((int)(byte)10, 100, 0);
    ds.Grafo.Aresta aresta17 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array18 = grafo8.peso;
    grafo3.prox = i_array18;
    grafo1.cab = i_array18;
    grafo1.insereAresta((int)'#', (int)(short)10, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)100, (int)(short)100);
    ds.Grafo grafo6 = new ds.Grafo(10);
    ds.Grafo grafo8 = new ds.Grafo(10);
    int i9 = grafo8.numVertices();
    grafo8.insereAresta((int)'a', (int)'4', 10);
    boolean b15 = grafo8.listaAdjVazia((int)(byte)0);
    int[] i_array16 = grafo8.peso;
    grafo6.prox = i_array16;
    grafo1.cab = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo(10);
    int i4 = grafo3.numVertices();
    grafo3.insereAresta((int)'a', (int)'4', 10);
    boolean b10 = grafo3.listaAdjVazia((int)(byte)0);
    int[] i_array11 = grafo3.peso;
    grafo1.prox = i_array11;
    int i13 = grafo1.numVertices();
    int[] i_array14 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

}
