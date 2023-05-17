package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta6 = grafo1.proxAdj((int)(short)(-1));
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    boolean b16 = grafo5.existeAresta((int)'4', 100);
    boolean b19 = grafo5.existeAresta(1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    boolean b16 = grafo5.existeAresta((int)'4', 100);
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta15 = grafo5.primeiroListaAdj(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int[] i_array6 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.cab;
    boolean b10 = grafo1.listaAdjVazia((int)'a');
    ds.Grafo grafo11 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo11);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    ds.Grafo.Aresta aresta15 = grafo5.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta8 = grafo5.retiraAresta(1, (int)(byte)100);
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    grafo9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test12"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array11 = new int[] { (short)1 };
    grafo1.cab = i_array11;
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)(byte)100);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo19 = new ds.Grafo((int)(byte)100);
    int[] i_array21 = new int[] { ' ' };
    grafo19.peso = i_array21;
    grafo17.cab = i_array21;
    int[] i_array24 = grafo17.cab;
    grafo1.prox = i_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test13"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    ds.Grafo.Aresta aresta3 = grafo1.primeiroListaAdj(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test14"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array11 = new int[] { (short)1 };
    grafo1.cab = i_array11;
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)(byte)100);
    ds.Grafo.Aresta aresta18 = grafo1.retiraAresta((int)(short)0, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(aresta18);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test15"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { ' ' };
    grafo15.peso = i_array17;
    ds.Grafo grafo19 = grafo15.grafoTransposto();
    ds.Grafo.Aresta aresta21 = grafo19.proxAdj((int)(byte)10);
    ds.Grafo grafo23 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo25 = new ds.Grafo((int)(byte)100);
    int[] i_array27 = new int[] { ' ' };
    grafo25.peso = i_array27;
    grafo23.cab = i_array27;
    int[] i_array30 = grafo23.prox;
    ds.Grafo grafo31 = grafo23.grafoTransposto();
    int[] i_array33 = new int[] { (short)1 };
    grafo23.cab = i_array33;
    grafo19.cab = i_array33;
    grafo5.prox = i_array33;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta39 = grafo5.retiraAresta((int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test16"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.prox;
    int[] i_array10 = grafo1.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test17"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    grafo1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test18"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array11 = new int[] { (short)1 };
    grafo1.cab = i_array11;
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)(byte)100);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array19 = new int[] { ' ' };
    grafo17.peso = i_array19;
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)100);
    int[] i_array24 = new int[] { ' ' };
    grafo22.peso = i_array24;
    ds.Grafo grafo26 = grafo22.grafoTransposto();
    ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int)(byte)10);
    ds.Grafo grafo30 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo32 = new ds.Grafo((int)(byte)100);
    int[] i_array34 = new int[] { ' ' };
    grafo32.peso = i_array34;
    grafo30.cab = i_array34;
    int[] i_array37 = grafo30.prox;
    ds.Grafo grafo38 = grafo30.grafoTransposto();
    int[] i_array40 = new int[] { (short)1 };
    grafo30.cab = i_array40;
    grafo26.cab = i_array40;
    grafo17.prox = i_array40;
    grafo1.peso = i_array40;
    ds.Grafo grafo46 = new ds.Grafo((int)(byte)100);
    int[] i_array48 = new int[] { ' ' };
    grafo46.peso = i_array48;
    ds.Grafo grafo50 = grafo46.grafoTransposto();
    int i51 = grafo50.numVertices();
    ds.Grafo grafo53 = new ds.Grafo((int)(byte)100);
    int[] i_array55 = new int[] { ' ' };
    grafo53.peso = i_array55;
    grafo50.peso = i_array55;
    int[] i_array58 = grafo50.peso;
    grafo1.prox = i_array58;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test19"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array11 = new int[] { (short)1 };
    grafo1.cab = i_array11;
    int[] i_array13 = grafo1.cab;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { ' ' };
    grafo15.peso = i_array17;
    ds.Grafo grafo19 = grafo15.grafoTransposto();
    ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(1, (int)(byte)100);
    int[] i_array23 = grafo19.prox;
    grafo1.prox = i_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test20"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo6 = new ds.Grafo((int)(byte)100);
    int[] i_array8 = new int[] { ' ' };
    grafo6.peso = i_array8;
    ds.Grafo grafo10 = grafo6.grafoTransposto();
    ds.Grafo.Aresta aresta12 = grafo10.proxAdj((int)(byte)10);
    ds.Grafo grafo14 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo16 = new ds.Grafo((int)(byte)100);
    int[] i_array18 = new int[] { ' ' };
    grafo16.peso = i_array18;
    grafo14.cab = i_array18;
    int[] i_array21 = grafo14.prox;
    ds.Grafo grafo22 = grafo14.grafoTransposto();
    int[] i_array24 = new int[] { (short)1 };
    grafo14.cab = i_array24;
    grafo10.cab = i_array24;
    grafo1.prox = i_array24;
    // The following exception was thrown during execution in test generation
    try {
    ds.Grafo.Aresta aresta30 = grafo1.retiraAresta(100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test21"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test22"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    grafo5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test23"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo grafo7 = new ds.Grafo((int)(byte)100);
    int[] i_array9 = new int[] { ' ' };
    grafo7.peso = i_array9;
    grafo1.prox = i_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test24"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.insereAresta((int)(short)10, (int)(byte)100, (int)(byte)10);
    ds.Grafo grafo10 = grafo5.grafoTransposto();
    int[] i_array11 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test25"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int i13 = grafo5.numVertices();
    int[] i_array14 = grafo5.cab;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test26"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'a');
    ds.Grafo.Aresta aresta3 = grafo1.proxAdj((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = grafo1.existeAresta((-1), 1);
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test27"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    ds.Grafo grafo9 = grafo1.grafoTransposto();
    int[] i_array11 = new int[] { (short)1 };
    grafo1.cab = i_array11;
    ds.Grafo.Aresta aresta15 = grafo1.retiraAresta(0, (int)(byte)100);
    ds.Grafo grafo17 = new ds.Grafo((int)(byte)100);
    int[] i_array19 = new int[] { ' ' };
    grafo17.peso = i_array19;
    ds.Grafo grafo22 = new ds.Grafo((int)(byte)100);
    int[] i_array24 = new int[] { ' ' };
    grafo22.peso = i_array24;
    ds.Grafo grafo26 = grafo22.grafoTransposto();
    ds.Grafo.Aresta aresta28 = grafo26.proxAdj((int)(byte)10);
    ds.Grafo grafo30 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo32 = new ds.Grafo((int)(byte)100);
    int[] i_array34 = new int[] { ' ' };
    grafo32.peso = i_array34;
    grafo30.cab = i_array34;
    int[] i_array37 = grafo30.prox;
    ds.Grafo grafo38 = grafo30.grafoTransposto();
    int[] i_array40 = new int[] { (short)1 };
    grafo30.cab = i_array40;
    grafo26.cab = i_array40;
    grafo17.prox = i_array40;
    grafo1.peso = i_array40;
    int[] i_array45 = grafo1.peso;
    int[] i_array46 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test28"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.cab;
    int[] i_array9 = grafo1.prox;
    ds.Grafo grafo10 = grafo1.grafoTransposto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test29"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    grafo5.insereAresta((int)(short)10, (int)(byte)100, (int)(byte)10);
    ds.Grafo grafo10 = grafo5.grafoTransposto();
    ds.Grafo grafo12 = new ds.Grafo((int)(byte)100);
    int[] i_array14 = new int[] { ' ' };
    grafo12.peso = i_array14;
    grafo10.prox = i_array14;
    ds.Grafo grafo18 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo20 = new ds.Grafo((int)(byte)100);
    int[] i_array22 = new int[] { ' ' };
    grafo20.peso = i_array22;
    grafo18.cab = i_array22;
    int[] i_array25 = grafo18.prox;
    ds.Grafo grafo26 = grafo18.grafoTransposto();
    int[] i_array27 = grafo26.peso;
    grafo10.peso = i_array27;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test30"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test31"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo3 = new ds.Grafo((int)(byte)100);
    int[] i_array5 = new int[] { ' ' };
    grafo3.peso = i_array5;
    grafo1.cab = i_array5;
    int[] i_array8 = grafo1.prox;
    int[] i_array9 = grafo1.cab;
    // The following exception was thrown during execution in test generation
    try {
    grafo1.insereAresta((int)'a', 10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test32"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(byte)10);
    int[] i_array8 = grafo5.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test33"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    int i6 = grafo5.numVertices();
    ds.Grafo grafo8 = new ds.Grafo((int)(byte)100);
    int[] i_array10 = new int[] { ' ' };
    grafo8.peso = i_array10;
    grafo5.peso = i_array10;
    int[] i_array13 = grafo5.peso;
    ds.Grafo grafo15 = new ds.Grafo((int)(byte)100);
    int[] i_array17 = new int[] { ' ' };
    grafo15.peso = i_array17;
    ds.Grafo grafo19 = grafo15.grafoTransposto();
    ds.Grafo.Aresta aresta22 = grafo19.retiraAresta(1, (int)(byte)100);
    ds.Grafo grafo24 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo26 = new ds.Grafo((int)(byte)100);
    int[] i_array28 = new int[] { ' ' };
    grafo26.peso = i_array28;
    grafo24.cab = i_array28;
    int[] i_array31 = grafo24.prox;
    ds.Grafo grafo32 = grafo24.grafoTransposto();
    int[] i_array34 = new int[] { (short)1 };
    grafo24.cab = i_array34;
    ds.Grafo.Aresta aresta38 = grafo24.retiraAresta(0, (int)(byte)100);
    ds.Grafo grafo40 = new ds.Grafo((int)(byte)100);
    int[] i_array42 = new int[] { ' ' };
    grafo40.peso = i_array42;
    ds.Grafo grafo45 = new ds.Grafo((int)(byte)100);
    int[] i_array47 = new int[] { ' ' };
    grafo45.peso = i_array47;
    ds.Grafo grafo49 = grafo45.grafoTransposto();
    ds.Grafo.Aresta aresta51 = grafo49.proxAdj((int)(byte)10);
    ds.Grafo grafo53 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo55 = new ds.Grafo((int)(byte)100);
    int[] i_array57 = new int[] { ' ' };
    grafo55.peso = i_array57;
    grafo53.cab = i_array57;
    int[] i_array60 = grafo53.prox;
    ds.Grafo grafo61 = grafo53.grafoTransposto();
    int[] i_array63 = new int[] { (short)1 };
    grafo53.cab = i_array63;
    grafo49.cab = i_array63;
    grafo40.prox = i_array63;
    grafo24.peso = i_array63;
    grafo19.peso = i_array63;
    grafo5.prox = i_array63;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test34"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(byte)100);
    int[] i_array3 = new int[] { ' ' };
    grafo1.peso = i_array3;
    ds.Grafo grafo5 = grafo1.grafoTransposto();
    ds.Grafo.Aresta aresta7 = grafo5.proxAdj((int)(byte)10);
    ds.Grafo grafo9 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo11 = new ds.Grafo((int)(byte)100);
    int[] i_array13 = new int[] { ' ' };
    grafo11.peso = i_array13;
    grafo9.cab = i_array13;
    int[] i_array16 = grafo9.prox;
    ds.Grafo grafo17 = grafo9.grafoTransposto();
    int[] i_array19 = new int[] { (short)1 };
    grafo9.cab = i_array19;
    grafo5.cab = i_array19;
    boolean b23 = grafo5.listaAdjVazia(10);
    ds.Grafo grafo25 = new ds.Grafo((int)(byte)100);
    ds.Grafo grafo27 = new ds.Grafo((int)(byte)100);
    int[] i_array29 = new int[] { ' ' };
    grafo27.peso = i_array29;
    grafo25.cab = i_array29;
    int[] i_array32 = grafo25.prox;
    ds.Grafo grafo33 = grafo25.grafoTransposto();
    int[] i_array35 = new int[] { (short)1 };
    grafo25.cab = i_array35;
    int[] i_array37 = grafo25.cab;
    grafo5.prox = i_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(grafo33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);

  }

}
