package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (-1));
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.peso;
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    boolean b13 = grafo10.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array14 = grafo10.peso;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 100);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo4.retiraAresta(0, 0);
    boolean b9 = grafo4.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.peso;
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    boolean b10 = grafo7.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array11 = grafo7.peso;
    grafo3.prox = i_array11;
    ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.imprime();
    grafo1.insereAresta((int)(short)1, (int)'4', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.peso;
    grafo3.prox = i_array6;
    grafo3.imprime();
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = grafo10.peso;
    grafo3.peso = i_array11;
    ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int)' ');
    int[] i_array15 = grafo3.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array11 = new int[] { (byte)1, 'a', 100, (byte)1 };
    grafo3.cab = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int)(short)10);
    ds.Grafo grafo9 = grafo3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (-1));
    int i7 = grafo1.numVertices();
    grafo1.insereAresta((int)' ', (int)'#', (int)(byte)0);
    ds.Grafo.Aresta aresta14 = grafo1.retiraAresta(10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(100);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    grafo3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    ds.Grafo.Aresta aresta8 = grafo3.primeiroListaAdj((int)(short)10);
    int i9 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array7 = grafo3.peso;
    int i8 = grafo3.numVertices();
    grafo3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    boolean b9 = grafo3.existeAresta((int)(short)1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(100, (-1));
    int i7 = grafo1.numVertices();
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = grafo9.peso;
    grafo9.imprime();
    ds.Grafo grafo12 = grafo9.grafoTransposto();
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo16 = grafo14.grafoTransposto();
    boolean b19 = grafo16.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array20 = grafo16.peso;
    grafo12.prox = i_array20;
    grafo1.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.peso;
    grafo3.prox = i_array6;
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = grafo9.prox;
    boolean b13 = grafo9.existeAresta((int)' ', 1);
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array16 = grafo15.peso;
    grafo9.peso = i_array16;
    grafo3.peso = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b4 = grafo1.existeAresta((int)'a', (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array7 = grafo3.peso;
    int i8 = grafo3.numVertices();
    int[] i_array9 = grafo3.cab;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)10);
    int[] i_array12 = grafo11.peso;
    grafo3.cab = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.peso;
    ds.Grafo grafo7 = grafo5.grafoTransposto();
    boolean b10 = grafo7.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array11 = grafo7.peso;
    grafo3.prox = i_array11;
    ds.Grafo.Aresta aresta15 = grafo3.retiraAresta((int)(byte)100, 10);
    int[] i_array16 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.imprime();
    int[] i_array5 = grafo1.cab;
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo4.retiraAresta(0, 0);
    ds.Grafo.Aresta aresta9 = grafo4.primeiroListaAdj((int)(short)10);
    ds.Grafo.Aresta aresta11 = grafo4.proxAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = grafo6.peso;
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array12 = grafo8.peso;
    grafo4.prox = i_array12;
    boolean b15 = grafo4.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.peso;
    grafo3.prox = i_array6;
    ds.Grafo.Aresta aresta9 = grafo3.primeiroListaAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    int i7 = grafo3.numVertices();
    boolean b10 = grafo3.existeAresta((int)(short)10, (int)(byte)(-1));
    grafo3.insereAresta((int)(byte)10, (int)(short)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    grafo1.imprime();
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int[] i_array5 = grafo4.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b6 = grafo3.existeAresta((int)(byte)10, (int)(short)10);
    int[] i_array7 = grafo3.peso;
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = grafo9.peso;
    ds.Grafo grafo11 = grafo9.grafoTransposto();
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)100);
    int[] i_array14 = grafo13.peso;
    grafo11.prox = i_array14;
    grafo11.imprime();
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)100);
    int[] i_array19 = grafo18.peso;
    grafo11.peso = i_array19;
    grafo3.peso = i_array19;
    int[] i_array22 = grafo3.peso;
    boolean b25 = grafo3.existeAresta((int)(byte)100, (int)(short)1);
    ds.Grafo grafo26 = grafo3.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);

  }

}
