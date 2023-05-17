package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.existeAresta((int)(byte)10, (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b3 = grafo1.listaAdjVazia(1);
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
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = grafo1.existeAresta((int)' ', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(short)(-1), (int)'#');
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b3 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.listaAdjVazia((int)(short)(-1));
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj((int)(short)10);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    boolean b3 = grafo1.listaAdjVazia(1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((int)(short)(-1), (int)(short)100);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj(10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int)'a');
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int)(short)1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.listaAdjVazia((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.listaAdjVazia(100);
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
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    int i10 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = grafo1.listaAdjVazia((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.listaAdjVazia((int)(byte)10);
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)1);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    grafo7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo1.existeAresta((int)' ', (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    int i7 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta(10, 0);
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
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(short)10);
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
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    grafo1.insereAresta(0, 1, (int)'a');
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = grafo1.existeAresta(100, (int)(short)(-1));
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
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    grafo1.imprime();
    boolean b9 = grafo1.existeAresta((int)(short)0, (int)(short)1);
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    int i11 = grafo10.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo10.proxAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    boolean b3 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    boolean b4 = grafo1.existeAresta((int)(short)10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta(0, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)0, 10);
    grafo1.insereAresta(0, (int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)0, 10);
    int i11 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)100, (int)(byte)100, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int i8 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test40"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj(0);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo1.imprime();
    grafo1.imprime();
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo7.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test41"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)0, 10);
    int i11 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)(-1), 0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

}
