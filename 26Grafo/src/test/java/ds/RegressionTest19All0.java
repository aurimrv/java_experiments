package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    int[] i_array2 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)'a', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.primeiroListaAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    boolean b12 = grafo1.listaAdjVazia((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo13 = grafo1.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = grafo1.cab;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)10);
    int[] i_array12 = grafo11.cab;
    grafo1.cab = i_array12;
    int[] i_array14 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    boolean b12 = grafo1.listaAdjVazia((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo13 = grafo1.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)10);
    int[] i_array17 = grafo16.cab;
    grafo14.prox = i_array17;
    ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array22 = new int[] {  };
    grafo14.peso = i_array22;
    grafo1.cab = i_array22;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)10);
    int[] i_array17 = grafo16.cab;
    grafo14.prox = i_array17;
    ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array22 = new int[] {  };
    grafo14.peso = i_array22;
    grafo1.cab = i_array22;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta26 = grafo1.primeiroListaAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    int[] i_array6 = grafo1.prox;
    int[] i_array9 = new int[] { (short)10, 10 };
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = grafo1.cab;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)10);
    int[] i_array12 = grafo11.cab;
    grafo1.cab = i_array12;
    boolean b16 = grafo1.existeAresta((int)'#', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    boolean b12 = grafo1.listaAdjVazia((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    int[] i_array15 = grafo14.cab;
    grafo12.prox = i_array15;
    ds.Grafo.Aresta aresta19 = grafo12.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array20 = null;
    grafo12.peso = i_array20;
    int[] i_array22 = grafo12.peso;
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo26 = new ds.Grafo((int)(byte)10);
    int[] i_array27 = grafo26.cab;
    grafo24.prox = i_array27;
    ds.Grafo.Aresta aresta31 = grafo24.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array32 = grafo24.cab;
    grafo12.prox = i_array32;
    grafo1.cab = i_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)10);
    int[] i_array13 = grafo12.cab;
    grafo10.prox = i_array13;
    ds.Grafo.Aresta aresta17 = grafo10.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array18 = new int[] {  };
    grafo10.peso = i_array18;
    int[] i_array20 = grafo10.peso;
    grafo1.peso = i_array20;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)10);
    int[] i_array12 = grafo11.cab;
    grafo9.prox = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)10);
    int[] i_array18 = grafo17.cab;
    grafo15.prox = i_array18;
    ds.Grafo.Aresta aresta22 = grafo15.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array23 = new int[] {  };
    grafo15.peso = i_array23;
    int[] i_array25 = null;
    grafo15.peso = i_array25;
    ds.Grafo grafo28 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo30 = new ds.Grafo((int)(byte)10);
    int[] i_array31 = grafo30.cab;
    grafo28.prox = i_array31;
    ds.Grafo.Aresta aresta35 = grafo28.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array36 = new int[] {  };
    grafo28.peso = i_array36;
    grafo15.cab = i_array36;
    grafo9.peso = i_array36;
    grafo1.peso = i_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo grafo7 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)10);
    int[] i_array10 = grafo9.cab;
    grafo7.prox = i_array10;
    ds.Grafo.Aresta aresta14 = grafo7.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array15 = new int[] {  };
    grafo7.peso = i_array15;
    int[] i_array17 = null;
    grafo7.peso = i_array17;
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)10);
    int[] i_array23 = grafo22.cab;
    grafo20.prox = i_array23;
    ds.Grafo.Aresta aresta27 = grafo20.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array28 = new int[] {  };
    grafo20.peso = i_array28;
    grafo7.cab = i_array28;
    grafo1.peso = i_array28;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta34 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)10);
    int[] i_array6 = grafo5.cab;
    grafo3.prox = i_array6;
    ds.Grafo.Aresta aresta10 = grafo3.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array11 = new int[] {  };
    grafo3.peso = i_array11;
    grafo1.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
    boolean b11 = grafo1.existeAresta(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo grafo7 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)10);
    int[] i_array10 = grafo9.cab;
    grafo7.prox = i_array10;
    ds.Grafo.Aresta aresta14 = grafo7.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array15 = new int[] {  };
    grafo7.peso = i_array15;
    int[] i_array17 = null;
    grafo7.peso = i_array17;
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)10);
    int[] i_array23 = grafo22.cab;
    grafo20.prox = i_array23;
    ds.Grafo.Aresta aresta27 = grafo20.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array28 = new int[] {  };
    grafo20.peso = i_array28;
    grafo7.cab = i_array28;
    grafo1.peso = i_array28;
    int[] i_array32 = null;
    grafo1.peso = i_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    int i12 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'4', (int)(byte)100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
    int[] i_array8 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta7 = grafo1.proxAdj(0);
    int i8 = grafo1.numVertices();
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = null;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    int[] i_array12 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo1.proxAdj(1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = null;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)10);
    int[] i_array16 = grafo15.cab;
    grafo13.prox = i_array16;
    ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array21 = grafo13.cab;
    grafo1.prox = i_array21;
    ds.Grafo.Aresta aresta25 = grafo1.retiraAresta((int)'#', 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta25);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
    grafo1.insereAresta((int)(short)100, 10, (int)(short)(-1));
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)10);
    int[] i_array17 = grafo16.cab;
    grafo14.prox = i_array17;
    ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array22 = new int[] {  };
    grafo14.peso = i_array22;
    grafo1.cab = i_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    boolean b14 = grafo1.existeAresta((int)'4', (int)(byte)0);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)10);
    int[] i_array17 = grafo16.cab;
    grafo1.cab = i_array17;
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)10);
    int[] i_array23 = grafo22.cab;
    grafo20.prox = i_array23;
    ds.Grafo.Aresta aresta27 = grafo20.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array28 = grafo20.cab;
    grafo1.peso = i_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)10);
    int[] i_array17 = grafo16.cab;
    grafo14.prox = i_array17;
    ds.Grafo.Aresta aresta21 = grafo14.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array22 = new int[] {  };
    grafo14.peso = i_array22;
    grafo1.cab = i_array22;
    int[] i_array25 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array25);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = null;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)10);
    int[] i_array16 = grafo15.cab;
    grafo13.prox = i_array16;
    ds.Grafo.Aresta aresta20 = grafo13.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array21 = grafo13.cab;
    grafo1.prox = i_array21;
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo26 = new ds.Grafo((int)(byte)10);
    int[] i_array27 = grafo26.cab;
    grafo24.prox = i_array27;
    ds.Grafo.Aresta aresta31 = grafo24.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array32 = new int[] {  };
    grafo24.peso = i_array32;
    boolean b35 = grafo24.listaAdjVazia((int)(short)100);
    int[] i_array36 = grafo24.prox;
    grafo1.cab = i_array36;
    ds.Grafo grafo39 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo41 = new ds.Grafo((int)(byte)10);
    int[] i_array42 = grafo41.cab;
    grafo39.prox = i_array42;
    ds.Grafo.Aresta aresta46 = grafo39.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array47 = new int[] {  };
    grafo39.peso = i_array47;
    grafo1.peso = i_array47;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    int i12 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta(1, (int)(short)0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = null;
    grafo1.peso = i_array9;
    int[] i_array11 = grafo1.peso;
    int[] i_array12 = grafo1.prox;
    int[] i_array13 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array13);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta(10, 1);
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test40"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)10);
    int[] i_array4 = grafo3.cab;
    grafo1.prox = i_array4;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)10, (int)(short)10);
    int[] i_array9 = new int[] {  };
    grafo1.peso = i_array9;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    int[] i_array13 = grafo1.peso;
    int[] i_array14 = null;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array13);

  }

}
