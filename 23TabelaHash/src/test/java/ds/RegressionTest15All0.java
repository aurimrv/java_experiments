package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash11.retira("hi!");
    tabelaHash11.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte)0+ "'", obj9.equals((byte)0));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array13 = tabelaHash9.recuperaItens();
    tabelaHash9.imprime();
    tabelaHash9.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte)0+ "'", obj9.equals((byte)0));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!"+ "'", obj12.equals("hi!"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    tabelaHash0.retira("");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)'#');
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
    tabelaHash19.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash14.insere("", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte)0+ "'", obj25.equals((byte)0));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)'#');
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array18 = tabelaHash14.recuperaItens();
    java.lang.Object obj20 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash9.insere("", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte)0+ "'", obj20.equals((byte)0));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)(-1L));
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "hi!"+ "'", obj12.equals("hi!"));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)'#');
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array9 = tabelaHash5.recuperaItens();
    java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
    tabelaHash5.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte)0+ "'", obj11.equals((byte)0));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)(-1L));
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)'#');
    tabelaHash0.insere("", (java.lang.Object)1.0d);
    tabelaHash0.imprime();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash6.retira("hi!");
    tabelaHash6.insere("", (java.lang.Object)(-1L));
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)1);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    java.lang.Object[] obj_array7 = tabelaHash6.recuperaItens();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array8);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)(-1L));
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test26"); }


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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array13 = tabelaHash9.recuperaItens();
    java.lang.Object obj15 = tabelaHash9.pesquisa("hi!");
    tabelaHash9.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash9.retira("");
    java.lang.Object obj22 = null;
    tabelaHash9.insere("", obj22);
    java.lang.Object[] obj_array24 = tabelaHash9.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash9.recuperaItens();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.retira("hi!");
    tabelaHash27.retira("hi!");
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.retira("hi!");
    tabelaHash33.retira("hi!");
    tabelaHash27.insere("", (java.lang.Object)"hi!");
    java.lang.Object[] obj_array39 = tabelaHash27.recuperaItens();
    tabelaHash9.insere("", (java.lang.Object)obj_array39);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash9);
    tabelaHash9.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte)0+ "'", obj15.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)'#');
    tabelaHash0.imprime();

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)(short)0);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)0+ "'", obj6.equals((byte)0));

  }

}
