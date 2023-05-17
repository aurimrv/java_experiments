package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)(-1));
    tabelaHash8.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj16 = tabelaHash8.pesquisa("");
    tabelaHash8.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)(-1)+ "'", obj16.equals((short)(-1)));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("hi!", (java.lang.Object)(-1));
    tabelaHash7.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj16 = new java.lang.Object();
    tabelaHash7.insere("", obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("hi!", (java.lang.Object)(-1));
    tabelaHash7.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short)(-1)+ "'", obj9.equals((short)(-1)));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("hi!", (java.lang.Object)(-1));
    tabelaHash7.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj16 = tabelaHash7.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)(-1)+ "'", obj16.equals((short)(-1)));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)(-1));
    tabelaHash8.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj16 = tabelaHash8.pesquisa("");
    tabelaHash8.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)(-1)+ "'", obj16.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1)+ "'", obj22.equals((-1)));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("hi!", (java.lang.Object)(-1));
    tabelaHash7.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    tabelaHash0.insere("", obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)(-1)+ "'", obj8.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short)(-1)+ "'", obj13.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("hi!", (java.lang.Object)(-1));
    tabelaHash7.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1)+ "'", obj16.equals((-1)));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)(-1));
    tabelaHash8.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj16 = tabelaHash8.pesquisa("");
    tabelaHash8.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)(-1)+ "'", obj16.equals((short)(-1)));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)1.0f);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)(-1));
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (-1)+ "'", obj13.equals((-1)));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("hi!", (java.lang.Object)(-1));
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.insere("hi!", (java.lang.Object)(-1));
    tabelaHash21.insere("", (java.lang.Object)(short)(-1));
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash21);
    tabelaHash21.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash21);
    java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)(-1)+ "'", obj8.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1)+ "'", obj34.equals((-1)));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1));
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1)+ "'", obj8.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1)+ "'", obj10.equals((-1)));

  }

}
