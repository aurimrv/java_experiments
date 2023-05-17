package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b4 = grafo1.existeAresta((-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)(-1), (int)' ', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int[] i_array14 = grafo13.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    boolean b5 = grafo1.listaAdjVazia(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)10);
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    boolean b9 = grafo1.listaAdjVazia(10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    int[] i_array10 = grafo4.prox;
    grafo1.cab = i_array10;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)'a');
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int)'4', 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    int[] i_array4 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.cab;
    int[] i_array4 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta(1, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo3.proxAdj((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    int[] i_array8 = grafo1.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    int[] i_array14 = grafo13.peso;
    grafo10.peso = i_array14;
    boolean b17 = grafo10.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo19 = new ds.Grafo((int)'4');
    int[] i_array20 = grafo19.prox;
    int[] i_array21 = grafo19.peso;
    grafo10.cab = i_array21;
    grafo1.cab = i_array21;
    boolean b26 = grafo1.existeAresta((int)(byte)10, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.insereAresta((int)(short)0, (int)(short)100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    ds.Grafo.Aresta aresta16 = grafo1.retiraAresta(0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int[] i_array7 = new int[] { (short)100, (short)0, 0, ' ', (short)1 };
    grafo1.peso = i_array7;
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)(-1), (int)(short)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int[] i_array7 = new int[] { (short)100, (short)0, 0, ' ', (short)1 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    grafo1.imprime();
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    int[] i_array9 = grafo8.prox;
    int[] i_array10 = grafo8.cab;
    grafo1.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)1, 1, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.cab;
    boolean b5 = grafo1.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)10, 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    int[] i_array14 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)(-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)1);
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo3.prox = i_array7;
    grafo3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(52, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo9.cab = i_array12;
    int[] i_array14 = grafo9.cab;
    grafo7.cab = i_array14;
    boolean b17 = grafo7.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    grafo10.imprime();
    int[] i_array12 = grafo10.cab;
    grafo1.cab = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    grafo4.cab = i_array7;
    grafo1.prox = i_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    int[] i_array11 = new int[] { ' ', (byte)100 };
    grafo1.cab = i_array11;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((-1), 1);
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    boolean b3 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(short)100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array15 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    int[] i_array10 = grafo4.prox;
    grafo1.cab = i_array10;
    int[] i_array12 = grafo1.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    int[] i_array15 = grafo14.prox;
    grafo1.cab = i_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)1);
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

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    int[] i_array10 = grafo1.peso;
    int i11 = grafo1.numVertices();
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta((int)'a', 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b5 = grafo1.listaAdjVazia(10);
    int[] i_array6 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.prox;
    int[] i_array6 = grafo4.peso;
    grafo1.peso = i_array6;
    boolean b10 = grafo1.existeAresta((int)(short)100, (int)(byte)100);
    int[] i_array11 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)10);
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array16 = new int[] { (byte)10 };
    grafo1.peso = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    int[] i_array8 = grafo1.peso;
    int i9 = grafo1.numVertices();
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    grafo14.peso = i_array18;
    grafo11.cab = i_array18;
    grafo1.prox = i_array18;
    ds.Grafo.Aresta aresta24 = grafo1.retiraAresta((int)' ', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta24);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int[] i_array7 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    boolean b6 = grafo1.existeAresta((int)' ', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)1, 1, (int)(byte)1);
    ds.Grafo grafo12 = new ds.Grafo((int)'4');
    grafo12.imprime();
    int[] i_array14 = grafo12.prox;
    grafo1.peso = i_array14;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    grafo1.insereAresta((int)(short)1, (int)(short)100, (int)(short)100);
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(0);
    boolean b17 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    int[] i_array13 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    grafo1.insereAresta(0, 52, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    int[] i_array4 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    boolean b9 = grafo1.listaAdjVazia(10);
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)0);
    int[] i_array12 = grafo11.cab;
    grafo1.peso = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    grafo1.imprime();
    grafo1.insereAresta((int)(short)100, 1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    grafo3.insereAresta(0, (-1), (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.prox;
    int[] i_array6 = grafo4.peso;
    grafo1.peso = i_array6;
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.peso;
    grafo1.cab = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta((int)' ', 10);
    int i12 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta((int)' ', 10);
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    grafo13.imprime();
    int[] i_array15 = grafo13.cab;
    int[] i_array16 = grafo13.cab;
    grafo1.peso = i_array16;
    ds.Grafo grafo19 = new ds.Grafo((int)'4');
    int[] i_array20 = grafo19.peso;
    ds.Grafo grafo22 = new ds.Grafo((int)'4');
    int[] i_array23 = grafo22.peso;
    grafo19.peso = i_array23;
    boolean b26 = grafo19.listaAdjVazia((int)(byte)100);
    int[] i_array29 = new int[] { ' ', (byte)100 };
    grafo19.cab = i_array29;
    grafo1.cab = i_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int[] i_array8 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.insereAresta((int)(byte)1, 100, 0);
    int[] i_array6 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)(-1), 100, (int)'#');
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
    int i15 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    boolean b4 = grafo1.existeAresta((int)(short)10, 10);
    boolean b7 = grafo1.existeAresta((int)' ', (int)(byte)0);
    grafo1.insereAresta((int)(short)1, (int)(byte)0, 10);
    ds.Grafo grafo13 = new ds.Grafo(0);
    grafo13.imprime();
    boolean b17 = grafo13.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array24 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo13.peso = i_array24;
    boolean b27 = grafo13.listaAdjVazia(0);
    int[] i_array28 = grafo13.peso;
    grafo1.peso = i_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = grafo1.listaAdjVazia((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.prox;
    int[] i_array11 = grafo9.cab;
    grafo7.prox = i_array11;
    int[] i_array13 = grafo7.prox;
    boolean b16 = grafo7.existeAresta((int)(byte)100, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)'#', (int)'#', 1);
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)1);
    int[] i_array10 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int[] i_array7 = grafo1.peso;
    boolean b9 = grafo1.listaAdjVazia(0);
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(0, 100);
    boolean b14 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    int[] i_array9 = grafo8.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo8.peso = i_array12;
    int[] i_array14 = grafo8.prox;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.peso;
    ds.Grafo grafo23 = new ds.Grafo((int)'4');
    int[] i_array24 = grafo23.peso;
    grafo20.peso = i_array24;
    int[] i_array26 = grafo20.prox;
    grafo17.cab = i_array26;
    int[] i_array28 = grafo17.peso;
    grafo1.prox = i_array28;
    boolean b32 = grafo1.existeAresta((int)(byte)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, 0);
    ds.Grafo grafo6 = new ds.Grafo(0);
    grafo6.imprime();
    boolean b10 = grafo6.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array17 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo6.peso = i_array17;
    int[] i_array19 = grafo6.prox;
    grafo1.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)'#', 0);
    boolean b11 = grafo1.existeAresta((int)'#', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)100);
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

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)'#', (int)'#', 1);
    int[] i_array13 = null;
    grafo1.cab = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.imprime();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(short)0, (int)(short)(-1), (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(100);
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

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    grafo1.insereAresta(0, (int)(short)100, (int)(short)100);
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    grafo9.imprime();
    int[] i_array11 = grafo9.cab;
    ds.Grafo.Aresta aresta13 = grafo9.primeiroListaAdj((int)'#');
    int[] i_array14 = grafo9.prox;
    grafo1.peso = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    grafo1.insereAresta((int)' ', (int)'#', (int)(byte)10);
    int[] i_array13 = null;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)'#', 0);
    int i9 = grafo1.numVertices();
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array15 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.prox;
    int[] i_array11 = grafo9.cab;
    grafo7.prox = i_array11;
    ds.Grafo.Aresta aresta14 = grafo7.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    boolean b15 = grafo1.listaAdjVazia(0);
    int[] i_array16 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    int[] i_array10 = grafo1.peso;
    ds.Grafo grafo12 = new ds.Grafo(0);
    int[] i_array13 = grafo12.cab;
    grafo1.cab = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int[] i_array7 = grafo1.peso;
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b11 = grafo1.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)' ', (int)'a');
    int[] i_array8 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)100, (int)'a');
    int[] i_array7 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    grafo4.cab = i_array7;
    int[] i_array9 = grafo4.cab;
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    grafo11.peso = i_array15;
    int[] i_array17 = grafo11.prox;
    grafo4.cab = i_array17;
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.peso;
    ds.Grafo grafo23 = new ds.Grafo((int)'4');
    int[] i_array24 = grafo23.peso;
    ds.Grafo grafo26 = new ds.Grafo((int)'4');
    int[] i_array27 = grafo26.peso;
    grafo23.peso = i_array27;
    int[] i_array29 = grafo23.prox;
    grafo20.cab = i_array29;
    int[] i_array31 = grafo20.peso;
    grafo4.prox = i_array31;
    grafo1.prox = i_array31;
    boolean b36 = grafo1.existeAresta((int)'4', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    ds.Grafo.Aresta aresta16 = grafo1.retiraAresta(52, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    ds.Grafo grafo15 = grafo1.grafoTransposto();
    boolean b18 = grafo1.existeAresta(10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    boolean b4 = grafo1.existeAresta((int)(short)10, 10);
    boolean b7 = grafo1.existeAresta((int)' ', (int)(byte)0);
    grafo1.insereAresta((int)(short)1, (int)(byte)0, 10);
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    grafo13.imprime();
    int[] i_array15 = grafo13.cab;
    grafo1.prox = i_array15;
    ds.Grafo grafo18 = new ds.Grafo((int)'4');
    grafo18.imprime();
    ds.Grafo grafo20 = grafo18.grafoTransposto();
    ds.Grafo grafo22 = new ds.Grafo((int)'4');
    int[] i_array23 = grafo22.prox;
    grafo18.cab = i_array23;
    int[] i_array25 = grafo18.peso;
    grafo1.prox = i_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)' ', (int)'a');
    grafo1.imprime();
    boolean b11 = grafo1.existeAresta(52, (int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    int i4 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = grafo1.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    int[] i_array4 = null;
    grafo1.peso = i_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    grafo9.imprime();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    grafo11.imprime();
    ds.Grafo grafo14 = new ds.Grafo(0);
    grafo14.imprime();
    boolean b18 = grafo14.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array25 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo14.peso = i_array25;
    boolean b28 = grafo14.listaAdjVazia(0);
    boolean b31 = grafo14.existeAresta((int)(byte)10, (int)'4');
    int[] i_array32 = grafo14.cab;
    grafo11.cab = i_array32;
    grafo1.prox = i_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    grafo1.insereAresta(0, (int)(short)100, (int)(short)100);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.prox;
    grafo10.cab = i_array15;
    int[] i_array17 = grafo10.peso;
    ds.Grafo grafo19 = new ds.Grafo((int)'4');
    int[] i_array20 = grafo19.peso;
    ds.Grafo grafo22 = new ds.Grafo((int)'4');
    int[] i_array23 = grafo22.peso;
    grafo19.peso = i_array23;
    boolean b26 = grafo19.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo28 = new ds.Grafo((int)'4');
    int[] i_array29 = grafo28.prox;
    int[] i_array30 = grafo28.peso;
    grafo19.cab = i_array30;
    grafo10.cab = i_array30;
    grafo8.prox = i_array30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)1, 1, (int)(byte)1);
    ds.Grafo grafo12 = new ds.Grafo((int)'4');
    grafo12.imprime();
    int[] i_array14 = grafo12.prox;
    grafo1.peso = i_array14;
    ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    grafo1.insereAresta(0, (int)(short)100, (int)(short)100);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(byte)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    int[] i_array8 = grafo1.prox;
    boolean b10 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.prox;
    int[] i_array11 = grafo9.cab;
    grafo7.prox = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.peso;
    grafo17.peso = i_array21;
    int[] i_array23 = grafo17.prox;
    grafo14.cab = i_array23;
    grafo7.prox = i_array23;
    ds.Grafo grafo27 = new ds.Grafo((int)'4');
    grafo27.imprime();
    ds.Grafo grafo29 = grafo27.grafoTransposto();
    int[] i_array30 = grafo27.cab;
    grafo7.peso = i_array30;
    int[] i_array32 = grafo7.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)'#', (int)(byte)1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    grafo1.insereAresta(0, (int)(short)100, (int)(short)100);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.prox;
    int[] i_array11 = grafo9.cab;
    grafo7.prox = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    grafo14.peso = i_array18;
    boolean b21 = grafo14.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo23 = new ds.Grafo((int)'4');
    int[] i_array24 = grafo23.prox;
    int[] i_array25 = grafo23.peso;
    grafo14.cab = i_array25;
    ds.Grafo grafo27 = grafo14.grafoTransposto();
    ds.Grafo grafo29 = new ds.Grafo((int)'4');
    int[] i_array30 = grafo29.peso;
    ds.Grafo grafo32 = new ds.Grafo((int)'4');
    int[] i_array33 = grafo32.peso;
    grafo29.peso = i_array33;
    ds.Grafo grafo35 = grafo29.grafoTransposto();
    ds.Grafo grafo37 = new ds.Grafo((int)'4');
    int[] i_array38 = grafo37.prox;
    int[] i_array39 = grafo37.cab;
    grafo35.prox = i_array39;
    ds.Grafo grafo42 = new ds.Grafo((int)'4');
    int[] i_array43 = grafo42.peso;
    ds.Grafo grafo45 = new ds.Grafo((int)'4');
    int[] i_array46 = grafo45.peso;
    ds.Grafo grafo48 = new ds.Grafo((int)'4');
    int[] i_array49 = grafo48.peso;
    grafo45.peso = i_array49;
    int[] i_array51 = grafo45.prox;
    grafo42.cab = i_array51;
    grafo35.prox = i_array51;
    grafo27.cab = i_array51;
    int[] i_array55 = grafo27.peso;
    grafo7.prox = i_array55;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b9 = grafo1.existeAresta((int)'4', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int[] i_array14 = grafo1.cab;
    boolean b16 = grafo1.listaAdjVazia((int)(short)100);
    ds.Grafo grafo18 = new ds.Grafo((int)'4');
    int[] i_array19 = grafo18.prox;
    int[] i_array20 = grafo18.prox;
    grafo1.cab = i_array20;
    ds.Grafo.Aresta aresta23 = grafo1.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    int[] i_array14 = grafo1.prox;
    ds.Grafo grafo16 = new ds.Grafo((int)'4');
    grafo16.imprime();
    ds.Grafo grafo18 = grafo16.grafoTransposto();
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.prox;
    grafo16.cab = i_array21;
    int[] i_array23 = grafo16.peso;
    ds.Grafo grafo25 = new ds.Grafo((int)'4');
    int[] i_array26 = grafo25.peso;
    ds.Grafo grafo28 = new ds.Grafo((int)'4');
    int[] i_array29 = grafo28.peso;
    grafo25.peso = i_array29;
    boolean b32 = grafo25.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo34 = new ds.Grafo((int)'4');
    int[] i_array35 = grafo34.prox;
    int[] i_array36 = grafo34.peso;
    grafo25.cab = i_array36;
    grafo16.cab = i_array36;
    grafo1.prox = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b5 = grafo1.listaAdjVazia(10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)'4');
    int[] i_array16 = grafo15.prox;
    int[] i_array17 = grafo15.cab;
    grafo1.prox = i_array17;
    grafo1.insereAresta((int)(short)10, 0, (int)(byte)0);
    int[] i_array23 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    grafo3.peso = i_array7;
    ds.Grafo grafo9 = grafo3.grafoTransposto();
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.prox;
    int[] i_array13 = grafo11.cab;
    grafo9.prox = i_array13;
    ds.Grafo grafo16 = new ds.Grafo((int)'4');
    int[] i_array17 = grafo16.peso;
    ds.Grafo grafo19 = new ds.Grafo((int)'4');
    int[] i_array20 = grafo19.peso;
    ds.Grafo grafo22 = new ds.Grafo((int)'4');
    int[] i_array23 = grafo22.peso;
    grafo19.peso = i_array23;
    int[] i_array25 = grafo19.prox;
    grafo16.cab = i_array25;
    grafo9.prox = i_array25;
    ds.Grafo grafo29 = new ds.Grafo((int)'4');
    grafo29.imprime();
    ds.Grafo grafo31 = grafo29.grafoTransposto();
    int[] i_array32 = grafo29.cab;
    grafo9.peso = i_array32;
    grafo1.prox = i_array32;
    int[] i_array35 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)10, (int)' ');

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    int[] i_array8 = grafo1.prox;
    grafo1.insereAresta(1, (int)(short)10, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(byte)1, (int)(short)(-1));
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.peso;
    grafo17.peso = i_array21;
    ds.Grafo grafo23 = grafo17.grafoTransposto();
    ds.Grafo grafo25 = new ds.Grafo((int)'4');
    ds.Grafo grafo27 = new ds.Grafo((int)'4');
    int[] i_array28 = grafo27.peso;
    grafo25.cab = i_array28;
    int[] i_array30 = grafo25.cab;
    grafo23.cab = i_array30;
    grafo1.cab = i_array30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo10 = new ds.Grafo(0);
    grafo10.imprime();
    boolean b14 = grafo10.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array21 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo10.peso = i_array21;
    boolean b24 = grafo10.listaAdjVazia(0);
    int[] i_array25 = grafo10.prox;
    grafo1.peso = i_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(short)10, 100);
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
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(0);
    grafo4.imprime();
    boolean b8 = grafo4.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array15 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo4.peso = i_array15;
    boolean b18 = grafo4.listaAdjVazia(0);
    int[] i_array19 = grafo4.peso;
    grafo1.cab = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.prox;
    grafo1.insereAresta((int)(short)0, (int)'a', 0);
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((-1), (int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    ds.Grafo grafo7 = new ds.Grafo(0);
    int[] i_array8 = grafo7.cab;
    int[] i_array9 = grafo7.cab;
    grafo1.peso = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.insereAresta((int)(byte)10, (-1), (int)(byte)100);
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(100);
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)1);
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)'#');
    grafo1.imprime();
    int[] i_array11 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    int[] i_array13 = null;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    int[] i_array14 = null;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    grafo1.imprime();
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    grafo5.insereAresta((int)(byte)1, 100, 0);
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    int[] i_array14 = grafo13.peso;
    grafo11.cab = i_array14;
    int[] i_array16 = grafo11.cab;
    ds.Grafo grafo18 = new ds.Grafo((int)'4');
    int[] i_array19 = grafo18.peso;
    ds.Grafo grafo21 = new ds.Grafo((int)'4');
    int[] i_array22 = grafo21.peso;
    grafo18.peso = i_array22;
    int[] i_array24 = grafo18.prox;
    grafo11.cab = i_array24;
    grafo5.cab = i_array24;
    ds.Grafo grafo28 = new ds.Grafo((int)'4');
    int[] i_array29 = grafo28.prox;
    int[] i_array30 = grafo28.cab;
    grafo5.cab = i_array30;
    int[] i_array32 = grafo5.peso;
    grafo1.peso = i_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    int[] i_array9 = grafo8.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo8.peso = i_array12;
    int[] i_array14 = grafo8.prox;
    grafo1.cab = i_array14;
    grafo1.insereAresta(100, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo9.cab = i_array12;
    int[] i_array14 = grafo9.cab;
    grafo7.cab = i_array14;
    ds.Grafo.Aresta aresta17 = grafo7.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    grafo11.peso = i_array15;
    grafo1.peso = i_array15;
    grafo1.imprime();
    boolean b20 = grafo1.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(short)10, 100);
    grafo1.imprime();
    ds.Grafo grafo7 = new ds.Grafo(0);
    grafo7.imprime();
    boolean b11 = grafo7.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array18 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo7.peso = i_array18;
    boolean b21 = grafo7.listaAdjVazia(0);
    boolean b24 = grafo7.existeAresta((int)(byte)10, (int)'4');
    int[] i_array25 = grafo7.cab;
    grafo1.cab = i_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo1.existeAresta(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((-1), (int)' ');
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

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.cab;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.insereAresta((int)(short)1, (int)(byte)(-1), (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)(-1), 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'#');
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    grafo7.peso = i_array11;
    ds.Grafo grafo13 = grafo7.grafoTransposto();
    ds.Grafo grafo15 = new ds.Grafo((int)'4');
    int[] i_array16 = grafo15.prox;
    int[] i_array17 = grafo15.cab;
    grafo13.prox = i_array17;
    int[] i_array19 = grafo13.prox;
    grafo1.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj(0);
    int[] i_array16 = grafo13.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    int[] i_array8 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

}
