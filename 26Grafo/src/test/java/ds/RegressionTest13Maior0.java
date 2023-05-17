package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test1"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.cab;
    boolean b10 = grafo1.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    boolean b16 = grafo5.existeAresta((int)'4', 100);
    boolean b19 = grafo5.existeAresta(1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test5"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test6"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(byte)10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array13 = new int[] { ' ' };
    grafo11.peso = i_array13;
    grafo9.cab = i_array13;
    int[] i_array16 = grafo9.prox;
    ds.Grafo grafo17 = grafo9.grafoTransposto();
    int[] i_array19 = new int[] { (short)1 };
    grafo9.cab = i_array19;
    grafo5.cab = i_array19;
    boolean b23 = grafo5.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test7"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.insereAresta((int)(short)10, (int)(byte)100, (int)(byte)10);
    ds.Grafo grafo10 = grafo5.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test8"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array10 = grafo9.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

}
