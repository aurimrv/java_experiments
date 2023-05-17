package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.existeAresta((int)(short)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    int i9 = grafo2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array10 = new int[] { '4', (byte)1, (-1), 10 };
    grafo5.peso = i_array10;
    grafo2.prox = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    int i7 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia((int)(short)10);
    ds.Grafo grafo6 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    grafo6.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo13 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array19 = new int[] { '4', (byte)1, (-1), 10 };
    grafo14.peso = i_array19;
    ds.Grafo grafo22 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo23 = grafo22.grafoTransposto();
    int[] i_array28 = new int[] { '4', (byte)1, (-1), 10 };
    grafo23.peso = i_array28;
    grafo14.cab = i_array28;
    grafo6.peso = i_array28;
    grafo2.peso = i_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    int[] i_array16 = new int[] { '4', (byte)1, (-1), 10 };
    grafo11.peso = i_array16;
    grafo2.cab = i_array16;
    ds.Grafo grafo19 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16Maior0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.insereAresta((int)(short)1, (int)(byte)1, (int)'#');

  }

}
