package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test01"); }


    ds.Grafo grafo0 = new ds.Grafo();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta2 = grafo0.primeiroListaAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test02"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo0.existeAresta((int)(byte)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test03"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    boolean b5 = grafo0.listaAdjVazia((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test04"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Aresta aresta3 = grafo0.primeiroListaAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test05"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    boolean b5 = grafo0.listaAdjVazia((int)(byte)1);
    boolean b7 = grafo0.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test06"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    grafo0.imprime();
    ds.Grafo grafo5 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test07"); }


    ds.Grafo grafo0 = new ds.Grafo();
    boolean b2 = grafo0.listaAdjVazia((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    grafo0.insereAresta((int)(byte)(-1), 1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test08"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo0.insereAresta((int)(byte)1, (int)' ', (int)(byte)0);
    boolean b7 = grafo0.listaAdjVazia(0);
    ds.Grafo grafo8 = grafo0.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test09"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo1.insereAresta((int)(short)1, (int)(byte)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test10"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    boolean b4 = grafo0.existeAresta((int)'#', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test11"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    boolean b5 = grafo0.listaAdjVazia((int)(byte)1);
    ds.Aresta aresta7 = grafo0.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test12"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Aresta aresta3 = grafo0.retiraAresta((int)' ', (int)' ');
    boolean b5 = grafo0.listaAdjVazia((int)(byte)1);
    grafo0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test13"); }


    ds.Grafo grafo0 = new ds.Grafo();
    ds.Grafo grafo1 = grafo0.grafoTransposto();
    grafo0.imprime();
    grafo0.insereAresta(0, (int)(byte)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo1);

  }

}
