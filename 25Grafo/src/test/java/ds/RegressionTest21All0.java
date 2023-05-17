package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo1.existeAresta((int)'#', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((-1));
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)100, (int)'#', (int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b3 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)100, (int)(byte)10, (int)(short)0);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)0);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(short)100, (int)(short)10, (int)' ');
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    int i7 = grafo1.numVertices();
    boolean b10 = grafo1.existeAresta((int)(byte)0, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    grafo0.insereAresta((int)(short)10, (int)(byte)0, 0);
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    grafo1.insereAresta((int)'#', (int)(short)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    int i4 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    boolean b9 = grafo0.listaAdjVazia((int)'#');
    grafo0.insereAresta((int)'#', 100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    boolean b5 = grafo0.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    grafo0.insereAresta(1, (int)' ', (int)(byte)10);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test17"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    boolean b9 = grafo0.listaAdjVazia((int)'#');
    int i10 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo0.retiraAresta(10, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test18"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo0.proxAdj((int)(byte)100);
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test19"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    boolean b9 = grafo0.listaAdjVazia((int)'#');
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
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test20"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    boolean b8 = grafo5.existeAresta(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test21"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int i6 = grafo4.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo4.proxAdj((-1));
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test22"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    grafo1.insereAresta((int)(byte)10, (-1), (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test23"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo0.retiraAresta((int)(short)0, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test24"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj(0);
    int i6 = grafo0.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test25"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)(-1));
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
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test26"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    grafo0.insereAresta((int)(short)10, (int)(byte)0, 0);
    ds.Grafo.Aresta aresta13 = grafo0.primeiroListaAdj(1);
    ds.Grafo.Aresta aresta16 = grafo0.retiraAresta((int)(byte)10, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta16);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test27"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int)(short)0);
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
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test28"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    grafo5.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo5.proxAdj((-1));
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
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test29"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    boolean b8 = grafo1.listaAdjVazia((int)' ');
    int i9 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test30"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    boolean b8 = grafo1.listaAdjVazia((int)' ');
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test31"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(byte)100);
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
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test32"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    boolean b9 = grafo0.listaAdjVazia((int)'#');
    int i10 = grafo0.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = grafo0.listaAdjVazia(100);
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
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test33"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test34"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj(0);
    ds.Grafo grafo6 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test35"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)'#', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test36"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)(short)0);
    int i3 = grafo0.numVertices();
    ds.Grafo grafo4 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test37"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)100);
    boolean b8 = grafo1.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = grafo1.existeAresta((-1), 1);
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
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test38"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    boolean b5 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test39"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    grafo0.insereAresta((int)(byte)0, 0, (-1));
    boolean b9 = grafo0.listaAdjVazia((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta(100, (int)' ', 0);
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
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test40"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    grafo1.insereAresta((int)(short)1, (int)(byte)(-1), 100);
    boolean b10 = grafo1.existeAresta((int)(byte)1, 100);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)(short)100, 0);
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
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test41"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b3 = grafo0.existeAresta(0, 10);
    ds.Grafo.Aresta aresta5 = grafo0.proxAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo0.retiraAresta((int)'a', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

}
