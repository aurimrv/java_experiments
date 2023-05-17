package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    grafo3.imprime();
    int[] i_array9 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo3.peso = i_array9;
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    int[] i_array12 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    boolean b4 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array5 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test09"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)0);
    boolean b6 = grafo1.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
