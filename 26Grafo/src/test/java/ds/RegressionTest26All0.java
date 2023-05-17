package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)'a');
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

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)(-1), 10, (int)' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.peso;
    grafo6.prox = i_array10;
    grafo1.peso = i_array10;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.prox = i_array8;
    grafo1.peso = i_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    grafo1.cab = i_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array10 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((-1), 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.cab;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.cab;
    grafo11.peso = i_array15;
    int[] i_array17 = grafo11.peso;
    grafo1.peso = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(byte)1, 1);
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
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    grafo7.prox = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    grafo14.prox = i_array18;
    grafo7.cab = i_array18;
    grafo5.cab = i_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo9.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.peso;
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
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    int i7 = grafo6.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(short)0, (int)(short)1);
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
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    boolean b11 = grafo9.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    boolean b5 = grafo1.existeAresta(10, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.peso;
    int[] i_array8 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    int[] i_array14 = grafo13.peso;
    grafo10.prox = i_array14;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(byte)1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.peso;
    grafo1.insereAresta(0, (int)(byte)0, (int)(short)0);
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(0, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array10 = grafo1.peso;
    boolean b12 = grafo1.listaAdjVazia((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.prox = i_array5;
    grafo1.insereAresta((int)(short)100, (int)' ', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)10);
    int i6 = grafo1.numVertices();
    int[] i_array7 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.peso;
    grafo6.prox = i_array10;
    grafo1.peso = i_array10;
    int[] i_array13 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo9.insereAresta((int)(short)10, (int)(byte)1, (int)'4');
    ds.Grafo grafo15 = new ds.Grafo((int)'4');
    int[] i_array16 = grafo15.cab;
    grafo9.prox = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    grafo1.peso = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)'a');
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
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)'a');
    boolean b8 = grafo1.listaAdjVazia(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)10);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    int[] i_array9 = grafo8.peso;
    int[] i_array10 = new int[] {  };
    grafo8.prox = i_array10;
    int[] i_array12 = grafo8.peso;
    grafo1.prox = i_array12;
    ds.Grafo grafo15 = new ds.Grafo(0);
    grafo15.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b22 = grafo15.existeAresta((int)'#', 0);
    ds.Grafo grafo23 = grafo15.grafoTransposto();
    int[] i_array24 = grafo15.peso;
    grafo1.prox = i_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (-1));
    ds.Grafo grafo6 = new ds.Grafo(0);
    grafo6.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b13 = grafo6.existeAresta((int)'#', 0);
    ds.Grafo grafo14 = grafo6.grafoTransposto();
    int[] i_array15 = grafo6.peso;
    grafo1.prox = i_array15;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)' ', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test40"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);

  }

}
