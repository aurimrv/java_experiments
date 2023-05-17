package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test1"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array9 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (short)1 };
    grafo3.peso = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test2"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta5);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test3"); }


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
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test4"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo(10);
    int[] i_array8 = grafo7.peso;
    grafo4.cab = i_array8;
    grafo2.peso = i_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test5"); }


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
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test6"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(10);
    int[] i_array5 = grafo4.peso;
    grafo1.cab = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    boolean b11 = grafo8.existeAresta((int)'4', (int)(byte)10);
    
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
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test7"); }


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
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test8"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)10, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)1, 100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test9"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b5 = grafo2.existeAresta((int)(byte)0, (int)(short)10);
    int[] i_array6 = grafo2.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

}
