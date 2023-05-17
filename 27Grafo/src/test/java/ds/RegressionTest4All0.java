package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)100, (int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)100);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(100);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)10);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.listaAdjVazia((int)(short)10);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)(byte)100, 100);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta(100, (int)(short)10, 0);
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta(100, (int)(byte)10);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)100, (int)'#', (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)(-1), 100);
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    boolean b8 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta((int)(byte)1, (int)'4', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    boolean b8 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo1.listaAdjVazia(10);
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
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj(1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo1.retiraAresta((int)'a', 10);
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
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((int)(short)100, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((-1), 100);
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj(1);
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    int i9 = grafo1.numVertices();
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)0);
    boolean b14 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    int i9 = grafo1.numVertices();
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)0);
    boolean b14 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    grafo1.insereAresta((int)' ', (int)(short)100, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    boolean b8 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(byte)10, (int)(short)0);
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
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj(1);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)100);
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
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((int)(byte)1, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta((int)'4', (int)'a', 10);
    boolean b10 = grafo1.listaAdjVazia(1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj(1);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj(100);
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
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(byte)0);
    grafo1.insereAresta(1, 0, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta14);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)10);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta((int)'4', (int)'a', 10);
    boolean b10 = grafo1.listaAdjVazia(1);
    grafo1.insereAresta((int)'a', (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta(10, (int)(short)100, (int)(short)1);
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

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    boolean b3 = grafo1.listaAdjVazia((int)(short)1);
    boolean b6 = grafo1.existeAresta(1, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.listaAdjVazia(100);
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

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)100, (int)(short)1, 0);
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
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo1.existeAresta(100, (int)(short)(-1));
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
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test40"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test41"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    int i9 = grafo1.numVertices();
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)0);
    boolean b14 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    boolean b17 = grafo1.existeAresta((int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test42"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(0);
    grafo1.insereAresta((int)'#', 1, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo15 = grafo1.grafoTransposto();
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
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test43"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)(byte)100);
    grafo1.insereAresta(0, (int)(short)(-1), (int)(short)1);
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);

  }

}
