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


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b18 = grafo0.existeAresta((int)'#', 100);
    boolean b20 = grafo0.listaAdjVazia((int)'4');
    int i21 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', (int)(byte)1, 100);
    grafo0.insereAresta(0, 10, (int)(byte)(-1));
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b32 = grafo0.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test002"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test003"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int)(short)1);
    grafo0.imprime();
    boolean b8 = grafo0.listaAdjVazia((int)'a');
    int i9 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = grafo0.existeAresta((int)(short)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test004"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia((int)(short)10);
    int i4 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test005"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    boolean b14 = grafo0.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test006"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo0.existeAresta((int)(byte)10, 0);
    boolean b7 = grafo0.existeAresta((int)'4', (int)'#');
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test007"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)1, (int)'4', (int)(byte)100);
    grafo0.insereAresta((int)'4', (int)' ', (int)(short)1);
    int i21 = grafo0.numVertices();
    grafo0.insereAresta((int)'#', (int)(short)0, (int)'4');
    ds.Grafo.Aresta aresta27 = grafo0.primeiroListaAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta27);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test008"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    int i9 = grafo0.numVertices();
    int i10 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test009"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    int i11 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo12 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test010"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo9.imprime();
    int i15 = grafo9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test011"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (-1));
    int i16 = grafo0.numVertices();
    boolean b19 = grafo0.existeAresta((int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta24 = grafo0.retiraAresta((int)'#', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test012"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(byte)10);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)10, (int)(short)0, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test013"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo0.existeAresta((int)(byte)10, 0);
    boolean b7 = grafo0.existeAresta((int)'4', (int)'#');
    boolean b10 = grafo0.existeAresta((int)' ', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test014"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b10 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    boolean b14 = grafo11.existeAresta((int)(short)0, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test015"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b18 = grafo0.existeAresta((int)'#', 100);
    int i19 = grafo0.numVertices();
    ds.Grafo grafo20 = grafo0.grafoTransposto();
    boolean b23 = grafo0.existeAresta(10, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test016"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    int i12 = grafo0.numVertices();
    grafo0.insereAresta(1, (int)(byte)1, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo0.retiraAresta((int)(byte)0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test017"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    int i2 = grafo0.numVertices();
    grafo0.imprime();
    int i4 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo0.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test018"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    int i5 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', (-1), 0);
    boolean b12 = grafo0.existeAresta(10, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo13 = grafo0.grafoTransposto();
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
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test019"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test020"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b6 = grafo0.existeAresta((int)(byte)0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test021"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    grafo9.insereAresta(10, (int)(short)(-1), 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta21 = grafo9.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test022"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    grafo0.insereAresta(1, 100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test023"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.insereAresta(10, (int)(byte)1, (int)'4');
    boolean b12 = grafo0.existeAresta((int)'4', 0);
    int i13 = grafo0.numVertices();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    boolean b17 = grafo14.existeAresta((int)(short)0, (int)'a');
    ds.Grafo.Aresta aresta19 = grafo14.proxAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test024"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b8 = grafo0.existeAresta((int)(short)1, 10);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test025"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'#', 100, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj((int)'a');
    boolean b18 = grafo0.existeAresta(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test026"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    grafo0.imprime();
    grafo0.imprime();
    int i13 = grafo0.numVertices();
    int i14 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test027"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo0.retiraAresta((int)(byte)1, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test028"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo9.imprime();
    ds.Grafo grafo15 = grafo9.grafoTransposto();
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test029"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.insereAresta(10, (int)(byte)1, (int)'4');
    boolean b12 = grafo0.existeAresta((int)'4', 0);
    int i13 = grafo0.numVertices();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo14.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test030"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(short)10);
    grafo0.insereAresta((int)'#', 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test031"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo1.numVertices();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test032"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)(byte)100, (-1));
    int i13 = grafo0.numVertices();
    int i14 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test033"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(short)1, (int)(byte)10, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo0.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test034"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test035"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'a', (int)(byte)(-1), 1);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'a');
    boolean b18 = grafo0.existeAresta((int)(short)0, (int)(byte)(-1));
    boolean b20 = grafo0.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test036"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    grafo0.imprime();
    int i7 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test037"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo0.existeAresta((-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test038"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)' ');
    int i5 = grafo0.numVertices();
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo6.imprime();
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test039"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, (int)(short)10, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo0.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test040"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo14.retiraAresta((int)' ', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test041"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    boolean b18 = grafo0.existeAresta((int)' ', (-1));
    int i19 = grafo0.numVertices();
    boolean b22 = grafo0.existeAresta((int)' ', (-1));
    boolean b24 = grafo0.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test042"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(short)(-1), (int)(short)1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test043"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    grafo0.imprime();
    grafo0.imprime();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta(10, (int)'a', (int)' ');
    int i19 = grafo0.numVertices();
    ds.Grafo.Aresta aresta21 = grafo0.primeiroListaAdj(1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta23 = grafo0.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test044"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)1, (int)'4', (int)(byte)100);
    grafo0.insereAresta((int)'4', (int)' ', (int)(short)1);
    int i21 = grafo0.numVertices();
    grafo0.insereAresta((int)'#', (int)(short)0, (int)'4');
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test045"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    ds.Grafo.Aresta aresta20 = grafo14.primeiroListaAdj((int)'4');
    boolean b23 = grafo14.existeAresta(0, (int)'#');
    boolean b25 = grafo14.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b27 = grafo14.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test046"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test047"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.insereAresta(1, (int)(byte)0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test048"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    boolean b9 = grafo0.listaAdjVazia((int)' ');
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)(byte)0);
    ds.Grafo grafo13 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo13.retiraAresta((int)(short)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test049"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    grafo0.insereAresta((int)' ', 10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test050"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(byte)10);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)10, (int)(short)0, (int)(short)0);
    grafo0.insereAresta((int)'4', (int)'#', (int)'a');
    grafo0.imprime();
    boolean b23 = grafo0.existeAresta((int)(byte)10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test051"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(0, (int)(short)1);
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test052"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b8 = grafo0.existeAresta((int)(byte)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test053"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)(short)10);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test054"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta(0, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test055"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (-1));
    int i16 = grafo0.numVertices();
    ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int)'#');
    boolean b20 = grafo0.listaAdjVazia((int)(short)1);
    int i21 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test056"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)' ');
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo0.retiraAresta((int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test057"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)' ');
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
    int i7 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test058"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)' ');
    int i5 = grafo0.numVertices();
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    int i7 = grafo6.numVertices();
    grafo6.insereAresta((int)'#', (int)(byte)100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test059"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test060"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)'4');
    grafo4.imprime();
    grafo4.imprime();
    grafo4.imprime();
    ds.Grafo grafo10 = grafo4.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo4.retiraAresta((int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test061"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    boolean b18 = grafo9.existeAresta(0, (int)(short)100);
    int i19 = grafo9.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo9.retiraAresta((int)(byte)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test062"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    grafo0.insereAresta((int)(short)1, (int)(byte)10, 0);
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.imprime();
    ds.Grafo grafo15 = grafo0.grafoTransposto();
    grafo15.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test063"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)'4');
    boolean b12 = grafo0.listaAdjVazia((int)'a');
    int i13 = grafo0.numVertices();
    int i14 = grafo0.numVertices();
    int i15 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test064"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    int i12 = grafo0.numVertices();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b16 = grafo0.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test065"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta(100, (int)(byte)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test066"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)'4');
    grafo4.insereAresta(0, (int)(short)(-1), (int)(byte)1);
    ds.Grafo.Aresta aresta12 = grafo4.proxAdj((int)(short)0);
    grafo4.insereAresta(0, (int)(byte)0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo4.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test067"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test068"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)(byte)1);
    boolean b16 = grafo9.listaAdjVazia(10);
    ds.Grafo.Aresta aresta18 = grafo9.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo9.insereAresta(100, 0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test069"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo8.numVertices();
    grafo8.imprime();
    grafo8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo8.retiraAresta(0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test070"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    ds.Grafo grafo16 = grafo9.grafoTransposto();
    ds.Grafo grafo17 = grafo16.grafoTransposto();
    int i18 = grafo17.numVertices();
    grafo17.insereAresta(1, 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test071"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int)(short)1);
    grafo0.imprime();
    int i7 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test072"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo9.imprime();
    ds.Grafo grafo15 = grafo9.grafoTransposto();
    grafo15.imprime();
    boolean b19 = grafo15.existeAresta((int)(byte)0, (int)'4');
    boolean b22 = grafo15.existeAresta((int)' ', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test073"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    boolean b9 = grafo0.listaAdjVazia((int)(byte)10);
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)' ');
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test074"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)'4');
    grafo4.insereAresta(0, (int)(short)(-1), (int)(byte)1);
    int i11 = grafo4.numVertices();
    ds.Grafo.Aresta aresta13 = grafo4.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = grafo4.existeAresta((int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test075"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    grafo8.imprime();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo8.insereAresta((int)(short)(-1), (int)(byte)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test076"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)0, 100, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = grafo0.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test077"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    boolean b9 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test078"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.imprime();
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test079"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo11.grafoTransposto();
    grafo12.insereAresta(1, (int)'#', 1);
    grafo12.imprime();
    ds.Grafo.Aresta aresta19 = grafo12.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test080"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(short)1, (int)(byte)10, (int)(byte)100);
    grafo0.imprime();
    grafo0.insereAresta(10, 10, (int)(short)100);
    int i13 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test081"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int i16 = grafo14.numVertices();
    ds.Grafo.Aresta aresta18 = grafo14.proxAdj(10);
    int i19 = grafo14.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test082"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.imprime();
    boolean b14 = grafo11.listaAdjVazia(1);
    ds.Grafo grafo15 = grafo11.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test083"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo0.retiraAresta((int)(byte)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test084"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    int i12 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo0.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test085"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'#', 100, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo0.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test086"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.insereAresta((int)(short)1, 100, (int)(byte)0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((-1), (int)(short)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test087"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.insereAresta((int)' ', (int)'a', (int)'#');
    int i18 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test088"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    grafo3.imprime();
    int i6 = grafo3.numVertices();
    ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo9 = grafo3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test089"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo12.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test090"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    boolean b14 = grafo11.existeAresta(10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test091"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int i10 = grafo1.numVertices();
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test092"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)'4');
    boolean b12 = grafo0.listaAdjVazia((int)'a');
    int i13 = grafo0.numVertices();
    int i14 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test093"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b7 = grafo0.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test094"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo0.existeAresta((int)(short)(-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test095"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)' ');
    ds.Grafo.Aresta aresta16 = grafo9.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo9.insereAresta((-1), (int)(byte)0, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test096"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    boolean b9 = grafo0.listaAdjVazia((int)(byte)10);
    int i10 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      boolean b12 = grafo0.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test097"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo0.retiraAresta((int)'a', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test098"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    grafo0.imprime();
    ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int)(short)10, 1);
    int i13 = grafo0.numVertices();
    boolean b15 = grafo0.listaAdjVazia((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo16 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test099"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    grafo14.imprime();
    ds.Grafo grafo20 = grafo14.grafoTransposto();
    int i21 = grafo14.numVertices();
    grafo14.imprime();
    ds.Grafo grafo23 = grafo14.grafoTransposto();
    ds.Grafo grafo24 = grafo23.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo24);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test100"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    boolean b17 = grafo14.existeAresta(0, (int)(byte)100);
    ds.Grafo grafo18 = grafo14.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test101"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    grafo10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test102"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    grafo7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test103"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)0, (int)'#', (int)(byte)100);
    grafo0.imprime();
    ds.Grafo.Aresta aresta18 = grafo0.retiraAresta((int)(byte)0, (int)(short)(-1));
    ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta23 = grafo0.retiraAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test104"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (-1));
    int i16 = grafo0.numVertices();
    boolean b18 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta20);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test105"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test106"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test107"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test108"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b10 = grafo0.listaAdjVazia(0);
    boolean b13 = grafo0.existeAresta((int)(short)0, (int)(short)1);
    grafo0.imprime();
    ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test109"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b17 = grafo0.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta20 = grafo0.retiraAresta(0, (int)'#');
    int i21 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test110"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test111"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo8.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test112"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo0.retiraAresta((int)(short)10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test113"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia((int)(short)0);
    grafo3.insereAresta((int)(short)10, (int)(byte)10, 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo3.retiraAresta((-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test114"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, (int)'a', (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(short)(-1), (int)'#', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test115"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test116"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    grafo9.insereAresta(10, (int)(short)(-1), (int)(byte)100);
    int i20 = grafo9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test117"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)'4');
    grafo0.insereAresta((int)(short)0, 10, (int)(short)100);
    grafo0.insereAresta((int)(short)10, (int)(byte)(-1), (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test118"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int i6 = grafo4.numVertices();
    ds.Grafo.Aresta aresta8 = grafo4.primeiroListaAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test119"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int)(byte)1);
    int i10 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test120"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo0.retiraAresta((int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test121"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test122"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int)'4');
    int i9 = grafo6.numVertices();
    ds.Grafo.Aresta aresta11 = grafo6.primeiroListaAdj((int)'4');
    boolean b13 = grafo6.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test123"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    boolean b11 = grafo8.listaAdjVazia((int)(byte)1);
    int i12 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test124"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta19 = grafo0.retiraAresta((int)(byte)10, (int)(short)100);
    grafo0.insereAresta(10, (int)'a', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta19);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test125"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (-1));
    int i16 = grafo0.numVertices();
    boolean b19 = grafo0.existeAresta((int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int)' ');
    ds.Grafo.Aresta aresta23 = grafo0.proxAdj(0);
    grafo0.imprime();
    boolean b26 = grafo0.listaAdjVazia(1);
    boolean b28 = grafo0.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test126"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    int i13 = grafo12.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo12.insereAresta((int)(short)(-1), (int)(byte)0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test127"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.insereAresta((int)(short)10, (int)(byte)0, (int)(byte)100);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test128"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta(0, (-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test129"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    int i4 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test130"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'a', (int)(byte)(-1), 1);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test131"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    grafo0.insereAresta((int)(short)10, (int)(short)1, (int)(byte)100);
    boolean b22 = grafo0.existeAresta((int)(short)0, (int)(byte)10);
    boolean b24 = grafo0.listaAdjVazia(0);
    int i25 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test132"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    boolean b8 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test133"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    boolean b16 = grafo9.existeAresta((int)(short)1, (int)(byte)(-1));
    ds.Grafo grafo17 = grafo9.grafoTransposto();
    ds.Grafo grafo18 = grafo9.grafoTransposto();
    int i19 = grafo18.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test134"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    int i19 = grafo14.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test135"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    grafo3.imprime();
    boolean b7 = grafo3.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo3.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo10 = grafo3.grafoTransposto();
    boolean b12 = grafo10.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test136"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b8 = grafo0.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test137"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)'4');
    boolean b12 = grafo0.listaAdjVazia((int)'a');
    grafo0.insereAresta((int)'#', (int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test138"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(short)1, (int)(byte)10, (int)(byte)100);
    grafo0.imprime();
    int i9 = grafo0.numVertices();
    boolean b12 = grafo0.existeAresta((int)(byte)0, (int)' ');
    int i13 = grafo0.numVertices();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test139"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)'#', (int)(short)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test140"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)1, 0, 0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test141"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    grafo0.insereAresta(0, 0, (int)(byte)1);
    grafo0.imprime();
    int i18 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test142"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)10, (int)(byte)100, (int)(short)1);
    boolean b21 = grafo0.existeAresta((int)(byte)0, (int)(short)10);
    int i22 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test143"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    boolean b12 = grafo10.listaAdjVazia(0);
    ds.Grafo grafo13 = grafo10.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo13.insereAresta((-1), (int)'#', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test144"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    boolean b10 = grafo0.existeAresta((int)(byte)1, (int)(byte)1);
    boolean b12 = grafo0.listaAdjVazia(0);
    int i13 = grafo0.numVertices();
    boolean b16 = grafo0.existeAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test145"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo0.retiraAresta((int)(byte)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test146"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    boolean b13 = grafo0.existeAresta(0, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int)' ', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test147"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    int i6 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test148"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)10);
    boolean b14 = grafo1.existeAresta(0, 100);
    boolean b16 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta((int)(short)0, (int)(short)0, (int)(byte)100);
    int i21 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test149"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo3.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int)'a');
    ds.Grafo grafo9 = grafo3.grafoTransposto();
    ds.Grafo grafo10 = grafo3.grafoTransposto();
    boolean b13 = grafo3.existeAresta((int)' ', (int)(short)(-1));
    boolean b15 = grafo3.listaAdjVazia(0);
    int i16 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test150"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo0.numVertices();
    grafo0.imprime();
    int i12 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test151"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)(byte)0);
    grafo0.imprime();
    boolean b14 = grafo0.listaAdjVazia(10);
    grafo0.imprime();
    boolean b18 = grafo0.existeAresta((int)(byte)10, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b21 = grafo0.existeAresta((int)(short)100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test152"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    grafo10.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo10.retiraAresta((int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test153"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)0, (int)'#', (int)(byte)100);
    grafo0.imprime();
    ds.Grafo.Aresta aresta18 = grafo0.retiraAresta((int)(byte)0, (int)(short)(-1));
    int i19 = grafo0.numVertices();
    boolean b22 = grafo0.existeAresta((int)(byte)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test154"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    grafo0.insereAresta((int)(byte)0, 100, 100);
    boolean b14 = grafo0.existeAresta((int)(byte)10, 10);
    grafo0.insereAresta((int)(short)0, (int)(byte)1, (int)(short)0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test155"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test156"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test157"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    int i12 = grafo0.numVertices();
    grafo0.insereAresta(1, (int)(byte)1, 100);
    int i17 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test158"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test159"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    boolean b9 = grafo0.listaAdjVazia((int)(byte)10);
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)' ');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test160"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test161"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)'4');
    ds.Grafo grafo7 = grafo4.grafoTransposto();
    int i8 = grafo7.numVertices();
    ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test162"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    int i6 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test163"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    boolean b15 = grafo0.existeAresta(0, (int)(byte)(-1));
    int i16 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test164"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)'4', 1, (int)(byte)100);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test165"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test166"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test167"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
    ds.Grafo grafo15 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo15.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test168"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.insereAresta(0, (int)(byte)10, (int)(short)0);
    ds.Grafo grafo17 = grafo0.grafoTransposto();
    boolean b20 = grafo17.existeAresta(1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test169"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    grafo8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test170"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    grafo0.imprime();
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)'a');
    boolean b14 = grafo0.existeAresta((int)(byte)10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test171"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int)(byte)0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test172"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    grafo14.imprime();
    ds.Grafo grafo20 = grafo14.grafoTransposto();
    grafo14.insereAresta((int)(byte)10, (-1), (-1));
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test173"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    boolean b7 = grafo4.existeAresta((int)' ', (int)(byte)0);
    grafo4.insereAresta((int)'#', 0, (int)(byte)0);
    ds.Grafo.Aresta aresta13 = grafo4.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test174"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.insereAresta(10, (int)(byte)1, (-1));
    grafo0.insereAresta((int)' ', 100, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
      boolean b20 = grafo0.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test175"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    boolean b8 = grafo0.listaAdjVazia((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(0, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test176"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    int i5 = grafo3.numVertices();
    grafo3.imprime();
    ds.Grafo grafo7 = grafo3.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      grafo3.insereAresta((int)(short)(-1), (int)(short)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test177"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test178"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia((int)(short)0);
    ds.Grafo.Aresta aresta7 = grafo3.proxAdj(1);
    grafo3.imprime();
    ds.Grafo grafo9 = grafo3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test179"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int)(byte)1, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test180"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    boolean b8 = grafo0.listaAdjVazia((int)'#');
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test181"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)'4', (int)(byte)0, (int)(byte)(-1));
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)(short)1, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test182"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta13 = grafo9.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test183"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    grafo3.imprime();
    boolean b7 = grafo3.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo3.primeiroListaAdj((int)(byte)1);
    grafo3.imprime();
    grafo3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test184"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    int i11 = grafo9.numVertices();
    ds.Grafo grafo12 = grafo9.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test185"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test186"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b10 = grafo0.listaAdjVazia((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      boolean b14 = grafo0.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test187"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia((int)(short)0);
    grafo3.insereAresta((int)(short)10, (int)(byte)10, 0);
    int i10 = grafo3.numVertices();
    boolean b12 = grafo3.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test188"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)' ');
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo0.existeAresta((int)(short)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test189"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo12 = grafo9.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test190"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b9 = grafo7.listaAdjVazia((int)'4');
    ds.Grafo grafo10 = grafo7.grafoTransposto();
    grafo7.insereAresta(1, (int)'a', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test191"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    boolean b13 = grafo0.existeAresta(0, 1);
    boolean b16 = grafo0.existeAresta((int)'#', (int)(byte)1);
    int i17 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test192"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    grafo10.insereAresta((int)(short)1, (int)(short)100, (int)(byte)0);
    grafo10.insereAresta((int)(short)1, (int)(byte)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test193"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (-1));
    ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)'4');
    boolean b21 = grafo0.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test194"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)(short)0, (int)(short)1, (int)(short)0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test195"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    boolean b10 = grafo0.existeAresta((int)(short)10, (int)'#');
    boolean b12 = grafo0.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b15 = grafo0.existeAresta((int)(byte)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test196"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta18 = grafo0.retiraAresta((int)(short)0, (int)'a');
    int i19 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test197"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    boolean b12 = grafo10.listaAdjVazia(0);
    boolean b15 = grafo10.existeAresta((int)'4', (int)'a');
    int i16 = grafo10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test198"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, (int)(short)0, (int)'a');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo12.retiraAresta((int)(short)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test199"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b18 = grafo0.existeAresta((int)'#', 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test200"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    boolean b18 = grafo14.existeAresta((int)(byte)1, (int)(byte)1);
    ds.Grafo.Aresta aresta20 = grafo14.primeiroListaAdj(0);
    int i21 = grafo14.numVertices();
    ds.Grafo.Aresta aresta23 = grafo14.proxAdj((int)'4');
    grafo14.insereAresta((int)(byte)10, 0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test201"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    boolean b5 = grafo0.existeAresta(0, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)10, (int)(byte)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test202"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    boolean b9 = grafo0.listaAdjVazia((int)(byte)1);
    boolean b11 = grafo0.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test203"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    boolean b9 = grafo0.listaAdjVazia((int)(short)0);
    boolean b12 = grafo0.existeAresta((int)'a', (int)(byte)10);
    boolean b15 = grafo0.existeAresta((int)(byte)1, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test204"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    int i6 = grafo0.numVertices();
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)'#', 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo0.retiraAresta((int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test205"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test206"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test207"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    boolean b8 = grafo0.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test208"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b6 = grafo0.existeAresta((int)(byte)0, (int)(byte)0);
    boolean b9 = grafo0.existeAresta(10, (int)(byte)0);
    grafo0.insereAresta(0, (int)(byte)0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test209"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    grafo14.imprime();
    ds.Grafo grafo20 = grafo14.grafoTransposto();
    grafo20.insereAresta((int)'a', (int)' ', (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test210"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo7.proxAdj(0);
    grafo7.insereAresta((int)(byte)10, (int)(short)1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test211"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    int i8 = grafo0.numVertices();
    boolean b10 = grafo0.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test212"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    int i6 = grafo0.numVertices();
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b10 = grafo0.listaAdjVazia((int)(short)0);
    int i11 = grafo0.numVertices();
    ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo0.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test213"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    int i2 = grafo0.numVertices();
    grafo0.imprime();
    int i4 = grafo0.numVertices();
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj(10);
    grafo0.insereAresta((int)'4', (int)'a', (int)(short)0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test214"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)(short)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test215"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo9.imprime();
    ds.Grafo grafo15 = grafo9.grafoTransposto();
    grafo15.imprime();
    boolean b19 = grafo15.existeAresta((int)(byte)0, (int)'4');
    ds.Grafo grafo20 = grafo15.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test216"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.insereAresta(10, (int)(byte)100, 100);
    grafo11.imprime();
    boolean b18 = grafo11.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test217"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    boolean b18 = grafo0.existeAresta((int)' ', (-1));
    ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj((int)'#');
    boolean b22 = grafo0.listaAdjVazia(0);
    ds.Grafo.Aresta aresta25 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)100, (int)(short)(-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta25);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test218"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    int i12 = grafo11.numVertices();
    ds.Grafo.Aresta aresta14 = grafo11.primeiroListaAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = grafo11.listaAdjVazia((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test219"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo3.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test220"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test221"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.insereAresta(10, (int)(byte)100, 100);
    grafo11.imprime();
    grafo11.insereAresta(0, (int)(byte)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test222"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    grafo0.imprime();
    int i9 = grafo0.numVertices();
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test223"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test224"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test225"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    boolean b11 = grafo0.existeAresta(0, (int)(byte)1);
    boolean b13 = grafo0.listaAdjVazia(0);
    boolean b15 = grafo0.listaAdjVazia((int)'a');
    grafo0.insereAresta((int)(short)1, 100, (int)'a');
    int i20 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test226"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    int i14 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test227"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b17 = grafo0.listaAdjVazia((int)(short)1);
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)'4');
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test228"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)'a');
    ds.Grafo grafo8 = grafo5.grafoTransposto();
    boolean b10 = grafo5.listaAdjVazia(0);
    int i11 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test229"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia(1);
    grafo0.insereAresta((int)'a', (int)'#', (int)'a');
    int i17 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(short)100, (int)'a', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test230"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    boolean b4 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    int i6 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test231"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia((int)(short)0);
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test232"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    ds.Grafo grafo16 = grafo9.grafoTransposto();
    boolean b19 = grafo16.existeAresta((int)'#', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b22 = grafo16.existeAresta((int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test233"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(byte)10);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test234"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b9 = grafo0.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test235"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)(byte)10);
    ds.Grafo.Aresta aresta8 = grafo4.proxAdj((int)'a');
    boolean b11 = grafo4.existeAresta((int)(byte)1, (int)(short)1);
    ds.Grafo.Aresta aresta13 = grafo4.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test236"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)100, (int)'#', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test237"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    boolean b18 = grafo0.existeAresta((int)' ', (-1));
    int i19 = grafo0.numVertices();
    boolean b21 = grafo0.listaAdjVazia((int)(short)1);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test238"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.insereAresta(10, (int)(short)(-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test239"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)'4', (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo9.retiraAresta(0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test240"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo11.grafoTransposto();
    boolean b14 = grafo12.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = grafo12.existeAresta((int)(byte)100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test241"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    grafo0.imprime();
    ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b21 = grafo0.existeAresta((int)'4', 1);
    int i22 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test242"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = grafo9.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test243"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    boolean b20 = grafo14.listaAdjVazia((int)' ');
    ds.Grafo grafo21 = grafo14.grafoTransposto();
    int i22 = grafo14.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test244"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo1.numVertices();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    boolean b7 = grafo3.existeAresta(1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test245"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'#', 100, (int)(short)0);
    int i14 = grafo0.numVertices();
    boolean b17 = grafo0.existeAresta((int)(byte)1, 0);
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta19);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test246"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test247"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    ds.Grafo grafo16 = grafo9.grafoTransposto();
    ds.Grafo.Aresta aresta18 = grafo9.proxAdj((int)(byte)0);
    grafo9.insereAresta((int)(short)1, (int)(short)100, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      grafo9.insereAresta((int)(byte)(-1), (int)'a', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
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
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test248"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia((int)'a');
    grafo0.insereAresta((int)(short)1, 100, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo0.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test249"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)(byte)0);
    grafo0.imprime();
    boolean b14 = grafo0.listaAdjVazia(10);
    grafo0.imprime();
    int i16 = grafo0.numVertices();
    grafo0.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test250"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(byte)0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test251"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    int i12 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test252"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    boolean b11 = grafo0.existeAresta(0, (int)(byte)1);
    boolean b13 = grafo0.listaAdjVazia((int)(byte)1);
    boolean b16 = grafo0.existeAresta((int)(byte)1, (int)'#');
    ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta21 = grafo0.retiraAresta((int)(byte)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test253"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    int i6 = grafo0.numVertices();
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)'#', 10);
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test254"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    grafo5.insereAresta((int)(byte)0, (int)(byte)10, (int)(byte)(-1));
    int i12 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test255"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.imprime();
    grafo0.insereAresta((int)'#', (int)(byte)10, 10);
    int i11 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)(-1), 0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test256"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b11 = grafo0.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test257"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)0, 100, (int)(byte)100);
    grafo0.insereAresta((int)(short)1, (int)(byte)10, (int)(byte)10);
    grafo0.insereAresta(0, (int)(short)1, (int)(byte)100);
    ds.Grafo.Aresta aresta25 = grafo0.primeiroListaAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)'#', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta25);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test258"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    boolean b9 = grafo0.listaAdjVazia((int)(byte)10);
    boolean b11 = grafo0.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test259"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta11 = grafo0.proxAdj(10);
    int i12 = grafo0.numVertices();
    grafo0.insereAresta(1, (int)(byte)1, 100);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta20 = grafo0.retiraAresta(100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test260"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)'#');
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test261"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)'#', (int)(short)10, 0);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((-1), (int)(short)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test262"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    boolean b12 = grafo0.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test263"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    grafo3.imprime();
    boolean b7 = grafo3.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo3.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo10 = grafo3.grafoTransposto();
    int i11 = grafo10.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test264"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b6 = grafo0.existeAresta((int)' ', (int)'a');
    int i7 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test265"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b10 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test266"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    ds.Grafo.Aresta aresta20 = grafo14.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta22 = grafo14.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test267"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo11.grafoTransposto();
    int i13 = grafo12.numVertices();
    grafo12.insereAresta((int)'a', (int)(byte)(-1), (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test268"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    grafo9.insereAresta((int)(byte)1, 100, (int)(byte)(-1));
    grafo9.insereAresta((int)' ', (int)(byte)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test269"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)0, (int)'#', (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo15 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test270"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    int i9 = grafo8.numVertices();
    grafo8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test271"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)' ');
    grafo9.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo9.insereAresta(100, (int)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test272"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b19 = grafo0.existeAresta(100, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test273"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)(short)1, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.insereAresta(0, (int)(byte)10, (int)(short)0);
    ds.Grafo grafo17 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test274"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
      grafo1.insereAresta((int)(byte)100, 1, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test275"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    boolean b9 = grafo0.listaAdjVazia((int)(short)1);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test276"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    grafo0.insereAresta((int)(short)1, (int)(byte)100, (int)(short)(-1));
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)(short)10, 0, 1);
    grafo0.imprime();
    boolean b22 = grafo0.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo23 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test277"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    boolean b17 = grafo14.existeAresta(0, (int)(byte)100);
    int i18 = grafo14.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test278"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    grafo0.insereAresta(1, (int)(short)(-1), (int)(short)1);
    boolean b10 = grafo0.existeAresta(0, (int)(short)(-1));
    grafo0.insereAresta((int)(byte)10, 0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b17 = grafo0.existeAresta((int)(byte)(-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test279"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test280"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    boolean b11 = grafo1.listaAdjVazia((int)(short)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test281"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    grafo0.imprime();
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test282"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    grafo0.insereAresta((int)(short)1, (int)(byte)10, 0);
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.imprime();
    ds.Grafo grafo15 = grafo0.grafoTransposto();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test283"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.imprime();
    grafo0.insereAresta((int)'#', (int)(byte)10, 10);
    grafo0.imprime();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test284"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo0.existeAresta((int)(byte)10, 0);
    boolean b7 = grafo0.existeAresta((int)'4', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(short)100, (int)(byte)10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test285"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    grafo14.imprime();
    ds.Grafo grafo20 = grafo14.grafoTransposto();
    grafo14.insereAresta((int)(byte)10, (-1), (-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo25 = grafo14.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test286"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta((int)'a', (int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test287"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int)'#');
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test288"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test289"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b11 = grafo9.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test290"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj(10);
    int i11 = grafo0.numVertices();
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test291"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test292"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    grafo14.imprime();
    ds.Grafo grafo20 = grafo14.grafoTransposto();
    int i21 = grafo14.numVertices();
    grafo14.imprime();
    boolean b25 = grafo14.existeAresta(1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test293"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)1, (int)'4', (int)(byte)100);
    grafo0.insereAresta((int)'4', (int)' ', (int)(short)1);
    boolean b22 = grafo0.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test294"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test295"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia((int)'a');
    boolean b9 = grafo0.existeAresta((int)'4', 10);
    ds.Grafo.Aresta aresta11 = grafo0.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test296"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    boolean b11 = grafo0.existeAresta(0, (int)(byte)1);
    boolean b13 = grafo0.listaAdjVazia((int)(byte)1);
    int i14 = grafo0.numVertices();
    ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj(0);
    boolean b18 = grafo0.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test297"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b10 = grafo0.listaAdjVazia((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo0.retiraAresta(0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test298"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    grafo0.insereAresta((int)(short)1, (int)(byte)100, (int)(short)(-1));
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'4');
    ds.Grafo.Aresta aresta17 = grafo0.proxAdj((int)'a');
    int i18 = grafo0.numVertices();
    int i19 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test299"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)' ', (int)(byte)0, (int)' ');
    int i16 = grafo0.numVertices();
    int i17 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test300"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    boolean b11 = grafo1.listaAdjVazia((int)(short)0);
    int i12 = grafo1.numVertices();
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test301"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    grafo0.insereAresta((int)'4', (int)(short)1, (int)(short)100);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test302"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo0.retiraAresta((int)(byte)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test303"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)0, 10, (int)(short)0);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'#');
    boolean b18 = grafo0.existeAresta((int)'#', 100);
    int i19 = grafo0.numVertices();
    ds.Grafo grafo20 = grafo0.grafoTransposto();
    int i21 = grafo20.numVertices();
    int i22 = grafo20.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test304"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    grafo0.insereAresta((int)'a', (int)(byte)(-1), 1);
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'a');
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo0.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test305"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    int i15 = grafo9.numVertices();
    ds.Grafo grafo16 = grafo9.grafoTransposto();
    ds.Grafo grafo17 = grafo16.grafoTransposto();
    grafo16.insereAresta((int)(byte)0, (int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test306"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)' ');
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test307"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    int i10 = grafo0.numVertices();
    boolean b13 = grafo0.existeAresta((int)'a', (int)(byte)1);
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test308"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    boolean b9 = grafo1.listaAdjVazia(10);
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)' ');
    ds.Grafo grafo12 = grafo1.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    boolean b16 = grafo12.existeAresta(10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test309"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)' ');
    grafo9.imprime();
    boolean b18 = grafo9.existeAresta(0, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta21 = grafo9.retiraAresta((int)'4', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test310"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    boolean b15 = grafo0.existeAresta(0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo18 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test311"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    boolean b4 = grafo0.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test312"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    boolean b15 = grafo0.existeAresta((int)'#', (int)(short)0);
    grafo0.imprime();
    ds.Grafo.Aresta aresta18 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b21 = grafo0.existeAresta((int)(byte)0, 0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b23 = grafo0.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test313"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)10, (int)(byte)100, (int)(short)1);
    grafo0.insereAresta((int)(byte)1, (int)(short)100, 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta25 = grafo0.retiraAresta((-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test314"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(short)(-1), (int)' ', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test315"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    grafo0.insereAresta(1, (int)(byte)10, (int)(short)1);
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test316"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b10 = grafo0.listaAdjVazia(0);
    boolean b13 = grafo0.existeAresta(1, 10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int)'#', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test317"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b9 = grafo0.existeAresta(1, (int)'#');
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test318"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test319"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    boolean b9 = grafo6.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test320"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    int i14 = grafo9.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo9.insereAresta((int)(byte)100, 100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test321"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo6.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test322"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.insereAresta(10, (int)(byte)1, (-1));
    grafo0.insereAresta((int)' ', 100, (int)'a');
    int i19 = grafo0.numVertices();
    grafo0.insereAresta(0, (int)(short)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test323"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(byte)10);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)10, (int)(short)0, (int)(short)0);
    grafo0.insereAresta((int)(byte)0, (int)(byte)(-1), (int)' ');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta21 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test324"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo11.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = grafo11.existeAresta(100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test325"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    boolean b13 = grafo11.listaAdjVazia((int)(short)1);
    grafo11.insereAresta(1, 0, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test326"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    boolean b4 = grafo0.listaAdjVazia((int)(byte)1);
    int i5 = grafo0.numVertices();
    boolean b7 = grafo0.listaAdjVazia((int)'4');
    boolean b9 = grafo0.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test327"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    boolean b17 = grafo15.listaAdjVazia((int)'4');
    boolean b19 = grafo15.listaAdjVazia(0);
    grafo15.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta22 = grafo15.primeiroListaAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test328"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b11 = grafo0.existeAresta((int)(short)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test329"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    grafo0.insereAresta(10, (int)(byte)1, (int)'4');
    boolean b12 = grafo0.existeAresta((int)'4', 0);
    ds.Grafo.Aresta aresta14 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)'#', (int)(short)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test330"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)(short)0, (int)(short)1, (int)(short)0);
    int i12 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test331"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo.Aresta aresta7 = grafo0.proxAdj((int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(short)10);
    grafo9.insereAresta((int)(byte)10, (-1), 1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo16 = grafo9.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test332"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)1, (int)(byte)100);
    boolean b13 = grafo0.existeAresta((int)(byte)1, (int)'4');
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    ds.Grafo grafo16 = grafo14.grafoTransposto();
    ds.Grafo grafo17 = grafo16.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo17.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test333"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo9.imprime();
    boolean b17 = grafo9.existeAresta((int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test334"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    boolean b12 = grafo0.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test335"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test336"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)(short)10);
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test337"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    boolean b12 = grafo0.listaAdjVazia(1);
    grafo0.insereAresta((int)'a', (int)'#', (int)'a');
    int i17 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test338"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta16 = grafo0.primeiroListaAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo0.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test339"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj((int)' ');
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)(-1), 100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test340"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    boolean b7 = grafo4.existeAresta((int)' ', (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      boolean b10 = grafo4.existeAresta((int)(byte)100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test341"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)0);
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test342"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)(short)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    int i12 = grafo11.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test343"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b5 = grafo0.listaAdjVazia((int)(byte)0);
    int i6 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test344"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.insereAresta((int)(byte)10, (int)'4', (int)(byte)(-1));
    grafo1.imprime();
    grafo1.insereAresta((int)' ', 0, (int)(short)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test345"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.imprime();
    boolean b4 = grafo0.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test346"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    grafo8.insereAresta((int)(short)10, (int)(short)10, (int)(short)(-1));
    ds.Grafo.Aresta aresta14 = grafo8.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test347"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj(10);
    ds.Grafo.Aresta aresta5 = grafo0.primeiroListaAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test348"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    boolean b11 = grafo0.existeAresta(0, (int)(byte)1);
    boolean b13 = grafo0.listaAdjVazia(0);
    boolean b15 = grafo0.listaAdjVazia((int)'a');
    grafo0.insereAresta((int)(short)1, 100, (int)'a');
    boolean b21 = grafo0.listaAdjVazia((int)(byte)1);
    int i22 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test349"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    int i9 = grafo0.numVertices();
    boolean b11 = grafo0.listaAdjVazia((int)(byte)0);
    boolean b14 = grafo0.existeAresta((int)(short)10, 10);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test350"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    int i5 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', (-1), 0);
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test351"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    boolean b14 = grafo0.existeAresta(10, (int)(byte)(-1));
    grafo0.insereAresta((int)' ', (int)(byte)1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test352"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = grafo9.grafoTransposto();
    grafo14.insereAresta((int)'#', (int)(byte)1, (int)(byte)1);
    ds.Grafo.Aresta aresta20 = grafo14.primeiroListaAdj((int)'4');
    boolean b23 = grafo14.existeAresta(0, (int)'#');
    boolean b25 = grafo14.listaAdjVazia(0);
    boolean b28 = grafo14.existeAresta(0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test353"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    boolean b8 = grafo0.listaAdjVazia((int)'#');
    int i9 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test354"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    boolean b7 = grafo0.existeAresta(0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test355"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    int i13 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test356"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(byte)10);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)10, (int)(short)0, (int)(short)0);
    boolean b17 = grafo0.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test357"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(0);
    boolean b8 = grafo0.listaAdjVazia((int)'#');
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test358"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj(10);
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)(byte)10);
    grafo0.imprime();
    grafo0.insereAresta((int)(byte)10, (int)(short)0, (int)(short)0);
    ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta(100, (int)(byte)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test359"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.imprime();
    boolean b5 = grafo0.listaAdjVazia((int)(byte)1);
    grafo0.insereAresta((int)(short)0, (int)(short)(-1), 0);
    int i10 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test360"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    grafo0.insereAresta((int)(byte)0, 100, 100);
    boolean b14 = grafo0.existeAresta((int)(byte)10, 10);
    boolean b16 = grafo0.listaAdjVazia((int)'a');
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo0.retiraAresta((int)(short)1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test361"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    boolean b7 = grafo0.existeAresta((int)(byte)1, (int)' ');
    grafo0.insereAresta((int)(byte)0, 100, 100);
    grafo0.imprime();
    int i13 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test362"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    ds.Grafo.Aresta aresta14 = grafo9.proxAdj((int)(byte)1);
    boolean b16 = grafo9.listaAdjVazia(10);
    ds.Grafo.Aresta aresta18 = grafo9.primeiroListaAdj((int)(byte)0);
    boolean b21 = grafo9.existeAresta((int)(byte)0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test363"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    grafo1.insereAresta((int)(short)10, (int)(byte)0, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test364"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta(10, (int)(short)100);
    boolean b15 = grafo9.existeAresta((int)(short)1, (-1));
    grafo9.insereAresta(10, (int)(short)(-1), 0);
    int i20 = grafo9.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test365"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj(10);
    int i9 = grafo0.numVertices();
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((int)(byte)1);
    boolean b14 = grafo0.existeAresta((int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo grafo15 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test366"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    boolean b15 = grafo0.existeAresta(0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test367"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    boolean b8 = grafo0.listaAdjVazia((int)(short)10);
    boolean b10 = grafo0.listaAdjVazia(0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test368"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b11 = grafo0.existeAresta((int)'a', (int)(short)100);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test369"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b8 = grafo0.existeAresta(0, (-1));
    boolean b10 = grafo0.listaAdjVazia(0);
    grafo0.imprime();
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    grafo12.insereAresta((int)(short)10, (int)(byte)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta19 = grafo12.retiraAresta((int)' ', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test370"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    grafo0.insereAresta((int)(byte)0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj(0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta17 = grafo0.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test371"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta3 = grafo0.primeiroListaAdj((int)(short)10);
    int i4 = grafo0.numVertices();
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia(1);
    boolean b10 = grafo0.existeAresta((int)(short)10, (int)'#');
    boolean b12 = grafo0.listaAdjVazia((int)'4');
    ds.Grafo grafo13 = grafo0.grafoTransposto();
    int i14 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test372"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj((int)(short)1);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)'#');
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test373"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    grafo0.imprime();
    grafo0.imprime();
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test374"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b12 = grafo9.existeAresta((int)' ', (int)'4');
    ds.Grafo grafo13 = grafo9.grafoTransposto();
    grafo13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test375"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    // The following exception was thrown during execution in test generation
    try {
      boolean b8 = grafo0.existeAresta(100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test376"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    int i3 = grafo0.numVertices();
    boolean b5 = grafo0.listaAdjVazia(10);
    int i6 = grafo0.numVertices();
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b10 = grafo0.listaAdjVazia((int)(short)0);
    int i11 = grafo0.numVertices();
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)100, (int)(short)100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test377"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)(short)10, 0, (int)(short)10);
    boolean b7 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo0.proxAdj(0);
    grafo0.insereAresta((int)(short)1, (int)(byte)100, (int)(short)(-1));
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta((int)(short)10, 0, 1);
    boolean b21 = grafo0.listaAdjVazia((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test378"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj((int)'a');
    ds.Grafo.Aresta aresta11 = grafo0.retiraAresta(10, (int)(short)10);
    int i12 = grafo0.numVertices();
    int i13 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      boolean b18 = grafo0.existeAresta((-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test379"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    grafo0.insereAresta(0, (int)'#', (int)(byte)100);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    grafo11.insereAresta(10, (int)(byte)100, 100);
    boolean b17 = grafo11.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test380"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)' ');
    boolean b6 = grafo0.listaAdjVazia(0);
    int i7 = grafo0.numVertices();
    boolean b9 = grafo0.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test381"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    boolean b8 = grafo0.listaAdjVazia((int)(byte)0);
    grafo0.insereAresta(0, 0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test382"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)10);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b11 = grafo9.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test383"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)'4');
    grafo0.insereAresta(0, 10, 10);
    int i15 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test384"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    grafo0.insereAresta(1, (int)(short)1, (int)(short)10);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      grafo0.insereAresta((int)(byte)100, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test385"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.proxAdj((int)(short)0);
    grafo0.insereAresta((int)'#', (-1), (int)(short)(-1));
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test386"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    grafo0.insereAresta((int)'a', 10, (int)(short)(-1));
    int i6 = grafo0.numVertices();
    grafo0.imprime();
    grafo0.insereAresta((int)(short)0, (int)(byte)(-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test387"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    grafo0.insereAresta((int)(byte)10, 100, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo0.primeiroListaAdj((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta10 = grafo0.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test388"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    boolean b10 = grafo0.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    ds.Grafo grafo12 = grafo11.grafoTransposto();
    boolean b14 = grafo11.listaAdjVazia((int)(short)1);
    ds.Grafo grafo15 = grafo11.grafoTransposto();
    boolean b17 = grafo15.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test389"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    ds.Grafo grafo7 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta9 = grafo7.primeiroListaAdj((int)(short)10);
    grafo7.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test390"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    int i2 = grafo0.numVertices();
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj(0);
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    boolean b11 = grafo9.listaAdjVazia((int)(short)1);
    grafo9.insereAresta(10, 0, (int)(short)0);
    grafo9.insereAresta((int)'4', (int)(short)10, 1);
    ds.Grafo.Aresta aresta21 = grafo9.proxAdj((int)(short)1);
    grafo9.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta25 = grafo9.retiraAresta((int)(short)(-1), 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop2.test391"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj(0);
    ds.Grafo.Aresta aresta6 = grafo0.primeiroListaAdj((int)(byte)1);
    int i7 = grafo0.numVertices();
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b11 = grafo8.existeAresta(0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

}
