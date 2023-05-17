package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)10);
    int[] i_array5 = grafo1.peso;
    int[] i_array6 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(short)10);
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
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)10);
    int[] i_array5 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    grafo1.insereAresta((int)'a', (int)(short)0, 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)10);
    int[] i_array5 = grafo1.cab;
    boolean b7 = grafo1.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    ds.Grafo grafo6 = grafo3.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo6.listaAdjVazia((-1));
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta8 = grafo5.retiraAresta((int)(byte)1, 0);
    int[] i_array9 = grafo5.peso;
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)10);
    int[] i_array5 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)(-1));
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

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)10);
    int[] i_array5 = grafo1.peso;
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(byte)1, 0);
    int[] i_array9 = new int[] {  };
    grafo1.cab = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    ds.Grafo grafo5 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo3.retiraAresta((int)(byte)1, (int)(short)100);
    ds.Grafo grafo10 = new ds.Grafo(1);
    int[] i_array11 = grafo10.cab;
    grafo3.cab = i_array11;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta14 = grafo3.proxAdj((int)(short)(-1));
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(short)(-1), (int)' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    grafo3.imprime();
    int i7 = grafo3.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    ds.Grafo grafo5 = grafo3.grafoTransposto();
    int[] i_array6 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    ds.Grafo grafo6 = grafo3.grafoTransposto();
    grafo3.insereAresta(0, (int)'#', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)1, 0);
    int[] i_array5 = grafo1.peso;
    grafo1.insereAresta(100, (int)'a', (int)(short)(-1));
    int[] i_array10 = grafo1.cab;
    boolean b12 = grafo1.listaAdjVazia((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    ds.Grafo grafo5 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo3.retiraAresta((int)(byte)1, (int)(short)100);
    ds.Grafo grafo10 = new ds.Grafo(1);
    int[] i_array11 = grafo10.cab;
    grafo3.cab = i_array11;
    grafo3.insereAresta(10, (int)(short)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    ds.Grafo.Aresta aresta8 = grafo3.retiraAresta(10, (int)(short)10);
    ds.Grafo grafo10 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta13 = grafo10.retiraAresta((int)(byte)1, 0);
    int[] i_array14 = grafo10.peso;
    grafo10.insereAresta(100, (int)'a', (int)(short)(-1));
    int[] i_array19 = grafo10.prox;
    grafo3.peso = i_array19;
    ds.Grafo.Aresta aresta23 = grafo3.retiraAresta((int)(byte)1, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta23);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)(byte)1, 0);
    int[] i_array5 = grafo1.peso;
    ds.Grafo grafo7 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(0, (int)(short)10);
    int[] i_array11 = grafo7.peso;
    ds.Grafo grafo12 = grafo7.grafoTransposto();
    ds.Grafo grafo14 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta17 = grafo14.retiraAresta(0, (int)(short)10);
    int[] i_array18 = grafo14.cab;
    grafo7.cab = i_array18;
    grafo1.peso = i_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    boolean b4 = grafo1.existeAresta((int)(byte)0, 1);
    ds.Grafo grafo6 = new ds.Grafo(1);
    int[] i_array7 = grafo6.cab;
    ds.Grafo grafo8 = grafo6.grafoTransposto();
    int i9 = grafo8.numVertices();
    ds.Grafo grafo10 = grafo8.grafoTransposto();
    ds.Grafo.Aresta aresta13 = grafo8.retiraAresta((int)(byte)1, (int)(short)100);
    ds.Grafo grafo15 = new ds.Grafo(1);
    int[] i_array16 = grafo15.cab;
    grafo8.cab = i_array16;
    int[] i_array18 = grafo8.prox;
    ds.Grafo grafo20 = new ds.Grafo(1);
    int[] i_array21 = grafo20.cab;
    ds.Grafo grafo22 = grafo20.grafoTransposto();
    int i23 = grafo22.numVertices();
    int[] i_array24 = grafo22.prox;
    ds.Grafo grafo25 = grafo22.grafoTransposto();
    ds.Grafo grafo27 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta30 = grafo27.retiraAresta((int)(byte)1, 0);
    int[] i_array31 = grafo27.peso;
    grafo25.prox = i_array31;
    int[] i_array33 = grafo25.prox;
    grafo8.cab = i_array33;
    grafo1.peso = i_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.insereAresta((int)(byte)1, (-1), (int)(short)100);
    grafo1.insereAresta((int)(short)100, (int)(byte)0, (-1));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    int[] i_array3 = grafo1.prox;
    int i4 = grafo1.numVertices();
    boolean b7 = grafo1.existeAresta(100, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = grafo3.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo3.primeiroListaAdj((int)'#');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    ds.Grafo grafo5 = grafo3.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo3.retiraAresta((int)(byte)1, (int)(short)100);
    ds.Grafo grafo10 = new ds.Grafo(1);
    int[] i_array11 = grafo10.cab;
    grafo3.cab = i_array11;
    int[] i_array13 = grafo3.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo3.primeiroListaAdj((int)'#');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int i4 = grafo3.numVertices();
    int[] i_array5 = grafo3.prox;
    ds.Grafo grafo6 = grafo3.grafoTransposto();
    ds.Grafo grafo8 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta11 = grafo8.retiraAresta((int)(byte)1, 0);
    int[] i_array12 = grafo8.peso;
    grafo6.prox = i_array12;
    ds.Grafo grafo15 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta18 = grafo15.retiraAresta(0, (int)(short)10);
    int[] i_array19 = grafo15.peso;
    int[] i_array20 = grafo15.cab;
    grafo6.cab = i_array20;
    int[] i_array22 = grafo6.cab;
    int[] i_array23 = grafo6.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo grafo3 = new ds.Grafo(1);
    int[] i_array4 = grafo3.cab;
    ds.Grafo grafo5 = grafo3.grafoTransposto();
    int i6 = grafo5.numVertices();
    int[] i_array7 = grafo5.prox;
    ds.Grafo.Aresta aresta10 = grafo5.retiraAresta(10, (int)(short)10);
    ds.Grafo grafo12 = new ds.Grafo(1);
    int[] i_array13 = grafo12.cab;
    ds.Grafo grafo14 = grafo12.grafoTransposto();
    int i15 = grafo14.numVertices();
    int[] i_array16 = grafo14.prox;
    ds.Grafo grafo17 = grafo14.grafoTransposto();
    ds.Grafo grafo19 = new ds.Grafo(1);
    ds.Grafo.Aresta aresta22 = grafo19.retiraAresta((int)(byte)1, 0);
    int[] i_array23 = grafo19.peso;
    grafo17.prox = i_array23;
    grafo5.peso = i_array23;
    grafo1.prox = i_array23;
    ds.Grafo grafo28 = new ds.Grafo(1);
    int[] i_array29 = grafo28.cab;
    int[] i_array30 = grafo28.prox;
    grafo1.cab = i_array30;
    boolean b33 = grafo1.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

}
