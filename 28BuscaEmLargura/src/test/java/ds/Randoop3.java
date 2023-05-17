package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    grafo1.insereAresta((int)(byte)10, (int)(byte)1, (int)(byte)1);
    boolean b14 = grafo1.existeAresta((int)(short)1, (int)(short)(-1));
    grafo1.insereAresta((int)'#', 97, (int)'#');
    grafo1.insereAresta((int)'4', (int)(byte)1, (-1));
    ds.Grafo.Aresta aresta24 = grafo1.proxAdj(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta24);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    grafo1.insereAresta(0, (int)'a', (int)(byte)(-1));
    int i8 = grafo1.numVertices();
    boolean b11 = grafo1.existeAresta(1, (-1));
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo7.proxAdj((int)(short)0);
    ds.Grafo.Aresta aresta12 = grafo7.proxAdj((int)(byte)1);
    int i13 = grafo7.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta15 = grafo7.primeiroListaAdj((-1));
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    int i4 = grafo1.numVertices();
    boolean b6 = grafo1.listaAdjVazia((int)(short)1);
    grafo1.insereAresta((int)(byte)0, (int)(byte)100, (int)'4');
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(byte)0);
    boolean b14 = grafo1.listaAdjVazia((int)(short)0);
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta18 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta10 = grafo5.primeiroListaAdj((int)(short)10);
    boolean b13 = grafo5.existeAresta((int)(byte)0, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    boolean b5 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(0);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'#', 0, (-1));
    // The following exception was thrown during execution in test generation
    try {
      boolean b16 = grafo1.existeAresta((int)(byte)100, 0);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    int i7 = grafo6.numVertices();
    // The following exception was thrown during execution in test generation
    try {
      grafo6.insereAresta((int)(short)(-1), 52, (int)(short)1);
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
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    boolean b5 = grafo1.listaAdjVazia((int)'a');
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int i2 = grafo1.numVertices();
    boolean b5 = grafo1.existeAresta((int)(byte)0, 1);
    grafo1.insereAresta((int)(byte)1, (int)(byte)10, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(short)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)'a', (int)(byte)(-1), 97);
    // The following exception was thrown during execution in test generation
    try {
      ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int)(short)100, (int)'a');
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop3.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(1);
    int i4 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)10);
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    boolean b12 = grafo1.existeAresta((int)(byte)0, 97);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta15 = grafo13.primeiroListaAdj((int)(short)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

}
