package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    boolean b4 = grafo1.listaAdjVazia(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    int[] i_array6 = null;
    grafo1.cab = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta(100, (int)(short)0);
    boolean b9 = grafo1.listaAdjVazia((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int[] i_array5 = grafo4.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    int[] i_array4 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    int[] i_array10 = grafo9.prox;
    int i11 = grafo9.numVertices();
    int[] i_array12 = grafo9.peso;
    grafo1.cab = i_array12;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.peso;
    grafo1.peso = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo1.listaAdjVazia((int)(byte)(-1));
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.listaAdjVazia((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = grafo1.existeAresta((int)(short)(-1), (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)(short)1);
    int[] i_array12 = grafo11.prox;
    int i13 = grafo11.numVertices();
    int[] i_array14 = grafo11.peso;
    grafo11.imprime();
    ds.Grafo grafo17 = new ds.Grafo((int)(short)1);
    int[] i_array18 = grafo17.prox;
    int[] i_array19 = grafo17.peso;
    grafo11.peso = i_array19;
    int[] i_array21 = grafo11.peso;
    grafo1.peso = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(short)1);
    int[] i_array5 = grafo4.prox;
    int[] i_array6 = grafo4.peso;
    grafo1.prox = i_array6;
    int[] i_array8 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int[] i_array6 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
    boolean b7 = grafo1.listaAdjVazia((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo4.proxAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int[] i_array6 = new int[] { (byte)10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    int[] i_array10 = grafo9.prox;
    int i11 = grafo9.numVertices();
    ds.Grafo grafo13 = new ds.Grafo((int)(short)1);
    int[] i_array14 = grafo13.prox;
    int[] i_array15 = grafo13.peso;
    grafo9.peso = i_array15;
    int[] i_array17 = grafo9.peso;
    grafo1.peso = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)(short)1);
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    grafo3.cab = i_array6;
    grafo1.cab = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    int[] i_array10 = grafo9.prox;
    int i11 = grafo9.numVertices();
    int[] i_array12 = grafo9.peso;
    grafo1.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(short)1);
    int[] i_array16 = grafo15.prox;
    int i17 = grafo15.numVertices();
    int[] i_array18 = grafo15.peso;
    grafo1.prox = i_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.cab;
    int[] i_array10 = grafo1.peso;
    int[] i_array11 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta((int)(byte)1, (int)' ');
    ds.Grafo grafo9 = new ds.Grafo((int)(short)1);
    int[] i_array10 = grafo9.prox;
    int i11 = grafo9.numVertices();
    int[] i_array12 = grafo9.peso;
    grafo1.cab = i_array12;
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo7 = new ds.Grafo((int)(short)1);
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.peso;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    grafo1.insereAresta((int)(short)1, (int)'#', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b7 = grafo1.existeAresta(100, (int)(short)0);
    int[] i_array8 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(byte)(-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array8);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo7 = new ds.Grafo((int)(short)1);
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.peso;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    int[] i_array12 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo7 = new ds.Grafo((int)(short)1);
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.peso;
    grafo1.peso = i_array9;
    grafo1.insereAresta(0, (int)'#', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.peso;
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)1);
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.cab;
    int[] i_array10 = grafo1.peso;
    boolean b12 = grafo1.listaAdjVazia((int)(short)0);
    ds.Grafo grafo14 = new ds.Grafo((int)(short)1);
    int[] i_array15 = grafo14.prox;
    grafo1.peso = i_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = null;
    grafo1.peso = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    grafo4.insereAresta((int)(byte)100, 0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

}
