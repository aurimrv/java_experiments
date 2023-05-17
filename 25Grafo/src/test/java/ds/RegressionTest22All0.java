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


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo0.existeAresta((int)(byte)(-1), (int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo0.retiraAresta((int)(byte)10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo0.retiraAresta((int)(byte)1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    ds.Grafo.Aresta aresta12 = grafo0.primeiroListaAdj((int)'4');
    ds.Grafo.Aresta aresta14 = grafo0.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), (int)(short)(-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo0.existeAresta((int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    boolean b11 = grafo0.listaAdjVazia((int)' ');
    boolean b13 = grafo0.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    boolean b11 = grafo0.listaAdjVazia((int)' ');
    boolean b13 = grafo0.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)(short)10);
    grafo0.insereAresta((int)'4', (int)(byte)100, (int)(byte)1);
    grafo0.imprime();
    boolean b22 = grafo0.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    boolean b12 = grafo0.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo10.proxAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    grafo0.insereAresta((int)(byte)1, 100, (-1));
    ds.Grafo.Aresta aresta16 = grafo0.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(short)10, 0);
    ds.Grafo.Aresta aresta13 = grafo8.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    boolean b12 = grafo0.listaAdjVazia((int)(short)1);
    ds.Grafo grafo13 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo0.insereAresta(1, (int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(10);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
    grafo0.insereAresta((int)'a', (int)(short)10, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    ds.Grafo.Aresta aresta6 = grafo0.proxAdj(10);
    ds.Grafo.Aresta aresta8 = grafo0.proxAdj(1);
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo grafo9 = grafo0.grafoTransposto();
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo10.primeiroListaAdj(0);
    grafo10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    grafo0.insereAresta((int)(byte)1, 100, (-1));
    ds.Grafo.Aresta aresta17 = grafo0.retiraAresta(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta(0, (int)(byte)(-1), (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo5 = grafo0.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    boolean b10 = grafo0.existeAresta((int)(short)0, (int)'a');
    grafo0.insereAresta((int)(byte)1, 100, (-1));
    grafo0.insereAresta(1, (int)(byte)0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta20 = grafo0.primeiroListaAdj((int)'4');
    boolean b22 = grafo0.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta(0, (int)(byte)(-1), (int)(byte)100);
    boolean b6 = grafo0.listaAdjVazia((int)'4');
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int)' ');
    int i10 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta(0, (int)(byte)(-1), (int)(byte)100);
    boolean b6 = grafo0.listaAdjVazia((int)'4');
    int i7 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta(0, (int)(byte)(-1), (int)(byte)100);
    boolean b6 = grafo0.listaAdjVazia((int)'4');
    int i7 = grafo0.numVertices();
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo0.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(short)10, 0);
    grafo8.insereAresta(0, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta12 = grafo0.retiraAresta((int)(short)0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = grafo0.existeAresta((-1), (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    boolean b12 = grafo0.listaAdjVazia((int)(short)1);
    grafo0.insereAresta(0, (int)(byte)100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    boolean b11 = grafo0.listaAdjVazia((int)' ');
    boolean b13 = grafo0.listaAdjVazia((int)' ');
    ds.Grafo.Aresta aresta15 = grafo0.proxAdj((int)(short)10);
    grafo0.insereAresta((int)'4', (int)(byte)100, (int)(byte)1);
    grafo0.imprime();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    boolean b11 = grafo0.listaAdjVazia((int)' ');
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test35"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.insereAresta((int)(short)0, 0, (int)(byte)10);
    boolean b7 = grafo0.existeAresta((int)(byte)10, (int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj(0);
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    boolean b12 = grafo0.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

}
