package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.imprime();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    int[] i_array5 = grafo1.prox;
    ds.Grafo grafo7 = new ds.Grafo(100);
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.prox;
    grafo1.peso = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    ds.Grafo grafo6 = new ds.Grafo(100);
    int[] i_array7 = grafo6.peso;
    grafo1.peso = i_array7;
    int i9 = grafo1.numVertices();
    int[] i_array10 = null;
    grafo1.prox = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(100);
    grafo4.imprime();
    int[] i_array6 = grafo4.prox;
    grafo4.imprime();
    int[] i_array8 = grafo4.prox;
    grafo1.peso = i_array8;
    int i10 = grafo1.numVertices();
    int[] i_array11 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)(short)100);
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
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(100);
    grafo6.imprime();
    ds.Grafo grafo9 = new ds.Grafo(100);
    grafo9.imprime();
    int[] i_array11 = grafo9.prox;
    grafo9.imprime();
    int[] i_array13 = grafo9.prox;
    grafo6.peso = i_array13;
    int i15 = grafo6.numVertices();
    int[] i_array16 = grafo6.peso;
    grafo1.peso = i_array16;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)(-1), 10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)100, 100, (int)(short)10);
    grafo1.insereAresta(0, 1, 0);
    int[] i_array13 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo5.retiraAresta((int)(byte)(-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(100);
    grafo4.imprime();
    int[] i_array6 = grafo4.prox;
    grafo1.peso = i_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    int i7 = grafo5.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)100, 100, (int)(short)10);
    grafo1.insereAresta(0, 1, 0);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int[] i_array14 = grafo13.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo(100);
    grafo4.imprime();
    int[] i_array6 = grafo4.prox;
    ds.Grafo grafo7 = grafo4.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo(100);
    grafo9.imprime();
    ds.Grafo grafo12 = new ds.Grafo(100);
    grafo12.imprime();
    int[] i_array14 = grafo12.prox;
    grafo12.imprime();
    int[] i_array16 = grafo12.prox;
    grafo9.peso = i_array16;
    int i18 = grafo9.numVertices();
    int[] i_array19 = grafo9.peso;
    grafo4.peso = i_array19;
    grafo1.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    boolean b4 = grafo1.existeAresta((int)(short)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    int[] i_array7 = grafo6.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo4.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(100);
    grafo4.imprime();
    int[] i_array6 = grafo4.prox;
    grafo4.imprime();
    int[] i_array8 = grafo4.prox;
    grafo1.peso = i_array8;
    int i10 = grafo1.numVertices();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    ds.Grafo grafo13 = new ds.Grafo(100);
    grafo13.imprime();
    int[] i_array15 = grafo13.prox;
    ds.Grafo grafo16 = grafo13.grafoTransposto();
    ds.Grafo grafo18 = new ds.Grafo(100);
    grafo18.imprime();
    ds.Grafo grafo21 = new ds.Grafo(100);
    grafo21.imprime();
    int[] i_array23 = grafo21.prox;
    grafo21.imprime();
    int[] i_array25 = grafo21.prox;
    grafo18.peso = i_array25;
    int i27 = grafo18.numVertices();
    int[] i_array28 = grafo18.peso;
    grafo13.peso = i_array28;
    ds.Grafo grafo31 = new ds.Grafo(100);
    grafo31.imprime();
    int[] i_array33 = grafo31.prox;
    ds.Grafo grafo34 = grafo31.grafoTransposto();
    int[] i_array35 = grafo31.peso;
    grafo13.peso = i_array35;
    grafo1.peso = i_array35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int[] i_array6 = grafo1.cab;
    grafo1.insereAresta((int)(byte)10, (int)(short)(-1), (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int i5 = grafo1.numVertices();
    int[] i_array6 = grafo1.peso;
    ds.Grafo grafo8 = new ds.Grafo(100);
    int[] i_array9 = grafo8.peso;
    grafo1.cab = i_array9;
    int[] i_array11 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = new ds.Grafo(100);
    grafo6.imprime();
    ds.Grafo grafo9 = new ds.Grafo(100);
    grafo9.imprime();
    int[] i_array11 = grafo9.prox;
    grafo9.imprime();
    int[] i_array13 = grafo9.prox;
    grafo6.peso = i_array13;
    int i15 = grafo6.numVertices();
    int[] i_array16 = grafo6.peso;
    grafo1.peso = i_array16;
    int[] i_array18 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo(100);
    grafo5.imprime();
    int[] i_array7 = grafo5.prox;
    grafo5.imprime();
    grafo5.insereAresta((int)(byte)100, 100, (int)(short)10);
    ds.Grafo grafo14 = new ds.Grafo(100);
    int[] i_array15 = grafo14.prox;
    int[] i_array16 = grafo14.prox;
    grafo5.peso = i_array16;
    grafo1.peso = i_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    int i5 = grafo4.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int i5 = grafo1.numVertices();
    boolean b8 = grafo1.existeAresta(100, (int)' ');
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)100, 100, (int)(short)10);
    grafo1.insereAresta(0, 1, 0);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    ds.Grafo grafo15 = new ds.Grafo(100);
    grafo15.imprime();
    ds.Grafo.Aresta aresta18 = grafo15.proxAdj(1);
    int i19 = grafo15.numVertices();
    int[] i_array20 = grafo15.peso;
    ds.Grafo grafo22 = new ds.Grafo(100);
    int[] i_array23 = grafo22.peso;
    grafo15.cab = i_array23;
    grafo13.peso = i_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int i5 = grafo1.numVertices();
    int[] i_array6 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

}
