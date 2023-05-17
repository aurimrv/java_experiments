package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta2 = grafo0.proxAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo0.existeAresta((int)'a', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)100, (int)(short)10, (int)(short)0);
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
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Aresta aresta7 = grafo0.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta9 = grafo0.retiraAresta((int)(short)(-1), (int)'4');
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta4 = grafo0.proxAdj((int)(byte)100);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    grafo6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    boolean b8 = grafo0.existeAresta((int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta11 = grafo0.retiraAresta((int)(short)(-1), (int)'a');
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test11"); }


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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    grafo0.imprime();
    boolean b8 = grafo0.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)100, (int)(byte)1, (int)' ');
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
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Aresta aresta5 = grafo0.proxAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)(short)10);
    boolean b4 = grafo0.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)(-1), (int)'4', (int)'a');
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
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Grafo grafo3 = grafo0.grafoTransposto();
    boolean b5 = grafo0.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    boolean b5 = grafo0.existeAresta(0, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta8 = grafo0.retiraAresta((int)(byte)100, (int)'#');
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

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo0.proxAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.retiraAresta(10, (int)(short)10);
    ds.Aresta aresta6 = grafo0.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b10 = grafo7.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Aresta aresta10 = grafo7.proxAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    grafo7.insereAresta((int)(short)10, 100, (int)(short)10);
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Aresta aresta10 = grafo7.proxAdj((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta13 = grafo7.retiraAresta((int)(byte)(-1), (int)' ');
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)'#', (int)(byte)(-1), (int)(byte)10);
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo0.primeiroListaAdj((int)'#');
    ds.Aresta aresta10 = grafo0.proxAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta13 = grafo0.retiraAresta((int)(byte)100, (int)(short)(-1));
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta4 = grafo0.retiraAresta((int)(byte)100, (int)(byte)0);
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    boolean b10 = grafo6.existeAresta((int)(byte)0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    ds.Aresta aresta4 = grafo0.retiraAresta(10, (int)(short)10);
    ds.Aresta aresta6 = grafo0.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta5 = grafo0.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    ds.Aresta aresta10 = grafo0.retiraAresta(0, 0);
    ds.Grafo grafo11 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo0.primeiroListaAdj((int)'#');
    ds.Aresta aresta10 = grafo0.proxAdj(10);
    boolean b12 = grafo0.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo0.primeiroListaAdj((int)'#');
    ds.Aresta aresta10 = grafo0.proxAdj(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta13 = grafo0.retiraAresta(0, 100);
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    ds.Aresta aresta10 = grafo0.retiraAresta(0, 0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = grafo0.existeAresta((int)(short)(-1), (int)(short)10);
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test35"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    grafo0.imprime();
    ds.Aresta aresta10 = grafo0.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test36"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta2 = grafo0.proxAdj((int)'a');
    ds.Aresta aresta5 = grafo0.retiraAresta((int)(byte)1, 0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    ds.Aresta aresta10 = grafo7.proxAdj((int)(byte)10);
    grafo7.insereAresta(0, (int)(short)1, (int)' ');
    ds.Aresta aresta16 = grafo7.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta16);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test37"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    ds.Aresta aresta8 = grafo6.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test38"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    ds.Aresta aresta7 = grafo0.proxAdj(0);
    ds.Aresta aresta10 = grafo0.retiraAresta(0, 0);
    boolean b12 = grafo0.listaAdjVazia((int)'a');
    grafo0.insereAresta((int)(byte)0, 1, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta18 = grafo0.proxAdj((int)(short)0);
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test39"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    grafo0.imprime();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test40"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)'4');
    ds.Aresta aresta5 = grafo0.retiraAresta(1, 0);
    boolean b7 = grafo0.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

}
