package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = null;
    tabelaHash0.insere("", obj4);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    // The following exception was thrown during execution in test generation
    try {
    tabelaHash0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("");
    tabelaHash11.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash11.imprime();
    java.lang.Object obj23 = null;
    tabelaHash11.insere("", obj23);
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj27 = tabelaHash11.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true+ "'", obj27.equals(true));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    java.lang.Object obj12 = null;
    tabelaHash0.insere("", obj12);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    java.lang.Object obj5 = tabelaHash3.pesquisa("");
    tabelaHash3.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash10);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object obj16 = tabelaHash14.pesquisa("");
    tabelaHash14.insere("", (java.lang.Object)true);
    tabelaHash14.insere("", (java.lang.Object)100.0f);
    tabelaHash10.insere("hi!", (java.lang.Object)100.0f);
    java.lang.Object obj25 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("");
    tabelaHash11.insere("", (java.lang.Object)true);
    tabelaHash11.insere("", (java.lang.Object)100.0f);
    tabelaHash7.insere("hi!", (java.lang.Object)100.0f);
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("");
    tabelaHash11.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash11.imprime();
    java.lang.Object obj23 = null;
    tabelaHash11.insere("", obj23);
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    tabelaHash11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("");
    tabelaHash9.insere("", (java.lang.Object)true);
    tabelaHash9.insere("", (java.lang.Object)100.0f);
    java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
    tabelaHash9.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    java.lang.Object obj27 = tabelaHash25.pesquisa("");
    java.lang.Object obj29 = null;
    tabelaHash25.insere("", obj29);
    java.lang.Object obj32 = tabelaHash25.pesquisa("hi!");
    tabelaHash9.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = null;
    tabelaHash0.insere("", obj4);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object obj6 = tabelaHash4.pesquisa("");
    tabelaHash4.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash4.insere("hi!", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    java.lang.Object obj17 = tabelaHash15.pesquisa("");
    tabelaHash15.insere("", (java.lang.Object)true);
    tabelaHash15.insere("", (java.lang.Object)100.0f);
    tabelaHash11.insere("hi!", (java.lang.Object)100.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    tabelaHash0.insere("", (java.lang.Object)100.0f);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object obj12 = tabelaHash10.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash17);
    tabelaHash10.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    java.lang.Object obj25 = tabelaHash23.pesquisa("");
    tabelaHash23.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash30);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)true);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    java.lang.Object obj12 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

}
