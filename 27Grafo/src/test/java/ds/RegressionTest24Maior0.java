package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((int)(byte)100, 1);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)10, (int)(short)0);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)100, (int)(short)10, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(short)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((-1), (int)(short)(-1));
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.existeAresta((int)(short)(-1), (int)' ');
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)1, (int)'#', 1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = grafo1.listaAdjVazia((-1));
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)(short)1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj(100);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta((int)(byte)(-1), 0);
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)0, (int)(short)1, (int)(byte)1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(short)100, (-1));
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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
