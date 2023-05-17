package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo1.prox = i_array4;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.imprime();
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo1.prox = i_array4;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)100, 0, 10);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj((-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(1, (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo1.prox = i_array4;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(0);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo1.prox = i_array4;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int)(byte)10);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)10, (int)(byte)0, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)(-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta(10, (int)(byte)(-1), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)' ', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.imprime();
    boolean b10 = grafo1.existeAresta((int)(byte)0, (int)(byte)100);
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
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)(byte)100, (-1));
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
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.imprime();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)'4');
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
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo4.retiraAresta((int)(byte)10, (int)'#');
    grafo4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta((int)'a', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    boolean b6 = grafo4.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = grafo1.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int i6 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;
    int[] i_array4 = grafo1.prox;
    boolean b6 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(short)(-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo3.imprime();
    int[] i_array7 = grafo3.cab;
    grafo1.cab = i_array7;
    int[] i_array9 = grafo1.prox;
    boolean b12 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    boolean b7 = grafo1.listaAdjVazia((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array7 = grafo1.prox;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)1);
    int[] i_array11 = new int[] {  };
    grafo10.cab = i_array11;
    grafo10.imprime();
    ds.Grafo.Aresta aresta15 = grafo10.primeiroListaAdj((int)(byte)0);
    int[] i_array16 = grafo10.cab;
    grafo1.cab = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array7 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)100, (int)(short)10);
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
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo3.imprime();
    int[] i_array7 = grafo3.cab;
    grafo1.cab = i_array7;
    int[] i_array9 = grafo1.prox;
    int[] i_array10 = grafo1.cab;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)1);
    int[] i_array13 = new int[] {  };
    grafo12.cab = i_array13;
    grafo12.imprime();
    int[] i_array16 = grafo12.cab;
    grafo1.cab = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    int[] i_array4 = new int[] {  };
    grafo3.cab = i_array4;
    grafo3.imprime();
    int[] i_array7 = grafo3.cab;
    grafo1.cab = i_array7;
    int[] i_array9 = grafo1.prox;
    boolean b11 = grafo1.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    grafo1.imprime();
    int[] i_array5 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)10, (int)(byte)10);
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    boolean b9 = grafo1.existeAresta((int)(byte)10, (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)1, (int)(byte)10);
    int i9 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    grafo1.imprime();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)1);
    grafo8.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    grafo8.imprime();
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)1);
    int[] i_array16 = new int[] {  };
    grafo15.cab = i_array16;
    grafo15.imprime();
    int[] i_array19 = grafo15.prox;
    grafo8.cab = i_array19;
    grafo1.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    grafo1.insereAresta((int)'4', (int)' ', (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int[] i_array2 = new int[] {  };
    grafo1.cab = i_array2;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    grafo4.insereAresta((int)(byte)100, (int)' ', (int)(byte)0);
    ds.Grafo.Aresta aresta12 = grafo4.retiraAresta(100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

}
