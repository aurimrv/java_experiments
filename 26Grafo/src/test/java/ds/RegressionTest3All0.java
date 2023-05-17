package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo2.proxAdj(100);
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
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(byte)10);
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
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    boolean b7 = grafo1.existeAresta(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    grafo3.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    ds.Grafo grafo14 = new ds.Grafo(0);
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    grafo14.imprime();
    int[] i_array17 = grafo14.prox;
    grafo5.prox = i_array17;
    grafo1.cab = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    int[] i_array4 = grafo3.peso;
    int[] i_array5 = null;
    grafo3.cab = i_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    grafo4.imprime();
    int[] i_array7 = grafo4.prox;
    grafo1.cab = i_array7;
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    grafo3.imprime();
    grafo3.insereAresta((int)'a', (int)(byte)0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    int[] i_array4 = grafo3.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)(short)10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    grafo1.peso = i_array11;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array20 = new int[] { '4', 10 };
    grafo15.prox = i_array20;
    grafo1.cab = i_array20;
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta25 = grafo1.primeiroListaAdj(0);
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
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    grafo1.peso = i_array11;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array20 = new int[] { '4', 10 };
    grafo15.prox = i_array20;
    grafo1.cab = i_array20;
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    boolean b26 = grafo23.existeAresta((int)'#', (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)100, (int)(short)1);
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    boolean b6 = grafo1.existeAresta((int)(byte)10, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(100);
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
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    grafo1.imprime();
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    grafo1.peso = i_array11;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array20 = new int[] { '4', 10 };
    grafo15.prox = i_array20;
    grafo1.cab = i_array20;
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    ds.Grafo grafo25 = new ds.Grafo(0);
    ds.Grafo grafo26 = grafo25.grafoTransposto();
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    int[] i_array28 = grafo27.peso;
    grafo1.cab = i_array28;
    ds.Grafo grafo30 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo30);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.listaAdjVazia((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(aresta6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    grafo3.imprime();
    grafo3.insereAresta((int)'#', (int)' ', (int)(short)10);
    boolean b10 = grafo3.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)(-1), (int)(short)1);
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
    org.junit.Assert.assertNotNull(aresta6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)100, (int)(short)1);
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    ds.Grafo.Aresta aresta14 = grafo8.retiraAresta((int)(short)100, (int)'#');
    int[] i_array15 = grafo8.prox;
    grafo1.peso = i_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    grafo4.imprime();
    int[] i_array7 = grafo4.prox;
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo(0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo14 = new ds.Grafo(0);
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    ds.Grafo grafo17 = new ds.Grafo(0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    grafo17.imprime();
    int[] i_array20 = grafo17.prox;
    grafo14.cab = i_array20;
    grafo10.peso = i_array20;
    boolean b25 = grafo10.existeAresta((int)' ', (int)(short)0);
    int[] i_array26 = grafo10.prox;
    grafo1.prox = i_array26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)100, (int)'#');
    int[] i_array8 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo1.listaAdjVazia((-1));
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
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)100, (int)'#');
    int i8 = grafo1.numVertices();
    ds.Grafo grafo10 = new ds.Grafo(0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    grafo10.imprime();
    ds.Grafo grafo14 = new ds.Grafo(0);
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    ds.Grafo grafo17 = new ds.Grafo(0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    grafo17.imprime();
    int[] i_array20 = grafo17.prox;
    grafo14.cab = i_array20;
    grafo10.peso = i_array20;
    grafo1.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo grafo5 = new ds.Grafo(0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    grafo8.imprime();
    int[] i_array11 = grafo8.prox;
    grafo5.cab = i_array11;
    grafo1.peso = i_array11;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array20 = new int[] { '4', 10 };
    grafo15.prox = i_array20;
    grafo1.cab = i_array20;
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    int i24 = grafo23.numVertices();
    int[] i_array25 = grafo23.peso;
    boolean b27 = grafo23.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    int i4 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(10);
    ds.Grafo grafo6 = new ds.Grafo(0);
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo(0);
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    grafo9.imprime();
    int[] i_array12 = grafo9.prox;
    grafo6.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array18 = grafo15.prox;
    grafo6.prox = i_array18;
    ds.Grafo grafo21 = new ds.Grafo(0);
    ds.Grafo grafo22 = grafo21.grafoTransposto();
    grafo21.imprime();
    ds.Grafo grafo25 = new ds.Grafo(0);
    ds.Grafo grafo26 = grafo25.grafoTransposto();
    ds.Grafo grafo28 = new ds.Grafo(0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    grafo28.imprime();
    int[] i_array31 = grafo28.prox;
    grafo25.cab = i_array31;
    grafo21.peso = i_array31;
    grafo6.cab = i_array31;
    grafo2.cab = i_array31;
    ds.Grafo grafo37 = new ds.Grafo(0);
    ds.Grafo grafo38 = grafo37.grafoTransposto();
    grafo37.imprime();
    int[] i_array40 = grafo37.prox;
    ds.Grafo.Aresta aresta43 = grafo37.retiraAresta((int)(short)100, (int)'#');
    grafo37.imprime();
    ds.Grafo grafo46 = new ds.Grafo(0);
    ds.Grafo grafo47 = grafo46.grafoTransposto();
    ds.Grafo grafo48 = grafo47.grafoTransposto();
    int[] i_array49 = grafo48.peso;
    grafo37.peso = i_array49;
    grafo2.prox = i_array49;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)100, (int)'#');
    int i8 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(short)(-1), (int)(short)10);
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
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(10);
    grafo2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    grafo4.imprime();
    int[] i_array9 = new int[] { '4', 10 };
    grafo4.prox = i_array9;
    grafo2.cab = i_array9;
    ds.Grafo grafo13 = new ds.Grafo(0);
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    ds.Grafo grafo16 = new ds.Grafo(0);
    ds.Grafo grafo17 = grafo16.grafoTransposto();
    grafo16.imprime();
    int[] i_array19 = grafo16.prox;
    grafo13.cab = i_array19;
    grafo2.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)100, (int)'#');
    int[] i_array8 = grafo1.prox;
    boolean b10 = grafo1.listaAdjVazia((int)'a');
    ds.Grafo grafo12 = new ds.Grafo(0);
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    grafo12.imprime();
    ds.Grafo grafo16 = new ds.Grafo(0);
    ds.Grafo grafo17 = grafo16.grafoTransposto();
    ds.Grafo grafo19 = new ds.Grafo(0);
    ds.Grafo grafo20 = grafo19.grafoTransposto();
    grafo19.imprime();
    int[] i_array22 = grafo19.prox;
    grafo16.cab = i_array22;
    grafo12.peso = i_array22;
    ds.Grafo grafo26 = new ds.Grafo(0);
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    grafo26.imprime();
    int[] i_array31 = new int[] { '4', 10 };
    grafo26.prox = i_array31;
    grafo12.cab = i_array31;
    grafo1.cab = i_array31;
    ds.Grafo.Aresta aresta37 = grafo1.retiraAresta((int)(byte)1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta37);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(10);
    ds.Grafo grafo6 = new ds.Grafo(0);
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo(0);
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    grafo9.imprime();
    int[] i_array12 = grafo9.prox;
    grafo6.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo(0);
    ds.Grafo grafo16 = grafo15.grafoTransposto();
    grafo15.imprime();
    int[] i_array18 = grafo15.prox;
    grafo6.prox = i_array18;
    ds.Grafo grafo21 = new ds.Grafo(0);
    ds.Grafo grafo22 = grafo21.grafoTransposto();
    grafo21.imprime();
    ds.Grafo grafo25 = new ds.Grafo(0);
    ds.Grafo grafo26 = grafo25.grafoTransposto();
    ds.Grafo grafo28 = new ds.Grafo(0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    grafo28.imprime();
    int[] i_array31 = grafo28.prox;
    grafo25.cab = i_array31;
    grafo21.peso = i_array31;
    grafo6.cab = i_array31;
    grafo2.cab = i_array31;
    grafo2.imprime();
    ds.Grafo grafo37 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo37);

  }

}
