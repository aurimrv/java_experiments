package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test1"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test2"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.insere(item1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test3"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    ds.Item item4 = arvoreBinaria0.pesquisa(item3);
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test4"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    arvoreBinaria0.testa();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test5"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    ds.Item item8 = arvoreBinaria0.pesquisa(item7);
    ds.Item item9 = null;
    arvoreBinaria0.insere(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test6"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item5 = null;
    ds.Item item6 = arvoreBinaria0.pesquisa(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

}
