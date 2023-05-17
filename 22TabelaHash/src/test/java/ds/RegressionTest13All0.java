package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)true);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    tabelaHash0.insere("", (java.lang.Object)'4');

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)1);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
    tabelaHash5.insere("hi!", (java.lang.Object)(-1));
    tabelaHash5.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj15 = tabelaHash5.pesquisa("hi!");
    java.lang.Object obj17 = tabelaHash5.pesquisa("");
    tabelaHash0.insere("", obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1.0f));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    tabelaHash0.insere("", (java.lang.Object)'#');

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
    tabelaHash10.insere("hi!", (java.lang.Object)(-1));
    tabelaHash10.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj20 = tabelaHash10.pesquisa("hi!");
    tabelaHash10.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
    tabelaHash25.insere("hi!", (java.lang.Object)(-1));
    tabelaHash25.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj35 = tabelaHash25.pesquisa("hi!");
    tabelaHash10.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash10.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash0.insere("", (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1)+ "'", obj20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1)+ "'", obj35.equals((-1)));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)1);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)1);
    java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    tabelaHash0.insere("", (java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

}
