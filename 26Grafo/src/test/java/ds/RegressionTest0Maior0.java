package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((-1), (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(short)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    int[] i_array10 = grafo4.prox;
    grafo1.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

}
