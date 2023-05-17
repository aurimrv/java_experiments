package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b5 = grafo2.existeAresta(1, (int)(short)0);
    grafo2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia((int)(short)100);
    ds.Grafo.Aresta aresta7 = grafo3.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    ds.Grafo grafo7 = new ds.Grafo(10);
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(byte)0, (int)(short)10);
    ds.Grafo grafo13 = new ds.Grafo(10);
    int[] i_array14 = grafo13.peso;
    ds.Grafo grafo16 = new ds.Grafo(10);
    int[] i_array17 = grafo16.peso;
    grafo13.cab = i_array17;
    grafo8.prox = i_array17;
    grafo1.cab = i_array17;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.primeiroListaAdj((int)' ');
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
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo(10);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b9 = grafo6.existeAresta((int)(byte)0, (int)(short)10);
    int[] i_array10 = grafo6.peso;
    grafo1.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo(10);
    int[] i_array8 = grafo7.peso;
    grafo4.cab = i_array8;
    grafo2.peso = i_array8;
    int[] i_array11 = grafo2.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    ds.Grafo grafo7 = new ds.Grafo(10);
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(byte)0, (int)(short)10);
    ds.Grafo grafo13 = new ds.Grafo(10);
    int[] i_array14 = grafo13.peso;
    ds.Grafo grafo16 = new ds.Grafo(10);
    int[] i_array17 = grafo16.peso;
    grafo13.cab = i_array17;
    grafo8.prox = i_array17;
    grafo1.cab = i_array17;
    grafo1.insereAresta((int)(short)100, (int)(byte)10, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (int)'#', (int)'4');
    int[] i_array13 = new int[] {  };
    grafo1.cab = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(short)10);
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
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    grafo7.insereAresta((int)(byte)1, (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    grafo1.insereAresta(0, (int)(byte)1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)1, 100, (int)(short)100);
    int[] i_array11 = grafo1.prox;
    boolean b14 = grafo1.existeAresta((int)'4', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = new int[] {  };
    grafo2.peso = i_array3;
    boolean b7 = grafo2.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo9 = new ds.Grafo(10);
    ds.Grafo grafo10 = grafo9.grafoTransposto();
    boolean b13 = grafo10.existeAresta((int)(byte)0, (int)(short)10);
    ds.Grafo grafo15 = new ds.Grafo(10);
    int[] i_array16 = grafo15.peso;
    ds.Grafo grafo18 = new ds.Grafo(10);
    int[] i_array19 = grafo18.peso;
    grafo15.cab = i_array19;
    grafo10.prox = i_array19;
    grafo2.peso = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)'4', (int)(byte)10);
    grafo8.insereAresta((int)(byte)100, (int)(byte)(-1), 1);
    grafo8.insereAresta((int)(byte)100, (int)(short)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)1, 100, (int)(short)100);
    ds.Grafo grafo12 = new ds.Grafo(10);
    ds.Grafo grafo13 = grafo12.grafoTransposto();
    grafo12.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo12.insereAresta((int)(short)1, 100, (int)(short)100);
    int[] i_array22 = grafo12.prox;
    grafo1.cab = i_array22;
    int[] i_array29 = new int[] { '#', '4', (byte)1, 0, (short)10 };
    grafo1.cab = i_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    grafo1.insereAresta(0, (int)'#', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo(10);
    int[] i_array8 = grafo7.peso;
    grafo4.cab = i_array8;
    grafo2.peso = i_array8;
    ds.Grafo.Aresta aresta12 = grafo2.primeiroListaAdj(1);
    boolean b14 = grafo2.listaAdjVazia((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test20"); }


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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)'4');
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
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo7.grafoTransposto();
    grafo7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    int[] i_array9 = grafo8.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)1, 100, (int)(short)100);
    int[] i_array11 = grafo1.prox;
    grafo1.imprime();
    int[] i_array13 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia((int)(short)100);
    int[] i_array6 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta10 = grafo8.proxAdj((int)(byte)0);
    ds.Grafo grafo11 = grafo8.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(100);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = null;
    grafo1.peso = i_array4;
    int[] i_array6 = null;
    grafo1.peso = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)1, 100, (int)(short)100);
    int[] i_array11 = grafo1.prox;
    int[] i_array12 = grafo1.prox;
    int[] i_array13 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (int)'#', (int)'4');
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo15 = new ds.Grafo(10);
    int[] i_array16 = grafo15.peso;
    ds.Grafo grafo17 = grafo15.grafoTransposto();
    int[] i_array23 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (short)1 };
    grafo17.peso = i_array23;
    int[] i_array25 = grafo17.peso;
    ds.Grafo grafo27 = new ds.Grafo(10);
    ds.Grafo grafo28 = grafo27.grafoTransposto();
    grafo27.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo27.insereAresta((int)(short)1, 100, (int)(short)100);
    int[] i_array37 = grafo27.prox;
    int[] i_array38 = grafo27.prox;
    grafo17.prox = i_array38;
    int[] i_array40 = grafo17.peso;
    grafo1.peso = i_array40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    ds.Grafo grafo7 = new ds.Grafo(10);
    int[] i_array8 = grafo7.peso;
    ds.Grafo grafo10 = new ds.Grafo(10);
    int[] i_array11 = grafo10.peso;
    grafo7.cab = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    boolean b16 = grafo1.listaAdjVazia((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)'4', (int)(byte)10);
    ds.Grafo grafo7 = new ds.Grafo(10);
    int[] i_array8 = grafo7.peso;
    ds.Grafo grafo10 = new ds.Grafo(10);
    int[] i_array11 = grafo10.peso;
    grafo7.cab = i_array11;
    grafo1.cab = i_array11;
    int[] i_array14 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.proxAdj((int)' ');
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
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

}
