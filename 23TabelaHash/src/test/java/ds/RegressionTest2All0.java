package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object[] obj_array23 = tabelaHash13.recuperaItens();
    java.lang.Object obj25 = tabelaHash13.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)(short)10);
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
    tabelaHash11.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object obj24 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj28 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object obj24 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)true);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    java.lang.Object[] obj_array25 = tabelaHash24.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array25);
    java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10.0d+ "'", obj28.equals(10.0d));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object obj24 = null;
    tabelaHash0.insere("", obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d+ "'", obj16.equals(10.0d));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash13.imprime();
    java.lang.Object obj25 = tabelaHash13.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    java.lang.Object[] obj_array23 = tabelaHash13.recuperaItens();
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
    java.lang.Object obj29 = tabelaHash25.pesquisa("hi!");
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash25);
    java.lang.Object[] obj_array31 = tabelaHash13.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.insere("", (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object[] obj_array8 = tabelaHash7.recuperaItens();
    tabelaHash7.retira("");
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    tabelaHash7.retira("");
    tabelaHash7.imprime();
    tabelaHash7.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    java.lang.Object[] obj_array21 = tabelaHash20.recuperaItens();
    tabelaHash20.retira("");
    java.lang.Object obj25 = tabelaHash20.pesquisa("");
    tabelaHash20.retira("");
    tabelaHash20.imprime();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash20);
    java.lang.Object[] obj_array30 = tabelaHash20.recuperaItens();
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    java.lang.Object[] obj_array33 = tabelaHash32.recuperaItens();
    tabelaHash32.retira("");
    java.lang.Object obj37 = tabelaHash32.pesquisa("");
    tabelaHash32.retira("");
    tabelaHash32.imprime();
    tabelaHash32.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    java.lang.Object[] obj_array46 = tabelaHash45.recuperaItens();
    tabelaHash45.retira("");
    java.lang.Object obj50 = tabelaHash45.pesquisa("");
    tabelaHash45.retira("");
    tabelaHash45.imprime();
    tabelaHash32.insere("", (java.lang.Object)tabelaHash45);
    java.lang.Object[] obj_array55 = tabelaHash45.recuperaItens();
    tabelaHash20.insere("", (java.lang.Object)obj_array55);
    java.lang.Object[] obj_array57 = tabelaHash20.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)100.0d);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    java.lang.Object[] obj_array14 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash13.imprime();
    java.lang.Object obj25 = tabelaHash13.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)100.0f);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

}
