package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.retira("");
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj13 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.insere("hi!", (java.lang.Object)100);
    tabelaHash0.insere("hi!", (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj9 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash11.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.insere("", (java.lang.Object)10L);
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash6.insere("hi!", (java.lang.Object)tabelaHash20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object[] obj_array11 = tabelaHash6.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("");
    tabelaHash6.insere("hi!", (java.lang.Object)(byte)10);
    tabelaHash6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.retira("");
    java.lang.Object obj13 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)1);
    java.lang.Object[] obj_array21 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.retira("");
    java.lang.Object obj13 = tabelaHash9.pesquisa("");
    java.lang.Object obj15 = tabelaHash9.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.retira("");
    java.lang.Object obj13 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash9.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.retira("");
    java.lang.Object obj13 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.retira("");
    java.lang.Object obj13 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array18 = tabelaHash9.recuperaItens();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.retira("");
    java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
    tabelaHash9.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.retira("");
    java.lang.Object[] obj_array10 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
    tabelaHash6.insere("", (java.lang.Object)'a');
    java.lang.Object[] obj_array14 = tabelaHash6.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj9 = tabelaHash6.pesquisa("");
    tabelaHash6.retira("hi!");
    java.lang.Object obj13 = tabelaHash6.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test33"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
    tabelaHash6.insere("", (java.lang.Object)'a');
    tabelaHash6.retira("");
    java.lang.Object[] obj_array16 = tabelaHash6.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test34"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
    tabelaHash6.insere("", (java.lang.Object)'a');
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.retira("");
    java.lang.Object obj19 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash21);
    java.lang.Object[] obj_array23 = tabelaHash21.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash21);
    java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test35"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.retira("");
    java.lang.Object obj9 = tabelaHash5.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)tabelaHash11);
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    java.lang.Object obj15 = tabelaHash11.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test36"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test37"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    java.lang.Object obj10 = tabelaHash6.pesquisa("");
    tabelaHash6.insere("hi!", (java.lang.Object)(byte)10);
    java.lang.Object obj15 = tabelaHash6.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (byte)10+ "'", obj15.equals((byte)10));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test38"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    tabelaHash0.imprime();

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test39"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(-1.0d));
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test40"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    tabelaHash0.insere("", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");

  }

}
