package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash0.insere("", (java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    java.lang.Object obj9 = tabelaHash5.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = tabelaHash8.pesquisa("");
    tabelaHash8.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object obj20 = tabelaHash18.pesquisa("");
    tabelaHash18.imprime();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    tabelaHash18.insere("", (java.lang.Object)tabelaHash23);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash27.insere("hi!", (java.lang.Object)tabelaHash30);
    tabelaHash18.insere("", (java.lang.Object)tabelaHash30);
    tabelaHash30.imprime();
    tabelaHash8.insere("hi!", (java.lang.Object)tabelaHash30);
    java.lang.Object obj36 = new java.lang.Object();
    tabelaHash30.insere("hi!", obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = tabelaHash8.pesquisa("");
    tabelaHash8.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    tabelaHash8.insere("", (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    java.lang.Object obj19 = tabelaHash17.pesquisa("");
    tabelaHash17.imprime();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    tabelaHash17.insere("", (java.lang.Object)tabelaHash22);
    tabelaHash9.insere("hi!", (java.lang.Object)tabelaHash17);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    java.lang.Object obj29 = tabelaHash27.pesquisa("");
    tabelaHash27.imprime();
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash32);
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash36.imprime();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash36.insere("hi!", (java.lang.Object)tabelaHash39);
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash39.imprime();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash39);
    tabelaHash5.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100);
    tabelaHash0.insere("", (java.lang.Object)'#');
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100+ "'", obj10.equals(100));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100);
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)0.0d);
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash5.imprime();
    tabelaHash5.insere("", (java.lang.Object)100);
    tabelaHash5.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    java.lang.Object obj16 = tabelaHash5.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100+ "'", obj16.equals(100));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.insere("hi!", (java.lang.Object)100.0d);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = tabelaHash8.pesquisa("");
    tabelaHash8.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
    tabelaHash8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

}
