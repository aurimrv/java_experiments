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


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test2"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test3"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = null;
    tabelaHash0.insere("", obj4);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test4"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test5"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.insere("hi!", (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test6"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

}
