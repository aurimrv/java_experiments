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
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)1+ "'", obj7.equals((byte)1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.insere("", (java.lang.Object)(byte)100);
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
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.imprime();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.insere("hi!", (java.lang.Object)false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)1);
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
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
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)0L);
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L+ "'", obj14.equals(0L));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array17 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false+ "'", obj12.equals(false));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object obj14 = null;
    tabelaHash11.insere("hi!", obj14);
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash13.imprime();
    tabelaHash13.retira("");
    java.lang.Object[] obj_array18 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object[] obj_array22 = tabelaHash13.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.retira("");
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)1);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = null;
    tabelaHash0.insere("hi!", obj3);
    tabelaHash0.insere("", (java.lang.Object)(byte)100);
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash2.imprime();
    tabelaHash2.imprime();
    tabelaHash2.retira("");
    java.lang.Object[] obj_array7 = tabelaHash2.recuperaItens();
    tabelaHash2.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)1);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    java.lang.Object[] obj_array12 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object[] obj_array15 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)10);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

}
