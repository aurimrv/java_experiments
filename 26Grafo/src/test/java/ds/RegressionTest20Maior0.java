package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    boolean b7 = grafo1.listaAdjVazia(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    int i6 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(byte)100);
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)' ');
    int[] i_array5 = grafo1.prox;
    boolean b7 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    int i16 = grafo1.numVertices();
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)100);
    int[] i_array24 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo18.cab = i_array24;
    ds.Grafo grafo27 = new ds.Grafo((int)(byte)100);
    int[] i_array34 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo27.prox = i_array34;
    grafo18.peso = i_array34;
    int[] i_array37 = grafo18.peso;
    grafo1.cab = i_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)100);
    int[] i_array12 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo6.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array22 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo15.prox = i_array22;
    grafo6.peso = i_array22;
    grafo1.peso = i_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo1.prox = i_array8;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo11.cab = i_array17;
    grafo1.peso = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { (byte)(-1), (byte)(-1), 1, (byte)(-1), 'a', (byte)100 };
    grafo10.prox = i_array17;
    grafo1.peso = i_array17;
    int[] i_array20 = grafo1.peso;
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array7 = new int[] { 10, (short)10, 0, (byte)100, '#' };
    grafo1.cab = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta(100, (int)' ');
    int[] i_array14 = grafo10.prox;
    grafo1.peso = i_array14;
    int[] i_array16 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)1, (int)(byte)10);
    int[] i_array5 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)(-1), (int)(short)0);
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
    org.junit.Assert.assertNotNull(i_array5);

  }

}
