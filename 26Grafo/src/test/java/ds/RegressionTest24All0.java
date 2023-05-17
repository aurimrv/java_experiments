package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array6 = new int[] { (byte)(-1) };
    grafo1.peso = i_array6;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)(-1), (int)(short)0, (int)'a');
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
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array6 = new int[] { (byte)(-1) };
    grafo1.peso = i_array6;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(short)(-1), 100);
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
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array6 = new int[] { (byte)(-1) };
    grafo1.peso = i_array6;
    grafo1.imprime();
    boolean b10 = grafo1.listaAdjVazia((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)(-1), (int)(byte)10, (int)(short)1);
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
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b8 = grafo5.existeAresta((int)(byte)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int i2 = grafo1.numVertices();
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)1);
    int i11 = grafo10.numVertices();
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo6.existeAresta((-1), (int)(short)1);
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
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((int)(byte)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int[] i_array6 = grafo5.prox;
    ds.Grafo grafo8 = new ds.Grafo(10);
    ds.Grafo grafo10 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int)(short)10, (int)(byte)100);
    grafo10.insereAresta(1, (int)(short)1, (int)(byte)100);
    boolean b20 = grafo10.existeAresta((int)(short)0, (int)(byte)10);
    int[] i_array24 = new int[] { (byte)0, (byte)(-1), 'a' };
    grafo10.peso = i_array24;
    grafo8.cab = i_array24;
    grafo5.peso = i_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    int[] i_array7 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    boolean b11 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    int[] i_array15 = new int[] { (byte)0, (byte)(-1), 'a' };
    grafo1.peso = i_array15;
    boolean b18 = grafo1.listaAdjVazia((int)'4');
    int[] i_array19 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array10 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)1);
    boolean b6 = grafo3.existeAresta((int)(short)1, (int)(byte)(-1));
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array13 = new int[] { (byte)(-1) };
    grafo8.peso = i_array13;
    grafo3.peso = i_array13;
    boolean b17 = grafo3.listaAdjVazia(10);
    ds.Grafo grafo19 = new ds.Grafo((int)(byte)1);
    boolean b22 = grafo19.existeAresta((int)(short)1, (int)(byte)(-1));
    int[] i_array23 = grafo19.prox;
    ds.Grafo.Aresta aresta26 = grafo19.retiraAresta(10, 10);
    int[] i_array27 = grafo19.cab;
    grafo3.cab = i_array27;
    grafo1.peso = i_array27;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)(short)1);
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
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)'4');
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
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)(byte)(-1));
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta9 = grafo6.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array11 = new int[] { (byte)(-1) };
    grafo6.peso = i_array11;
    grafo1.peso = i_array11;
    boolean b15 = grafo1.listaAdjVazia(10);
    ds.Grafo grafo16 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo16);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    int[] i_array7 = grafo5.prox;
    int[] i_array8 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array6 = new int[] { (byte)(-1) };
    grafo1.peso = i_array6;
    grafo1.imprime();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(10);
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
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.imprime();
    ds.Grafo grafo7 = new ds.Grafo((int)(byte)1);
    int i8 = grafo7.numVertices();
    int[] i_array9 = grafo7.peso;
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)1);
    int i13 = grafo12.numVertices();
    int[] i_array14 = grafo12.peso;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)1);
    boolean b20 = grafo17.existeAresta((int)(short)1, (int)(byte)(-1));
    int[] i_array21 = grafo17.prox;
    grafo1.peso = i_array21;
    ds.Grafo grafo23 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)(byte)1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)(byte)(-1));
    boolean b6 = grafo1.listaAdjVazia((int)(byte)10);
    int[] i_array7 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)(byte)(-1));
    boolean b6 = grafo1.listaAdjVazia((int)(byte)10);
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)(short)100, (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.primeiroListaAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    boolean b11 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    ds.Grafo grafo13 = new ds.Grafo((int)(byte)1);
    boolean b16 = grafo13.existeAresta((int)(short)1, (int)(byte)(-1));
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta21 = grafo18.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array23 = new int[] { (byte)(-1) };
    grafo18.peso = i_array23;
    grafo13.peso = i_array23;
    boolean b27 = grafo13.listaAdjVazia(10);
    ds.Grafo grafo29 = new ds.Grafo((int)(byte)1);
    boolean b32 = grafo29.existeAresta((int)(short)1, (int)(byte)(-1));
    int[] i_array33 = grafo29.prox;
    ds.Grafo.Aresta aresta36 = grafo29.retiraAresta(10, 10);
    int[] i_array37 = grafo29.cab;
    grafo13.cab = i_array37;
    grafo1.cab = i_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int i2 = grafo1.numVertices();
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)1);
    boolean b7 = grafo4.existeAresta((int)(short)1, (int)(byte)(-1));
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta12 = grafo9.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array14 = new int[] { (byte)(-1) };
    grafo9.peso = i_array14;
    grafo4.peso = i_array14;
    boolean b18 = grafo4.listaAdjVazia(10);
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)1);
    boolean b23 = grafo20.existeAresta((int)(short)1, (int)(byte)(-1));
    int[] i_array24 = grafo20.prox;
    ds.Grafo.Aresta aresta27 = grafo20.retiraAresta(10, 10);
    int[] i_array28 = grafo20.cab;
    grafo4.cab = i_array28;
    grafo1.peso = i_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    boolean b4 = grafo1.existeAresta((int)(short)1, (int)(byte)(-1));
    boolean b6 = grafo1.listaAdjVazia((int)(byte)10);
    int[] i_array7 = grafo1.prox;
    int[] i_array8 = grafo1.prox;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta((int)(short)0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    int[] i_array6 = new int[] { (byte)(-1) };
    grafo1.peso = i_array6;
    grafo1.imprime();
    boolean b10 = grafo1.listaAdjVazia((int)(byte)0);
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)10, (int)(byte)100);
    grafo1.insereAresta(1, (int)(short)1, (int)(byte)100);
    boolean b11 = grafo1.existeAresta((int)(short)0, (int)(byte)10);
    int[] i_array15 = new int[] { (byte)0, (byte)(-1), 'a' };
    grafo1.peso = i_array15;
    grafo1.insereAresta((int)(byte)0, (int)(byte)1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

}
