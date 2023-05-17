package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    int[] i_array2 = null;
    grafo1.cab = i_array2;

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = grafo1.existeAresta((int)(short)(-1), (int)(byte)100);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    int[] i_array16 = new int[] { '4', (byte)1, (-1), 10 };
    grafo11.peso = i_array16;
    grafo2.cab = i_array16;
    ds.Grafo grafo19 = grafo2.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    int i9 = grafo2.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo2.proxAdj(1);
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
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.insereAresta((int)(short)1, (int)(byte)1, (int)'#');
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test11"); }


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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.imprime();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta52 = grafo1.primeiroListaAdj(0);
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
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    ds.Grafo grafo10 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    int[] i_array16 = new int[] { '4', (byte)1, (-1), 10 };
    grafo11.peso = i_array16;
    grafo2.cab = i_array16;
    ds.Grafo grafo20 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo21 = grafo20.grafoTransposto();
    int[] i_array26 = new int[] { '4', (byte)1, (-1), 10 };
    grafo21.peso = i_array26;
    ds.Grafo grafo29 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo30 = grafo29.grafoTransposto();
    int[] i_array35 = new int[] { '4', (byte)1, (-1), 10 };
    grafo30.peso = i_array35;
    grafo21.cab = i_array35;
    grafo2.prox = i_array35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array10 = new int[] { '4', (byte)1, (-1), 10 };
    grafo5.peso = i_array10;
    grafo2.prox = i_array10;
    int[] i_array13 = grafo2.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo.Aresta aresta9 = grafo1.retiraAresta((int)'4', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo2.primeiroListaAdj((int)'4');
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
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia((int)(short)10);
    ds.Grafo grafo6 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    grafo6.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo13 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo14 = grafo13.grafoTransposto();
    int[] i_array19 = new int[] { '4', (byte)1, (-1), 10 };
    grafo14.peso = i_array19;
    ds.Grafo grafo22 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo23 = grafo22.grafoTransposto();
    int[] i_array28 = new int[] { '4', (byte)1, (-1), 10 };
    grafo23.peso = i_array28;
    grafo14.cab = i_array28;
    grafo6.peso = i_array28;
    grafo2.peso = i_array28;
    int[] i_array33 = grafo2.prox;
    grafo2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array10 = new int[] { '4', (byte)1, (-1), 10 };
    grafo5.peso = i_array10;
    grafo2.prox = i_array10;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = grafo2.existeAresta((int)(byte)0, (int)(byte)1);
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
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    int i7 = grafo1.numVertices();
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)10);
    int[] i_array10 = grafo9.prox;
    grafo1.prox = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.insereAresta((int)'4', (int)(byte)100, 100);
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = grafo6.grafoTransposto();
    int[] i_array8 = grafo6.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    // The following exception was thrown during execution in test generation
    try {
    boolean b52 = grafo1.listaAdjVazia((int)(byte)(-1));
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
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    int[] i_array51 = grafo1.prox;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    ds.Grafo grafo4 = grafo2.grafoTransposto();
    int[] i_array5 = grafo2.cab;
    grafo2.insereAresta(1, (int)(byte)0, (int)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    int[] i_array11 = new int[] { (short)10, (short)1 };
    grafo2.peso = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    int[] i_array20 = new int[] { '4', (byte)1, (-1), 10 };
    grafo15.peso = i_array20;
    grafo2.cab = i_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta5 = grafo2.primeiroListaAdj(100);
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
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);
    int[] i_array2 = grafo1.prox;
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
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    boolean b4 = grafo2.listaAdjVazia((int)(short)10);
    int[] i_array5 = grafo2.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    ds.Grafo grafo4 = grafo2.grafoTransposto();
    int[] i_array5 = grafo2.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test32"); }


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
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int[] i_array7 = new int[] { '4', (byte)1, (-1), 10 };
    grafo2.peso = i_array7;
    int i9 = grafo2.numVertices();
    ds.Grafo grafo11 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo12 = grafo11.grafoTransposto();
    grafo11.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo18 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo19 = grafo18.grafoTransposto();
    int[] i_array24 = new int[] { '4', (byte)1, (-1), 10 };
    grafo19.peso = i_array24;
    ds.Grafo grafo27 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo28 = grafo27.grafoTransposto();
    int[] i_array33 = new int[] { '4', (byte)1, (-1), 10 };
    grafo28.peso = i_array33;
    grafo19.cab = i_array33;
    grafo11.peso = i_array33;
    grafo2.cab = i_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    ds.Grafo grafo4 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo5 = grafo4.grafoTransposto();
    int[] i_array10 = new int[] { '4', (byte)1, (-1), 10 };
    grafo5.peso = i_array10;
    grafo2.prox = i_array10;
    ds.Grafo grafo14 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo15 = grafo14.grafoTransposto();
    boolean b17 = grafo15.listaAdjVazia((int)(short)10);
    ds.Grafo grafo19 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo20 = grafo19.grafoTransposto();
    grafo19.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo26 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    int[] i_array32 = new int[] { '4', (byte)1, (-1), 10 };
    grafo27.peso = i_array32;
    ds.Grafo grafo35 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo36 = grafo35.grafoTransposto();
    int[] i_array41 = new int[] { '4', (byte)1, (-1), 10 };
    grafo36.peso = i_array41;
    grafo27.cab = i_array41;
    grafo19.peso = i_array41;
    grafo15.peso = i_array41;
    int[] i_array46 = grafo15.peso;
    grafo2.peso = i_array46;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo(10);
    int[] i_array2 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo1.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo8 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo9 = grafo8.grafoTransposto();
    int[] i_array14 = new int[] { '4', (byte)1, (-1), 10 };
    grafo9.peso = i_array14;
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    grafo9.cab = i_array23;
    grafo1.peso = i_array23;
    ds.Grafo grafo28 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo29 = grafo28.grafoTransposto();
    ds.Grafo grafo31 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo32 = grafo31.grafoTransposto();
    int[] i_array37 = new int[] { '4', (byte)1, (-1), 10 };
    grafo32.peso = i_array37;
    ds.Grafo grafo40 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo41 = grafo40.grafoTransposto();
    int[] i_array46 = new int[] { '4', (byte)1, (-1), 10 };
    grafo41.peso = i_array46;
    grafo32.cab = i_array46;
    grafo28.prox = i_array46;
    grafo1.cab = i_array46;
    int[] i_array51 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)100, (int)'a', (int)(byte)1);
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
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    grafo1.insereAresta((int)(short)1, (int)(byte)1, (int)'#');
    int[] i_array6 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    int i3 = grafo2.numVertices();
    ds.Grafo grafo4 = grafo2.grafoTransposto();
    grafo2.insereAresta((int)(short)100, (int)(byte)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo4);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test39"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    grafo2.imprime();
    ds.Grafo grafo5 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo6 = grafo5.grafoTransposto();
    boolean b8 = grafo6.listaAdjVazia((int)(short)10);
    ds.Grafo grafo10 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo11 = grafo10.grafoTransposto();
    grafo10.insereAresta((int)(byte)100, (int)(byte)1, (int)(short)0);
    ds.Grafo grafo17 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo18 = grafo17.grafoTransposto();
    int[] i_array23 = new int[] { '4', (byte)1, (-1), 10 };
    grafo18.peso = i_array23;
    ds.Grafo grafo26 = new ds.Grafo((int)(short)0);
    ds.Grafo grafo27 = grafo26.grafoTransposto();
    int[] i_array32 = new int[] { '4', (byte)1, (-1), 10 };
    grafo27.peso = i_array32;
    grafo18.cab = i_array32;
    grafo10.peso = i_array32;
    grafo6.peso = i_array32;
    int[] i_array37 = grafo6.peso;
    grafo2.cab = i_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

  }

}
