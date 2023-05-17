package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.listaAdjVazia((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.insereAresta((int)(short)100, (int)(byte)(-1), (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, 100);
    grafo1.insereAresta(10, (int)(short)100, (int)(short)0);
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    grafo11.insereAresta((int)(byte)1, (int)(byte)100, 100);
    ds.Grafo.Aresta aresta17 = grafo11.primeiroListaAdj((int)(byte)10);
    grafo11.imprime();
    int[] i_array22 = new int[] { (byte)100, (short)(-1), ' ' };
    grafo11.cab = i_array22;
    grafo1.peso = i_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, 100);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.imprime();
    int[] i_array12 = new int[] { (byte)100, (short)(-1), ' ' };
    grafo1.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    grafo15.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b22 = grafo15.existeAresta(1, (int)' ');
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    int[] i_array31 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo24.cab = i_array31;
    grafo15.peso = i_array31;
    grafo1.prox = i_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);

  }

}
