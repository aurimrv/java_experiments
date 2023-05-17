package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = grafo1.existeAresta((-1), (int)(byte)1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    boolean b4 = grafo1.existeAresta((int)(short)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    int[] i_array11 = null;
    grafo1.peso = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int i2 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    ds.Grafo.Aresta aresta9 = grafo1.proxAdj((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(byte)(-1), (int)' ', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    int[] i_array11 = new int[] { ' ', (byte)100 };
    grafo1.cab = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    int[] i_array7 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo9.cab = i_array12;
    int[] i_array14 = grafo9.cab;
    grafo7.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)10);
    int[] i_array7 = new int[] { (short)100, (short)0, 0, ' ', (short)1 };
    grafo1.peso = i_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    int[] i_array3 = grafo1.cab;
    int[] i_array4 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    grafo1.cab = i_array8;
    ds.Grafo.Aresta aresta12 = grafo1.primeiroListaAdj((int)(short)1);
    ds.Grafo grafo13 = grafo1.grafoTransposto();
    int[] i_array14 = grafo13.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    int[] i_array2 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.prox;
    int[] i_array3 = grafo1.peso;
    boolean b5 = grafo1.listaAdjVazia(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    int[] i_array7 = grafo1.prox;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta10 = grafo1.retiraAresta((int)(byte)(-1), (int)(byte)10);
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    int[] i_array14 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    boolean b7 = grafo1.listaAdjVazia((int)(short)1);
    boolean b9 = grafo1.listaAdjVazia(10);
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta11 = grafo1.proxAdj((int)(byte)100);
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
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    ds.Grafo grafo3 = new ds.Grafo((int)'4');
    int[] i_array4 = grafo3.peso;
    grafo1.cab = i_array4;
    int[] i_array6 = grafo1.cab;
    ds.Grafo grafo8 = new ds.Grafo((int)'4');
    int[] i_array9 = grafo8.peso;
    ds.Grafo grafo11 = new ds.Grafo((int)'4');
    int[] i_array12 = grafo11.peso;
    grafo8.peso = i_array12;
    int[] i_array14 = grafo8.prox;
    grafo1.cab = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)0, (int)(byte)(-1));
    ds.Grafo grafo6 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array12 = new int[] { (-1), (short)(-1), ' ', '4', (byte)0, 'a' };
    grafo1.peso = i_array12;
    ds.Grafo grafo15 = new ds.Grafo((int)'4');
    int[] i_array16 = grafo15.prox;
    int[] i_array17 = grafo15.cab;
    grafo1.prox = i_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    ds.Grafo.Aresta aresta9 = grafo1.primeiroListaAdj(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta9);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    int[] i_array10 = grafo4.prox;
    grafo1.cab = i_array10;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta13 = grafo1.primeiroListaAdj((int)'a');
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
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    boolean b5 = grafo1.existeAresta((int)(byte)100, (int)(short)(-1));
    int[] i_array6 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    boolean b8 = grafo1.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.prox;
    int[] i_array12 = grafo10.peso;
    grafo1.cab = i_array12;
    ds.Grafo grafo14 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo14);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    ds.Grafo grafo7 = new ds.Grafo((int)'4');
    int[] i_array8 = grafo7.peso;
    grafo4.peso = i_array8;
    int[] i_array10 = grafo4.prox;
    grafo1.cab = i_array10;
    int[] i_array12 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    ds.Grafo grafo9 = new ds.Grafo((int)'4');
    int[] i_array10 = grafo9.prox;
    int[] i_array11 = grafo9.cab;
    grafo7.prox = i_array11;
    ds.Grafo grafo14 = new ds.Grafo((int)'4');
    int[] i_array15 = grafo14.peso;
    ds.Grafo grafo17 = new ds.Grafo((int)'4');
    int[] i_array18 = grafo17.peso;
    ds.Grafo grafo20 = new ds.Grafo((int)'4');
    int[] i_array21 = grafo20.peso;
    grafo17.peso = i_array21;
    int[] i_array23 = grafo17.prox;
    grafo14.cab = i_array23;
    grafo7.prox = i_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    int[] i_array2 = grafo1.peso;
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.peso;
    grafo1.peso = i_array5;
    grafo1.imprime();
    int i8 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test35"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    grafo1.cab = i_array6;
    int[] i_array8 = grafo1.peso;
    ds.Grafo grafo10 = new ds.Grafo((int)'4');
    int[] i_array11 = grafo10.peso;
    ds.Grafo grafo13 = new ds.Grafo((int)'4');
    int[] i_array14 = grafo13.peso;
    grafo10.peso = i_array14;
    boolean b17 = grafo10.listaAdjVazia((int)(byte)100);
    ds.Grafo grafo19 = new ds.Grafo((int)'4');
    int[] i_array20 = grafo19.prox;
    int[] i_array21 = grafo19.peso;
    grafo10.cab = i_array21;
    grafo1.cab = i_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test36"); }


    ds.Grafo grafo1 = new ds.Grafo(0);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo((int)'4');
    int[] i_array5 = grafo4.prox;
    int[] i_array6 = grafo4.peso;
    grafo1.peso = i_array6;
    boolean b10 = grafo1.existeAresta((int)(short)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test37"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'4');
    grafo1.imprime();
    ds.Grafo grafo3 = grafo1.grafoTransposto();
    ds.Grafo grafo5 = new ds.Grafo((int)'4');
    int[] i_array6 = grafo5.prox;
    int[] i_array7 = grafo5.peso;
    grafo3.prox = i_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

}
