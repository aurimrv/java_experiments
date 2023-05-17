package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash4);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash4);
    tabelaHash4.insere("", (java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object obj8 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object obj12 = tabelaHash9.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object obj8 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array16 = tabelaHash5.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = null;
    tabelaHash0.insere("", obj5);
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
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash4);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    tabelaHash9.imprime();
    tabelaHash4.insere("hi!", (java.lang.Object)tabelaHash9);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.retira("hi!");
    tabelaHash9.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = null;
    tabelaHash0.insere("", obj5);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = new java.lang.Object();
    tabelaHash0.insere("", obj2);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("hi!");
    java.lang.Object obj16 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    java.lang.Object[] obj_array7 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("");
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

}
