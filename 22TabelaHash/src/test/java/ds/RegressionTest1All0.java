package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj10 = tabelaHash5.pesquisa("hi!");
    tabelaHash0.insere("hi!", obj10);
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1)+ "'", obj15.equals((-1)));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1.0f));
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.insere("", (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)0L);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1.0f));
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
    java.lang.Object obj20 = tabelaHash13.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (-1)+ "'", obj11.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1)+ "'", obj18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1)+ "'", obj20.equals((-1)));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1)+ "'", obj14.equals((-1)));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)100.0f);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
    java.lang.Object obj22 = tabelaHash15.pesquisa("");
    java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
    java.lang.Object obj26 = tabelaHash15.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1)+ "'", obj20.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (-1)+ "'", obj24.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (-1)+ "'", obj12.equals((-1)));

  }

}
