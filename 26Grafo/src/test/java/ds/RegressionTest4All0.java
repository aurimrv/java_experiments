package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    int i3 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta((int)'4', (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array9 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo1.peso = i_array9;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta12 = grafo1.proxAdj((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)0);
    int i4 = grafo3.numVertices();
    int[] i_array11 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo3.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)0);
    int i15 = grafo14.numVertices();
    int[] i_array22 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo14.peso = i_array22;
    grafo3.prox = i_array22;
    grafo1.peso = i_array22;
    int i26 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta4 = grafo2.proxAdj((int)(byte)1);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array9 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)0);
    int i13 = grafo12.numVertices();
    int[] i_array20 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo12.peso = i_array20;
    grafo1.prox = i_array20;
    int[] i_array23 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    boolean b5 = grafo3.listaAdjVazia(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array9 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)0);
    int i13 = grafo12.numVertices();
    int[] i_array20 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo12.peso = i_array20;
    grafo1.prox = i_array20;
    int i23 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)0);
    int i4 = grafo3.numVertices();
    int[] i_array11 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo3.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)0);
    int i15 = grafo14.numVertices();
    int[] i_array22 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo14.peso = i_array22;
    grafo3.prox = i_array22;
    grafo1.peso = i_array22;
    ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(1, (int)(short)(-1));
    int[] i_array29 = grafo1.cab;
    int i30 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    boolean b6 = grafo1.listaAdjVazia(100);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta6 = grafo3.retiraAresta((int)(short)100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta6);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array9 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)0);
    int i13 = grafo12.numVertices();
    int[] i_array20 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo12.peso = i_array20;
    grafo1.prox = i_array20;
    grafo1.imprime();
    ds.Grafo grafo25 = new ds.Grafo((int)(byte)0);
    int i26 = grafo25.numVertices();
    int[] i_array33 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo25.peso = i_array33;
    ds.Grafo grafo36 = new ds.Grafo((int)(byte)0);
    int i37 = grafo36.numVertices();
    int[] i_array44 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo36.peso = i_array44;
    grafo25.prox = i_array44;
    grafo1.peso = i_array44;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 35);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)0);
    int i4 = grafo3.numVertices();
    int[] i_array11 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo3.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)0);
    int i15 = grafo14.numVertices();
    int[] i_array22 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo14.peso = i_array22;
    grafo3.prox = i_array22;
    grafo1.peso = i_array22;
    ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(1, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)(-1), (int)'4', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta7 = grafo1.primeiroListaAdj(1);
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    boolean b6 = grafo1.listaAdjVazia(100);
    int[] i_array7 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo1.cab;
    ds.Grafo grafo5 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(0, (int)(short)(-1));
    int[] i_array9 = grafo5.prox;
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array9 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo1.peso = i_array9;
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)0);
    int i13 = grafo12.numVertices();
    int[] i_array20 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo12.peso = i_array20;
    grafo1.prox = i_array20;
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = grafo1.existeAresta((int)(short)0, 35);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo3.cab;
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    int[] i_array8 = grafo6.cab;
    grafo3.peso = i_array8;
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta14 = grafo11.retiraAresta(0, (int)(short)(-1));
    ds.Grafo grafo15 = grafo11.grafoTransposto();
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)0);
    grafo17.imprime();
    ds.Grafo grafo19 = grafo17.grafoTransposto();
    int[] i_array20 = grafo19.cab;
    grafo11.cab = i_array20;
    grafo3.peso = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array3 = grafo1.cab;
    int[] i_array4 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    int[] i_array3 = grafo1.prox;
    int[] i_array4 = grafo1.cab;
    int[] i_array11 = new int[] { ' ', (short)100, '#', (short)10, 1, (short)0 };
    grafo1.cab = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    int[] i_array5 = grafo1.prox;
    grafo1.insereAresta((int)'4', (int)(byte)0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.insereAresta((int)(short)0, (int)'4', (int)(short)(-1));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)0);
    int i7 = grafo6.numVertices();
    int[] i_array14 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo6.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)0);
    int i18 = grafo17.numVertices();
    int[] i_array25 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo17.peso = i_array25;
    grafo6.prox = i_array25;
    grafo4.peso = i_array25;
    ds.Grafo grafo30 = new ds.Grafo((int)(byte)0);
    grafo30.imprime();
    ds.Grafo grafo32 = grafo30.grafoTransposto();
    int[] i_array33 = grafo32.cab;
    grafo4.cab = i_array33;
    ds.Grafo grafo36 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta39 = grafo36.retiraAresta(0, (int)(short)(-1));
    int[] i_array40 = grafo36.prox;
    grafo4.prox = i_array40;
    grafo1.prox = i_array40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    int i2 = grafo1.numVertices();
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array6 = grafo5.prox;
    grafo1.peso = i_array6;
    int i8 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta10 = grafo7.retiraAresta(0, (int)(short)(-1));
    int[] i_array11 = grafo7.prox;
    grafo5.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    ds.Grafo.Aresta aresta7 = grafo1.retiraAresta(100, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)0);
    int i4 = grafo3.numVertices();
    int[] i_array11 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo3.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)0);
    int i15 = grafo14.numVertices();
    int[] i_array22 = new int[] { (byte)100, '4', (byte)10, (short)10, (-1), (short)1 };
    grafo14.peso = i_array22;
    grafo3.prox = i_array22;
    grafo1.peso = i_array22;
    ds.Grafo.Aresta aresta28 = grafo1.retiraAresta(1, (int)(short)(-1));
    int[] i_array29 = grafo1.cab;
    int[] i_array30 = grafo1.peso;
    ds.Grafo grafo31 = grafo1.grafoTransposto();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo31);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(0, (int)(short)(-1));
    int[] i_array5 = null;
    grafo1.peso = i_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)(byte)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array6 = grafo5.prox;
    grafo2.prox = i_array6;
    boolean b10 = grafo2.existeAresta((int)(short)0, (int)'a');
    boolean b12 = grafo2.listaAdjVazia(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

}
