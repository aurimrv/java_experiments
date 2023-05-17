package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = grafo2.existeAresta((int)(byte)100, (int)'a');
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    boolean b6 = grafo1.existeAresta((int)(byte)1, (int)(short)(-1));
    ds.Grafo.Aresta aresta8 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    grafo1.insereAresta((int)(byte)10, (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((int)(byte)(-1), (int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    boolean b6 = grafo1.existeAresta((int)(byte)1, (int)(short)(-1));
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)100, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    grafo1.insereAresta((int)'4', (int)(byte)1, (int)(byte)(-1));
    boolean b10 = grafo1.existeAresta((int)(short)1, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj(10);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(short)0);
    int i8 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

}
