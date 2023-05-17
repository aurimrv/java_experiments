package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test01"); }


    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo1 = new ds.Grafo((int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj((int)'a');
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)(-1), 10, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = new int[] {  };
    grafo1.prox = i_array3;
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    int[] i_array7 = grafo6.peso;
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.peso;
    grafo6.prox = i_array10;
    grafo1.peso = i_array10;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo9.insereAresta((int)(short)10, (int)(byte)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.cab;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(short)10, 0, (int)(short)1);
    boolean b8 = grafo1.existeAresta((int)'#', 0);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array10 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.prox = i_array8;
    grafo1.peso = i_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

}
