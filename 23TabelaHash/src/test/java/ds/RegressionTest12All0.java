package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)100.0d);
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    tabelaHash0.insere("", obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0d+ "'", obj16.equals(100.0d));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.imprime();
    java.lang.Object obj15 = tabelaHash11.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0d+ "'", obj9.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + ' '+ "'", obj6.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("", (java.lang.Object)' ');
    tabelaHash10.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.insere("", (java.lang.Object)0);
    tabelaHash0.imprime();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)' ');
    tabelaHash11.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
    tabelaHash11.retira("");
    java.lang.Object[] obj_array22 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array22);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)100.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.imprime();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0d+ "'", obj11.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array11 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash7.recuperaItens();
    tabelaHash7.retira("hi!");
    java.lang.Object[] obj_array15 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0d+ "'", obj9.equals(100.0d));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = null;
    tabelaHash0.insere("hi!", obj8);
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0d+ "'", obj11.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.insere("", (java.lang.Object)100.0d);
    java.lang.Object[] obj_array7 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj11 = null;
    tabelaHash3.insere("hi!", obj11);
    java.lang.Object obj14 = tabelaHash3.pesquisa("");
    java.lang.Object[] obj_array15 = tabelaHash3.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array15);
    java.lang.Object obj18 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100.0d+ "'", obj14.equals(100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array17 = tabelaHash13.recuperaItens();
    java.lang.Object[] obj_array18 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));

  }

}
