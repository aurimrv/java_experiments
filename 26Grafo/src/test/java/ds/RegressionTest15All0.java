package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((-1), (int)(short)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    int i11 = grafo1.numVertices();
    int[] i_array12 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)' ');
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array11 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo4.cab = i_array11;
    grafo2.cab = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    grafo2.insereAresta(10, (int)(short)1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    int[] i_array4 = grafo2.cab;
    int i5 = grafo2.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    ds.Grafo grafo11 = new ds.Grafo((int)' ');
    int[] i_array18 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo11.cab = i_array18;
    int[] i_array20 = grafo11.prox;
    grafo1.peso = i_array20;
    int[] i_array22 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int[] i_array2 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.prox;
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    int i11 = grafo1.numVertices();
    ds.Grafo grafo13 = new ds.Grafo((int)' ');
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array20 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo13.cab = i_array20;
    ds.Grafo grafo23 = new ds.Grafo((int)' ');
    ds.Grafo grafo24 = grafo23.grafoTransposto();
    ds.Grafo grafo26 = new ds.Grafo((int)' ');
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    int[] i_array33 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo26.cab = i_array33;
    grafo24.cab = i_array33;
    grafo13.prox = i_array33;
    grafo1.prox = i_array33;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)10, (int)(short)(-1), (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    ds.Grafo.Aresta aresta6 = grafo2.retiraAresta(10, (int)'a');
    int i7 = grafo2.numVertices();
    ds.Grafo.Aresta aresta9 = grafo2.primeiroListaAdj(0);
    grafo2.insereAresta(100, 1, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array8 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    int[] i_array5 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    int[] i_array7 = grafo6.peso;
    grafo1.prox = i_array7;
    int i9 = grafo1.numVertices();
    int[] i_array10 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    int[] i_array7 = grafo6.peso;
    grafo1.prox = i_array7;
    int[] i_array9 = grafo1.peso;
    boolean b12 = grafo1.existeAresta((int)'4', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array8 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo1.cab = i_array8;
    grafo1.imprime();
    int i11 = grafo1.numVertices();
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    boolean b4 = grafo1.existeAresta(1, (int)(byte)1);
    ds.Grafo grafo6 = new ds.Grafo((int)(short)1);
    int[] i_array7 = grafo6.peso;
    grafo1.prox = i_array7;
    int[] i_array9 = grafo1.peso;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.imprime();
    int[] i_array4 = grafo2.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    boolean b12 = grafo1.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    ds.Grafo grafo5 = new ds.Grafo((int)' ');
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    int[] i_array12 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo5.cab = i_array12;
    int[] i_array14 = grafo5.peso;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array8 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo1.cab = i_array8;
    grafo1.imprime();
    int i11 = grafo1.numVertices();
    ds.Grafo grafo13 = new ds.Grafo((int)' ');
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array20 = new int[] { 10, (byte)(-1), (short)1, (byte)1, 10 };
    grafo13.cab = i_array20;
    int[] i_array22 = grafo13.peso;
    grafo1.cab = i_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(32);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(short)100);
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array8 = new int[] { ' ', 100, (short)100, ' ', '#' };
    grafo1.cab = i_array8;
    grafo1.imprime();
    int i11 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int[] i_array2 = grafo1.peso;
    int[] i_array3 = grafo1.peso;
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)1);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(100, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    ds.Grafo.Aresta aresta6 = grafo2.retiraAresta(10, (int)'a');
    ds.Grafo.Aresta aresta8 = grafo2.primeiroListaAdj(1);
    grafo2.insereAresta((int)(byte)1, (int)(short)10, 0);
    ds.Grafo.Aresta aresta14 = grafo2.primeiroListaAdj((int)(byte)0);
    int[] i_array15 = grafo2.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)'a');
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
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    int[] i_array8 = new int[] { (byte)(-1), (byte)10, ' ', (short)10, (byte)(-1), 100 };
    grafo1.cab = i_array8;
    int[] i_array10 = grafo1.prox;
    int i11 = grafo1.numVertices();
    int[] i_array12 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo2.prox;
    int[] i_array4 = grafo2.cab;
    ds.Grafo grafo6 = new ds.Grafo((int)' ');
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    int[] i_array8 = grafo7.prox;
    int[] i_array9 = grafo7.cab;
    grafo2.cab = i_array9;
    int[] i_array11 = grafo2.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

}
