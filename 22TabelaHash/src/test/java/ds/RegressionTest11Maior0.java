package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test1"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = new java.lang.Object();
    tabelaHash0.insere("", obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test2"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)100.0f);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test3"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test4"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    java.lang.Object obj5 = tabelaHash3.pesquisa("");
    java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test5"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test6"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test7"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test8"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test9"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

}
