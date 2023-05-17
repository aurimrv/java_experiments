package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
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
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
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
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object obj12 = null;
    tabelaHash10.insere("hi!", obj12);
    java.lang.Object obj15 = new java.lang.Object();
    tabelaHash10.insere("hi!", obj15);
    tabelaHash10.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj21 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)' ');
    tabelaHash0.imprime();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    java.lang.Object obj7 = null;
    tabelaHash5.insere("hi!", obj7);
    java.lang.Object obj10 = new java.lang.Object();
    tabelaHash5.insere("hi!", obj10);
    tabelaHash5.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj16 = tabelaHash5.pesquisa("");
    java.lang.Object obj18 = tabelaHash5.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    tabelaHash0.insere("", (java.lang.Object)0.0f);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    tabelaHash0.insere("", (java.lang.Object)0.0f);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object obj16 = null;
    tabelaHash14.insere("hi!", obj16);
    java.lang.Object obj19 = new java.lang.Object();
    tabelaHash14.insere("hi!", obj19);
    tabelaHash14.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj25 = tabelaHash14.pesquisa("hi!");
    tabelaHash0.insere("", obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)100.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)' ');
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
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
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
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
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    java.lang.Object obj4 = null;
    tabelaHash2.insere("hi!", obj4);
    java.lang.Object obj7 = new java.lang.Object();
    tabelaHash2.insere("hi!", obj7);
    tabelaHash2.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj13 = tabelaHash2.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!"+ "'", obj16.equals("hi!"));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    tabelaHash0.insere("hi!", (java.lang.Object)(-1L));
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = null;
    tabelaHash8.insere("hi!", obj10);
    java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)(short)1);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)1+ "'", obj8.equals((short)1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object obj15 = null;
    tabelaHash13.insere("hi!", obj15);
    java.lang.Object obj18 = new java.lang.Object();
    tabelaHash13.insere("hi!", obj18);
    tabelaHash13.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
    tabelaHash11.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);

  }

}
