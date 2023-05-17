package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj14 = null;
    tabelaHash9.insere("", obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L+ "'", obj6.equals(10L));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.imprime();
    java.lang.Object obj8 = tabelaHash3.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash3.recuperaItens();
    tabelaHash3.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array13 = tabelaHash3.recuperaItens();
    java.lang.Object obj15 = tabelaHash3.pesquisa("hi!");
    java.lang.Object[] obj_array16 = tabelaHash3.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 'a'+ "'", obj15.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a'+ "'", obj14.equals('a'));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test37"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj25 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + ""+ "'", obj25.equals(""));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test38"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

}
