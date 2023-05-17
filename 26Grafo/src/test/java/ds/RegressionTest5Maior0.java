package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test01"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    int[] i_array2 = grafo1.prox;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test02"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int i5 = grafo1.numVertices();
    boolean b8 = grafo1.existeAresta(100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test03"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test04"); }


    ds.Grafo grafo1 = new ds.Grafo((int)'#');

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test05"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    int i5 = grafo1.numVertices();
    int[] i_array6 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test06"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    int[] i_array5 = grafo1.peso;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test07"); }


    ds.Grafo grafo1 = new ds.Grafo((int)(short)100);
    grafo1.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test08"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo.Aresta aresta4 = grafo1.proxAdj(1);
    ds.Grafo grafo6 = new ds.Grafo(100);
    int[] i_array7 = grafo6.peso;
    grafo1.peso = i_array7;
    int i9 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(aresta4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test09"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    int[] i_array3 = grafo1.prox;
    grafo1.imprime();
    grafo1.insereAresta((int)(byte)100, 100, (int)(short)10);
    grafo1.insereAresta(0, 1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test10"); }


    ds.Grafo grafo1 = new ds.Grafo(100);
    grafo1.imprime();
    ds.Grafo grafo4 = new ds.Grafo(100);
    grafo4.imprime();
    int[] i_array6 = grafo4.prox;
    grafo4.imprime();
    int[] i_array8 = grafo4.prox;
    grafo1.peso = i_array8;
    int i10 = grafo1.numVertices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test11"); }


    ds.Grafo grafo1 = new ds.Grafo((int)' ');

  }

}
