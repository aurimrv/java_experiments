package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)100L);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)(-1));
    tabelaHash11.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)"hi!");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("", (java.lang.Object)(-1));
    java.lang.Object obj15 = new java.lang.Object();
    tabelaHash10.insere("", obj15);
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)100.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("", obj5);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)(-1));
    tabelaHash7.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)(-1));
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    tabelaHash14.insere("", (java.lang.Object)10);
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash7.insere("", (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (-1)+ "'", obj19.equals((-1)));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)(-1));
    tabelaHash7.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);
    java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
    tabelaHash7.insere("", (java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)100);
    tabelaHash0.insere("", (java.lang.Object)true);
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)(-1));
    tabelaHash7.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);
    java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.insere("", (java.lang.Object)(-1));
    tabelaHash16.insere("hi!", (java.lang.Object)(-1));
    tabelaHash16.insere("hi!", (java.lang.Object)10);
    tabelaHash7.insere("hi!", (java.lang.Object)10);
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)100);
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));

  }

}
