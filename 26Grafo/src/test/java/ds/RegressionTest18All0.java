package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta8 = grafo1.proxAdj((int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    boolean b4 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(short)0);
    int[] i_array5 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo2 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.peso;
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(byte)10);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    grafo3.imprime();
    ds.Grafo.Aresta aresta7 = grafo3.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array8 = grafo3.cab;
    grafo1.cab = i_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    grafo3.imprime();
    int[] i_array9 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo3.peso = i_array9;
    grafo1.prox = i_array9;
    int[] i_array12 = grafo1.prox;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    grafo14.imprime();
    ds.Grafo.Aresta aresta18 = grafo14.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array19 = grafo14.cab;
    grafo1.peso = i_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo3.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)' ');
    int i4 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    grafo5.imprime();
    ds.Grafo.Aresta aresta9 = grafo5.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array10 = grafo5.cab;
    int[] i_array11 = grafo5.peso;
    grafo1.prox = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    grafo3.imprime();
    int[] i_array9 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo3.peso = i_array9;
    grafo1.prox = i_array9;
    int[] i_array12 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.prox;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.insereAresta(0, (int)'a', (int)(byte)1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)(byte)0);
    int[] i_array14 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'4', (int)(byte)0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    int[] i_array4 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.prox;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(1);
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.cab;
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test26"); }


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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(byte)0);
    int[] i_array16 = grafo1.peso;
    int[] i_array17 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.peso;
    ds.Grafo grafo8 = grafo1.grafoTransposto();
    int i9 = grafo1.numVertices();
    boolean b11 = grafo1.listaAdjVazia(100);
    int[] i_array12 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array6 = grafo1.prox;
    int[] i_array7 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)1);
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    grafo3.imprime();
    int[] i_array9 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo3.peso = i_array9;
    grafo1.prox = i_array9;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo grafo12 = grafo1.grafoTransposto();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)0);
    boolean b6 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    grafo8.imprime();
    int[] i_array14 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo8.peso = i_array14;
    ds.Grafo.Aresta aresta18 = grafo8.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta20 = grafo8.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta22 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array23 = grafo8.peso;
    grafo1.cab = i_array23;
    int i25 = grafo1.numVertices();
    int[] i_array26 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    int[] i_array12 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)' ', (int)' ', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta13 = grafo1.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta15 = grafo1.primeiroListaAdj((int)(byte)0);
    int i16 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(byte)0);
    boolean b6 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    grafo8.imprime();
    int[] i_array14 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo8.peso = i_array14;
    ds.Grafo.Aresta aresta18 = grafo8.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta20 = grafo8.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta22 = grafo8.primeiroListaAdj((int)(byte)0);
    int[] i_array23 = grafo8.peso;
    grafo1.cab = i_array23;
    ds.Grafo grafo26 = new ds.Grafo((int)'4');
    grafo26.imprime();
    int[] i_array32 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo26.peso = i_array32;
    ds.Grafo.Aresta aresta36 = grafo26.retiraAresta(1, (int)(short)(-1));
    ds.Grafo.Aresta aresta38 = grafo26.proxAdj((int)(byte)0);
    ds.Grafo.Aresta aresta40 = grafo26.primeiroListaAdj((int)(byte)0);
    int[] i_array41 = grafo26.peso;
    grafo1.cab = i_array41;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    int[] i_array9 = grafo1.prox;
    int[] i_array10 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta5 = grafo3.proxAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array7 = new int[] { (byte)1, (byte)10, (short)100, 10 };
    grafo1.peso = i_array7;
    ds.Grafo.Aresta aresta11 = grafo1.retiraAresta(1, (int)(short)(-1));
    int[] i_array12 = grafo1.cab;
    int i13 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test38"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int i2 = grafo1.numVertices();
    ds.Grafo.Aresta aresta4 = grafo1.primeiroListaAdj((int)(short)0);
    ds.Grafo grafo6 = new ds.Grafo((int)'4');
    grafo6.imprime();
    ds.Grafo.Aresta aresta10 = grafo6.retiraAresta((int)' ', (int)(byte)1);
    int[] i_array11 = grafo6.prox;
    grafo1.prox = i_array11;
    int[] i_array13 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

}
