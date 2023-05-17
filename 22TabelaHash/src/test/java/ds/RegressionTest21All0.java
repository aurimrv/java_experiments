package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


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

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("hi!", (java.lang.Object)true);
    tabelaHash2.imprime();
    java.lang.Object obj9 = tabelaHash2.pesquisa("hi!");
    tabelaHash2.insere("hi!", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj8 = tabelaHash2.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true+ "'", obj8.equals(true));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("hi!", (java.lang.Object)true);
    tabelaHash2.imprime();
    java.lang.Object obj9 = tabelaHash2.pesquisa("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash13.insere("", (java.lang.Object)'4');
    java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
    tabelaHash13.insere("", (java.lang.Object)1.0d);
    tabelaHash2.insere("hi!", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)tabelaHash7);
    tabelaHash7.insere("hi!", (java.lang.Object)true);
    tabelaHash2.insere("hi!", (java.lang.Object)"hi!");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100.0f);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash11.insere("hi!", (java.lang.Object)true);
    tabelaHash11.imprime();
    java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true+ "'", obj18.equals(true));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    java.lang.Object obj5 = tabelaHash2.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object obj8 = tabelaHash5.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.insere("hi!", (java.lang.Object)true);
    tabelaHash10.imprime();
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash17.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash19.insere("hi!", (java.lang.Object)true);
    tabelaHash19.imprime();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash0.insere("", (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100.0f);
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash3.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("", (java.lang.Object)'4');
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash13.insere("", (java.lang.Object)'4');
    tabelaHash5.insere("", (java.lang.Object)'4');
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash20.insere("", (java.lang.Object)tabelaHash22);
    tabelaHash5.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("hi!", (java.lang.Object)(byte)100);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash11);
    java.lang.Object obj14 = tabelaHash9.pesquisa("");
    tabelaHash0.insere("hi!", obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

}
