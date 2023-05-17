package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)0.0f);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.retira("hi!");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("hi!", (java.lang.Object)"");
    tabelaHash5.insere("hi!", (java.lang.Object)0.0f);
    tabelaHash5.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test09"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + ""+ "'", obj8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ""+ "'", obj20.equals(""));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test11"); }


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

}
