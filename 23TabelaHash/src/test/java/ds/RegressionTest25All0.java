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
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash4.recuperaItens();
    java.lang.Object obj9 = tabelaHash4.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    tabelaHash4.imprime();
    java.lang.Object[] obj_array13 = tabelaHash4.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)'#');
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    tabelaHash4.retira("hi!");
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash0.insere("", (java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)10.0f);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    tabelaHash4.retira("");
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash4.insere("", (java.lang.Object)0L);
    tabelaHash4.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash4.insere("", (java.lang.Object)0L);
    tabelaHash4.insere("hi!", (java.lang.Object)0);
    java.lang.Object obj21 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.retira("hi!");
    java.lang.Object obj25 = tabelaHash4.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10L+ "'", obj21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L+ "'", obj25.equals(0L));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)tabelaHash13);
    tabelaHash13.retira("");
    java.lang.Object[] obj_array18 = tabelaHash13.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash4.insere("", (java.lang.Object)0L);
    tabelaHash4.insere("hi!", (java.lang.Object)0);
    tabelaHash4.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    tabelaHash4.imprime();
    java.lang.Object[] obj_array13 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    java.lang.Object[] obj_array20 = tabelaHash19.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash19);
    tabelaHash19.retira("");
    tabelaHash19.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash19.recuperaItens();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array29 = tabelaHash19.recuperaItens();
    java.lang.Object obj31 = tabelaHash19.pesquisa("hi!");
    tabelaHash4.insere("hi!", obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10L+ "'", obj31.equals(10L));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash4.insere("hi!", (java.lang.Object)obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object[] obj_array8 = tabelaHash7.recuperaItens();
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.retira("");
    tabelaHash7.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    java.lang.Object[] obj_array22 = tabelaHash21.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash21);
    tabelaHash17.imprime();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash17);
    tabelaHash17.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    java.lang.Object[] obj_array9 = tabelaHash4.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash4.insere("hi!", (java.lang.Object)tabelaHash8);
    tabelaHash8.retira("");
    java.lang.Object[] obj_array13 = tabelaHash8.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    tabelaHash4.imprime();
    java.lang.Object[] obj_array13 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash15);
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    tabelaHash4.imprime();
    java.lang.Object[] obj_array13 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash15);
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    java.lang.Object obj15 = tabelaHash4.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)10.0f);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0f+ "'", obj7.equals(10.0f));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.insere("", (java.lang.Object)(byte)1);
    tabelaHash4.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash4.insere("", (java.lang.Object)0L);
    tabelaHash4.insere("hi!", (java.lang.Object)0);
    java.lang.Object obj21 = tabelaHash4.pesquisa("hi!");
    java.lang.Object[] obj_array22 = tabelaHash4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10L+ "'", obj21.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    java.lang.Object[] obj_array14 = tabelaHash4.recuperaItens();
    java.lang.Object obj16 = tabelaHash4.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.retira("");
    tabelaHash4.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    tabelaHash4.insere("", (java.lang.Object)0L);
    tabelaHash4.insere("hi!", (java.lang.Object)0);
    java.lang.Object obj21 = null;
    tabelaHash4.insere("hi!", obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array8 = tabelaHash4.recuperaItens();
    java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object[] obj_array8 = tabelaHash7.recuperaItens();
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.retira("");
    tabelaHash7.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    java.lang.Object[] obj_array22 = tabelaHash21.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash21);
    tabelaHash17.imprime();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash17);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.retira("hi!");
    java.lang.Object[] obj_array30 = tabelaHash27.recuperaItens();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object[] obj_array8 = tabelaHash7.recuperaItens();
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj11 = tabelaHash7.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

}
