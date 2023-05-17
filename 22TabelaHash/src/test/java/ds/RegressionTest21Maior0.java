package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test1"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test2"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("", (java.lang.Object)'4');
    tabelaHash2.imprime();
    java.lang.Object obj9 = tabelaHash2.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4'+ "'", obj9.equals('4'));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test3"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("", (java.lang.Object)'4');
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.insere("", (java.lang.Object)'4');
    tabelaHash2.insere("", (java.lang.Object)'4');
    tabelaHash2.imprime();

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test4"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("hi!", (java.lang.Object)true);
    tabelaHash2.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash11.insere("hi!", (java.lang.Object)true);
    tabelaHash11.imprime();
    tabelaHash2.insere("hi!", (java.lang.Object)tabelaHash11);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test5"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("hi!", (java.lang.Object)true);
    tabelaHash2.imprime();
    java.lang.Object obj9 = tabelaHash2.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test6"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("", (java.lang.Object)'4');
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.insere("", (java.lang.Object)'4');
    tabelaHash2.insere("", (java.lang.Object)'4');
    java.lang.Object obj17 = tabelaHash2.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '4'+ "'", obj17.equals('4'));

  }

}
