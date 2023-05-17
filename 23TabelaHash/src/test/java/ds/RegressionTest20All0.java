package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)"");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash9.retira("");
    java.lang.Object obj19 = null;
    tabelaHash9.insere("", obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash7.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj15 = tabelaHash7.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '4'+ "'", obj15.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!"+ "'", obj19.equals("hi!"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4'+ "'", obj8.equals('4'));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array16 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("", (java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
    java.lang.Object[] obj_array11 = tabelaHash8.recuperaItens();
    tabelaHash8.insere("hi!", (java.lang.Object)'4');
    tabelaHash8.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
    java.lang.Object[] obj_array11 = tabelaHash8.recuperaItens();
    java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
    java.lang.Object[] obj_array14 = tabelaHash8.recuperaItens();
    tabelaHash8.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash7.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj15 = tabelaHash7.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '4'+ "'", obj15.equals('4'));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array16 = tabelaHash9.recuperaItens();
    java.lang.Object obj18 = tabelaHash9.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'4');
    tabelaHash10.insere("hi!", (java.lang.Object)(short)(-1));
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
    java.lang.Object[] obj_array14 = tabelaHash11.recuperaItens();
    tabelaHash11.retira("");
    tabelaHash11.imprime();
    tabelaHash11.retira("hi!");
    java.lang.Object[] obj_array20 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array20);
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
    java.lang.Object[] obj_array26 = tabelaHash23.recuperaItens();
    tabelaHash23.retira("");
    java.lang.Object[] obj_array29 = tabelaHash23.recuperaItens();
    tabelaHash23.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash23);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash9.retira("");
    java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj17 = tabelaHash9.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array16 = tabelaHash9.recuperaItens();
    java.lang.Object[] obj_array17 = tabelaHash9.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash9.recuperaItens();
    tabelaHash9.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
    java.lang.Object[] obj_array20 = tabelaHash17.recuperaItens();
    tabelaHash17.retira("");
    java.lang.Object[] obj_array23 = tabelaHash17.recuperaItens();
    tabelaHash17.imprime();
    java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
    java.lang.Object[] obj_array27 = tabelaHash17.recuperaItens();
    java.lang.Object[] obj_array28 = tabelaHash17.recuperaItens();
    tabelaHash9.insere("", (java.lang.Object)obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test37"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
    java.lang.Object[] obj_array14 = tabelaHash11.recuperaItens();
    tabelaHash11.retira("");
    tabelaHash11.imprime();
    tabelaHash11.retira("hi!");
    java.lang.Object[] obj_array20 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array20);
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
    java.lang.Object[] obj_array26 = tabelaHash23.recuperaItens();
    tabelaHash23.retira("");
    java.lang.Object[] obj_array29 = tabelaHash23.recuperaItens();
    tabelaHash23.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash23);
    java.lang.Object[] obj_array32 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

}
