package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true+ "'", obj8.equals(true));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100);
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    java.lang.Object obj16 = null;
    tabelaHash0.insere("", obj16);
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10+ "'", obj19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true+ "'", obj21.equals(true));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10+ "'", obj16.equals(10));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    java.lang.Object obj16 = null;
    tabelaHash0.insere("", obj16);
    java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true+ "'", obj19.equals(true));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("hi!", (java.lang.Object)true);
    tabelaHash10.insere("", (java.lang.Object)10);
    java.lang.Object obj18 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", obj18);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10+ "'", obj8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10+ "'", obj18.equals(10));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash5.imprime();
    tabelaHash5.imprime();

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10+ "'", obj16.equals(10));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true+ "'", obj8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + true+ "'", obj10.equals(true));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)10);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)true);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)true);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + ' '+ "'", obj11.equals(' '));

  }

}
