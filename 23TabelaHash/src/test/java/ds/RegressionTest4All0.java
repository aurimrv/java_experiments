package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + ""+ "'", obj5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ""+ "'", obj7.equals(""));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash0.insere("", (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
    tabelaHash0.insere("", obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + ""+ "'", obj17.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ""+ "'", obj7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash5.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("", (java.lang.Object)1L);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash5.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash5.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    java.lang.Object[] obj_array15 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object obj20 = tabelaHash17.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.insere("hi!", (java.lang.Object)"");
    tabelaHash22.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash22);
    java.lang.Object[] obj_array30 = tabelaHash17.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash5.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    tabelaHash0.retira("");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.insere("hi!", (java.lang.Object)"");
    tabelaHash12.imprime();
    java.lang.Object[] obj_array17 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ""+ "'", obj20.equals(""));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.insere("hi!", (java.lang.Object)"");
    tabelaHash12.imprime();
    java.lang.Object[] obj_array17 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("", (java.lang.Object)10L);
    tabelaHash5.insere("hi!", (java.lang.Object)(byte)100);
    tabelaHash5.retira("");
    tabelaHash5.imprime();
    java.lang.Object[] obj_array22 = tabelaHash5.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);
    java.lang.Object[] obj_array7 = tabelaHash5.recuperaItens();
    tabelaHash5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0.0f);
    tabelaHash0.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0d);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ""+ "'", obj7.equals(""));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ""+ "'", obj10.equals(""));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash5.insere("", (java.lang.Object)10L);
    tabelaHash5.insere("hi!", (java.lang.Object)(byte)100);
    tabelaHash5.retira("");
    java.lang.Object obj22 = tabelaHash5.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.insere("hi!", (java.lang.Object)"");
    tabelaHash12.insere("hi!", (java.lang.Object)0.0f);
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ""+ "'", obj20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + ""+ "'", obj9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.insere("hi!", (java.lang.Object)"");
    tabelaHash8.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash8.retira("hi!");
    tabelaHash8.insere("hi!", (java.lang.Object)100);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj22 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

}
