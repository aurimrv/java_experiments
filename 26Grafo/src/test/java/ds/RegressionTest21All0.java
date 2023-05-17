package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = grafo1.listaAdjVazia((int)(byte)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo2.retiraAresta((int)(short)0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.peso;
    boolean b9 = grafo1.existeAresta(1, (int)(byte)100);
    int[] i_array10 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, 100);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.imprime();
    ds.Grafo.Aresta aresta10 = grafo1.proxAdj((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    boolean b4 = grafo1.existeAresta((int)' ', (-1));
    int i5 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, 100);
    grafo1.insereAresta(10, (int)(short)100, (int)(short)0);
    int[] i_array10 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    boolean b14 = grafo10.existeAresta((int)(short)10, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.retiraAresta(0, 10);
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(52);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo1.primeiroListaAdj((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b8 = grafo1.existeAresta(1, (int)' ');
    boolean b11 = grafo1.existeAresta((int)'#', (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(byte)1, (int)(byte)100, 100);
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj((int)(byte)10);
    grafo1.imprime();
    int[] i_array12 = new int[] { (byte)100, (short)(-1), ' ' };
    grafo1.cab = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    grafo15.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b22 = grafo15.existeAresta(1, (int)' ');
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    int[] i_array31 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo24.cab = i_array31;
    grafo15.peso = i_array31;
    grafo1.prox = i_array31;
    ds.Grafo grafo36 = new ds.Grafo((int)(byte)100);
    grafo36.insereAresta((int)(byte)1, (int)(byte)100, 100);
    grafo36.insereAresta(10, (int)(short)100, (int)(short)0);
    ds.Grafo grafo46 = new ds.Grafo((int)(byte)100);
    grafo46.insereAresta((int)(byte)1, (int)(byte)100, 100);
    ds.Grafo.Aresta aresta52 = grafo46.primeiroListaAdj((int)(byte)10);
    grafo46.imprime();
    int[] i_array57 = new int[] { (byte)100, (short)(-1), ' ' };
    grafo46.cab = i_array57;
    grafo36.peso = i_array57;
    grafo1.prox = i_array57;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj(1);
    boolean b14 = grafo1.existeAresta((int)'a', (int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta16 = grafo1.primeiroListaAdj((int)(short)(-1));
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
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    grafo3.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b10 = grafo3.existeAresta(1, (int)' ');
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)100);
    int[] i_array19 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo12.cab = i_array19;
    grafo3.peso = i_array19;
    grafo1.cab = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    boolean b4 = grafo1.existeAresta((int)'#', (int)'#');
    int[] i_array5 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b8 = grafo1.existeAresta(1, (int)' ');
    int[] i_array9 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    boolean b4 = grafo1.existeAresta((int)' ', (-1));
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    boolean b12 = grafo1.listaAdjVazia(0);
    boolean b14 = grafo1.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    grafo1.insereAresta((int)(short)100, (int)(byte)(-1), (int)(byte)10);
    int i11 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.insereAresta(0, (int)(byte)100, (-1));
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array15 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo8.cab = i_array15;
    ds.Grafo grafo17 = grafo8.grafoTransposto();
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array19 = grafo17.prox;
    grafo2.prox = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    int[] i_array3 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array6 = grafo1.prox;
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta(0, (int)(byte)(-1));
    int i10 = grafo1.numVertices();
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array2 = grafo1.cab;
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)100);
    grafo5.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    int[] i_array10 = grafo5.peso;
    grafo3.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    grafo1.imprime();
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)100);
    grafo12.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b19 = grafo12.existeAresta(1, (int)' ');
    ds.Grafo grafo21 = new ds.Grafo((int)(byte)100);
    int[] i_array28 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo21.cab = i_array28;
    grafo12.peso = i_array28;
    grafo1.peso = i_array28;
    int[] i_array32 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    grafo1.insereAresta((int)(short)1, (int)(short)10, (int)(byte)(-1));
    boolean b8 = grafo1.existeAresta(1, (int)' ');
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b5 = grafo1.existeAresta(100, (int)' ');
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)(short)100, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { (byte)10, (-1), 'a', 'a', (byte)100, (short)10 };
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

}
