package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta(0, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    boolean b6 = grafo1.existeAresta((int)(byte)10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo3 = grafo2.grafoTransposto();
    int[] i_array4 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.imprime();
    int[] i_array4 = grafo1.prox;
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(short)100, (int)'#');
    int i8 = grafo1.numVertices();
    
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test11"); }


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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test12"); }


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
    boolean b16 = grafo1.existeAresta((int)' ', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test13"); }


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
    int[] i_array13 = grafo10.prox;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test14"); }


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

  }

}
