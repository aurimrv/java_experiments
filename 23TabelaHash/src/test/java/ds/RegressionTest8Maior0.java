package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array3 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    java.lang.Object obj11 = tabelaHash8.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    java.lang.Object obj9 = tabelaHash7.pesquisa("");
    tabelaHash7.insere("hi!", (java.lang.Object)(byte)100);
    tabelaHash7.insere("", (java.lang.Object)false);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object obj3 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    tabelaHash0.insere("hi!", (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)10);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    tabelaHash0.insere("", (java.lang.Object)false);
    tabelaHash0.imprime();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false+ "'", obj11.equals(false));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8Maior0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

}
