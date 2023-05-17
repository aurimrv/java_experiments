package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("", (java.lang.Object)'#');
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

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("", (java.lang.Object)'#');
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)10L);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("", (java.lang.Object)0L);
    java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
    tabelaHash10.imprime();
    java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
    tabelaHash0.insere("hi!", obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L+ "'", obj8.equals(0L));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("", (java.lang.Object)'#');
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)0L);
    java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
    java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("hi!", obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash7.insere("", (java.lang.Object)0);
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)0L);
    java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
    java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object obj20 = tabelaHash17.pesquisa("");
    tabelaHash8.insere("hi!", obj20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L+ "'", obj6.equals(0L));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L+ "'", obj8.equals(0L));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)0L);
    java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
    java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object obj20 = tabelaHash17.pesquisa("");
    tabelaHash8.insere("hi!", obj20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    java.lang.Object obj24 = tabelaHash8.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L+ "'", obj24.equals(0L));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("", (java.lang.Object)(short)10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0L);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("", (java.lang.Object)0L);
    java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
    java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object obj20 = tabelaHash17.pesquisa("");
    tabelaHash8.insere("hi!", obj20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    tabelaHash8.insere("", (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

}
