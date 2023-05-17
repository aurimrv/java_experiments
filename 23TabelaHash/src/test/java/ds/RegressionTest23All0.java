package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash9.retira("hi!");
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)1L);
    tabelaHash9.insere("", (java.lang.Object)(short)1);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.insere("", (java.lang.Object)(short)1);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash8.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash8.retira("hi!");
    tabelaHash8.retira("");
    java.lang.Object[] obj_array17 = tabelaHash8.recuperaItens();
    tabelaHash8.retira("");
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash9.retira("hi!");
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)1L);
    tabelaHash9.insere("", (java.lang.Object)(short)1);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array26 = tabelaHash0.recuperaItens();
    java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10L+ "'", obj28.equals(10L));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash9.retira("hi!");
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)1L);
    tabelaHash9.insere("", (java.lang.Object)(short)1);
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj25 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + ""+ "'", obj25.equals(""));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.retira("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = null;
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("", (java.lang.Object)10.0f);
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash9.retira("hi!");
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)1L);
    tabelaHash9.insere("", (java.lang.Object)(short)1);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)(short)1);
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    java.lang.Object[] obj_array29 = tabelaHash28.recuperaItens();
    tabelaHash28.retira("");
    java.lang.Object[] obj_array32 = tabelaHash28.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    java.lang.Object obj11 = tabelaHash8.pesquisa("");
    java.lang.Object obj13 = tabelaHash8.pesquisa("");
    java.lang.Object obj15 = tabelaHash8.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

}
