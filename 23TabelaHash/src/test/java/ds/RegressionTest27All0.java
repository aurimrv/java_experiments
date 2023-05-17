package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10+ "'", obj7.equals(10));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.retira("hi!");
    tabelaHash6.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj17 = tabelaHash6.pesquisa("hi!");
    tabelaHash0.insere("", obj17);
    java.lang.Object obj20 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10+ "'", obj17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10+ "'", obj20.equals(10));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    java.lang.Object[] obj_array7 = tabelaHash6.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.retira("hi!");
    tabelaHash8.retira("hi!");
    java.lang.Object[] obj_array13 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array13);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10+ "'", obj8.equals(10));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10+ "'", obj11.equals(10));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)0.0d);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.retira("hi!");
    tabelaHash6.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)1L);
    tabelaHash6.insere("hi!", (java.lang.Object)(short)(-1));
    java.lang.Object[] obj_array19 = tabelaHash6.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array21 = tabelaHash6.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)0.0d);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    java.lang.Object obj14 = tabelaHash12.pesquisa("");
    tabelaHash12.imprime();
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("", (java.lang.Object)0);
    tabelaHash12.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("");

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10+ "'", obj14.equals(10));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test25"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.retira("hi!");
    tabelaHash6.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)1L);
    tabelaHash6.insere("hi!", (java.lang.Object)(short)(-1));
    java.lang.Object[] obj_array19 = tabelaHash6.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test26"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test27"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test28"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test29"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("hi!", (java.lang.Object)(short)(-1));
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array15 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test30"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array18 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)1L);
    java.lang.Object[] obj_array22 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test31"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test32"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.retira("hi!");
    tabelaHash8.insere("hi!", (java.lang.Object)10);
    java.lang.Object[] obj_array14 = tabelaHash8.recuperaItens();
    tabelaHash8.insere("hi!", (java.lang.Object)1L);
    java.lang.Object[] obj_array18 = tabelaHash8.recuperaItens();
    java.lang.Object obj20 = tabelaHash8.pesquisa("");
    java.lang.Object obj22 = tabelaHash8.pesquisa("hi!");
    java.lang.Object[] obj_array23 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10+ "'", obj22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

}
