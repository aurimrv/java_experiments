package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test1"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.insere(item3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test2"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    arvoreBinaria0.retira(item4);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test3"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.insere(item2);
    arvoreBinaria0.testa();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test4"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    ds.Item item3 = arvoreBinaria0.pesquisa(item2);
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    arvoreBinaria0.retira(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test5"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    arvoreBinaria0.testa();
    ds.Item item4 = null;
    ds.Item item5 = arvoreBinaria0.pesquisa(item4);
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

}
