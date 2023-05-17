package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0f+ "'", obj10.equals(10.0f));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    tabelaHash12.insere("", (java.lang.Object)1L);
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    tabelaHash12.insere("", (java.lang.Object)1L);
    java.lang.Object[] obj_array18 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10.0f+ "'", obj10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(short)0);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash7.insere("", (java.lang.Object)1L);
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array13);
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.retira("hi!");
    tabelaHash16.insere("", (java.lang.Object)1L);
    tabelaHash16.retira("");
    java.lang.Object[] obj_array24 = tabelaHash16.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash16.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0f+ "'", obj8.equals(10.0f));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj5 = null;
    tabelaHash0.insere("", obj5);
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash7.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj14 = tabelaHash7.pesquisa("");
    tabelaHash7.retira("");
    tabelaHash7.imprime();
    tabelaHash7.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)100);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)10);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash7.insere("", (java.lang.Object)1L);
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array13);
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)100);
    java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash7.insere("", (java.lang.Object)1L);
    tabelaHash7.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L+ "'", obj11.equals(1L));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj5 = null;
    tabelaHash0.insere("", obj5);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.retira("hi!");
    tabelaHash8.imprime();
    java.lang.Object obj13 = null;
    tabelaHash8.insere("", obj13);
    tabelaHash8.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)"");

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(byte)100);
    java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj22 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte)100+ "'", obj22.equals((byte)100));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.retira("hi!");
    tabelaHash11.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array17 = tabelaHash11.recuperaItens();
    java.lang.Object obj19 = tabelaHash11.pesquisa("");
    java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0f+ "'", obj21.equals(10.0f));

  }

}
