package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)(-1), (-1));
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array6 = grafo1.prox;
    int i7 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    int[] i_array4 = grafo1.cab;
    int[] i_array10 = new int[] { 0, '#', (byte)(-1), 'a', 100 };
    grafo1.peso = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo(10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    ds.Grafo grafo7 = new ds.Grafo(100);
    grafo7.imprime();
    int[] i_array9 = grafo7.peso;
    int[] i_array10 = grafo7.cab;
    int[] i_array11 = grafo7.peso;
    grafo1.cab = i_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    boolean b6 = grafo1.existeAresta((int)' ', (int)(byte)10);
    ds.Grafo grafo7 = grafo1.grafoTransposto();
    boolean b10 = grafo7.existeAresta((int)(byte)10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta5 = grafo1.proxAdj(0);
    ds.Grafo.Aresta aresta8 = grafo1.retiraAresta((int)' ', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    boolean b7 = grafo5.listaAdjVazia((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    int[] i_array4 = grafo1.cab;
    boolean b7 = grafo1.existeAresta((int)(short)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    int[] i_array4 = grafo1.cab;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array6 = grafo1.prox;
    ds.Grafo grafo8 = new ds.Grafo(100);
    boolean b10 = grafo8.listaAdjVazia(0);
    boolean b12 = grafo8.listaAdjVazia((int)(short)100);
    int[] i_array17 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo8.cab = i_array17;
    boolean b20 = grafo8.listaAdjVazia(0);
    ds.Grafo grafo22 = new ds.Grafo(100);
    boolean b24 = grafo22.listaAdjVazia(0);
    boolean b26 = grafo22.listaAdjVazia((int)(short)100);
    int[] i_array31 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo22.cab = i_array31;
    grafo8.prox = i_array31;
    grafo1.peso = i_array31;
    ds.Grafo.Aresta aresta37 = grafo1.retiraAresta((int)'4', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta37);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    int[] i_array4 = grafo1.peso;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)10, (int)(byte)0);
    int i7 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    grafo1.imprime();
    int[] i_array5 = grafo1.cab;
    boolean b8 = grafo1.existeAresta(0, (int)(byte)0);
    ds.Grafo grafo10 = new ds.Grafo(100);
    grafo10.imprime();
    int[] i_array12 = grafo10.peso;
    int[] i_array13 = grafo10.cab;
    int[] i_array14 = grafo10.peso;
    grafo1.prox = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array10 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo1.cab = i_array10;
    boolean b14 = grafo1.existeAresta(1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta4 = grafo1.retiraAresta(100, (int)(byte)100);
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.primeiroListaAdj((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    grafo1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)(short)(-1), 0, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    int[] i_array4 = grafo1.cab;
    int[] i_array5 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    ds.Grafo grafo7 = new ds.Grafo(100);
    grafo7.imprime();
    int[] i_array9 = grafo7.prox;
    ds.Grafo grafo11 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta13 = grafo11.proxAdj((int)' ');
    int[] i_array14 = grafo11.prox;
    grafo7.cab = i_array14;
    grafo1.peso = i_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array10 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo1.cab = i_array10;
    boolean b13 = grafo1.listaAdjVazia(0);
    int i14 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array10 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo1.cab = i_array10;
    boolean b13 = grafo1.listaAdjVazia(0);
    ds.Grafo grafo15 = new ds.Grafo(100);
    boolean b17 = grafo15.listaAdjVazia(0);
    boolean b19 = grafo15.listaAdjVazia((int)(short)100);
    int[] i_array24 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo15.cab = i_array24;
    grafo1.prox = i_array24;
    // The following exception was thrown during execution in test generation
    try {
    boolean b29 = grafo1.existeAresta((int)(byte)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    int[] i_array4 = grafo1.cab;
    grafo1.insereAresta(10, (int)(byte)(-1), (int)'#');
    int[] i_array9 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta5 = grafo1.retiraAresta(10, (int)(byte)1);
    grafo1.insereAresta((int)(byte)100, (int)(short)10, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta5);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    int[] i_array4 = grafo1.cab;
    int[] i_array5 = grafo1.cab;
    int i6 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    boolean b5 = grafo1.listaAdjVazia((int)(short)100);
    int[] i_array10 = new int[] { 10, (-1), '4', (short)(-1) };
    grafo1.cab = i_array10;
    ds.Grafo grafo13 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta15 = grafo13.proxAdj((int)' ');
    boolean b18 = grafo13.existeAresta((int)' ', (int)(byte)10);
    ds.Grafo grafo19 = grafo13.grafoTransposto();
    int i20 = grafo19.numVertices();
    ds.Grafo grafo22 = new ds.Grafo(100);
    grafo22.imprime();
    int[] i_array24 = grafo22.prox;
    grafo19.cab = i_array24;
    grafo1.peso = i_array24;
    ds.Grafo.Aresta aresta28 = grafo1.primeiroListaAdj((int)(byte)0);
    ds.Grafo.Aresta aresta31 = grafo1.retiraAresta((int)'#', (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta31);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    boolean b3 = grafo1.listaAdjVazia(0);
    int[] i_array4 = grafo1.cab;
    int[] i_array5 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    int[] i_array4 = grafo1.peso;
    int[] i_array5 = grafo1.cab;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)' ');
    ds.Grafo.Aresta aresta6 = grafo1.retiraAresta((int)(byte)10, (int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = grafo1.listaAdjVazia((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta6);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    grafo1.imprime();
    int[] i_array5 = grafo1.cab;
    int[] i_array10 = new int[] { 1, (byte)(-1), (short)(-1), (short)0 };
    grafo1.cab = i_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    boolean b5 = grafo1.listaAdjVazia((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    grafo1.imprime();
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

}
