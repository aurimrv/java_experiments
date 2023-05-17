package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(byte)(-1), 0);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(1);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = grafo10.cab;
    int[] i_array12 = grafo10.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.prox;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.cab;
    grafo14.prox = i_array18;
    grafo10.cab = i_array18;
    int[] i_array21 = grafo10.peso;
    grafo1.cab = i_array21;
    grafo1.insereAresta((int)(short)1, (int)(short)0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    boolean b6 = grafo1.existeAresta((int)'#', (int)'#');
    boolean b9 = grafo1.existeAresta(10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    boolean b6 = grafo1.existeAresta((int)'#', (int)'#');
    boolean b8 = grafo1.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array4 = grafo3.prox;
    grafo1.peso = i_array4;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.cab;
    grafo5.prox = i_array9;
    grafo1.cab = i_array9;
    int[] i_array12 = grafo1.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.cab;
    grafo1.cab = i_array15;
    grafo1.imprime();
    int i18 = grafo1.numVertices();
    int[] i_array19 = grafo1.prox;
    int[] i_array20 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    boolean b6 = grafo1.existeAresta((int)'#', (int)'#');
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.prox;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array12 = grafo11.cab;
    grafo8.prox = i_array12;
    ds.Grafo.Aresta aresta15 = grafo8.primeiroListaAdj(1);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.cab;
    int[] i_array19 = grafo17.peso;
    ds.Grafo grafo21 = new ds.Grafo((int)(byte)100);
    int[] i_array22 = grafo21.prox;
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    int[] i_array25 = grafo24.cab;
    grafo21.prox = i_array25;
    grafo17.cab = i_array25;
    int[] i_array28 = grafo17.peso;
    grafo8.cab = i_array28;
    ds.Grafo grafo31 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta33 = grafo31.proxAdj((int)(short)10);
    grafo31.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array38 = grafo31.cab;
    grafo8.cab = i_array38;
    grafo1.prox = i_array38;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    int[] i_array7 = grafo1.cab;
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = grafo9.cab;
    int[] i_array11 = grafo9.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)100);
    int[] i_array14 = grafo13.prox;
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = grafo16.cab;
    grafo13.prox = i_array17;
    grafo9.cab = i_array17;
    int[] i_array20 = grafo9.peso;
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)100);
    int[] i_array23 = grafo22.cab;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo.Aresta aresta27 = grafo1.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta27);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    int[] i_array6 = grafo4.peso;
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.prox;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array12 = grafo11.cab;
    grafo8.prox = i_array12;
    grafo4.cab = i_array12;
    int[] i_array15 = grafo4.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.cab;
    grafo4.cab = i_array18;
    grafo1.peso = i_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int[] i_array5 = grafo1.prox;
    boolean b7 = grafo1.listaAdjVazia((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    boolean b6 = grafo1.existeAresta((int)'#', (int)'#');
    int[] i_array7 = grafo1.peso;
    grafo1.insereAresta((int)(short)0, (int)(byte)(-1), (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)(short)10, (int)(byte)0);
    boolean b8 = grafo1.existeAresta((int)(short)10, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    int[] i_array7 = grafo1.cab;
    int[] i_array8 = grafo1.cab;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int)(short)10);
    grafo10.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array17 = grafo10.cab;
    boolean b20 = grafo10.existeAresta((int)(short)100, (-1));
    int[] i_array21 = grafo10.prox;
    grafo1.cab = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    ds.Grafo grafo4 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(1);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = grafo10.cab;
    int[] i_array12 = grafo10.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.prox;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.cab;
    grafo14.prox = i_array18;
    grafo10.cab = i_array18;
    int[] i_array21 = grafo10.peso;
    grafo1.cab = i_array21;
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta26 = grafo24.proxAdj((int)(short)10);
    grafo24.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array31 = grafo24.cab;
    grafo1.cab = i_array31;
    ds.Grafo grafo34 = new ds.Grafo((int)(byte)100);
    int[] i_array35 = grafo34.prox;
    ds.Grafo grafo37 = new ds.Grafo((int)(byte)100);
    int[] i_array38 = grafo37.cab;
    grafo34.prox = i_array38;
    ds.Grafo.Aresta aresta41 = grafo34.primeiroListaAdj(1);
    ds.Grafo grafo43 = new ds.Grafo((int)(byte)100);
    int[] i_array44 = grafo43.cab;
    int[] i_array45 = grafo43.peso;
    ds.Grafo grafo47 = new ds.Grafo((int)(byte)100);
    int[] i_array48 = grafo47.prox;
    ds.Grafo grafo50 = new ds.Grafo((int)(byte)100);
    int[] i_array51 = grafo50.cab;
    grafo47.prox = i_array51;
    grafo43.cab = i_array51;
    int[] i_array54 = grafo43.peso;
    grafo34.cab = i_array54;
    grafo1.cab = i_array54;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta58 = grafo1.proxAdj((-1));
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
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.cab;
    grafo5.prox = i_array9;
    grafo1.cab = i_array9;
    int[] i_array12 = grafo1.peso;
    int[] i_array13 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    int[] i_array6 = grafo5.prox;
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = grafo8.cab;
    grafo5.prox = i_array9;
    grafo1.cab = i_array9;
    int[] i_array12 = grafo1.peso;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = grafo14.cab;
    grafo1.cab = i_array15;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = grafo1.existeAresta((-1), 100);
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
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = grafo4.cab;
    grafo1.prox = i_array5;
    int[] i_array7 = grafo1.cab;
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.prox;
    boolean b11 = grafo1.listaAdjVazia((int)'#');
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)(short)10);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = grafo17.prox;
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)100);
    int[] i_array21 = grafo20.cab;
    grafo17.prox = i_array21;
    int[] i_array23 = grafo17.cab;
    int[] i_array24 = grafo17.cab;
    grafo13.prox = i_array24;
    grafo1.cab = i_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    grafo1.imprime();

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = grafo6.cab;
    grafo1.peso = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array11 = grafo10.peso;
    grafo1.prox = i_array11;
    int[] i_array13 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    grafo1.insereAresta((int)(byte)0, (int)(byte)0, (int)(short)0);
    int[] i_array8 = grafo1.cab;
    boolean b11 = grafo1.existeAresta((int)(short)100, (-1));
    int[] i_array12 = grafo1.cab;
    int[] i_array13 = grafo1.peso;
    int[] i_array14 = grafo1.prox;
    grafo1.insereAresta((int)'#', (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

}
