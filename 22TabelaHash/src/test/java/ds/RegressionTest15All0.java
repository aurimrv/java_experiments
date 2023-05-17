package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    tabelaHash0.imprime();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.imprime();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash8);
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.insere("hi!", (java.lang.Object)(short)100);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!"+ "'", obj18.equals("hi!"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    java.lang.Object obj17 = tabelaHash0.pesquisa("");
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)100.0d);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!"+ "'", obj11.equals("hi!"));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj8 = tabelaHash3.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash3.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash3);
    java.lang.Object obj13 = tabelaHash3.pesquisa("");
    tabelaHash3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!"+ "'", obj8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "hi!"+ "'", obj10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!"+ "'", obj5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!"+ "'", obj7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

}
