package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo0.listaAdjVazia((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta4 = grafo0.retiraAresta(100, (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    boolean b12 = grafo0.listaAdjVazia(10);
    ds.Aresta aresta14 = grafo0.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta3 = grafo0.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.proxAdj((int)(byte)100);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    grafo0.insereAresta((int)(short)10, 0, (-1));
    ds.Aresta aresta10 = grafo0.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(10, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta10 = grafo0.retiraAresta((int)(short)100, 1);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    boolean b14 = grafo0.existeAresta((int)(short)10, (int)(byte)0);
    ds.Grafo grafo15 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo1.existeAresta((int)(byte)0, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    ds.Aresta aresta13 = grafo0.retiraAresta((int)'a', (int)(byte)0);
    grafo0.imprime();
    ds.Grafo grafo15 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    ds.Aresta aresta6 = grafo1.proxAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    ds.Aresta aresta13 = grafo0.retiraAresta((int)'a', (int)(byte)0);
    grafo0.imprime();
    boolean b17 = grafo0.existeAresta((int)(byte)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    boolean b14 = grafo0.existeAresta((int)(short)10, (int)(byte)0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    ds.Aresta aresta10 = grafo0.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    boolean b11 = grafo0.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    grafo14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    boolean b6 = grafo1.listaAdjVazia((int)'#');
    boolean b9 = grafo1.existeAresta((int)(short)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    ds.Aresta aresta3 = grafo0.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.proxAdj((int)(byte)(-1));
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta14 = grafo0.retiraAresta((int)'a', (int)(short)100);
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    boolean b11 = grafo0.existeAresta((int)(short)0, (int)(byte)10);
    ds.Aresta aresta14 = grafo0.retiraAresta((int)(short)10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)'4');
    ds.Aresta aresta4 = grafo0.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    boolean b6 = grafo1.listaAdjVazia((int)'#');
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta9 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Grafo grafo2 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    boolean b11 = grafo0.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Aresta aresta17 = grafo13.retiraAresta((int)(short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = grafo0.existeAresta((int)(short)(-1), (int)(byte)(-1));
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    boolean b10 = grafo0.existeAresta((int)(byte)10, (int)(short)10);
    grafo0.imprime();
    boolean b14 = grafo0.existeAresta((int)(short)10, (int)(byte)0);
    ds.Aresta aresta16 = grafo0.proxAdj(1);
    ds.Grafo grafo17 = grafo0.grafoTransposto();
    grafo17.insereAresta(0, (int)'#', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    grafo0.imprime();
    boolean b11 = grafo0.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo12 = grafo0.grafoTransposto();
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta16 = grafo13.retiraAresta((int)'#', (int)(short)100);
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
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    grafo0.insereAresta((int)(short)10, 0, (-1));
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo0.existeAresta((int)(short)(-1), 100);
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
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    boolean b7 = grafo1.existeAresta((int)(byte)10, 1);
    boolean b10 = grafo1.existeAresta(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    boolean b7 = grafo1.existeAresta((int)(byte)10, 1);
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo8.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test35"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)100, (int)(short)(-1), (int)(short)1);
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test36"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    boolean b7 = grafo0.existeAresta((int)(short)10, (int)(short)0);
    ds.Aresta aresta9 = grafo0.proxAdj((int)'#');
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test37"); }


    ds.Grafo grafo0 = new ds.Grafo();
    grafo0.imprime();
    boolean b4 = grafo0.existeAresta(0, 1);
    grafo0.insereAresta((int)(short)10, 0, (-1));
    grafo0.imprime();
    ds.Aresta aresta11 = grafo0.primeiroListaAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test38"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo1.retiraAresta((int)(byte)10, (int)(short)1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

}
