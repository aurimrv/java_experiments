package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test001"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    grafo1.insereAresta(0, (int)(byte)100, (int)(byte)1);
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test002"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    grafo12.insereAresta(0, (int)(short)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test003"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta(10, (int)' ', (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test004"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo1.listaAdjVazia((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test005"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    grafo4.insereAresta((int)'4', (int)'4', (int)'#');
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
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test006"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    grafo1.imprime();
    boolean b15 = grafo1.existeAresta(1, (int)'4');
    boolean b18 = grafo1.existeAresta(10, (int)'4');
    ds.Grafo grafo19 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test007"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo13.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test008"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(0);
    int i5 = grafo2.numVertices();
    grafo2.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo2.retiraAresta((int)(byte)10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test009"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    boolean b17 = grafo1.listaAdjVazia(0);
    int i18 = grafo1.numVertices();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(10);
    boolean b23 = grafo1.existeAresta(52, (int)' ');
    boolean b26 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta29 = grafo1.primeiroListaAdj(1);
    grafo1.imprime();
    grafo1.insereAresta(10, (int)(byte)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta29);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test010"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    grafo1.insereAresta((int)(byte)0, 10, 100);
    int i15 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test011"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    grafo10.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo10.retiraAresta(100, (int)(short)10);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test012"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    int i16 = grafo1.numVertices();
    boolean b18 = grafo1.listaAdjVazia((int)(byte)0);
    grafo1.insereAresta((int)'4', 0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test013"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int)(short)0);
    grafo7.insereAresta((int)'#', (int)(short)0, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta((-1), (int)(short)0, (int)(short)10);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test014"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)' ');
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test015"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test016"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    boolean b11 = grafo1.existeAresta(1, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)' ');
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test017"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)10, 0, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.retiraAresta(52, 97);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test018"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    grafo8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test019"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    boolean b19 = grafo1.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo1.retiraAresta((int)(short)100, (int)'#');
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test020"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    int i9 = grafo1.numVertices();
    boolean b12 = grafo1.existeAresta((int)'4', (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'#', (int)(byte)10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test021"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(100, 1);
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
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test022"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)'4', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test023"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    boolean b11 = grafo1.listaAdjVazia((int)(byte)0);
    int i12 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test024"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test025"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test026"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    grafo1.insereAresta(0, (int)(byte)100, (int)(byte)1);
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int)(byte)0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo13 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test027"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    boolean b8 = grafo1.listaAdjVazia((int)'#');
    int i9 = grafo1.numVertices();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo.Aresta aresta13 = grafo10.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test028"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    boolean b14 = grafo1.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test029"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test030"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    grafo4.insereAresta((int)'4', (int)'4', (int)'#');
    grafo4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo4.retiraAresta((int)' ', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test031"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.imprime();
    grafo2.imprime();
    ds.Grafo grafo5 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test032"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    boolean b9 = grafo7.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta11 = grafo7.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test033"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo19 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test034"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.imprime();
    grafo1.insereAresta((int)(short)1, (int)(byte)0, (int)(short)(-1));
    int i9 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(100);
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
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test035"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo12 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test036"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'a', (int)(byte)(-1), 97);
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test037"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    int i10 = grafo1.numVertices();
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)(short)1, 1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test038"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    boolean b7 = grafo4.listaAdjVazia((int)'4');
    grafo4.insereAresta(10, (int)(byte)10, (int)(byte)10);
    ds.Grafo grafo12 = grafo4.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo4.retiraAresta((int)'4', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test039"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = grafo5.existeAresta((int)(short)100, (int)(byte)(-1));
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
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test040"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    int i12 = grafo1.numVertices();
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.proxAdj((-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test041"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    grafo15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test042"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo1.listaAdjVazia((int)'4');
    boolean b9 = grafo1.existeAresta(10, 52);
    grafo1.insereAresta((int)'#', (int)(byte)0, (int)(short)1);
    boolean b16 = grafo1.existeAresta(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test043"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    int i12 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test044"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b5 = grafo1.listaAdjVazia((int)(short)0);
    boolean b8 = grafo1.existeAresta(0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test045"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    grafo8.insereAresta(0, (int)(byte)10, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test046"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(10, (int)' ');
    boolean b14 = grafo1.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = grafo1.existeAresta((int)(byte)100, 0);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test047"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo10.numVertices();
    grafo10.insereAresta((int)(byte)1, (int)' ', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test048"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.insereAresta((int)(short)10, 1, (int)'#');
    int i11 = grafo1.numVertices();
    boolean b14 = grafo1.existeAresta(0, (int)(short)1);
    boolean b16 = grafo1.listaAdjVazia((int)(short)0);
    int i17 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test049"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    grafo1.imprime();
    boolean b15 = grafo1.existeAresta(1, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo1.existeAresta((int)(byte)100, (-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test050"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.insereAresta((int)(short)10, 1, (int)'#');
    int i11 = grafo1.numVertices();
    boolean b14 = grafo1.existeAresta(0, (int)(short)1);
    int i15 = grafo1.numVertices();
    ds.Grafo grafo16 = grafo1.grafoTransposto();
    int i17 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta20 = grafo1.retiraAresta((int)'4', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test051"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = grafo1.existeAresta((int)'a', 0);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test052"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    boolean b14 = grafo1.existeAresta((int)(byte)1, 97);
    boolean b17 = grafo1.existeAresta((int)'#', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((-1), (int)' ', (int)(short)(-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test053"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj(52);
    grafo1.insereAresta((int)'#', 100, 10);
    boolean b16 = grafo1.existeAresta((int)'4', 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test054"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    grafo5.insereAresta(52, (int)' ', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo5.retiraAresta((int)(byte)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test055"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b10 = grafo1.existeAresta((int)'4', (int)(short)0);
    grafo1.insereAresta((int)'#', (int)(byte)10, (int)(byte)10);
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int)'a', (int)(byte)100);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test056"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    grafo1.imprime();
    grafo1.imprime();
    boolean b7 = grafo1.listaAdjVazia(52);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.proxAdj(100);
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test057"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b6 = grafo1.existeAresta((int)(byte)10, 97);
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test058"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    boolean b8 = grafo4.listaAdjVazia(52);
    boolean b10 = grafo4.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test059"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b10 = grafo1.listaAdjVazia((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test060"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    ds.Grafo.Aresta aresta7 = grafo4.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test061"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.insereAresta((int)(short)0, (int)'a', (int)'a');
    grafo6.imprime();
    grafo6.insereAresta((int)(byte)0, 97, 0);
    int i16 = grafo6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test062"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test063"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test064"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test065"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    boolean b19 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo20 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(10);
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    int i24 = grafo23.numVertices();
    ds.Grafo grafo25 = grafo23.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo25);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test066"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta(52, (int)'#', (int)(short)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test067"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = grafo1.listaAdjVazia((int)'a');
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test068"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    grafo1.insereAresta((int)(short)0, (int)(byte)10, (int)(short)(-1));
    grafo1.insereAresta((int)(byte)0, (int)' ', (int)(byte)0);
    int i12 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test069"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b14 = grafo1.existeAresta(0, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo1.retiraAresta((int)'#', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test070"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    grafo1.imprime();
    boolean b7 = grafo1.existeAresta(10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test071"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)(short)10);
    grafo4.insereAresta(1, 0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test072"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(0, 1);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo13.insereAresta((int)(short)10, (int)(byte)(-1), (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int)(short)0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test073"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test074"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.insereAresta(1, (int)(short)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test075"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(0);
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test076"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)1);
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(short)0);
    int i9 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)(-1), (int)' ', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test077"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test078"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test079"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)'4');
    boolean b20 = grafo1.listaAdjVazia((int)(byte)1);
    boolean b23 = grafo1.existeAresta((int)'#', 10);
    int i24 = grafo1.numVertices();
    boolean b26 = grafo1.listaAdjVazia(10);
    int i27 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 97);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test080"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta(52, (int)(short)1, (int)'#');
    int i20 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test081"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo.Aresta aresta9 = grafo6.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo10 = grafo6.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = grafo10.existeAresta((int)(short)100, 1);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test082"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    grafo1.insereAresta(0, (int)(byte)(-1), (int)'#');
    int i9 = grafo1.numVertices();
    grafo1.imprime();
    grafo1.imprime();
    boolean b13 = grafo1.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test083"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    grafo1.insereAresta(10, (int)(byte)0, (int)(short)0);
    boolean b18 = grafo1.existeAresta((int)(short)0, 52);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test084"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    grafo1.imprime();
    ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int)(byte)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test085"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)0, (int)'#', (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta24 = grafo1.retiraAresta(10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test086"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    grafo5.insereAresta(52, (int)' ', 0);
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test087"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b6 = grafo1.existeAresta((int)(byte)10, 97);
    boolean b9 = grafo1.existeAresta(0, 1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test088"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    boolean b5 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test089"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test090"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    grafo1.insereAresta((int)'4', (int)(short)1, 97);
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test091"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(10, (int)' ');
    boolean b14 = grafo1.listaAdjVazia(0);
    boolean b16 = grafo1.listaAdjVazia(10);
    int i17 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test092"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    boolean b19 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo20 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj((int)'4');
    int i23 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 97);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test093"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)10);
    boolean b7 = grafo1.existeAresta(52, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test094"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.insereAresta(0, (-1), (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test095"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    boolean b14 = grafo1.existeAresta((int)(byte)1, 97);
    boolean b17 = grafo1.existeAresta((int)'#', (int)(short)0);
    boolean b20 = grafo1.existeAresta((int)(short)1, (int)' ');
    boolean b23 = grafo1.existeAresta((int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test096"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    boolean b15 = grafo1.existeAresta((int)(short)1, 100);
    ds.Grafo grafo16 = grafo1.grafoTransposto();
    int i17 = grafo16.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test097"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    boolean b8 = grafo1.listaAdjVazia((int)'#');
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia(52);
    boolean b14 = grafo1.existeAresta(0, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test098"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    boolean b16 = grafo1.listaAdjVazia(1);
    boolean b18 = grafo1.listaAdjVazia((int)(short)1);
    int i19 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test099"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    int i12 = grafo1.numVertices();
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(byte)0);
    int i15 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo1.retiraAresta(10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test100"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b11 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test101"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    boolean b19 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo20 = grafo1.grafoTransposto();
    grafo20.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test102"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    boolean b7 = grafo4.listaAdjVazia((int)'4');
    grafo4.insereAresta(10, (int)(byte)10, (int)(byte)10);
    grafo4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo4.existeAresta((int)(short)(-1), (int)'4');
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test103"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)0);
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test104"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo8.proxAdj((int)(short)10);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test105"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.insereAresta((int)(short)10, 1, (int)'#');
    int i11 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test106"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test107"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    grafo1.imprime();
    boolean b20 = grafo1.listaAdjVazia((int)'#');
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test108"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)'#');
    grafo1.insereAresta(1, (int)'#', (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test109"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta19 = grafo1.retiraAresta((int)(byte)0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test110"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b5 = grafo1.existeAresta((int)(short)100, 52);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test111"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      grafo4.insereAresta((int)(byte)100, 100, (-1));
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
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test112"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)(-1), 52);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test113"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.insereAresta((int)'#', (int)(byte)1, 100);
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta((int)(byte)0, (int)'a');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test114"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    int i16 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, (int)(short)100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test115"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta(52, (int)(short)1, (int)'#');
    ds.Grafo.Aresta aresta21 = grafo1.primeiroListaAdj(10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test116"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)' ');
    ds.Grafo.Aresta aresta9 = grafo5.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test117"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj(0);
    grafo6.insereAresta(52, (int)(byte)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test118"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test119"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    int i12 = grafo1.numVertices();
    boolean b15 = grafo1.existeAresta((int)(byte)1, (int)(short)(-1));
    int i16 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test120"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta8 = grafo4.proxAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      grafo4.insereAresta((int)(short)100, (int)' ', 97);
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
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test121"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)' ');
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)' ');
    ds.Grafo.Aresta aresta18 = grafo1.proxAdj(0);
    int i19 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test122"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)1, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)'a', (int)(byte)(-1), (int)'#');
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test123"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    int i16 = grafo1.numVertices();
    boolean b18 = grafo1.listaAdjVazia((int)(byte)0);
    boolean b20 = grafo1.listaAdjVazia((int)'4');
    grafo1.insereAresta((int)' ', (int)' ', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test124"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    int i9 = grafo7.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta((int)'a', (int)(short)1, (int)(short)10);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test125"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo10.numVertices();
    boolean b14 = grafo10.existeAresta(10, (int)' ');
    int i15 = grafo10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test126"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.insereAresta((int)(short)0, (int)'a', (int)'a');
    grafo6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo12 = grafo6.grafoTransposto();
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
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test127"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int)'#', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test128"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta18 = grafo14.primeiroListaAdj((int)'4');
    boolean b20 = grafo14.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta22 = grafo14.primeiroListaAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test129"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    boolean b17 = grafo1.listaAdjVazia(0);
    int i18 = grafo1.numVertices();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(10);
    boolean b23 = grafo1.existeAresta(52, (int)' ');
    boolean b26 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    grafo1.imprime();
    boolean b29 = grafo1.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test130"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.insereAresta((int)'#', (int)(byte)1, 100);
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta((int)(byte)0, (int)'a');
    grafo1.insereAresta((int)(byte)0, 100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test131"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.imprime();
    grafo1.imprime();
    boolean b13 = grafo1.existeAresta((int)(byte)0, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test132"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    int i9 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test133"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    boolean b10 = grafo1.existeAresta((int)(byte)10, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int)(short)(-1), 0);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test134"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    boolean b8 = grafo1.listaAdjVazia((int)'4');
    boolean b11 = grafo1.existeAresta((int)'4', (int)(short)10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test135"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    grafo1.imprime();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test136"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    int i11 = grafo1.numVertices();
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test137"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    grafo4.insereAresta((int)(short)1, (int)(short)0, (int)(short)100);
    grafo4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo4.existeAresta((int)(byte)(-1), (int)'a');
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
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test138"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    boolean b10 = grafo7.existeAresta((int)(byte)1, 97);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo7.retiraAresta((-1), (int)(short)1);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test139"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)' ');
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test140"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    grafo8.insereAresta(1, (int)(byte)100, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo8.retiraAresta((int)'4', 0);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test141"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b9 = grafo1.existeAresta((int)(byte)1, 1);
    boolean b11 = grafo1.listaAdjVazia((int)(short)1);
    int i12 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test142"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    grafo9.imprime();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = grafo9.listaAdjVazia((int)'a');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test143"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    grafo1.imprime();
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(10);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)(-1), (-1), 100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test144"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test145"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b8 = grafo6.listaAdjVazia(52);
    int i9 = grafo6.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo6.retiraAresta((int)(byte)(-1), 100);
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test146"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.insereAresta(0, (int)(byte)100, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo7.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test147"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)'a', (int)'4', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test148"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    boolean b13 = grafo1.existeAresta((int)(byte)0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test149"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)' ');
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)' ');
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)' ');
    grafo1.insereAresta(0, 10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test150"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    boolean b14 = grafo1.listaAdjVazia(52);
    ds.Grafo grafo15 = grafo1.grafoTransposto();
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test151"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test152"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    grafo1.imprime();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(52);
    boolean b23 = grafo1.existeAresta((int)(short)0, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta26 = grafo1.retiraAresta((int)(short)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test153"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    grafo1.insereAresta(10, (int)(byte)0, (int)(short)0);
    ds.Grafo.Aresta aresta17 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo20 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta23 = grafo20.retiraAresta((-1), (int)(short)10);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test154"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(short)1);
    int i9 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)'4', (int)'#', (int)(byte)100);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test155"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo1.listaAdjVazia((int)' ');
    grafo1.insereAresta(1, (int)'#', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test156"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    grafo1.insereAresta((int)(byte)0, 10, 100);
    boolean b16 = grafo1.listaAdjVazia((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo1.listaAdjVazia(100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test157"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    boolean b19 = grafo1.listaAdjVazia((int)'#');
    boolean b22 = grafo1.existeAresta(10, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta24 = grafo1.proxAdj(97);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test158"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b4 = grafo1.listaAdjVazia(97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test159"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    int i16 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)'a');
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
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test160"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    boolean b10 = grafo7.existeAresta((int)(byte)1, 97);
    boolean b13 = grafo7.existeAresta((int)(short)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test161"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    int i13 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.retiraAresta(52, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test162"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test163"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo8.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo8.listaAdjVazia(10);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test164"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, (int)(byte)0);
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test165"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test166"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia(10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test167"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta((int)(byte)0, 97);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test168"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b8 = grafo6.listaAdjVazia(52);
    boolean b10 = grafo6.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((-1), (int)(short)1);
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test169"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.insereAresta(0, (int)(byte)100, (int)(byte)10);
    boolean b14 = grafo7.listaAdjVazia((int)(short)0);
    ds.Grafo.Aresta aresta16 = grafo7.proxAdj(0);
    ds.Grafo.Aresta aresta19 = grafo7.retiraAresta(0, (int)(byte)10);
    ds.Grafo.Aresta aresta21 = grafo7.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta21);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test170"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    int i10 = grafo1.numVertices();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    boolean b13 = grafo1.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test171"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    boolean b5 = grafo1.listaAdjVazia((int)(byte)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test172"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia(97);
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo5.proxAdj((int)(byte)1);
    int i11 = grafo5.numVertices();
    ds.Grafo.Aresta aresta13 = grafo5.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test173"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    boolean b16 = grafo12.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test174"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta(52, (int)'#', (int)(short)10);
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test175"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test176"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    boolean b14 = grafo1.listaAdjVazia(52);
    int i15 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int)(byte)100, 1);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test177"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)'4');
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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test178"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    int i12 = grafo1.numVertices();
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(byte)0);
    int i15 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test179"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b6 = grafo1.existeAresta((int)(byte)10, 97);
    int i7 = grafo1.numVertices();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    int i9 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test180"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int i2 = grafo1.numVertices();
    boolean b5 = grafo1.existeAresta(1, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test181"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)'4');
    grafo1.imprime();
    grafo1.imprime();
    int i21 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test182"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
    grafo1.imprime();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test183"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.insereAresta((int)(byte)10, (int)(byte)1, (int)(byte)1);
    boolean b14 = grafo1.existeAresta((int)(short)1, (int)(short)(-1));
    boolean b17 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test184"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    grafo1.imprime();
    int i7 = grafo1.numVertices();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b12 = grafo1.existeAresta((int)(short)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test185"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test186"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    grafo1.imprime();
    grafo1.imprime();
    boolean b7 = grafo1.listaAdjVazia((int)(short)0);
    boolean b9 = grafo1.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test187"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    boolean b15 = grafo1.existeAresta((int)(short)1, 100);
    ds.Grafo grafo16 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo16.retiraAresta((-1), (int)(byte)1);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test188"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)1);
    int i6 = grafo1.numVertices();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    int i8 = grafo7.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta((int)' ', (int)(byte)0, (int)(short)10);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test189"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)'4');
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test190"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int i10 = grafo1.numVertices();
    boolean b12 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)'4', (int)(short)100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test191"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b13 = grafo1.existeAresta((int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test192"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)'a');
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test193"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    boolean b19 = grafo1.listaAdjVazia((int)(byte)10);
    int i20 = grafo1.numVertices();
    grafo1.imprime();
    int i22 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 97);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test194"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test195"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    grafo4.insereAresta((int)(short)1, (int)(byte)0, 10);
    grafo4.insereAresta(0, (int)'4', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test196"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test197"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = grafo10.existeAresta((int)'a', 0);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test198"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    ds.Grafo grafo8 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj(10);
    ds.Grafo grafo11 = grafo8.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test199"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(10, 1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj((-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test200"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    int i7 = grafo5.numVertices();
    int i8 = grafo5.numVertices();
    grafo5.imprime();
    ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj((int)(byte)10);
    int i12 = grafo5.numVertices();
    ds.Grafo.Aresta aresta14 = grafo5.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test201"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = grafo4.existeAresta((int)'a', (int)(short)100);
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
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test202"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    ds.Grafo grafo18 = grafo1.grafoTransposto();
    grafo18.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test203"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.imprime();
    int i4 = grafo2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test204"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo1.numVertices();
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo12.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test205"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    boolean b3 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test206"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    grafo4.insereAresta((int)'4', (int)'4', (int)'#');
    grafo4.imprime();
    int i12 = grafo4.numVertices();
    grafo4.imprime();
    boolean b16 = grafo4.existeAresta((int)(byte)0, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test207"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test208"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(byte)100);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test209"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(10, 1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta17 = grafo1.retiraAresta(0, (int)(short)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test210"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    boolean b19 = grafo1.listaAdjVazia((int)(short)10);
    int i20 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, (-1), (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b27 = grafo1.existeAresta(97, (int)' ');
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test211"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    int i8 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test212"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    boolean b7 = grafo4.listaAdjVazia((int)'4');
    grafo4.insereAresta(10, (int)(byte)10, (int)(byte)10);
    ds.Grafo grafo12 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int)' ');
    boolean b17 = grafo12.existeAresta(0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo12.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test213"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo4.existeAresta(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test214"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.insereAresta((int)(short)1, (int)'4', 0);
    ds.Grafo.Aresta aresta16 = grafo10.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test215"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int i10 = grafo1.numVertices();
    boolean b12 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test216"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
    int i7 = grafo1.numVertices();
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    grafo1.insereAresta((int)(short)1, (int)' ', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test217"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test218"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(short)1);
    int i8 = grafo5.numVertices();
    ds.Grafo.Aresta aresta10 = grafo5.proxAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test219"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    grafo1.insereAresta((int)(short)0, (int)(short)100, (int)(short)0);
    grafo1.insereAresta(0, (int)(byte)100, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test220"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.insereAresta((int)'#', (int)(byte)1, 100);
    int i8 = grafo1.numVertices();
    grafo1.insereAresta(52, (-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test221"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo9.existeAresta((int)(short)100, (int)'a');
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test222"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    int i13 = grafo12.numVertices();
    int i14 = grafo12.numVertices();
    ds.Grafo grafo15 = grafo12.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test223"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo15.numVertices();
    ds.Grafo.Aresta aresta18 = grafo15.proxAdj(10);
    grafo15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test224"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    int i9 = grafo8.numVertices();
    boolean b11 = grafo8.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test225"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    grafo1.imprime();
    boolean b19 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    grafo1.insereAresta((int)(short)10, (-1), (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b25 = grafo1.listaAdjVazia(97);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test226"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    grafo10.insereAresta((int)'4', 97, (int)(byte)100);
    int i15 = grafo10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test227"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    boolean b13 = grafo9.existeAresta(1, (int)(short)10);
    grafo9.insereAresta(10, (int)(short)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test228"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    int i15 = grafo14.numVertices();
    ds.Grafo.Aresta aresta17 = grafo14.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test229"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta(1, (int)(byte)10);
    ds.Grafo grafo9 = grafo5.grafoTransposto();
    boolean b12 = grafo5.existeAresta((int)(byte)0, (int)' ');
    int i13 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test230"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    boolean b13 = grafo1.listaAdjVazia(52);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test231"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    grafo12.imprime();
    ds.Grafo grafo15 = grafo12.grafoTransposto();
    boolean b17 = grafo15.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo15.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test232"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test233"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b10 = grafo1.listaAdjVazia((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo1.existeAresta((int)(byte)(-1), (int)' ');
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test234"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
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
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test235"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    boolean b15 = grafo1.listaAdjVazia((int)(short)1);
    boolean b17 = grafo1.listaAdjVazia((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = grafo1.listaAdjVazia((int)(byte)100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test236"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.insereAresta(0, 0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test237"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b9 = grafo1.existeAresta((int)(byte)1, 1);
    boolean b12 = grafo1.existeAresta(0, (-1));
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int)(byte)0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test238"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test239"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    boolean b9 = grafo1.listaAdjVazia((int)(short)0);
    int i10 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test240"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(short)1);
    boolean b9 = grafo5.listaAdjVazia((int)'#');
    grafo5.insereAresta(10, 97, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo14 = grafo5.grafoTransposto();
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test241"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(0);
    int i5 = grafo2.numVertices();
    grafo2.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj(97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test242"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b10 = grafo1.listaAdjVazia((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo13 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test243"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo14.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta18 = grafo14.primeiroListaAdj((int)'4');
    boolean b20 = grafo14.listaAdjVazia((int)(byte)1);
    boolean b23 = grafo14.existeAresta((int)(short)1, (int)(short)0);
    grafo14.insereAresta((int)(byte)1, (int)(short)10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test244"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.imprime();
    grafo1.insereAresta((int)(short)1, (int)(byte)0, (int)(short)(-1));
    boolean b11 = grafo1.existeAresta(1, 0);
    boolean b14 = grafo1.existeAresta((int)(byte)1, 0);
    ds.Grafo grafo15 = grafo1.grafoTransposto();
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test245"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b5 = grafo1.listaAdjVazia((int)(short)0);
    grafo1.insereAresta(0, 100, (int)(short)(-1));
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test246"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo1.proxAdj(97);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test247"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta(0, 97);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo8.primeiroListaAdj((int)'a');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test248"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test249"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.imprime();
    boolean b6 = grafo2.existeAresta(0, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test250"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b16 = grafo1.existeAresta(0, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test251"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)'4');
    boolean b20 = grafo1.listaAdjVazia((int)(byte)1);
    boolean b23 = grafo1.existeAresta((int)'#', 10);
    int i24 = grafo1.numVertices();
    boolean b26 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo27 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test252"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test253"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo9 = grafo5.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)' ', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test254"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj(10);
    int i9 = grafo6.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo6.retiraAresta(97, (int)(short)100);
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test255"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo15.numVertices();
    ds.Grafo.Aresta aresta18 = grafo15.proxAdj(10);
    ds.Grafo.Aresta aresta20 = grafo15.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test256"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(short)0, (int)(short)0, (int)' ');
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo1.listaAdjVazia(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test257"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)(-1), 1, 0);
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test258"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    grafo1.imprime();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(52);
    boolean b23 = grafo1.existeAresta((int)(short)0, (int)(byte)1);
    int i24 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test259"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(short)0, (int)(short)0, (int)' ');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo1.existeAresta((int)'4', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test260"); }


    ds.Grafo grafo1 = new ds.Grafo(52);
    boolean b4 = grafo1.existeAresta(10, (int)(byte)0);
    int i5 = grafo1.numVertices();
    boolean b8 = grafo1.existeAresta((int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test261"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo9 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj((int)(byte)1);
    boolean b13 = grafo5.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test262"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    boolean b19 = grafo15.existeAresta(52, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test263"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo grafo15 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta17 = grafo15.primeiroListaAdj((int)(byte)10);
    boolean b19 = grafo15.listaAdjVazia(10);
    boolean b21 = grafo15.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test264"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test265"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    grafo1.imprime();
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test266"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo1.existeAresta((int)(short)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test267"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    int i9 = grafo1.numVertices();
    boolean b12 = grafo1.existeAresta((int)'4', (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test268"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((-1), (int)' ');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test269"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    grafo1.insereAresta(0, (int)(byte)100, (int)(byte)1);
    boolean b11 = grafo1.listaAdjVazia(0);
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test270"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.insereAresta(0, (int)(byte)100, (int)(byte)10);
    boolean b14 = grafo7.listaAdjVazia((int)(short)0);
    boolean b17 = grafo7.existeAresta((int)(byte)10, 97);
    boolean b19 = grafo7.listaAdjVazia((int)(short)0);
    grafo7.imprime();
    ds.Grafo.Aresta aresta22 = grafo7.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test271"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo1.listaAdjVazia((int)(short)0);
    boolean b9 = grafo1.existeAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test272"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia(0);
    boolean b17 = grafo1.listaAdjVazia(0);
    int i18 = grafo1.numVertices();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj(10);
    boolean b23 = grafo1.existeAresta(52, (int)' ');
    int i24 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta27 = grafo1.retiraAresta((int)(byte)(-1), (int)(short)1);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test273"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo10.numVertices();
    int i12 = grafo10.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo10.insereAresta((int)'a', (int)(short)1, (int)'a');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test274"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo7.existeAresta(97, 0);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test275"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(52);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test276"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia(97);
    int i8 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test277"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.imprime();
    int i8 = grafo6.numVertices();
    int i9 = grafo6.numVertices();
    ds.Grafo grafo10 = grafo6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test278"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b9 = grafo1.existeAresta((int)(byte)1, 1);
    boolean b12 = grafo1.existeAresta(0, (-1));
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo1.insereAresta(1, (int)(short)0, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test279"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)100, (int)(byte)100, (int)(short)100);
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
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test280"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    int i14 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test281"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    int i9 = grafo1.numVertices();
    boolean b12 = grafo1.existeAresta((int)'4', (int)'#');
    grafo1.insereAresta(10, (int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test282"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)' ');
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)' ');
    int i17 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test283"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    int i7 = grafo5.numVertices();
    int i8 = grafo5.numVertices();
    int i9 = grafo5.numVertices();
    grafo5.insereAresta((int)(short)0, 0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test284"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    int i9 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)1, 1, (int)(short)100);
    boolean b15 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test285"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    ds.Grafo grafo8 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj(10);
    ds.Grafo grafo11 = grafo8.grafoTransposto();
    boolean b13 = grafo11.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test286"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(short)10);
    int i14 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = grafo1.existeAresta((int)(byte)(-1), 100);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test287"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test288"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    grafo1.imprime();
    int i13 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((-1), (int)'#');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test289"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    boolean b12 = grafo8.existeAresta((int)(byte)1, (int)'#');
    grafo8.imprime();
    ds.Grafo grafo14 = grafo8.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo8.insereAresta(97, (int)'a', (int)(byte)100);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test290"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    int i4 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b6 = grafo1.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test291"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    boolean b15 = grafo1.existeAresta((int)'4', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test292"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    boolean b14 = grafo1.existeAresta((int)(byte)1, 97);
    boolean b17 = grafo1.existeAresta((int)'#', (int)(short)0);
    boolean b20 = grafo1.existeAresta((int)(short)1, (int)' ');
    ds.Grafo.Aresta aresta23 = grafo1.retiraAresta(0, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test293"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)'4');
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo7.existeAresta(100, (int)(byte)100);
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
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test294"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test295"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    boolean b14 = grafo1.listaAdjVazia(52);
    int i15 = grafo1.numVertices();
    int i16 = grafo1.numVertices();
    boolean b18 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test296"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b14 = grafo1.existeAresta(0, 100);
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj(10);
    grafo1.insereAresta((int)' ', 1, 0);
    ds.Grafo.Aresta aresta22 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta22);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test297"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia((int)(byte)0);
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(1);
    boolean b10 = grafo1.existeAresta((int)(byte)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test298"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo.Aresta aresta20 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test299"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.insereAresta((int)(byte)10, (int)(byte)1, (int)(byte)1);
    int i12 = grafo1.numVertices();
    int i13 = grafo1.numVertices();
    boolean b16 = grafo1.existeAresta(10, (int)' ');
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test300"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj(0);
    boolean b16 = grafo1.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test301"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test302"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo grafo15 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta17 = grafo15.primeiroListaAdj((int)(byte)10);
    grafo15.imprime();
    ds.Grafo.Aresta aresta20 = grafo15.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test303"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(52, 97, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test304"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test305"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)1, (int)(short)(-1), 97);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo1.proxAdj(97);
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
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test306"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    ds.Grafo.Aresta aresta9 = grafo4.primeiroListaAdj(0);
    grafo4.insereAresta(52, (int)(short)1, 100);
    int i14 = grafo4.numVertices();
    boolean b16 = grafo4.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      grafo4.insereAresta((int)(short)100, (int)(byte)(-1), (int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test307"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    int i15 = grafo14.numVertices();
    grafo14.insereAresta((int)(byte)1, (int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test308"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    boolean b5 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test309"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    boolean b8 = grafo4.existeAresta((int)'4', (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo4.existeAresta((int)(byte)100, (int)(short)0);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test310"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    int i9 = grafo6.numVertices();
    ds.Grafo grafo10 = grafo6.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = grafo10.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test311"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    grafo1.insereAresta((int)(byte)0, (int)'#', 10);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test312"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(0);
    int i10 = grafo1.numVertices();
    boolean b12 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test313"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    boolean b8 = grafo1.listaAdjVazia((int)'#');
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia(52);
    int i12 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test314"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    int i4 = grafo1.numVertices();
    grafo1.insereAresta((int)'4', (-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test315"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.retiraAresta(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test316"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'#', 0, (-1));
    grafo1.imprime();
    ds.Grafo grafo15 = grafo1.grafoTransposto();
    boolean b17 = grafo15.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test317"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo15.numVertices();
    ds.Grafo.Aresta aresta18 = grafo15.proxAdj(1);
    grafo15.insereAresta((int)(short)1, (int)'4', 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test318"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test319"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    boolean b8 = grafo1.listaAdjVazia((int)'#');
    int i9 = grafo1.numVertices();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo10.retiraAresta(0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test320"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo.Aresta aresta8 = grafo5.primeiroListaAdj((int)(short)0);
    grafo5.imprime();
    boolean b12 = grafo5.existeAresta((int)'#', (int)'a');
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo5.listaAdjVazia((-1));
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test321"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.imprime();
    grafo1.insereAresta((int)(short)0, (int)'4', (-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo1.existeAresta(10, (int)' ');
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
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test322"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int)(byte)0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test323"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)100, (int)'a', (-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test324"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    grafo12.imprime();
    ds.Grafo grafo15 = grafo12.grafoTransposto();
    grafo15.insereAresta(0, (int)(byte)0, 52);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo15.retiraAresta(52, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test325"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    boolean b15 = grafo1.existeAresta((int)(short)1, 100);
    ds.Grafo grafo16 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta18 = grafo16.proxAdj(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test326"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo1.listaAdjVazia((int)'4');
    boolean b9 = grafo1.existeAresta(10, 52);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(97, (int)(short)100);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test327"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)1);
    int i6 = grafo1.numVertices();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    int i8 = grafo7.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta(100, 0, (int)(byte)10);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test328"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    int i7 = grafo6.numVertices();
    ds.Grafo.Aresta aresta9 = grafo6.proxAdj((int)(byte)10);
    ds.Grafo.Aresta aresta11 = grafo6.primeiroListaAdj((int)(short)10);
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test329"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    grafo14.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo14.existeAresta((int)(byte)(-1), 100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test330"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int)(byte)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test331"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    int i8 = grafo7.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta((int)(byte)100, (int)(short)0, (int)(short)0);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test332"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b17 = grafo1.existeAresta((int)' ', (int)(byte)1);
    grafo1.insereAresta(10, (-1), (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test333"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    boolean b9 = grafo5.existeAresta((int)(short)1, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      grafo5.insereAresta((-1), (int)(byte)10, 52);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test334"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test335"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
    int i7 = grafo1.numVertices();
    grafo1.imprime();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test336"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta9 = grafo5.primeiroListaAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo5.listaAdjVazia(100);
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
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test337"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)' ');
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    boolean b11 = grafo5.existeAresta((int)(byte)10, (int)'#');
    ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(10);
    ds.Grafo grafo14 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test338"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    boolean b14 = grafo1.listaAdjVazia(0);
    boolean b16 = grafo1.listaAdjVazia((int)' ');
    boolean b18 = grafo1.listaAdjVazia((int)(byte)1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test339"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
    boolean b13 = grafo1.listaAdjVazia(1);
    int i14 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test340"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b4 = grafo2.listaAdjVazia(97);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test341"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo grafo15 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta17 = grafo15.primeiroListaAdj((int)(byte)10);
    grafo15.imprime();
    grafo15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test342"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
    grafo1.imprime();
    int i5 = grafo1.numVertices();
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test343"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    grafo12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test344"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.imprime();
    int i5 = grafo1.numVertices();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo1.existeAresta((-1), (int)(short)1);
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
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test345"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo.Aresta aresta8 = grafo5.primeiroListaAdj((int)(short)0);
    int i9 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test346"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    grafo4.insereAresta((int)(short)1, (int)(short)0, (int)(short)100);
    ds.Grafo grafo12 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo12.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test347"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.insereAresta(0, (int)(byte)100, (int)(byte)10);
    boolean b14 = grafo7.listaAdjVazia((int)(short)0);
    boolean b17 = grafo7.existeAresta((int)(byte)10, 97);
    boolean b19 = grafo7.listaAdjVazia((int)(short)0);
    boolean b21 = grafo7.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test348"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)1);
    int i6 = grafo1.numVertices();
    boolean b9 = grafo1.existeAresta((int)(byte)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test349"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)' ');
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    boolean b11 = grafo5.existeAresta((int)(byte)10, (int)'#');
    ds.Grafo grafo12 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test350"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    boolean b14 = grafo1.existeAresta((int)(byte)1, 97);
    boolean b17 = grafo1.existeAresta((int)'#', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)100, 52, (int)(byte)0);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test351"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    int i13 = grafo12.numVertices();
    grafo12.insereAresta(0, (int)'4', (int)'a');
    ds.Grafo.Aresta aresta19 = grafo12.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta19);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test352"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test353"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    grafo1.insereAresta(0, (int)(short)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test354"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int i14 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test355"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test356"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)100, (int)(short)1, 100);
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
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test357"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    boolean b20 = grafo1.listaAdjVazia((int)(byte)0);
    boolean b23 = grafo1.existeAresta((int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test358"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.imprime();
    boolean b11 = grafo1.existeAresta((int)(short)10, 10);
    boolean b14 = grafo1.existeAresta(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test359"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)1);
    int i6 = grafo1.numVertices();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    int i8 = grafo7.numVertices();
    grafo7.insereAresta(0, 10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test360"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    ds.Grafo.Aresta aresta9 = grafo4.primeiroListaAdj(0);
    int i10 = grafo4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test361"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta(52, 0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test362"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test363"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    boolean b19 = grafo1.existeAresta(0, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test364"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo12.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo12.proxAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test365"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta(0, 97);
    ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int)(short)1);
    grafo8.insereAresta(1, (int)' ', (int)'a');
    ds.Grafo.Aresta aresta20 = grafo8.retiraAresta((int)(short)1, 52);
    ds.Grafo grafo21 = grafo8.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test366"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta8 = grafo4.proxAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo4.retiraAresta(10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test367"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)' ');
    boolean b13 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.proxAdj(100);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test368"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    boolean b19 = grafo1.listaAdjVazia((int)'4');
    boolean b21 = grafo1.listaAdjVazia((int)'#');
    int i22 = grafo1.numVertices();
    boolean b25 = grafo1.existeAresta((int)'4', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test369"); }


    ds.Grafo grafo1 = new ds.Grafo(97);
    int i2 = grafo1.numVertices();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo3.insereAresta(97, (-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test370"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test371"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(byte)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test372"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    int i7 = grafo5.numVertices();
    int i8 = grafo5.numVertices();
    int i9 = grafo5.numVertices();
    grafo5.insereAresta((int)(byte)1, (int)(byte)1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test373"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta(0, 97);
    ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int)(short)1);
    ds.Grafo grafo14 = grafo8.grafoTransposto();
    boolean b17 = grafo14.existeAresta((int)(short)10, (int)(byte)100);
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test374"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test375"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    grafo1.imprime();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test376"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    boolean b16 = grafo1.listaAdjVazia(10);
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test377"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    grafo1.insereAresta((int)(short)0, (int)(byte)1, (int)(short)10);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(0, (int)(byte)0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test378"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    boolean b5 = grafo1.listaAdjVazia((int)(short)0);
    boolean b8 = grafo1.existeAresta(0, (int)(byte)(-1));
    int i9 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test379"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.insereAresta((int)(short)10, 1, (int)'#');
    int i11 = grafo1.numVertices();
    boolean b14 = grafo1.existeAresta(0, (int)(short)1);
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test380"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((-1), 100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test381"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)0, (int)'#', (int)(short)(-1));
    boolean b24 = grafo1.existeAresta(0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)100, (int)(short)0, (int)(byte)100);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test382"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)'4');
    grafo1.imprime();
    int i20 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test383"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    boolean b5 = grafo1.listaAdjVazia((int)'a');
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = grafo1.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test384"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    boolean b19 = grafo1.listaAdjVazia((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)1);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test385"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(0);
    boolean b7 = grafo2.existeAresta((int)(short)0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test386"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo15.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo15.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test387"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.insereAresta((int)(byte)10, (int)(byte)1, (int)(byte)1);
    boolean b14 = grafo1.existeAresta((int)(short)1, (int)(short)(-1));
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test388"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test389"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(10, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((-1), 10);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test390"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    boolean b5 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.imprime();
    grafo6.imprime();
    int i9 = grafo6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test391"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    int i5 = grafo1.numVertices();
    boolean b8 = grafo1.existeAresta((int)' ', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test392"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    grafo1.insereAresta((int)(short)0, (int)(short)100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)'4', (int)(short)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test393"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test394"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    boolean b8 = grafo1.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta(97, (int)(byte)(-1), 100);
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
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test395"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo14.numVertices();
    int i17 = grafo14.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test396"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b16 = grafo1.existeAresta(0, (int)' ');
    ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test397"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo9 = grafo5.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)'4', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test398"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)1);
    grafo1.imprime();
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test399"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    grafo1.imprime();
    int i17 = grafo1.numVertices();
    grafo1.imprime();
    int i19 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test400"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta(0, 97);
    ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int)(short)1);
    boolean b16 = grafo8.existeAresta(0, (int)'4');
    grafo8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test401"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    grafo1.insereAresta(0, (int)(byte)100, (int)(byte)1);
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.imprime();
    grafo1.imprime();
    boolean b15 = grafo1.listaAdjVazia((int)'#');
    int i16 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test402"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b8 = grafo6.listaAdjVazia(52);
    ds.Grafo.Aresta aresta10 = grafo6.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((int)' ', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test403"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    boolean b6 = grafo1.existeAresta((int)'#', (int)'a');
    boolean b9 = grafo1.existeAresta(0, (int)'4');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    grafo13.insereAresta(0, 52, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test404"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta(52, (int)'#', (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test405"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    int i12 = grafo1.numVertices();
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test406"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = grafo1.listaAdjVazia((-1));
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
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test407"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int i10 = grafo1.numVertices();
    boolean b12 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.proxAdj(100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test408"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    grafo1.imprime();
    grafo1.imprime();
    boolean b7 = grafo1.listaAdjVazia((int)(short)0);
    boolean b9 = grafo1.listaAdjVazia((int)(short)1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int)(short)0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test409"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    int i10 = grafo1.numVertices();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    boolean b13 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.retiraAresta((int)'#', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test410"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    boolean b7 = grafo4.listaAdjVazia((int)'4');
    grafo4.insereAresta(10, (int)(byte)10, (int)(byte)10);
    ds.Grafo grafo12 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo12.proxAdj((int)' ');
    boolean b17 = grafo12.existeAresta(52, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test411"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.insereAresta(10, (int)(short)100, (int)' ');
    int i20 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test412"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    grafo1.insereAresta(0, 52, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test413"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo10.insereAresta(10, 0, 97);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test414"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    boolean b7 = grafo1.listaAdjVazia(1);
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj(52);
    grafo1.insereAresta((int)'#', 100, 10);
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int)(short)100, 100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test415"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test416"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    grafo6.insereAresta((int)(short)0, (int)'a', (int)'a');
    grafo6.imprime();
    boolean b14 = grafo6.existeAresta((int)(short)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test417"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    int i10 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = grafo1.listaAdjVazia(100);
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
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test418"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test419"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test420"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    grafo13.insereAresta(52, 0, 1);
    int i18 = grafo13.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test421"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    grafo10.insereAresta((int)(short)1, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test422"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    grafo10.insereAresta((int)(short)1, (int)'4', 0);
    ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int)(byte)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test423"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    boolean b15 = grafo1.existeAresta((int)(short)0, (int)(byte)100);
    grafo1.imprime();
    grafo1.imprime();
    boolean b19 = grafo1.listaAdjVazia((int)'4');
    boolean b21 = grafo1.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo22 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test424"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(10, 1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(short)1);
    int i15 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 97);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test425"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo13.retiraAresta((int)(byte)100, 1);
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test426"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    boolean b18 = grafo1.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta21 = grafo1.retiraAresta((int)(byte)10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test427"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    grafo1.insereAresta((int)'#', 0, 97);
    boolean b19 = grafo1.listaAdjVazia((int)(short)10);
    int i20 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, (-1), (int)(byte)1);
    grafo1.insereAresta(1, 100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test428"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    boolean b8 = grafo1.listaAdjVazia(0);
    int i9 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta(97, (-1), (int)(byte)(-1));
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test429"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo9 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo5.primeiroListaAdj((int)(byte)1);
    int i12 = grafo5.numVertices();
    grafo5.insereAresta((int)(short)0, (int)(byte)1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test430"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    grafo10.imprime();
    grafo10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test431"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, (int)(short)100);
    boolean b18 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta(100, 10, (int)(short)10);
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test432"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int i7 = grafo6.numVertices();
    int i8 = grafo6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test433"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    grafo1.imprime();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int)(byte)1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test434"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia(97);
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.primeiroListaAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo8.proxAdj((int)(short)100);
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
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test435"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo grafo9 = grafo7.grafoTransposto();
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    ds.Grafo grafo12 = grafo10.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test436"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test437"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo1.listaAdjVazia((int)(byte)10);
    grafo1.insereAresta(10, (int)(byte)0, (int)(short)0);
    ds.Grafo.Aresta aresta17 = grafo1.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo18 = grafo1.grafoTransposto();
    int i19 = grafo18.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = grafo18.listaAdjVazia((-1));
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test438"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj(10);
    int i9 = grafo6.numVertices();
    grafo6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo6.retiraAresta((int)(byte)1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test439"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test440"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo1.proxAdj((-1));
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
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test441"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo14.proxAdj(10);
    boolean b19 = grafo14.existeAresta((int)(short)0, (int)(byte)1);
    grafo14.insereAresta((int)'#', 52, (int)(short)0);
    ds.Grafo grafo24 = grafo14.grafoTransposto();
    ds.Grafo grafo25 = grafo24.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo25);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test442"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    int i11 = grafo1.numVertices();
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    grafo1.insereAresta(10, (int)(byte)100, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test443"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia((int)' ');
    grafo4.imprime();
    ds.Grafo grafo8 = grafo4.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(byte)10, (int)(short)10);
    ds.Grafo grafo12 = grafo8.grafoTransposto();
    boolean b15 = grafo12.existeAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test444"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo8.insereAresta((int)'4', (int)' ', (int)(byte)10);
    int i13 = grafo8.numVertices();
    boolean b15 = grafo8.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test445"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    grafo1.insereAresta((int)(short)0, (int)(byte)10, (int)(short)(-1));
    grafo1.insereAresta((int)(byte)0, (int)' ', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta(100, (int)'#', 0);
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
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test446"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta8 = grafo4.proxAdj((int)'#');
    grafo4.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo4.retiraAresta((int)(byte)1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test447"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    int i10 = grafo1.numVertices();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test448"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)'a', 0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test449"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.imprime();
    int i5 = grafo1.numVertices();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    boolean b9 = grafo6.existeAresta(10, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test450"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test451"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)'#');
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)10, 0, (int)'#');
    boolean b12 = grafo1.listaAdjVazia((int)(short)1);
    boolean b15 = grafo1.existeAresta((int)(byte)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test452"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    boolean b11 = grafo1.existeAresta(1, (int)(byte)(-1));
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test453"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta(10, (int)' ');
    int i13 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo1.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test454"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj(0);
    grafo4.insereAresta((int)'4', (int)'4', (int)'#');
    grafo4.imprime();
    ds.Grafo grafo12 = grafo4.grafoTransposto();
    ds.Grafo grafo13 = grafo4.grafoTransposto();
    int i14 = grafo13.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test455"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(52);
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    boolean b14 = grafo11.existeAresta(0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test456"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo1.proxAdj(100);
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
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test457"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    boolean b9 = grafo5.existeAresta(0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test458"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(0);
    int i12 = grafo1.numVertices();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test459"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)10, (int)(byte)10);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test460"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b9 = grafo5.existeAresta((int)' ', 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo5.retiraAresta((int)(byte)(-1), 97);
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test461"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b8 = grafo6.listaAdjVazia(52);
    boolean b10 = grafo6.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      boolean b13 = grafo6.existeAresta((int)'a', (int)'4');
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test462"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.imprime();
    grafo4.insereAresta((int)'#', (int)(short)0, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo4.retiraAresta(10, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test463"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.imprime();
    boolean b11 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test464"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)1);
    boolean b6 = grafo1.listaAdjVazia(10);
    boolean b8 = grafo1.listaAdjVazia((int)'#');
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia(52);
    boolean b13 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test465"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(short)1, 52, 97);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo1.retiraAresta((int)'#', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test466"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.insereAresta(10, (int)(byte)10, (int)(short)100);
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test467"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    boolean b5 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.proxAdj((int)(short)1);
    boolean b11 = grafo6.existeAresta(1, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test468"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b9 = grafo5.existeAresta(100, (int)(short)10);
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
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test469"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test470"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    grafo1.imprime();
    int i17 = grafo1.numVertices();
    int i18 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test471"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test472"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int)(short)1);
    grafo7.imprime();
    boolean b15 = grafo7.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test473"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b4 = grafo1.existeAresta(0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test474"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'#', 0, (-1));
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)100, 52, (int)(short)100);
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
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test475"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)' ');
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)' ');
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo21 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test476"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    int i5 = grafo1.numVertices();
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)'#');
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test477"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(byte)0);
    boolean b14 = grafo1.listaAdjVazia((int)(short)0);
    boolean b16 = grafo1.listaAdjVazia(1);
    boolean b18 = grafo1.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test478"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    boolean b12 = grafo1.existeAresta((int)(byte)0, 0);
    grafo1.insereAresta((int)'#', (int)(byte)1, 10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo1.listaAdjVazia((int)(short)100);
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test479"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(0);
    int i11 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(short)100, (int)'4', 52);
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test480"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    int i16 = grafo1.numVertices();
    boolean b18 = grafo1.listaAdjVazia((int)(byte)0);
    boolean b20 = grafo1.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b23 = grafo1.existeAresta((int)'a', (int)'a');
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
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test481"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test482"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    grafo1.insereAresta((int)(byte)0, 0, (int)(byte)0);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo16 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test483"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta9 = grafo7.proxAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      grafo7.insereAresta((int)'a', (int)(byte)(-1), (int)'a');
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
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test484"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    boolean b16 = grafo1.existeAresta((int)(short)1, 52);
    boolean b19 = grafo1.existeAresta((int)'4', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test485"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    int i12 = grafo1.numVertices();
    boolean b14 = grafo1.listaAdjVazia((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test486"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo8.imprime();
    boolean b12 = grafo8.existeAresta((int)(byte)1, (int)'#');
    grafo8.imprime();
    ds.Grafo grafo14 = grafo8.grafoTransposto();
    boolean b16 = grafo14.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test487"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.insereAresta(0, (int)(byte)100, (int)(byte)10);
    boolean b14 = grafo7.listaAdjVazia((int)(short)0);
    boolean b17 = grafo7.existeAresta((int)(byte)10, 97);
    boolean b19 = grafo7.listaAdjVazia((int)(short)0);
    boolean b22 = grafo7.existeAresta(0, 1);
    grafo7.insereAresta((int)(byte)1, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test488"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    grafo1.insereAresta((int)(byte)0, 10, 100);
    boolean b16 = grafo1.listaAdjVazia((int)(short)10);
    grafo1.insereAresta((int)(short)1, (int)(short)100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test489"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    int i16 = grafo1.numVertices();
    boolean b18 = grafo1.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test490"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b9 = grafo1.listaAdjVazia(0);
    boolean b12 = grafo1.existeAresta(0, (int)(short)100);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo grafo15 = grafo13.grafoTransposto();
    ds.Grafo.Aresta aresta17 = grafo15.primeiroListaAdj((int)(byte)10);
    int i18 = grafo15.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test491"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)'4', (int)'4');
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

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test492"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    int i6 = grafo1.numVertices();
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta(10, (int)(short)1, (int)'#');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    grafo13.insereAresta((int)(short)10, (int)(short)(-1), (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test493"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b10 = grafo1.existeAresta((int)'4', (int)(short)0);
    grafo1.insereAresta((int)'#', (int)(byte)10, (int)(byte)10);
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)' ');
    boolean b19 = grafo1.existeAresta(10, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = grafo1.existeAresta(100, 52);
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
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test494"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test495"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)' ');
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test496"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)10);
    boolean b12 = grafo1.listaAdjVazia((int)' ');
    boolean b14 = grafo1.listaAdjVazia(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test497"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)'#');
    grafo1.imprime();
    boolean b19 = grafo1.existeAresta((int)'#', (int)(byte)10);
    grafo1.insereAresta((int)(short)0, (int)' ', 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta26 = grafo1.retiraAresta((-1), (int)'#');
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
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test498"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test499"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    boolean b10 = grafo1.existeAresta(52, 97);
    int i11 = grafo1.numVertices();
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int i14 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test500"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)' ');
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    boolean b11 = grafo5.existeAresta((int)(byte)10, (int)'#');
    ds.Grafo.Aresta aresta13 = grafo5.primeiroListaAdj(10);
    grafo5.insereAresta((int)'4', (int)(short)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

}
