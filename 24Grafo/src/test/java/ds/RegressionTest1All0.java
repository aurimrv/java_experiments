package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo0.existeAresta(100, (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta(1, 100, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)' ', (int)(byte)100, (int)'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), 100, (int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta(0, (int)(short)100, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo0.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo2.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo0.existeAresta(0, (int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta4 = grafo2.proxAdj((int)(byte)100);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    boolean b9 = grafo0.existeAresta((int)'#', 0);
    boolean b11 = grafo0.listaAdjVazia(0);
    ds.Aresta aresta13 = grafo0.proxAdj(0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)0, (int)(byte)(-1), (int)(byte)1);
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.proxAdj(10);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    grafo5.insereAresta((int)(byte)(-1), 100, (int)(byte)0);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    boolean b9 = grafo0.existeAresta((int)'#', 0);
    boolean b11 = grafo0.listaAdjVazia(0);
    ds.Aresta aresta13 = grafo0.proxAdj(0);
    ds.Grafo grafo14 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta3 = grafo0.proxAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo0.existeAresta(0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.insereAresta((int)(byte)0, 1, (int)(short)100);
    boolean b12 = grafo0.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(short)10, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo0.existeAresta((int)'a', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.insereAresta((int)(byte)0, 1, (int)(short)100);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    boolean b9 = grafo0.existeAresta((int)'#', 0);
    boolean b11 = grafo0.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)(-1), (int)'4', (int)(byte)1);
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.retiraAresta((int)'a', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    ds.Aresta aresta7 = grafo0.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    grafo0.insereAresta((int)(short)1, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo0.existeAresta((int)(short)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo0.existeAresta((-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo0.listaAdjVazia((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    boolean b7 = grafo0.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    ds.Aresta aresta6 = grafo0.primeiroListaAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta10 = grafo0.retiraAresta(0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    boolean b9 = grafo0.existeAresta((int)'#', 0);
    boolean b11 = grafo0.listaAdjVazia(0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta14 = grafo0.primeiroListaAdj((int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.primeiroListaAdj((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta6 = grafo0.proxAdj((-1));
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    ds.Aresta aresta9 = grafo0.primeiroListaAdj((int)'4');
    ds.Grafo grafo10 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.proxAdj(10);
    ds.Aresta aresta6 = grafo0.proxAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    ds.Aresta aresta10 = grafo0.retiraAresta((int)(short)1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test35"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    boolean b6 = grafo0.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test36"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo2.primeiroListaAdj((int)(short)1);
    boolean b6 = grafo2.listaAdjVazia((int)(byte)0);
    boolean b9 = grafo2.existeAresta((int)(byte)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test37"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    grafo0.insereAresta((int)(short)10, (int)(byte)0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test38"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo2.primeiroListaAdj((int)(short)1);
    boolean b6 = grafo2.listaAdjVazia((int)(byte)0);
    ds.Grafo grafo7 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test39"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.proxAdj(10);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test40"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    ds.Aresta aresta7 = grafo0.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test41"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    grafo0.imprime();
    boolean b10 = grafo0.existeAresta((int)(byte)0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test42"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.proxAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)(-1), (int)(byte)0, (int)'4');
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
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test43"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'#');
    grafo0.insereAresta((int)(byte)0, (int)(short)0, 10);
    boolean b9 = grafo0.existeAresta((int)'#', 0);
    boolean b11 = grafo0.listaAdjVazia(0);
    grafo0.imprime();
    boolean b15 = grafo0.existeAresta((int)(byte)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test44"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo2.primeiroListaAdj((int)(short)1);
    grafo2.insereAresta((int)(byte)10, 1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

}
