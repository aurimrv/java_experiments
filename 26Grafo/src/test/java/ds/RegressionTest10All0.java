package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((-1), (int)' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo(100);
    int[] i_array10 = new int[] { (short)10, (short)10, '#', 10 };
    grafo5.cab = i_array10;
    grafo5.imprime();
    int[] i_array13 = grafo5.peso;
    grafo1.prox = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    int[] i_array17 = grafo1.peso;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)10, (int)(short)1, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    int i22 = grafo21.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    int i17 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo18 = new ds.Grafo(100);
    int[] i_array23 = new int[] { (short)10, (short)10, '#', 10 };
    grafo18.cab = i_array23;
    grafo1.peso = i_array23;
    boolean b27 = grafo1.listaAdjVazia((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta29 = grafo1.proxAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    int i6 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(100);
    int[] i_array9 = new int[] { (short)10, (short)10, '#', 10 };
    grafo4.cab = i_array9;
    grafo4.imprime();
    int[] i_array12 = grafo4.peso;
    int[] i_array13 = grafo4.peso;
    grafo1.cab = i_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    grafo1.imprime();
    int[] i_array9 = grafo1.peso;
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta((int)(byte)1, (int)(byte)0);
    int[] i_array13 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = null;
    grafo1.cab = i_array2;

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    ds.Grafo grafo23 = new ds.Grafo(100);
    int[] i_array28 = new int[] { (short)10, (short)10, '#', 10 };
    grafo23.cab = i_array28;
    grafo21.prox = i_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    boolean b20 = grafo1.existeAresta(10, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    ds.Grafo grafo23 = new ds.Grafo(100);
    int[] i_array24 = grafo23.prox;
    grafo1.prox = i_array24;
    ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta23 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    boolean b24 = grafo21.existeAresta((int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta26 = grafo21.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta29 = grafo21.retiraAresta((int)(short)1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta29);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo18 = new ds.Grafo(100);
    int[] i_array23 = new int[] { (short)10, (short)10, '#', 10 };
    grafo18.cab = i_array23;
    grafo1.peso = i_array23;
    grafo1.imprime();
    boolean b29 = grafo1.existeAresta(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    grafo3.insereAresta(10, 0, (int)(short)100);
    ds.Grafo grafo11 = new ds.Grafo(100);
    int[] i_array16 = new int[] { (short)10, (short)10, '#', 10 };
    grafo11.cab = i_array16;
    grafo11.imprime();
    int[] i_array19 = grafo11.peso;
    int[] i_array20 = grafo11.peso;
    ds.Grafo grafo22 = new ds.Grafo(100);
    int[] i_array27 = new int[] { (short)10, (short)10, '#', 10 };
    grafo22.cab = i_array27;
    grafo11.cab = i_array27;
    grafo3.prox = i_array27;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj((int)(short)(-1));
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
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    grafo1.imprime();
    boolean b10 = grafo1.listaAdjVazia((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    boolean b24 = grafo21.existeAresta((int)(byte)0, (int)'4');
    ds.Grafo.Aresta aresta26 = grafo21.primeiroListaAdj(0);
    ds.Grafo.Aresta aresta28 = grafo21.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)'4');
    ds.Grafo.Aresta aresta6 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo21 = grafo1.grafoTransposto();
    boolean b23 = grafo21.listaAdjVazia((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo18 = new ds.Grafo(100);
    int[] i_array23 = new int[] { (short)10, (short)10, '#', 10 };
    grafo18.cab = i_array23;
    grafo1.peso = i_array23;
    boolean b28 = grafo1.existeAresta(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo(100);
    int[] i_array9 = new int[] { (short)10, (short)10, '#', 10 };
    grafo4.cab = i_array9;
    ds.Grafo grafo12 = new ds.Grafo(100);
    int[] i_array17 = new int[] { (short)10, (short)10, '#', 10 };
    grafo12.cab = i_array17;
    grafo4.cab = i_array17;
    ds.Grafo grafo20 = grafo4.grafoTransposto();
    int[] i_array21 = grafo4.prox;
    grafo1.prox = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    ds.Grafo grafo9 = new ds.Grafo(100);
    int[] i_array14 = new int[] { (short)10, (short)10, '#', 10 };
    grafo9.cab = i_array14;
    grafo1.cab = i_array14;
    ds.Grafo grafo17 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta19 = grafo1.primeiroListaAdj(0);
    grafo1.imprime();
    ds.Grafo grafo22 = new ds.Grafo(100);
    int[] i_array27 = new int[] { (short)10, (short)10, '#', 10 };
    grafo22.cab = i_array27;
    grafo22.imprime();
    int[] i_array30 = grafo22.peso;
    int[] i_array31 = grafo22.peso;
    ds.Grafo grafo33 = new ds.Grafo(100);
    int[] i_array38 = new int[] { (short)10, (short)10, '#', 10 };
    grafo33.cab = i_array38;
    grafo22.cab = i_array38;
    grafo1.peso = i_array38;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta43 = grafo1.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    grafo3.insereAresta(10, (int)'#', (-1));
    int[] i_array10 = grafo3.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array6 = new int[] { (short)10, (short)10, '#', 10 };
    grafo1.cab = i_array6;
    grafo1.imprime();
    int[] i_array9 = grafo1.peso;
    int[] i_array10 = grafo1.peso;
    int[] i_array11 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    ds.Grafo grafo6 = grafo3.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(100);
    int[] i_array13 = new int[] { (short)10, (short)10, '#', 10 };
    grafo8.cab = i_array13;
    ds.Grafo grafo16 = new ds.Grafo(100);
    int[] i_array21 = new int[] { (short)10, (short)10, '#', 10 };
    grafo16.cab = i_array21;
    grafo8.cab = i_array21;
    ds.Grafo grafo24 = grafo8.grafoTransposto();
    int[] i_array25 = grafo8.prox;
    grafo3.cab = i_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);

  }

}
