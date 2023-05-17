package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)100, 1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo0.existeAresta(100, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo0.retiraAresta((int)(byte)10, (int)(byte)0);
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo0.retiraAresta((-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo0.retiraAresta((int)(short)1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo0.retiraAresta((int)(short)100, 1);
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    int i8 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo0.proxAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo0.retiraAresta((int)(short)0, (int)(byte)1);
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    int i8 = grafo0.numVertices();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo0.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo8.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    boolean b9 = grafo0.listaAdjVazia((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo0.primeiroListaAdj((-1));
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    int i2 = grafo0.numVertices();
    int i3 = grafo0.numVertices();
    int i4 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo0.retiraAresta((int)(short)100, 10);
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    grafo0.insereAresta((int)(byte)10, (int)(short)100, (int)'a');
    int i12 = grafo0.numVertices();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)'4');
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    ds.Grafo.Aresta aresta4 = grafo0.primeiroListaAdj(10);
    boolean b6 = grafo0.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    grafo0.insereAresta((int)(byte)10, (int)(short)100, (int)'a');
    int i12 = grafo0.numVertices();
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)'4');
    int i15 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    int i1 = grafo0.numVertices();
    boolean b3 = grafo0.listaAdjVazia((int)' ');
    int i4 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    grafo0.insereAresta((int)(byte)10, (int)(short)100, (int)'a');
    int i12 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo0.primeiroListaAdj((int)(short)100);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    boolean b10 = grafo0.existeAresta((int)(short)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    grafo0.insereAresta((int)(byte)10, (int)(short)10, (int)(short)100);
    int i9 = grafo0.numVertices();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo0.retiraAresta((int)(byte)1, 10);
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
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(10);
    boolean b13 = grafo0.existeAresta(1, 0);
    grafo0.insereAresta(0, (int)' ', (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta20 = grafo0.retiraAresta((int)(short)(-1), (int)(byte)10);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo8.numVertices();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    grafo8.insereAresta((int)'#', 100, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b13 = grafo0.existeAresta((int)(short)0, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int)(byte)100, (int)(byte)1);
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
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)0);
    grafo0.imprime();
    grafo0.insereAresta(0, 10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo8.numVertices();
    int i10 = grafo8.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)0);
    boolean b13 = grafo0.existeAresta((int)(byte)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)10, 0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    int i9 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, (int)(byte)(-1));
    boolean b7 = grafo0.existeAresta((int)(byte)0, (int)'4');
    int i8 = grafo0.numVertices();
    ds.Grafo.Aresta aresta10 = grafo0.primeiroListaAdj(10);
    boolean b13 = grafo0.existeAresta(1, 0);
    grafo0.insereAresta(0, (int)' ', (int)'4');
    ds.Grafo.Aresta aresta19 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta22 = grafo0.retiraAresta((int)(short)0, (int)(byte)0);
    ds.Grafo.Aresta aresta25 = grafo0.retiraAresta(0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta25);

  }

}
