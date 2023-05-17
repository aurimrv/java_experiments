package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(short)0, (int)(short)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)(-1), (int)'a', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)100, 1, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(short)1, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo0.existeAresta((int)'4', (-1));
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo6.insereAresta((int)(short)100, (int)(byte)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta7 = grafo5.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    boolean b6 = grafo0.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo0.existeAresta((int)(byte)1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    boolean b7 = grafo0.existeAresta((int)' ', 0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta10 = grafo0.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta3 = grafo0.primeiroListaAdj((int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta6 = grafo0.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    boolean b7 = grafo0.existeAresta((int)' ', 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo0.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    boolean b7 = grafo0.existeAresta((int)' ', 0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)0);
    boolean b10 = grafo6.listaAdjVazia(1);
    boolean b13 = grafo6.existeAresta((int)' ', (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta15 = grafo6.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta3 = grafo0.proxAdj(0);
    grafo0.insereAresta(0, 0, (int)(short)100);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    boolean b10 = grafo0.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.insereAresta(0, 10, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Aresta aresta7 = grafo4.retiraAresta((int)' ', (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    boolean b7 = grafo4.existeAresta(1, 1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo4.listaAdjVazia(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b9 = grafo0.listaAdjVazia(10);
    grafo0.imprime();
    grafo0.insereAresta(10, (int)' ', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta16 = grafo0.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b3 = grafo0.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta3 = grafo0.proxAdj(0);
    grafo0.insereAresta(0, 0, (int)(short)100);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    ds.Aresta aresta10 = grafo0.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta14 = grafo0.retiraAresta((int)(byte)100, (int)(short)(-1));
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
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta6 = grafo0.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta9 = grafo0.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    boolean b7 = grafo4.existeAresta(1, 1);
    grafo4.imprime();
    ds.Aresta aresta10 = grafo4.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)0);
    boolean b11 = grafo6.existeAresta((int)'#', (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = grafo6.listaAdjVazia((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)0);
    boolean b10 = grafo6.listaAdjVazia(1);
    ds.Grafo grafo11 = grafo6.grafoTransposto();
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    grafo0.imprime();
    boolean b7 = grafo0.existeAresta((int)' ', 0);
    grafo0.insereAresta((int)(byte)10, (int)'4', (int)(short)1);
    boolean b13 = grafo0.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b9 = grafo0.listaAdjVazia(10);
    grafo0.imprime();
    grafo0.insereAresta(10, (int)' ', (int)' ');
    ds.Aresta aresta16 = grafo0.primeiroListaAdj((int)' ');
    boolean b19 = grafo0.existeAresta((int)'#', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((-1), (int)(byte)(-1), 0);
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Aresta aresta7 = grafo4.retiraAresta(10, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.primeiroListaAdj((int)(short)0);
    boolean b10 = grafo6.listaAdjVazia(1);
    grafo6.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo6.insereAresta((-1), (int)(short)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta((int)(short)0, (int)'4');
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    grafo0.imprime();
    boolean b9 = grafo0.listaAdjVazia(10);
    grafo0.imprime();
    ds.Aresta aresta12 = grafo0.primeiroListaAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

}
