package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test1"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.insere(item1);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test2"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    ds.Item item5 = null;
    arvoreBinaria0.insere(item5);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test3"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    ds.Item item6 = null;
    arvoreBinaria0.insere(item6);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test4"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.insere(item2);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test5"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    arvoreBinaria0.testa();
    ds.Item item2 = null;
    arvoreBinaria0.retira(item2);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test6"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    ds.Item item2 = arvoreBinaria0.pesquisa(item1);
    ds.Item item3 = null;
    arvoreBinaria0.insere(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test7"); }


    ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
    ds.Item item1 = null;
    arvoreBinaria0.retira(item1);
    ds.Item item3 = null;
    arvoreBinaria0.retira(item3);
    arvoreBinaria0.testa();
    arvoreBinaria0.testa();
    ds.Item item7 = null;
    arvoreBinaria0.insere(item7);

  }

}
