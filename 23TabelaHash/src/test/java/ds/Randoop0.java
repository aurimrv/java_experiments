package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array15 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a'+ "'", obj14.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.imprime();
    java.lang.Object obj24 = tabelaHash19.pesquisa("");
    java.lang.Object[] obj_array25 = tabelaHash19.recuperaItens();
    tabelaHash19.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!"+ "'", obj31.equals("hi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.imprime();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash3.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object[] obj_array12 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array24 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash0.insere("", (java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.retira("hi!");
    java.lang.Object obj22 = tabelaHash16.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    java.lang.Object obj27 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj25 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj29 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + ""+ "'", obj25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + ""+ "'", obj29.equals(""));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array18 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array22 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array23 = tabelaHash14.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)obj_array23);
    tabelaHash7.imprime();
    java.lang.Object[] obj_array26 = tabelaHash7.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
    tabelaHash10.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.retira("");
    java.lang.Object[] obj_array15 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    tabelaHash11.retira("");
    tabelaHash11.retira("hi!");
    java.lang.Object[] obj_array21 = tabelaHash11.recuperaItens();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    java.lang.Object[] obj_array28 = tabelaHash26.recuperaItens();
    tabelaHash26.retira("hi!");
    java.lang.Object obj32 = tabelaHash26.pesquisa("");
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash26);
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash23);
    java.lang.Object[] obj_array35 = tabelaHash23.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash23);
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj14 = null;
    tabelaHash9.insere("", obj14);
    java.lang.Object obj17 = tabelaHash9.pesquisa("");
    java.lang.Object[] obj_array18 = tabelaHash9.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array18 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array22 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array23 = tabelaHash14.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)obj_array23);
    tabelaHash7.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1+ "'", obj13.equals(1));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    java.lang.Object[] obj_array24 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.retira("hi!");
    java.lang.Object obj22 = tabelaHash16.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false+ "'", obj27.equals(false));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    tabelaHash10.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("hi!");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    tabelaHash0.retira("hi!");
    java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array32 = tabelaHash0.recuperaItens();
    java.lang.Object obj34 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj23 = tabelaHash10.pesquisa("");
    java.lang.Object obj25 = tabelaHash10.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    tabelaHash27.retira("hi!");
    java.lang.Object[] obj_array31 = tabelaHash27.recuperaItens();
    tabelaHash27.retira("");
    java.lang.Object obj35 = tabelaHash27.pesquisa("hi!");
    ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
    tabelaHash37.imprime();
    java.lang.Object[] obj_array39 = tabelaHash37.recuperaItens();
    tabelaHash37.imprime();
    java.lang.Object obj42 = tabelaHash37.pesquisa("");
    java.lang.Object[] obj_array43 = tabelaHash37.recuperaItens();
    tabelaHash37.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array47 = tabelaHash37.recuperaItens();
    java.lang.Object obj49 = tabelaHash37.pesquisa("hi!");
    tabelaHash37.retira("hi!");
    tabelaHash27.insere("", (java.lang.Object)"hi!");
    java.lang.Object[] obj_array53 = tabelaHash27.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)obj_array53);
    tabelaHash10.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a'+ "'", obj25.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 'a'+ "'", obj49.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash22);
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    java.lang.Object[] obj_array28 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    java.lang.Object obj31 = tabelaHash26.pesquisa("");
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash33);
    tabelaHash15.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    tabelaHash38.imprime();
    tabelaHash38.insere("", (java.lang.Object)10L);
    java.lang.Object obj44 = tabelaHash38.pesquisa("");
    java.lang.Object[] obj_array45 = tabelaHash38.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash38);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 10L+ "'", obj44.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    java.lang.Object[] obj_array23 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    java.lang.Object obj37 = tabelaHash25.pesquisa("hi!");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object obj47 = tabelaHash43.pesquisa("");
    tabelaHash25.insere("", (java.lang.Object)"");
    java.lang.Object obj50 = tabelaHash25.pesquisa("");
    tabelaHash25.imprime();
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.imprime();
    java.lang.Object[] obj_array55 = tabelaHash53.recuperaItens();
    tabelaHash53.imprime();
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    java.lang.Object[] obj_array59 = tabelaHash53.recuperaItens();
    tabelaHash53.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array63 = tabelaHash53.recuperaItens();
    java.lang.Object[] obj_array64 = tabelaHash53.recuperaItens();
    tabelaHash25.insere("", (java.lang.Object)tabelaHash53);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 'a'+ "'", obj37.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj50 + "' != '" + ""+ "'", obj50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)obj_array19);
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array14 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    tabelaHash10.retira("hi!");
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    java.lang.Object obj24 = tabelaHash10.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash18.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash18.recuperaItens();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash18.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash11.insere("", (java.lang.Object)"hi!");
    tabelaHash11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash16.imprime();
    java.lang.Object obj25 = tabelaHash16.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash21);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    tabelaHash25.insere("hi!", (java.lang.Object)tabelaHash32);
    tabelaHash14.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash14.insere("", (java.lang.Object)10.0d);
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    tabelaHash15.retira("");
    java.lang.Object[] obj_array19 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    java.lang.Object[] obj_array23 = tabelaHash21.recuperaItens();
    tabelaHash21.imprime();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array28 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash7.recuperaItens();
    java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array17 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj27 = tabelaHash7.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj27);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L+ "'", obj6.equals(10L));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    java.lang.Object obj23 = null;
    tabelaHash15.insere("", obj23);
    tabelaHash0.insere("hi!", obj23);
    java.lang.Object[] obj_array26 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    java.lang.Object[] obj_array27 = tabelaHash26.recuperaItens();
    tabelaHash22.insere("hi!", (java.lang.Object)tabelaHash26);
    java.lang.Object obj30 = tabelaHash26.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash26.recuperaItens();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    java.lang.Object[] obj_array37 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    tabelaHash33.retira("hi!");
    java.lang.Object[] obj_array43 = tabelaHash33.recuperaItens();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash48.retira("hi!");
    java.lang.Object obj54 = tabelaHash48.pesquisa("");
    tabelaHash45.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash33.insere("hi!", (java.lang.Object)tabelaHash45);
    java.lang.Object[] obj_array57 = tabelaHash45.recuperaItens();
    tabelaHash26.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash45.imprime();
    tabelaHash12.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash4.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object obj63 = tabelaHash12.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("hi!");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array26 = tabelaHash12.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    tabelaHash14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj33 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj33);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    java.lang.Object[] obj_array6 = tabelaHash4.recuperaItens();
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    tabelaHash4.imprime();
    java.lang.Object obj12 = tabelaHash4.pesquisa("");
    tabelaHash0.insere("", obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array17);
    java.lang.Object[] obj_array19 = tabelaHash0.recuperaItens();
    java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj21);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash7.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    java.lang.Object[] obj_array20 = tabelaHash19.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash19);
    java.lang.Object obj23 = tabelaHash19.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    java.lang.Object[] obj_array30 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    tabelaHash26.retira("hi!");
    java.lang.Object[] obj_array36 = tabelaHash26.recuperaItens();
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    tabelaHash38.imprime();
    ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
    tabelaHash41.imprime();
    java.lang.Object[] obj_array43 = tabelaHash41.recuperaItens();
    tabelaHash41.retira("hi!");
    java.lang.Object obj47 = tabelaHash41.pesquisa("");
    tabelaHash38.insere("hi!", (java.lang.Object)tabelaHash41);
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash38);
    java.lang.Object[] obj_array50 = tabelaHash38.recuperaItens();
    tabelaHash19.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    java.lang.Object obj23 = null;
    tabelaHash15.insere("", obj23);
    tabelaHash0.insere("hi!", obj23);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj14 = null;
    tabelaHash9.insere("", obj14);
    java.lang.Object obj17 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.retira("");
    tabelaHash19.retira("");
    tabelaHash19.retira("hi!");
    java.lang.Object[] obj_array28 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    java.lang.Object[] obj_array32 = tabelaHash30.recuperaItens();
    java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
    java.lang.Object[] obj_array35 = tabelaHash30.recuperaItens();
    tabelaHash19.insere("hi!", (java.lang.Object)obj_array35);
    tabelaHash9.insere("", (java.lang.Object)obj_array35);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
    tabelaHash51.imprime();
    java.lang.Object[] obj_array53 = tabelaHash51.recuperaItens();
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    java.lang.Object[] obj_array56 = tabelaHash55.recuperaItens();
    tabelaHash51.insere("hi!", (java.lang.Object)tabelaHash55);
    java.lang.Object obj59 = tabelaHash55.pesquisa("hi!");
    tabelaHash55.imprime();
    tabelaHash39.insere("", (java.lang.Object)tabelaHash55);
    tabelaHash55.imprime();
    java.lang.Object[] obj_array63 = tabelaHash55.recuperaItens();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash55);
    java.lang.Object obj66 = tabelaHash9.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj66);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array29 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    tabelaHash6.insere("", (java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    java.lang.Object obj14 = null;
    tabelaHash0.insere("", obj14);
    java.lang.Object[] obj_array16 = tabelaHash0.recuperaItens();
    java.lang.Object obj18 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)(-1.0d));
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
    java.lang.Object[] obj_array20 = tabelaHash15.recuperaItens();
    java.lang.Object obj22 = tabelaHash15.pesquisa("");
    tabelaHash0.insere("", obj22);
    // The following exception was thrown during execution in test generation
    try {
      tabelaHash0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    java.lang.Object obj11 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    tabelaHash17.imprime();
    java.lang.Object obj22 = tabelaHash17.pesquisa("");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash24);
    tabelaHash17.imprime();
    tabelaHash17.imprime();
    tabelaHash17.retira("hi!");
    tabelaHash12.insere("", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    tabelaHash17.imprime();
    java.lang.Object obj22 = tabelaHash17.pesquisa("");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash24);
    tabelaHash17.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash7.recuperaItens();
    java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array17 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object[] obj_array26 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash13.retira("");
    tabelaHash13.imprime();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.imprime();
    java.lang.Object obj24 = tabelaHash19.pesquisa("");
    java.lang.Object[] obj_array25 = tabelaHash19.recuperaItens();
    java.lang.Object obj27 = tabelaHash19.pesquisa("");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.imprime();
    java.lang.Object obj34 = tabelaHash29.pesquisa("");
    java.lang.Object[] obj_array35 = tabelaHash29.recuperaItens();
    tabelaHash29.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array39 = tabelaHash29.recuperaItens();
    tabelaHash19.insere("", (java.lang.Object)tabelaHash29);
    tabelaHash13.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    java.lang.Object[] obj_array47 = tabelaHash45.recuperaItens();
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    java.lang.Object[] obj_array50 = tabelaHash49.recuperaItens();
    tabelaHash45.insere("hi!", (java.lang.Object)tabelaHash49);
    java.lang.Object[] obj_array52 = tabelaHash45.recuperaItens();
    tabelaHash45.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
    tabelaHash57.imprime();
    java.lang.Object[] obj_array59 = tabelaHash57.recuperaItens();
    ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
    java.lang.Object[] obj_array62 = tabelaHash61.recuperaItens();
    tabelaHash57.insere("hi!", (java.lang.Object)tabelaHash61);
    java.lang.Object obj65 = tabelaHash61.pesquisa("hi!");
    tabelaHash61.imprime();
    tabelaHash45.insere("", (java.lang.Object)tabelaHash61);
    tabelaHash61.imprime();
    java.lang.Object[] obj_array69 = tabelaHash61.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj11 = tabelaHash7.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    java.lang.Object[] obj_array21 = tabelaHash15.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)'a');
    tabelaHash15.imprime();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.retira("hi!");
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    tabelaHash31.retira("hi!");
    tabelaHash27.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash27.imprime();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash27);
    tabelaHash7.insere("", (java.lang.Object)tabelaHash15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array21 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    java.lang.Object[] obj_array25 = tabelaHash23.recuperaItens();
    tabelaHash23.retira("");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("hi!");
    java.lang.Object obj35 = tabelaHash29.pesquisa("");
    tabelaHash23.insere("", (java.lang.Object)tabelaHash29);
    tabelaHash23.imprime();
    tabelaHash10.insere("", (java.lang.Object)tabelaHash23);
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    java.lang.Object[] obj_array6 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    java.lang.Object obj9 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    java.lang.Object obj12 = tabelaHash4.pesquisa("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array24 = tabelaHash14.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.imprime();
    java.lang.Object[] obj_array28 = tabelaHash4.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array14 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array18 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array18);
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    java.lang.Object[] obj_array23 = tabelaHash21.recuperaItens();
    tabelaHash21.imprime();
    java.lang.Object obj26 = tabelaHash21.pesquisa("");
    java.lang.Object[] obj_array27 = tabelaHash21.recuperaItens();
    tabelaHash21.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array31 = tabelaHash21.recuperaItens();
    java.lang.Object obj33 = tabelaHash21.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a'+ "'", obj33.equals('a'));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array27);
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    tabelaHash30.retira("");
    java.lang.Object[] obj_array34 = tabelaHash30.recuperaItens();
    tabelaHash30.imprime();
    ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
    tabelaHash37.imprime();
    java.lang.Object[] obj_array39 = tabelaHash37.recuperaItens();
    tabelaHash37.imprime();
    java.lang.Object obj42 = tabelaHash37.pesquisa("");
    java.lang.Object[] obj_array43 = tabelaHash37.recuperaItens();
    java.lang.Object[] obj_array44 = tabelaHash37.recuperaItens();
    java.lang.Object obj46 = tabelaHash37.pesquisa("hi!");
    java.lang.Object[] obj_array47 = tabelaHash37.recuperaItens();
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    tabelaHash49.retira("");
    java.lang.Object[] obj_array53 = tabelaHash49.recuperaItens();
    tabelaHash37.insere("", (java.lang.Object)tabelaHash49);
    tabelaHash30.insere("hi!", (java.lang.Object)tabelaHash37);
    tabelaHash30.imprime();
    tabelaHash30.imprime();
    java.lang.Object obj59 = null;
    tabelaHash30.insere("", obj59);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash30);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array19 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    java.lang.Object[] obj_array23 = tabelaHash21.recuperaItens();
    tabelaHash21.retira("");
    tabelaHash21.retira("");
    java.lang.Object obj29 = tabelaHash21.pesquisa("");
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    java.lang.Object[] obj_array33 = tabelaHash31.recuperaItens();
    tabelaHash31.imprime();
    java.lang.Object obj36 = tabelaHash31.pesquisa("");
    java.lang.Object[] obj_array37 = tabelaHash31.recuperaItens();
    java.lang.Object[] obj_array38 = tabelaHash31.recuperaItens();
    tabelaHash21.insere("hi!", (java.lang.Object)obj_array38);
    java.lang.Object[] obj_array40 = tabelaHash21.recuperaItens();
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.imprime();
    java.lang.Object[] obj_array44 = tabelaHash42.recuperaItens();
    tabelaHash42.imprime();
    tabelaHash21.insere("hi!", (java.lang.Object)tabelaHash42);
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash48.imprime();
    java.lang.Object obj53 = tabelaHash48.pesquisa("");
    java.lang.Object[] obj_array54 = tabelaHash48.recuperaItens();
    java.lang.Object[] obj_array55 = tabelaHash48.recuperaItens();
    ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
    tabelaHash57.imprime();
    java.lang.Object[] obj_array59 = tabelaHash57.recuperaItens();
    tabelaHash48.insere("hi!", (java.lang.Object)tabelaHash57);
    java.lang.Object obj62 = null;
    tabelaHash57.insere("", obj62);
    tabelaHash42.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L+ "'", obj19.equals(10L));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    java.lang.Object[] obj_array22 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash24.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("", (java.lang.Object)"");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("hi!");
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash19);
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    java.lang.Object[] obj_array25 = tabelaHash23.recuperaItens();
    tabelaHash23.imprime();
    java.lang.Object obj28 = tabelaHash23.pesquisa("");
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash30);
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.imprime();
    tabelaHash35.insere("", (java.lang.Object)10L);
    java.lang.Object obj41 = tabelaHash35.pesquisa("");
    java.lang.Object[] obj_array42 = tabelaHash35.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash35);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10L+ "'", obj41.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array24 = tabelaHash12.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash12.recuperaItens();
    java.lang.Object obj27 = tabelaHash12.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.retira("");
    java.lang.Object[] obj_array24 = tabelaHash20.recuperaItens();
    tabelaHash20.imprime();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash27.recuperaItens();
    java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
    java.lang.Object[] obj_array37 = tabelaHash27.recuperaItens();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    java.lang.Object obj48 = tabelaHash20.pesquisa("hi!");
    tabelaHash20.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj48);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    java.lang.Object[] obj_array10 = tabelaHash8.recuperaItens();
    tabelaHash8.imprime();
    java.lang.Object obj13 = tabelaHash8.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    tabelaHash8.insere("hi!", (java.lang.Object)tabelaHash15);
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.imprime();
    java.lang.Object obj24 = tabelaHash19.pesquisa("");
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash19.insere("hi!", (java.lang.Object)tabelaHash26);
    tabelaHash8.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj31 = tabelaHash8.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.retira("");
    java.lang.Object[] obj_array24 = tabelaHash20.recuperaItens();
    tabelaHash20.imprime();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash27.recuperaItens();
    java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
    java.lang.Object[] obj_array37 = tabelaHash27.recuperaItens();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    java.lang.Object[] obj_array47 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array48 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    java.lang.Object[] obj_array34 = tabelaHash32.recuperaItens();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    java.lang.Object[] obj_array37 = tabelaHash36.recuperaItens();
    tabelaHash32.insere("hi!", (java.lang.Object)tabelaHash36);
    java.lang.Object[] obj_array39 = tabelaHash32.recuperaItens();
    tabelaHash32.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
    tabelaHash44.imprime();
    java.lang.Object[] obj_array46 = tabelaHash44.recuperaItens();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    java.lang.Object[] obj_array49 = tabelaHash48.recuperaItens();
    tabelaHash44.insere("hi!", (java.lang.Object)tabelaHash48);
    java.lang.Object obj52 = tabelaHash48.pesquisa("hi!");
    tabelaHash48.imprime();
    tabelaHash32.insere("", (java.lang.Object)tabelaHash48);
    tabelaHash48.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("");
    java.lang.Object obj19 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj19);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    tabelaHash15.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.retira("");
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    java.lang.Object[] obj_array33 = tabelaHash31.recuperaItens();
    tabelaHash31.retira("hi!");
    java.lang.Object obj37 = tabelaHash31.pesquisa("");
    tabelaHash25.insere("", (java.lang.Object)tabelaHash31);
    tabelaHash15.insere("", (java.lang.Object)tabelaHash25);
    ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
    tabelaHash41.imprime();
    java.lang.Object[] obj_array43 = tabelaHash41.recuperaItens();
    tabelaHash41.imprime();
    java.lang.Object obj46 = tabelaHash41.pesquisa("");
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    tabelaHash41.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash48.imprime();
    tabelaHash48.retira("");
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    tabelaHash55.imprime();
    tabelaHash55.retira("");
    java.lang.Object[] obj_array59 = tabelaHash55.recuperaItens();
    tabelaHash55.imprime();
    tabelaHash55.retira("");
    java.lang.Object[] obj_array63 = tabelaHash55.recuperaItens();
    java.lang.Object[] obj_array64 = tabelaHash55.recuperaItens();
    tabelaHash48.insere("hi!", (java.lang.Object)obj_array64);
    tabelaHash48.imprime();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj12 = null;
    tabelaHash6.insere("hi!", obj12);
    tabelaHash6.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array24 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash17);
    tabelaHash17.imprime();
    tabelaHash17.retira("");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash24.retira("");
    java.lang.Object[] obj_array28 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    tabelaHash24.retira("");
    java.lang.Object[] obj_array32 = tabelaHash24.recuperaItens();
    java.lang.Object[] obj_array33 = tabelaHash24.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)obj_array33);
    tabelaHash17.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash17);
    java.lang.Object[] obj_array37 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array27);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array32 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.retira("hi!");
    java.lang.Object obj22 = tabelaHash16.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    java.lang.Object[] obj_array28 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    java.lang.Object obj31 = tabelaHash26.pesquisa("");
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash33);
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
    tabelaHash40.imprime();
    tabelaHash40.retira("");
    java.lang.Object[] obj_array44 = tabelaHash40.recuperaItens();
    tabelaHash40.imprime();
    tabelaHash40.retira("");
    java.lang.Object[] obj_array48 = tabelaHash40.recuperaItens();
    java.lang.Object[] obj_array49 = tabelaHash40.recuperaItens();
    tabelaHash33.insere("hi!", (java.lang.Object)obj_array49);
    tabelaHash33.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash33);
    java.lang.Object[] obj_array53 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    java.lang.Object[] obj_array27 = tabelaHash26.recuperaItens();
    tabelaHash22.insere("hi!", (java.lang.Object)tabelaHash26);
    java.lang.Object obj30 = tabelaHash26.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash26.recuperaItens();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    java.lang.Object[] obj_array37 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    tabelaHash33.retira("hi!");
    java.lang.Object[] obj_array43 = tabelaHash33.recuperaItens();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash48.retira("hi!");
    java.lang.Object obj54 = tabelaHash48.pesquisa("");
    tabelaHash45.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash33.insere("hi!", (java.lang.Object)tabelaHash45);
    java.lang.Object[] obj_array57 = tabelaHash45.recuperaItens();
    tabelaHash26.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash45.imprime();
    tabelaHash12.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash4.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj14 = null;
    tabelaHash9.insere("", obj14);
    java.lang.Object obj17 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.retira("");
    tabelaHash19.retira("");
    tabelaHash19.retira("hi!");
    java.lang.Object[] obj_array28 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    java.lang.Object[] obj_array32 = tabelaHash30.recuperaItens();
    java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
    java.lang.Object[] obj_array35 = tabelaHash30.recuperaItens();
    tabelaHash19.insere("hi!", (java.lang.Object)obj_array35);
    tabelaHash9.insere("", (java.lang.Object)obj_array35);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash39.retira("");
    java.lang.Object[] obj_array49 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)(-1.0d));
    tabelaHash9.insere("hi!", (java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    java.lang.Object[] obj_array16 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array16);
    java.lang.Object obj19 = null;
    tabelaHash0.insere("", obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array32 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    java.lang.Object[] obj_array20 = tabelaHash19.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash19);
    java.lang.Object[] obj_array22 = tabelaHash15.recuperaItens();
    tabelaHash15.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array26 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.imprime();
    java.lang.Object[] obj_array30 = tabelaHash28.recuperaItens();
    tabelaHash28.retira("");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.retira("hi!");
    java.lang.Object obj40 = tabelaHash34.pesquisa("");
    tabelaHash28.insere("", (java.lang.Object)tabelaHash34);
    tabelaHash28.imprime();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash28);
    java.lang.Object[] obj_array44 = tabelaHash28.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.retira("hi!");
    java.lang.Object obj24 = tabelaHash18.pesquisa("");
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object[] obj_array26 = tabelaHash15.recuperaItens();
    java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj28);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("");
    tabelaHash29.retira("");
    java.lang.Object obj37 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    tabelaHash39.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj53 = tabelaHash39.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash39);
    ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
    tabelaHash56.imprime();
    java.lang.Object[] obj_array58 = tabelaHash56.recuperaItens();
    tabelaHash56.imprime();
    java.lang.Object obj61 = tabelaHash56.pesquisa("");
    java.lang.Object[] obj_array62 = tabelaHash56.recuperaItens();
    tabelaHash56.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array66 = tabelaHash56.recuperaItens();
    java.lang.Object obj68 = tabelaHash56.pesquisa("hi!");
    tabelaHash56.retira("hi!");
    java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
    tabelaHash56.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash56);
    tabelaHash56.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 'a'+ "'", obj68.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj72);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj31 = tabelaHash0.pesquisa("");
    java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash24.retira("");
    java.lang.Object[] obj_array28 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    tabelaHash24.retira("hi!");
    tabelaHash24.retira("hi!");
    java.lang.Object obj35 = tabelaHash24.pesquisa("");
    tabelaHash24.retira("");
    tabelaHash12.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object obj14 = null;
    tabelaHash9.insere("", obj14);
    java.lang.Object obj17 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.retira("");
    tabelaHash19.retira("");
    tabelaHash19.retira("hi!");
    java.lang.Object[] obj_array28 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    java.lang.Object[] obj_array32 = tabelaHash30.recuperaItens();
    java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
    java.lang.Object[] obj_array35 = tabelaHash30.recuperaItens();
    tabelaHash19.insere("hi!", (java.lang.Object)obj_array35);
    tabelaHash9.insere("", (java.lang.Object)obj_array35);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
    tabelaHash51.imprime();
    java.lang.Object[] obj_array53 = tabelaHash51.recuperaItens();
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    java.lang.Object[] obj_array56 = tabelaHash55.recuperaItens();
    tabelaHash51.insere("hi!", (java.lang.Object)tabelaHash55);
    java.lang.Object obj59 = tabelaHash55.pesquisa("hi!");
    tabelaHash55.imprime();
    tabelaHash39.insere("", (java.lang.Object)tabelaHash55);
    tabelaHash55.imprime();
    java.lang.Object[] obj_array63 = tabelaHash55.recuperaItens();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash55);
    java.lang.Object[] obj_array65 = tabelaHash55.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array18 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    tabelaHash14.imprime();
    tabelaHash14.imprime();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    tabelaHash23.insere("", (java.lang.Object)10L);
    tabelaHash14.insere("hi!", (java.lang.Object)10L);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    java.lang.Object[] obj_array32 = tabelaHash14.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array32);
    java.lang.Object[] obj_array34 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    java.lang.Object obj16 = tabelaHash12.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    java.lang.Object obj37 = tabelaHash25.pesquisa("hi!");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object obj47 = tabelaHash43.pesquisa("");
    tabelaHash25.insere("", (java.lang.Object)"");
    java.lang.Object obj50 = tabelaHash25.pesquisa("");
    tabelaHash25.imprime();
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.imprime();
    java.lang.Object[] obj_array55 = tabelaHash53.recuperaItens();
    tabelaHash53.imprime();
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    java.lang.Object[] obj_array59 = tabelaHash53.recuperaItens();
    tabelaHash53.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array63 = tabelaHash53.recuperaItens();
    java.lang.Object[] obj_array64 = tabelaHash53.recuperaItens();
    tabelaHash25.insere("", (java.lang.Object)tabelaHash53);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 'a'+ "'", obj37.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj50 + "' != '" + ""+ "'", obj50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    java.lang.Object[] obj_array22 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash24.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("", (java.lang.Object)"");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("hi!");
    java.lang.Object[] obj_array33 = tabelaHash12.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("");
    tabelaHash29.retira("");
    java.lang.Object obj37 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    tabelaHash39.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj53 = tabelaHash39.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash39);
    ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
    tabelaHash56.imprime();
    java.lang.Object[] obj_array58 = tabelaHash56.recuperaItens();
    tabelaHash56.imprime();
    java.lang.Object obj61 = tabelaHash56.pesquisa("");
    ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
    tabelaHash63.imprime();
    tabelaHash56.insere("hi!", (java.lang.Object)tabelaHash63);
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.imprime();
    java.lang.Object[] obj_array69 = tabelaHash67.recuperaItens();
    tabelaHash67.imprime();
    java.lang.Object obj72 = tabelaHash67.pesquisa("");
    ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
    tabelaHash74.imprime();
    tabelaHash67.insere("hi!", (java.lang.Object)tabelaHash74);
    tabelaHash56.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
    tabelaHash79.imprime();
    tabelaHash79.insere("", (java.lang.Object)10L);
    java.lang.Object obj85 = tabelaHash79.pesquisa("");
    java.lang.Object[] obj_array86 = tabelaHash79.recuperaItens();
    tabelaHash56.insere("hi!", (java.lang.Object)tabelaHash79);
    tabelaHash56.imprime();
    tabelaHash39.insere("", (java.lang.Object)tabelaHash56);
    java.lang.Object[] obj_array90 = tabelaHash56.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 10L+ "'", obj85.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array90);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    java.lang.Object[] obj_array18 = tabelaHash17.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash17);
    java.lang.Object[] obj_array20 = tabelaHash13.recuperaItens();
    java.lang.Object obj22 = tabelaHash13.pesquisa("");
    java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    java.lang.Object[] obj_array16 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array16);
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    java.lang.Object[] obj_array21 = tabelaHash20.recuperaItens();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    java.lang.Object[] obj_array25 = tabelaHash23.recuperaItens();
    tabelaHash23.imprime();
    java.lang.Object obj28 = tabelaHash23.pesquisa("");
    java.lang.Object[] obj_array29 = tabelaHash23.recuperaItens();
    tabelaHash23.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array33 = tabelaHash23.recuperaItens();
    java.lang.Object obj35 = tabelaHash23.pesquisa("hi!");
    java.lang.Object[] obj_array36 = tabelaHash23.recuperaItens();
    tabelaHash20.insere("hi!", (java.lang.Object)obj_array36);
    tabelaHash20.imprime();
    tabelaHash20.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 'a'+ "'", obj35.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object[] obj_array7 = tabelaHash5.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash5.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array12 = tabelaHash5.recuperaItens();
    tabelaHash5.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    java.lang.Object[] obj_array22 = tabelaHash21.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash21);
    java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
    tabelaHash21.imprime();
    tabelaHash5.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash21.imprime();
    java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash21.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array15 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    tabelaHash17.retira("hi!");
    java.lang.Object obj23 = tabelaHash17.pesquisa("");
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash17);
    tabelaHash14.imprime();
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    tabelaHash29.retira("");
    java.lang.Object[] obj_array33 = tabelaHash29.recuperaItens();
    tabelaHash29.imprime();
    tabelaHash29.retira("hi!");
    tabelaHash29.retira("hi!");
    java.lang.Object obj40 = tabelaHash29.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash16.retira("hi!");
    java.lang.Object[] obj_array25 = tabelaHash16.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash4.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.retira("");
    java.lang.Object[] obj_array15 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    tabelaHash11.retira("");
    tabelaHash11.retira("hi!");
    java.lang.Object[] obj_array21 = tabelaHash11.recuperaItens();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.imprime();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    java.lang.Object[] obj_array28 = tabelaHash26.recuperaItens();
    tabelaHash26.retira("hi!");
    java.lang.Object obj32 = tabelaHash26.pesquisa("");
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash26);
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash23);
    java.lang.Object[] obj_array35 = tabelaHash23.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash23);
    tabelaHash23.imprime();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash39.imprime();
    tabelaHash39.imprime();
    tabelaHash39.imprime();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    tabelaHash48.insere("", (java.lang.Object)10L);
    tabelaHash39.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array54 = tabelaHash39.recuperaItens();
    tabelaHash39.retira("");
    tabelaHash23.insere("", (java.lang.Object)tabelaHash39);
    java.lang.Object obj59 = tabelaHash23.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj59);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object obj15 = tabelaHash7.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("", (java.lang.Object)10L);
    tabelaHash14.retira("hi!");
    tabelaHash14.retira("hi!");
    java.lang.Object[] obj_array23 = tabelaHash14.recuperaItens();
    java.lang.Object obj25 = tabelaHash14.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    tabelaHash27.retira("");
    tabelaHash27.imprime();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    java.lang.Object obj38 = tabelaHash33.pesquisa("");
    java.lang.Object[] obj_array39 = tabelaHash33.recuperaItens();
    java.lang.Object obj41 = tabelaHash33.pesquisa("");
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    java.lang.Object[] obj_array45 = tabelaHash43.recuperaItens();
    tabelaHash43.imprime();
    java.lang.Object obj48 = tabelaHash43.pesquisa("");
    java.lang.Object[] obj_array49 = tabelaHash43.recuperaItens();
    tabelaHash43.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array53 = tabelaHash43.recuperaItens();
    tabelaHash33.insere("", (java.lang.Object)tabelaHash43);
    tabelaHash27.insere("", (java.lang.Object)tabelaHash33);
    tabelaHash27.imprime();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash27);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object[] obj_array12 = tabelaHash11.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash18.retira("");
    tabelaHash18.imprime();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    java.lang.Object[] obj_array30 = tabelaHash24.recuperaItens();
    java.lang.Object obj32 = tabelaHash24.pesquisa("");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.imprime();
    java.lang.Object obj39 = tabelaHash34.pesquisa("");
    java.lang.Object[] obj_array40 = tabelaHash34.recuperaItens();
    tabelaHash34.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array44 = tabelaHash34.recuperaItens();
    tabelaHash24.insere("", (java.lang.Object)tabelaHash34);
    tabelaHash18.insere("", (java.lang.Object)tabelaHash24);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash24);
    tabelaHash24.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj23 = tabelaHash10.pesquisa("");
    tabelaHash10.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.imprime();
    java.lang.Object[] obj_array23 = tabelaHash10.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("");
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    java.lang.Object[] obj_array7 = tabelaHash3.recuperaItens();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    tabelaHash3.retira("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("", (java.lang.Object)10L);
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object obj22 = tabelaHash14.pesquisa("");
    tabelaHash14.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L+ "'", obj22.equals(10L));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("");
    tabelaHash29.retira("");
    java.lang.Object obj37 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    tabelaHash39.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj53 = tabelaHash39.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash39);
    tabelaHash39.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array19 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash16.retira("hi!");
    java.lang.Object obj26 = tabelaHash16.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash3.insere("", (java.lang.Object)(byte)10);
    tabelaHash3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    tabelaHash4.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array20 = tabelaHash12.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    java.lang.Object[] obj_array23 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("");
    tabelaHash29.retira("");
    java.lang.Object obj37 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    tabelaHash39.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj53 = tabelaHash39.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash39);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.retira("hi!");
    java.lang.Object obj22 = tabelaHash16.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array26 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
    java.lang.Object[] obj_array20 = tabelaHash15.recuperaItens();
    java.lang.Object obj22 = tabelaHash15.pesquisa("");
    tabelaHash0.insere("", obj22);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array17 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    java.lang.Object[] obj_array19 = tabelaHash13.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)'a');
    tabelaHash13.imprime();
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    tabelaHash25.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array34 = tabelaHash25.recuperaItens();
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
    tabelaHash37.imprime();
    tabelaHash37.insere("", (java.lang.Object)10L);
    tabelaHash25.insere("", (java.lang.Object)"");
    tabelaHash13.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash4.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object[] obj_array12 = tabelaHash11.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash18.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash18);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.retira("");
    tabelaHash24.retira("");
    java.lang.Object obj32 = tabelaHash24.pesquisa("");
    tabelaHash18.insere("", obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object[] obj_array12 = tabelaHash11.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
    java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array29 = tabelaHash6.recuperaItens();
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    java.lang.Object[] obj_array33 = tabelaHash31.recuperaItens();
    tabelaHash31.imprime();
    java.lang.Object obj36 = tabelaHash31.pesquisa("");
    tabelaHash31.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array40 = tabelaHash31.recuperaItens();
    java.lang.Object[] obj_array41 = tabelaHash31.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    tabelaHash43.retira("");
    tabelaHash43.imprime();
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    java.lang.Object[] obj_array51 = tabelaHash49.recuperaItens();
    tabelaHash49.imprime();
    java.lang.Object obj54 = tabelaHash49.pesquisa("");
    java.lang.Object[] obj_array55 = tabelaHash49.recuperaItens();
    java.lang.Object obj57 = tabelaHash49.pesquisa("");
    ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
    tabelaHash59.imprime();
    java.lang.Object[] obj_array61 = tabelaHash59.recuperaItens();
    tabelaHash59.imprime();
    java.lang.Object obj64 = tabelaHash59.pesquisa("");
    java.lang.Object[] obj_array65 = tabelaHash59.recuperaItens();
    tabelaHash59.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array69 = tabelaHash59.recuperaItens();
    tabelaHash49.insere("", (java.lang.Object)tabelaHash59);
    tabelaHash43.insere("", (java.lang.Object)tabelaHash49);
    java.lang.Object obj73 = tabelaHash43.pesquisa("hi!");
    tabelaHash43.retira("hi!");
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash43);
    tabelaHash31.retira("hi!");
    tabelaHash6.insere("", (java.lang.Object)"hi!");
    tabelaHash6.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    java.lang.Object obj20 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj20);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    tabelaHash25.insere("hi!", (java.lang.Object)tabelaHash32);
    tabelaHash25.imprime();
    tabelaHash25.imprime();
    tabelaHash25.retira("hi!");
    java.lang.Object[] obj_array39 = tabelaHash25.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash25);
    java.lang.Object[] obj_array41 = tabelaHash25.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj25 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array27 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + ""+ "'", obj25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array27);
    java.lang.Object obj30 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj15);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array14 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array18 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array18);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.imprime();
    java.lang.Object obj27 = tabelaHash22.pesquisa("");
    tabelaHash22.insere("hi!", (java.lang.Object)false);
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L+ "'", obj6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10L+ "'", obj9.equals(10L));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash14.recuperaItens();
    java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array26 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array27 = tabelaHash14.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.imprime();
    java.lang.Object obj27 = tabelaHash22.pesquisa("");
    java.lang.Object[] obj_array28 = tabelaHash22.recuperaItens();
    java.lang.Object[] obj_array29 = tabelaHash22.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)obj_array29);
    java.lang.Object[] obj_array31 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash33);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    tabelaHash39.imprime();
    java.lang.Object obj44 = tabelaHash39.pesquisa("");
    java.lang.Object[] obj_array45 = tabelaHash39.recuperaItens();
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash48);
    java.lang.Object obj53 = null;
    tabelaHash48.insere("", obj53);
    tabelaHash33.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash33);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    tabelaHash19.retira("hi!");
    java.lang.Object[] obj_array29 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.retira("hi!");
    java.lang.Object obj40 = tabelaHash34.pesquisa("");
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash34);
    tabelaHash19.insere("hi!", (java.lang.Object)tabelaHash31);
    ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
    tabelaHash44.imprime();
    tabelaHash44.retira("");
    java.lang.Object[] obj_array48 = tabelaHash44.recuperaItens();
    tabelaHash44.imprime();
    tabelaHash44.retira("");
    tabelaHash44.retira("hi!");
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    tabelaHash55.imprime();
    tabelaHash55.insere("", (java.lang.Object)10L);
    tabelaHash44.insere("hi!", (java.lang.Object)tabelaHash55);
    tabelaHash19.insere("hi!", (java.lang.Object)tabelaHash44);
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    java.lang.Object[] obj_array22 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash24.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("", (java.lang.Object)"");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array31 = tabelaHash12.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    tabelaHash24.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array33 = tabelaHash24.recuperaItens();
    tabelaHash16.insere("", (java.lang.Object)obj_array33);
    tabelaHash16.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    tabelaHash8.retira("");
    java.lang.Object[] obj_array12 = tabelaHash8.recuperaItens();
    tabelaHash8.imprime();
    tabelaHash8.retira("");
    java.lang.Object[] obj_array16 = tabelaHash8.recuperaItens();
    java.lang.Object obj18 = tabelaHash8.pesquisa("");
    java.lang.Object obj20 = tabelaHash8.pesquisa("");
    java.lang.Object obj22 = null;
    tabelaHash8.insere("", obj22);
    java.lang.Object[] obj_array24 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash8);
    java.lang.Object[] obj_array26 = tabelaHash8.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array27);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array33 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    tabelaHash8.retira("");
    tabelaHash8.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash8);
    java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    java.lang.Object[] obj_array6 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    java.lang.Object obj9 = tabelaHash4.pesquisa("");
    tabelaHash4.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array13 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash4.recuperaItens();
    java.lang.Object[] obj_array15 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array15);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    tabelaHash18.insere("hi!", (java.lang.Object)tabelaHash25);
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.imprime();
    java.lang.Object obj34 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash36.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash36);
    tabelaHash18.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash18.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array43 = tabelaHash18.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array43);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)(byte)0);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    tabelaHash13.retira("");
    java.lang.Object[] obj_array17 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    tabelaHash13.retira("hi!");
    tabelaHash13.retira("hi!");
    java.lang.Object obj24 = tabelaHash13.pesquisa("");
    java.lang.Object[] obj_array25 = tabelaHash13.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    java.lang.Object[] obj_array16 = tabelaHash11.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array16);
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a'+ "'", obj24.equals('a'));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    java.lang.Object[] obj_array17 = tabelaHash16.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash16);
    java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
    tabelaHash16.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash16.imprime();
    tabelaHash16.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    java.lang.Object[] obj_array20 = tabelaHash19.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash19);
    java.lang.Object obj23 = tabelaHash19.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    java.lang.Object[] obj_array30 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    tabelaHash26.retira("hi!");
    java.lang.Object[] obj_array36 = tabelaHash26.recuperaItens();
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    tabelaHash38.imprime();
    ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
    tabelaHash41.imprime();
    java.lang.Object[] obj_array43 = tabelaHash41.recuperaItens();
    tabelaHash41.retira("hi!");
    java.lang.Object obj47 = tabelaHash41.pesquisa("");
    tabelaHash38.insere("hi!", (java.lang.Object)tabelaHash41);
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash38);
    java.lang.Object[] obj_array50 = tabelaHash38.recuperaItens();
    tabelaHash19.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash38.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1+ "'", obj13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    tabelaHash25.insere("hi!", (java.lang.Object)tabelaHash32);
    tabelaHash25.imprime();
    tabelaHash25.imprime();
    tabelaHash25.retira("hi!");
    java.lang.Object[] obj_array39 = tabelaHash25.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash25);
    java.lang.Object[] obj_array41 = tabelaHash13.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    java.lang.Object[] obj_array7 = tabelaHash6.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash9.imprime();
    java.lang.Object obj14 = tabelaHash9.pesquisa("");
    java.lang.Object[] obj_array15 = tabelaHash9.recuperaItens();
    tabelaHash9.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array19 = tabelaHash9.recuperaItens();
    java.lang.Object obj21 = tabelaHash9.pesquisa("hi!");
    java.lang.Object[] obj_array22 = tabelaHash9.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)obj_array22);
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array27 = tabelaHash6.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a'+ "'", obj21.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    java.lang.Object[] obj_array6 = tabelaHash4.recuperaItens();
    tabelaHash4.imprime();
    java.lang.Object obj9 = tabelaHash4.pesquisa("");
    java.lang.Object[] obj_array10 = tabelaHash4.recuperaItens();
    java.lang.Object obj12 = tabelaHash4.pesquisa("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array24 = tabelaHash14.recuperaItens();
    tabelaHash4.insere("", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object obj28 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    java.lang.Object[] obj_array18 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    java.lang.Object[] obj_array21 = tabelaHash20.recuperaItens();
    tabelaHash12.insere("", (java.lang.Object)obj_array21);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash12.insere("", (java.lang.Object)tabelaHash24);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.retira("");
    tabelaHash9.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    java.lang.Object[] obj_array21 = tabelaHash15.recuperaItens();
    java.lang.Object obj23 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash9.insere("", (java.lang.Object)tabelaHash15);
    java.lang.Object[] obj_array38 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    tabelaHash15.imprime();
    tabelaHash15.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    java.lang.Object[] obj_array7 = tabelaHash3.recuperaItens();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    tabelaHash3.retira("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("", (java.lang.Object)10L);
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object obj22 = tabelaHash14.pesquisa("");
    tabelaHash14.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10L+ "'", obj22.equals(10L));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.retira("");
    java.lang.Object[] obj_array24 = tabelaHash10.recuperaItens();
    java.lang.Object obj26 = tabelaHash10.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    java.lang.Object[] obj_array10 = tabelaHash8.recuperaItens();
    tabelaHash8.retira("");
    tabelaHash8.imprime();
    java.lang.Object[] obj_array14 = tabelaHash8.recuperaItens();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    java.lang.Object[] obj_array20 = tabelaHash16.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash16.recuperaItens();
    tabelaHash8.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    java.lang.Object obj11 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array12 = tabelaHash7.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object obj15 = tabelaHash7.pesquisa("");
    java.lang.Object obj17 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array18 = tabelaHash7.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    tabelaHash6.retira("");
    java.lang.Object[] obj_array10 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj16 = tabelaHash6.pesquisa("hi!");
    java.lang.Object obj18 = tabelaHash6.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array24 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false+ "'", obj12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    tabelaHash25.insere("hi!", (java.lang.Object)tabelaHash32);
    tabelaHash25.imprime();
    tabelaHash25.imprime();
    tabelaHash25.retira("hi!");
    java.lang.Object[] obj_array39 = tabelaHash25.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash25);
    tabelaHash13.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.retira("");
    java.lang.Object[] obj_array24 = tabelaHash20.recuperaItens();
    tabelaHash20.imprime();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash27.recuperaItens();
    java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
    java.lang.Object[] obj_array37 = tabelaHash27.recuperaItens();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    tabelaHash20.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    java.lang.Object obj20 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    java.lang.Object[] obj_array27 = tabelaHash26.recuperaItens();
    tabelaHash22.insere("hi!", (java.lang.Object)tabelaHash26);
    java.lang.Object[] obj_array29 = tabelaHash22.recuperaItens();
    tabelaHash22.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    java.lang.Object[] obj_array39 = tabelaHash38.recuperaItens();
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash38);
    java.lang.Object obj42 = tabelaHash38.pesquisa("hi!");
    tabelaHash38.imprime();
    tabelaHash22.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash38.imprime();
    java.lang.Object[] obj_array46 = tabelaHash38.recuperaItens();
    tabelaHash12.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash3.insere("", (java.lang.Object)(byte)10);
    java.lang.Object[] obj_array14 = tabelaHash3.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.imprime();
    java.lang.Object obj27 = tabelaHash22.pesquisa("");
    java.lang.Object[] obj_array28 = tabelaHash22.recuperaItens();
    java.lang.Object[] obj_array29 = tabelaHash22.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)obj_array29);
    java.lang.Object[] obj_array31 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash33);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    tabelaHash39.imprime();
    java.lang.Object obj44 = tabelaHash39.pesquisa("");
    java.lang.Object[] obj_array45 = tabelaHash39.recuperaItens();
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash48);
    java.lang.Object obj53 = null;
    tabelaHash48.insere("", obj53);
    tabelaHash33.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash33);
    java.lang.Object[] obj_array57 = tabelaHash33.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj14);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash7.recuperaItens();
    java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array17 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.imprime();
    java.lang.Object obj29 = tabelaHash7.pesquisa("");
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj29);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash14.recuperaItens();
    java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    java.lang.Object obj31 = tabelaHash27.pesquisa("hi!");
    tabelaHash27.imprime();
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    java.lang.Object[] obj_array39 = tabelaHash38.recuperaItens();
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash38);
    java.lang.Object obj42 = tabelaHash38.pesquisa("hi!");
    tabelaHash27.insere("", (java.lang.Object)tabelaHash38);
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    tabelaHash45.retira("");
    tabelaHash27.insere("hi!", (java.lang.Object)tabelaHash45);
    java.lang.Object[] obj_array50 = tabelaHash45.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash45);
    java.lang.Object[] obj_array52 = tabelaHash45.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash12.retira("");
    tabelaHash12.insere("", (java.lang.Object)(byte)1);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    java.lang.Object[] obj_array29 = tabelaHash28.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash28);
    tabelaHash28.retira("");
    java.lang.Object[] obj_array33 = tabelaHash28.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash18.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash18.recuperaItens();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash18.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash11.insere("", (java.lang.Object)"hi!");
    java.lang.Object[] obj_array32 = tabelaHash11.recuperaItens();
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.retira("");
    tabelaHash34.retira("");
    tabelaHash34.retira("hi!");
    java.lang.Object[] obj_array43 = tabelaHash34.recuperaItens();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    java.lang.Object[] obj_array47 = tabelaHash45.recuperaItens();
    java.lang.Object obj49 = tabelaHash45.pesquisa("hi!");
    java.lang.Object[] obj_array50 = tabelaHash45.recuperaItens();
    tabelaHash34.insere("hi!", (java.lang.Object)obj_array50);
    java.lang.Object[] obj_array52 = tabelaHash34.recuperaItens();
    tabelaHash34.retira("");
    tabelaHash34.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash18.recuperaItens();
    java.lang.Object obj26 = tabelaHash18.pesquisa("");
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.imprime();
    java.lang.Object[] obj_array30 = tabelaHash28.recuperaItens();
    tabelaHash28.imprime();
    java.lang.Object obj33 = tabelaHash28.pesquisa("");
    java.lang.Object[] obj_array34 = tabelaHash28.recuperaItens();
    tabelaHash28.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array38 = tabelaHash28.recuperaItens();
    tabelaHash18.insere("", (java.lang.Object)tabelaHash28);
    tabelaHash12.insere("", (java.lang.Object)tabelaHash18);
    java.lang.Object obj42 = tabelaHash12.pesquisa("hi!");
    tabelaHash12.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("");
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("hi!");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    tabelaHash27.insere("hi!", (java.lang.Object)'a');
    tabelaHash27.imprime();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    tabelaHash39.imprime();
    java.lang.Object obj44 = tabelaHash39.pesquisa("");
    tabelaHash39.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array48 = tabelaHash39.recuperaItens();
    java.lang.Object[] obj_array49 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
    tabelaHash51.imprime();
    tabelaHash51.insere("", (java.lang.Object)10L);
    tabelaHash39.insere("", (java.lang.Object)"");
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash12.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
    java.lang.Object[] obj_array20 = tabelaHash15.recuperaItens();
    java.lang.Object obj22 = tabelaHash15.pesquisa("");
    tabelaHash0.insere("", obj22);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.retira("");
    tabelaHash25.imprime();
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    tabelaHash25.retira("");
    tabelaHash0.insere("", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.retira("");
    tabelaHash14.retira("");
    java.lang.Object obj22 = tabelaHash14.pesquisa("");
    tabelaHash14.retira("");
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    java.lang.Object[] obj_array30 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    tabelaHash26.imprime();
    tabelaHash26.imprime();
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.imprime();
    tabelaHash35.insere("", (java.lang.Object)10L);
    tabelaHash26.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array41 = tabelaHash26.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)obj_array41);
    java.lang.Object obj44 = tabelaHash14.pesquisa("");
    tabelaHash0.insere("hi!", obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash29.imprime();
    java.lang.Object[] obj_array31 = tabelaHash29.recuperaItens();
    tabelaHash29.retira("");
    tabelaHash29.retira("");
    java.lang.Object obj37 = tabelaHash29.pesquisa("");
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    java.lang.Object[] obj_array44 = tabelaHash43.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash43);
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    tabelaHash39.insere("", (java.lang.Object)1);
    tabelaHash39.imprime();
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj53 = tabelaHash39.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash39);
    java.lang.Object obj56 = tabelaHash39.pesquisa("hi!");
    java.lang.Object obj58 = tabelaHash39.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test286"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash14.recuperaItens();
    java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    java.lang.Object[] obj_array36 = tabelaHash35.recuperaItens();
    tabelaHash27.insere("", (java.lang.Object)obj_array36);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash39);
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    java.lang.Object[] obj_array45 = tabelaHash43.recuperaItens();
    tabelaHash43.imprime();
    java.lang.Object obj48 = tabelaHash43.pesquisa("");
    java.lang.Object[] obj_array49 = tabelaHash43.recuperaItens();
    java.lang.Object[] obj_array50 = tabelaHash43.recuperaItens();
    java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
    tabelaHash39.insere("", obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test287"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.imprime();
    java.lang.Object obj39 = tabelaHash34.pesquisa("");
    tabelaHash34.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
    tabelaHash44.imprime();
    java.lang.Object[] obj_array46 = tabelaHash44.recuperaItens();
    tabelaHash44.retira("");
    ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
    tabelaHash50.imprime();
    java.lang.Object[] obj_array52 = tabelaHash50.recuperaItens();
    tabelaHash50.retira("hi!");
    java.lang.Object obj56 = tabelaHash50.pesquisa("");
    tabelaHash44.insere("", (java.lang.Object)tabelaHash50);
    tabelaHash34.insere("", (java.lang.Object)tabelaHash44);
    ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
    tabelaHash60.imprime();
    java.lang.Object[] obj_array62 = tabelaHash60.recuperaItens();
    tabelaHash60.imprime();
    java.lang.Object obj65 = tabelaHash60.pesquisa("");
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.imprime();
    tabelaHash60.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash67.imprime();
    tabelaHash67.retira("");
    ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array78 = tabelaHash74.recuperaItens();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array82 = tabelaHash74.recuperaItens();
    java.lang.Object[] obj_array83 = tabelaHash74.recuperaItens();
    tabelaHash67.insere("hi!", (java.lang.Object)obj_array83);
    tabelaHash67.imprime();
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash67);
    java.lang.Object obj89 = null;
    tabelaHash67.insere("", obj89);
    tabelaHash67.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array83);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test288"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    java.lang.Object[] obj_array7 = tabelaHash3.recuperaItens();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    tabelaHash3.retira("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("", (java.lang.Object)10L);
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.retira("");
    tabelaHash24.retira("");
    java.lang.Object obj32 = tabelaHash24.pesquisa("");
    tabelaHash24.retira("");
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash36.imprime();
    tabelaHash36.retira("");
    java.lang.Object[] obj_array40 = tabelaHash36.recuperaItens();
    tabelaHash36.imprime();
    tabelaHash36.imprime();
    tabelaHash36.imprime();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    tabelaHash45.insere("", (java.lang.Object)10L);
    tabelaHash36.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array51 = tabelaHash36.recuperaItens();
    tabelaHash24.insere("hi!", (java.lang.Object)obj_array51);
    tabelaHash14.insere("", (java.lang.Object)obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test289"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test290"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object obj12 = tabelaHash0.pesquisa("");
    java.lang.Object obj14 = null;
    tabelaHash0.insere("", obj14);
    java.lang.Object[] obj_array16 = tabelaHash0.recuperaItens();
    // The following exception was thrown during execution in test generation
    try {
      tabelaHash0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test291"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    java.lang.Object obj23 = null;
    tabelaHash15.insere("", obj23);
    tabelaHash0.insere("hi!", obj23);
    java.lang.Object obj27 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test292"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test293"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
    java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test294"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array5 = tabelaHash0.recuperaItens();
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash9.imprime();
    java.lang.Object obj14 = tabelaHash9.pesquisa("");
    tabelaHash9.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.retira("");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.retira("hi!");
    java.lang.Object obj31 = tabelaHash25.pesquisa("");
    tabelaHash19.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash9.insere("", (java.lang.Object)tabelaHash19);
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.imprime();
    java.lang.Object[] obj_array37 = tabelaHash35.recuperaItens();
    tabelaHash35.imprime();
    java.lang.Object obj40 = tabelaHash35.pesquisa("");
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.imprime();
    tabelaHash35.insere("hi!", (java.lang.Object)tabelaHash42);
    tabelaHash42.imprime();
    tabelaHash42.retira("");
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    tabelaHash49.retira("");
    java.lang.Object[] obj_array53 = tabelaHash49.recuperaItens();
    tabelaHash49.imprime();
    tabelaHash49.retira("");
    java.lang.Object[] obj_array57 = tabelaHash49.recuperaItens();
    java.lang.Object[] obj_array58 = tabelaHash49.recuperaItens();
    tabelaHash42.insere("hi!", (java.lang.Object)obj_array58);
    tabelaHash42.imprime();
    tabelaHash9.insere("hi!", (java.lang.Object)tabelaHash42);
    java.lang.Object[] obj_array62 = tabelaHash42.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test295"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test296"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test297"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    tabelaHash15.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array24 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    tabelaHash15.retira("");
    java.lang.Object obj30 = tabelaHash15.pesquisa("");
    java.lang.Object obj32 = tabelaHash15.pesquisa("hi!");
    tabelaHash0.insere("", obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test298"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object obj15 = tabelaHash7.pesquisa("");
    tabelaHash7.retira("hi!");
    java.lang.Object obj19 = tabelaHash7.pesquisa("hi!");
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.retira("");
    java.lang.Object[] obj_array25 = tabelaHash21.recuperaItens();
    tabelaHash21.imprime();
    tabelaHash21.imprime();
    tabelaHash21.imprime();
    ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
    tabelaHash30.imprime();
    tabelaHash30.insere("", (java.lang.Object)10L);
    tabelaHash21.insere("hi!", (java.lang.Object)10L);
    tabelaHash21.retira("");
    tabelaHash21.imprime();
    java.lang.Object[] obj_array39 = tabelaHash21.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)obj_array39);
    tabelaHash0.insere("", (java.lang.Object)obj_array39);
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    tabelaHash43.retira("");
    java.lang.Object[] obj_array47 = tabelaHash43.recuperaItens();
    tabelaHash43.imprime();
    tabelaHash43.retira("");
    tabelaHash43.retira("hi!");
    java.lang.Object[] obj_array53 = tabelaHash43.recuperaItens();
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    tabelaHash55.imprime();
    ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
    tabelaHash58.imprime();
    java.lang.Object[] obj_array60 = tabelaHash58.recuperaItens();
    tabelaHash58.retira("hi!");
    java.lang.Object obj64 = tabelaHash58.pesquisa("");
    tabelaHash55.insere("hi!", (java.lang.Object)tabelaHash58);
    tabelaHash43.insere("hi!", (java.lang.Object)tabelaHash55);
    java.lang.Object[] obj_array67 = tabelaHash55.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test299"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array33 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test300"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    tabelaHash4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test301"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.retira("");
    tabelaHash14.retira("");
    java.lang.Object obj22 = tabelaHash14.pesquisa("");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    java.lang.Object[] obj_array30 = tabelaHash24.recuperaItens();
    java.lang.Object[] obj_array31 = tabelaHash24.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)obj_array31);
    java.lang.Object obj34 = tabelaHash14.pesquisa("hi!");
    tabelaHash0.insere("hi!", obj34);
    java.lang.Object obj37 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test302"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array29 = tabelaHash6.recuperaItens();
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    java.lang.Object[] obj_array33 = tabelaHash31.recuperaItens();
    tabelaHash31.imprime();
    java.lang.Object obj36 = tabelaHash31.pesquisa("");
    tabelaHash31.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array40 = tabelaHash31.recuperaItens();
    java.lang.Object[] obj_array41 = tabelaHash31.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    tabelaHash43.retira("");
    tabelaHash43.imprime();
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    java.lang.Object[] obj_array51 = tabelaHash49.recuperaItens();
    tabelaHash49.imprime();
    java.lang.Object obj54 = tabelaHash49.pesquisa("");
    java.lang.Object[] obj_array55 = tabelaHash49.recuperaItens();
    java.lang.Object obj57 = tabelaHash49.pesquisa("");
    ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
    tabelaHash59.imprime();
    java.lang.Object[] obj_array61 = tabelaHash59.recuperaItens();
    tabelaHash59.imprime();
    java.lang.Object obj64 = tabelaHash59.pesquisa("");
    java.lang.Object[] obj_array65 = tabelaHash59.recuperaItens();
    tabelaHash59.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array69 = tabelaHash59.recuperaItens();
    tabelaHash49.insere("", (java.lang.Object)tabelaHash59);
    tabelaHash43.insere("", (java.lang.Object)tabelaHash49);
    java.lang.Object obj73 = tabelaHash43.pesquisa("hi!");
    tabelaHash43.retira("hi!");
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash43);
    tabelaHash31.retira("hi!");
    tabelaHash6.insere("", (java.lang.Object)"hi!");
    java.lang.Object obj81 = tabelaHash6.pesquisa("hi!");
    ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
    tabelaHash83.imprime();
    java.lang.Object[] obj_array85 = tabelaHash83.recuperaItens();
    tabelaHash83.imprime();
    java.lang.Object obj88 = tabelaHash83.pesquisa("");
    java.lang.Object[] obj_array89 = tabelaHash83.recuperaItens();
    java.lang.Object[] obj_array90 = tabelaHash83.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)tabelaHash83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array90);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test303"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash14.recuperaItens();
    java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array26 = tabelaHash14.recuperaItens();
    java.lang.Object obj28 = tabelaHash14.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test304"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test305"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)(-1.0d));
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test306"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test307"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.retira("hi!");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    java.lang.Object[] obj_array21 = tabelaHash15.recuperaItens();
    java.lang.Object obj23 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    tabelaHash15.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash15);
    java.lang.Object obj39 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.imprime();
    java.lang.Object[] obj_array44 = tabelaHash42.recuperaItens();
    tabelaHash42.retira("");
    tabelaHash42.retira("");
    java.lang.Object obj50 = tabelaHash42.pesquisa("");
    tabelaHash42.retira("");
    ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
    tabelaHash54.imprime();
    tabelaHash54.retira("");
    java.lang.Object[] obj_array58 = tabelaHash54.recuperaItens();
    tabelaHash54.imprime();
    tabelaHash54.imprime();
    tabelaHash54.imprime();
    ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
    tabelaHash63.imprime();
    tabelaHash63.insere("", (java.lang.Object)10L);
    tabelaHash54.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array69 = tabelaHash54.recuperaItens();
    tabelaHash42.insere("hi!", (java.lang.Object)obj_array69);
    java.lang.Object obj72 = tabelaHash42.pesquisa("");
    java.lang.Object[] obj_array73 = tabelaHash42.recuperaItens();
    tabelaHash11.insere("", (java.lang.Object)obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test308"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array18 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    java.lang.Object[] obj_array22 = tabelaHash20.recuperaItens();
    java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
    tabelaHash20.imprime();
    tabelaHash20.imprime();
    java.lang.Object obj28 = tabelaHash20.pesquisa("");
    java.lang.Object[] obj_array29 = tabelaHash20.recuperaItens();
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.retira("hi!");
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.imprime();
    java.lang.Object[] obj_array37 = tabelaHash35.recuperaItens();
    tabelaHash35.imprime();
    java.lang.Object obj40 = tabelaHash35.pesquisa("");
    java.lang.Object[] obj_array41 = tabelaHash35.recuperaItens();
    java.lang.Object obj43 = tabelaHash35.pesquisa("");
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    java.lang.Object[] obj_array47 = tabelaHash45.recuperaItens();
    tabelaHash45.imprime();
    java.lang.Object obj50 = tabelaHash45.pesquisa("");
    java.lang.Object[] obj_array51 = tabelaHash45.recuperaItens();
    tabelaHash45.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array55 = tabelaHash45.recuperaItens();
    tabelaHash35.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash35);
    java.lang.Object obj59 = tabelaHash31.pesquisa("hi!");
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash31);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj59);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test309"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash18.recuperaItens();
    java.lang.Object[] obj_array25 = tabelaHash18.recuperaItens();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash18.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash11.insere("", (java.lang.Object)"hi!");
    java.lang.Object obj33 = tabelaHash11.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10L+ "'", obj33.equals(10L));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test310"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.imprime();
    java.lang.Object obj39 = tabelaHash34.pesquisa("");
    tabelaHash34.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
    tabelaHash44.imprime();
    java.lang.Object[] obj_array46 = tabelaHash44.recuperaItens();
    tabelaHash44.retira("");
    ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
    tabelaHash50.imprime();
    java.lang.Object[] obj_array52 = tabelaHash50.recuperaItens();
    tabelaHash50.retira("hi!");
    java.lang.Object obj56 = tabelaHash50.pesquisa("");
    tabelaHash44.insere("", (java.lang.Object)tabelaHash50);
    tabelaHash34.insere("", (java.lang.Object)tabelaHash44);
    ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
    tabelaHash60.imprime();
    java.lang.Object[] obj_array62 = tabelaHash60.recuperaItens();
    tabelaHash60.imprime();
    java.lang.Object obj65 = tabelaHash60.pesquisa("");
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.imprime();
    tabelaHash60.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash67.imprime();
    tabelaHash67.retira("");
    ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array78 = tabelaHash74.recuperaItens();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array82 = tabelaHash74.recuperaItens();
    java.lang.Object[] obj_array83 = tabelaHash74.recuperaItens();
    tabelaHash67.insere("hi!", (java.lang.Object)obj_array83);
    tabelaHash67.imprime();
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash67);
    java.lang.Object obj89 = null;
    tabelaHash67.insere("", obj89);
    // The following exception was thrown during execution in test generation
    try {
      tabelaHash67.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array83);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test311"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("hi!");
    java.lang.Object obj19 = tabelaHash13.pesquisa("");
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash13);
    tabelaHash10.imprime();
    tabelaHash10.imprime();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    java.lang.Object[] obj_array30 = tabelaHash24.recuperaItens();
    java.lang.Object[] obj_array31 = tabelaHash24.recuperaItens();
    java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
    tabelaHash24.imprime();
    tabelaHash10.insere("", (java.lang.Object)tabelaHash24);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test312"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.retira("hi!");
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.imprime();
    java.lang.Object[] obj_array30 = tabelaHash28.recuperaItens();
    tabelaHash28.imprime();
    java.lang.Object obj33 = tabelaHash28.pesquisa("");
    java.lang.Object[] obj_array34 = tabelaHash28.recuperaItens();
    java.lang.Object obj36 = tabelaHash28.pesquisa("");
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    tabelaHash38.imprime();
    java.lang.Object[] obj_array40 = tabelaHash38.recuperaItens();
    tabelaHash38.imprime();
    java.lang.Object obj43 = tabelaHash38.pesquisa("");
    java.lang.Object[] obj_array44 = tabelaHash38.recuperaItens();
    tabelaHash38.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array48 = tabelaHash38.recuperaItens();
    tabelaHash28.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash24.insere("hi!", (java.lang.Object)tabelaHash28);
    tabelaHash28.retira("hi!");
    tabelaHash28.retira("hi!");
    tabelaHash28.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test313"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    java.lang.Object[] obj_array12 = tabelaHash11.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash11);
    java.lang.Object[] obj_array17 = tabelaHash11.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test314"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test315"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj24 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test316"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array14 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array18 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.retira("");
    tabelaHash22.retira("");
    java.lang.Object obj30 = tabelaHash22.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    java.lang.Object[] obj_array34 = tabelaHash32.recuperaItens();
    tabelaHash32.imprime();
    java.lang.Object obj37 = tabelaHash32.pesquisa("");
    java.lang.Object[] obj_array38 = tabelaHash32.recuperaItens();
    java.lang.Object[] obj_array39 = tabelaHash32.recuperaItens();
    tabelaHash22.insere("hi!", (java.lang.Object)obj_array39);
    java.lang.Object[] obj_array41 = tabelaHash22.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    java.lang.Object[] obj_array45 = tabelaHash43.recuperaItens();
    tabelaHash43.imprime();
    tabelaHash22.insere("hi!", (java.lang.Object)tabelaHash43);
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    java.lang.Object[] obj_array51 = tabelaHash49.recuperaItens();
    tabelaHash49.imprime();
    java.lang.Object obj54 = tabelaHash49.pesquisa("");
    java.lang.Object[] obj_array55 = tabelaHash49.recuperaItens();
    java.lang.Object[] obj_array56 = tabelaHash49.recuperaItens();
    ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
    tabelaHash58.imprime();
    java.lang.Object[] obj_array60 = tabelaHash58.recuperaItens();
    tabelaHash49.insere("hi!", (java.lang.Object)tabelaHash58);
    java.lang.Object obj63 = null;
    tabelaHash58.insere("", obj63);
    tabelaHash43.insere("", (java.lang.Object)"");
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash43);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj69 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj71 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!"+ "'", obj69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj71 + "' != '" + "hi!"+ "'", obj71.equals("hi!"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test317"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.retira("hi!");
    java.lang.Object obj12 = tabelaHash6.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("");
    java.lang.Object[] obj_array20 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    tabelaHash16.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash16);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    tabelaHash25.retira("");
    java.lang.Object[] obj_array29 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    tabelaHash25.retira("");
    tabelaHash25.retira("hi!");
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    tabelaHash25.retira("");
    java.lang.Object[] obj_array38 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test318"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test319"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test320"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object obj14 = tabelaHash6.pesquisa("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.imprime();
    java.lang.Object obj21 = tabelaHash16.pesquisa("");
    java.lang.Object[] obj_array22 = tabelaHash16.recuperaItens();
    tabelaHash16.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array26 = tabelaHash16.recuperaItens();
    tabelaHash6.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    java.lang.Object[] obj_array36 = tabelaHash34.recuperaItens();
    tabelaHash34.imprime();
    java.lang.Object obj39 = tabelaHash34.pesquisa("");
    tabelaHash34.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
    tabelaHash44.imprime();
    java.lang.Object[] obj_array46 = tabelaHash44.recuperaItens();
    tabelaHash44.retira("");
    ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
    tabelaHash50.imprime();
    java.lang.Object[] obj_array52 = tabelaHash50.recuperaItens();
    tabelaHash50.retira("hi!");
    java.lang.Object obj56 = tabelaHash50.pesquisa("");
    tabelaHash44.insere("", (java.lang.Object)tabelaHash50);
    tabelaHash34.insere("", (java.lang.Object)tabelaHash44);
    ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
    tabelaHash60.imprime();
    java.lang.Object[] obj_array62 = tabelaHash60.recuperaItens();
    tabelaHash60.imprime();
    java.lang.Object obj65 = tabelaHash60.pesquisa("");
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.imprime();
    tabelaHash60.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash67.imprime();
    tabelaHash67.retira("");
    ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array78 = tabelaHash74.recuperaItens();
    tabelaHash74.imprime();
    tabelaHash74.retira("");
    java.lang.Object[] obj_array82 = tabelaHash74.recuperaItens();
    java.lang.Object[] obj_array83 = tabelaHash74.recuperaItens();
    tabelaHash67.insere("hi!", (java.lang.Object)obj_array83);
    tabelaHash67.imprime();
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash67);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash67);
    java.lang.Object obj89 = tabelaHash67.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj89);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test321"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj12 = null;
    tabelaHash6.insere("hi!", obj12);
    java.lang.Object obj15 = tabelaHash6.pesquisa("");
    tabelaHash6.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test322"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test323"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    java.lang.Object obj16 = null;
    tabelaHash0.insere("", obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test324"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    java.lang.Object[] obj_array7 = tabelaHash3.recuperaItens();
    tabelaHash3.imprime();
    tabelaHash3.retira("");
    tabelaHash3.retira("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("", (java.lang.Object)10L);
    tabelaHash3.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test325"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test326"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    java.lang.Object[] obj_array11 = tabelaHash10.recuperaItens();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array12);
    tabelaHash0.retira("hi!");
    java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash19.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash19.retira("");
    java.lang.Object[] obj_array29 = tabelaHash19.recuperaItens();
    java.lang.Object[] obj_array30 = tabelaHash19.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test327"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object[] obj_array7 = tabelaHash5.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash5.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array12 = tabelaHash5.recuperaItens();
    tabelaHash5.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    java.lang.Object[] obj_array22 = tabelaHash21.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash21);
    java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
    tabelaHash21.imprime();
    tabelaHash5.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash21.imprime();
    java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash21);
    java.lang.Object[] obj_array32 = tabelaHash21.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test328"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("", (java.lang.Object)10L);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L+ "'", obj6.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test329"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test330"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    tabelaHash17.imprime();
    java.lang.Object obj22 = tabelaHash17.pesquisa("");
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash24);
    tabelaHash17.imprime();
    tabelaHash17.imprime();
    tabelaHash17.retira("hi!");
    tabelaHash12.insere("", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash33.imprime();
    tabelaHash33.retira("hi!");
    java.lang.Object obj41 = tabelaHash33.pesquisa("");
    tabelaHash12.insere("", (java.lang.Object)tabelaHash33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test331"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash22);
    tabelaHash22.imprime();
    java.lang.Object[] obj_array26 = tabelaHash22.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test332"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("");
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10.0f+ "'", obj11.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test333"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash7.imprime();
    tabelaHash7.retira("");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array18 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    tabelaHash14.retira("");
    java.lang.Object[] obj_array22 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array23 = tabelaHash14.recuperaItens();
    tabelaHash7.insere("hi!", (java.lang.Object)obj_array23);
    tabelaHash7.imprime();
    tabelaHash7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test334"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    java.lang.Object[] obj_array11 = tabelaHash9.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array13 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash22);
    tabelaHash22.imprime();
    java.lang.Object[] obj_array26 = tabelaHash22.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array26);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test335"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj28 = new java.lang.Object();
    tabelaHash12.insere("", obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test336"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test337"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array14 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false+ "'", obj12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test338"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test339"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)10L);
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array19 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test340"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object obj25 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.imprime();
    java.lang.Object[] obj_array30 = tabelaHash28.recuperaItens();
    tabelaHash28.imprime();
    java.lang.Object obj33 = tabelaHash28.pesquisa("");
    java.lang.Object[] obj_array34 = tabelaHash28.recuperaItens();
    tabelaHash28.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array38 = tabelaHash28.recuperaItens();
    java.lang.Object[] obj_array39 = tabelaHash28.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash28);
    java.lang.Object obj42 = tabelaHash28.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + ""+ "'", obj25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 'a'+ "'", obj42.equals('a'));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test341"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj12 = null;
    tabelaHash0.insere("", obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test342"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    tabelaHash14.imprime();
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    java.lang.Object[] obj_array20 = tabelaHash14.recuperaItens();
    java.lang.Object[] obj_array21 = tabelaHash14.recuperaItens();
    java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
    tabelaHash14.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash14);
    tabelaHash14.imprime();
    java.lang.Object[] obj_array27 = tabelaHash14.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test343"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    java.lang.Object[] obj_array10 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash7.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test344"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object[] obj_array13 = tabelaHash6.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)tabelaHash15);
    java.lang.Object obj20 = null;
    tabelaHash15.insere("", obj20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash15);
    java.lang.Object[] obj_array23 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test345"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj18 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test346"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test347"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    java.lang.Object[] obj_array19 = tabelaHash13.recuperaItens();
    tabelaHash13.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array23 = tabelaHash13.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test348"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object obj12 = null;
    tabelaHash6.insere("hi!", obj12);
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    tabelaHash15.retira("");
    java.lang.Object[] obj_array19 = tabelaHash15.recuperaItens();
    tabelaHash15.imprime();
    tabelaHash15.retira("");
    tabelaHash15.retira("hi!");
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash26.insere("", (java.lang.Object)10L);
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash26);
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    java.lang.Object obj38 = tabelaHash33.pesquisa("");
    java.lang.Object[] obj_array39 = tabelaHash33.recuperaItens();
    java.lang.Object[] obj_array40 = tabelaHash33.recuperaItens();
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.imprime();
    java.lang.Object[] obj_array44 = tabelaHash42.recuperaItens();
    tabelaHash33.insere("hi!", (java.lang.Object)tabelaHash42);
    tabelaHash26.insere("", (java.lang.Object)"hi!");
    tabelaHash6.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test349"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object[] obj_array22 = tabelaHash10.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test350"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    tabelaHash8.retira("");
    java.lang.Object[] obj_array12 = tabelaHash8.recuperaItens();
    tabelaHash8.imprime();
    tabelaHash8.retira("");
    java.lang.Object[] obj_array16 = tabelaHash8.recuperaItens();
    java.lang.Object obj18 = tabelaHash8.pesquisa("");
    java.lang.Object obj20 = tabelaHash8.pesquisa("");
    java.lang.Object obj22 = null;
    tabelaHash8.insere("", obj22);
    java.lang.Object[] obj_array24 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash8);
    java.lang.Object[] obj_array26 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test351"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("hi!");
    java.lang.Object obj14 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test352"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    tabelaHash11.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test353"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    java.lang.Object[] obj_array16 = tabelaHash14.recuperaItens();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    java.lang.Object[] obj_array19 = tabelaHash18.recuperaItens();
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash18);
    java.lang.Object obj22 = tabelaHash18.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.imprime();
    java.lang.Object[] obj_array27 = tabelaHash25.recuperaItens();
    tabelaHash25.imprime();
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    java.lang.Object[] obj_array31 = tabelaHash25.recuperaItens();
    tabelaHash25.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array35 = tabelaHash25.recuperaItens();
    tabelaHash25.retira("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a'+ "'", obj12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test354"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test355"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array12 = tabelaHash0.recuperaItens();
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test356"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj22 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false+ "'", obj20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + ""+ "'", obj22.equals(""));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test357"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    java.lang.Object[] obj_array13 = tabelaHash11.recuperaItens();
    tabelaHash11.imprime();
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash18);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    tabelaHash0.retira("");
    java.lang.Object obj31 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    tabelaHash33.retira("");
    java.lang.Object[] obj_array37 = tabelaHash33.recuperaItens();
    tabelaHash33.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash33.retira("");
    java.lang.Object[] obj_array43 = tabelaHash33.recuperaItens();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash45.imprime();
    tabelaHash45.retira("hi!");
    java.lang.Object[] obj_array49 = tabelaHash45.recuperaItens();
    tabelaHash45.retira("");
    java.lang.Object obj53 = tabelaHash45.pesquisa("hi!");
    java.lang.Object[] obj_array54 = tabelaHash45.recuperaItens();
    tabelaHash33.insere("hi!", (java.lang.Object)tabelaHash45);
    tabelaHash45.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash45);
    java.lang.Object obj59 = null;
    tabelaHash45.insere("hi!", obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test358"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
    tabelaHash18.imprime();
    java.lang.Object[] obj_array20 = tabelaHash18.recuperaItens();
    tabelaHash18.imprime();
    java.lang.Object obj23 = tabelaHash18.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash18.recuperaItens();
    java.lang.Object obj26 = tabelaHash18.pesquisa("");
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.imprime();
    java.lang.Object[] obj_array30 = tabelaHash28.recuperaItens();
    tabelaHash28.imprime();
    java.lang.Object obj33 = tabelaHash28.pesquisa("");
    java.lang.Object[] obj_array34 = tabelaHash28.recuperaItens();
    tabelaHash28.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array38 = tabelaHash28.recuperaItens();
    tabelaHash18.insere("", (java.lang.Object)tabelaHash28);
    tabelaHash12.insere("", (java.lang.Object)tabelaHash18);
    java.lang.Object obj42 = tabelaHash12.pesquisa("hi!");
    tabelaHash12.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.retira("");
    tabelaHash12.retira("");
    ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
    tabelaHash51.imprime();
    java.lang.Object[] obj_array53 = tabelaHash51.recuperaItens();
    tabelaHash51.retira("");
    tabelaHash51.retira("");
    java.lang.Object obj59 = tabelaHash51.pesquisa("");
    tabelaHash51.retira("");
    ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
    tabelaHash63.imprime();
    tabelaHash63.retira("");
    java.lang.Object[] obj_array67 = tabelaHash63.recuperaItens();
    tabelaHash63.imprime();
    tabelaHash63.imprime();
    tabelaHash63.imprime();
    ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
    tabelaHash72.imprime();
    tabelaHash72.insere("", (java.lang.Object)10L);
    tabelaHash63.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array78 = tabelaHash63.recuperaItens();
    tabelaHash51.insere("hi!", (java.lang.Object)obj_array78);
    tabelaHash12.insere("hi!", (java.lang.Object)obj_array78);
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test359"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object obj15 = tabelaHash10.pesquisa("");
    java.lang.Object[] obj_array16 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj23 = tabelaHash10.pesquisa("");
    java.lang.Object obj25 = tabelaHash10.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    tabelaHash27.retira("hi!");
    java.lang.Object[] obj_array31 = tabelaHash27.recuperaItens();
    tabelaHash27.retira("");
    java.lang.Object obj35 = tabelaHash27.pesquisa("hi!");
    ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
    tabelaHash37.imprime();
    java.lang.Object[] obj_array39 = tabelaHash37.recuperaItens();
    tabelaHash37.imprime();
    java.lang.Object obj42 = tabelaHash37.pesquisa("");
    java.lang.Object[] obj_array43 = tabelaHash37.recuperaItens();
    tabelaHash37.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array47 = tabelaHash37.recuperaItens();
    java.lang.Object obj49 = tabelaHash37.pesquisa("hi!");
    tabelaHash37.retira("hi!");
    tabelaHash27.insere("", (java.lang.Object)"hi!");
    java.lang.Object[] obj_array53 = tabelaHash27.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)obj_array53);
    tabelaHash10.imprime();
    java.lang.Object[] obj_array56 = tabelaHash10.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a'+ "'", obj25.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 'a'+ "'", obj49.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test360"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    java.lang.Object obj25 = tabelaHash13.pesquisa("");
    java.lang.Object obj27 = tabelaHash13.pesquisa("");
    java.lang.Object[] obj_array28 = tabelaHash13.recuperaItens();
    java.lang.Object obj30 = null;
    tabelaHash13.insere("", obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test361"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    java.lang.Object[] obj_array5 = tabelaHash3.recuperaItens();
    tabelaHash3.retira("hi!");
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash3);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.imprime();
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash13.insere("hi!", (java.lang.Object)tabelaHash20);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.imprime();
    tabelaHash24.insere("hi!", (java.lang.Object)tabelaHash31);
    tabelaHash13.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash13.insere("", (java.lang.Object)10.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash13);
    ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
    tabelaHash40.imprime();
    java.lang.Object[] obj_array42 = tabelaHash40.recuperaItens();
    tabelaHash40.imprime();
    java.lang.Object obj45 = tabelaHash40.pesquisa("");
    java.lang.Object[] obj_array46 = tabelaHash40.recuperaItens();
    tabelaHash40.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array50 = tabelaHash40.recuperaItens();
    java.lang.Object obj52 = tabelaHash40.pesquisa("hi!");
    ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
    tabelaHash54.imprime();
    java.lang.Object[] obj_array56 = tabelaHash54.recuperaItens();
    ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
    java.lang.Object[] obj_array59 = tabelaHash58.recuperaItens();
    tabelaHash54.insere("hi!", (java.lang.Object)tabelaHash58);
    java.lang.Object obj62 = tabelaHash58.pesquisa("");
    tabelaHash40.insere("", (java.lang.Object)"");
    java.lang.Object obj65 = tabelaHash40.pesquisa("");
    tabelaHash40.imprime();
    ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
    tabelaHash68.imprime();
    java.lang.Object[] obj_array70 = tabelaHash68.recuperaItens();
    tabelaHash68.imprime();
    java.lang.Object obj73 = tabelaHash68.pesquisa("");
    java.lang.Object[] obj_array74 = tabelaHash68.recuperaItens();
    tabelaHash68.insere("hi!", (java.lang.Object)'a');
    java.lang.Object[] obj_array78 = tabelaHash68.recuperaItens();
    java.lang.Object[] obj_array79 = tabelaHash68.recuperaItens();
    tabelaHash40.insere("", (java.lang.Object)tabelaHash68);
    ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
    tabelaHash82.imprime();
    tabelaHash82.retira("");
    java.lang.Object[] obj_array86 = tabelaHash82.recuperaItens();
    tabelaHash82.imprime();
    tabelaHash82.retira("");
    tabelaHash82.retira("hi!");
    java.lang.Object[] obj_array92 = tabelaHash82.recuperaItens();
    tabelaHash40.insere("hi!", (java.lang.Object)tabelaHash82);
    java.lang.Object[] obj_array94 = tabelaHash82.recuperaItens();
    tabelaHash13.insere("", (java.lang.Object)tabelaHash82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 'a'+ "'", obj52.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj65 + "' != '" + ""+ "'", obj65.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array94);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test362"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash12.imprime();
    java.lang.Object[] obj_array25 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    tabelaHash12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test363"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    tabelaHash10.retira("");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    java.lang.Object[] obj_array18 = tabelaHash16.recuperaItens();
    tabelaHash16.retira("hi!");
    java.lang.Object obj22 = tabelaHash16.pesquisa("");
    tabelaHash10.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    tabelaHash10.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test364"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array8 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.imprime();
    java.lang.Object obj27 = tabelaHash22.pesquisa("");
    java.lang.Object[] obj_array28 = tabelaHash22.recuperaItens();
    java.lang.Object[] obj_array29 = tabelaHash22.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)obj_array29);
    java.lang.Object[] obj_array31 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    tabelaHash33.imprime();
    java.lang.Object[] obj_array35 = tabelaHash33.recuperaItens();
    tabelaHash33.imprime();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash33);
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    java.lang.Object[] obj_array41 = tabelaHash39.recuperaItens();
    tabelaHash39.imprime();
    java.lang.Object obj44 = tabelaHash39.pesquisa("");
    java.lang.Object[] obj_array45 = tabelaHash39.recuperaItens();
    java.lang.Object[] obj_array46 = tabelaHash39.recuperaItens();
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.imprime();
    java.lang.Object[] obj_array50 = tabelaHash48.recuperaItens();
    tabelaHash39.insere("hi!", (java.lang.Object)tabelaHash48);
    java.lang.Object obj53 = null;
    tabelaHash48.insere("", obj53);
    tabelaHash33.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash33);
    java.lang.Object obj58 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj58);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test365"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)(byte)0);
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test366"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.imprime();
    java.lang.Object[] obj_array15 = tabelaHash13.recuperaItens();
    tabelaHash13.retira("");
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    java.lang.Object[] obj_array21 = tabelaHash19.recuperaItens();
    tabelaHash19.retira("hi!");
    java.lang.Object obj25 = tabelaHash19.pesquisa("");
    tabelaHash13.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash13.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash13);
    tabelaHash0.imprime();
    java.lang.Object[] obj_array30 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    java.lang.Object[] obj_array34 = tabelaHash32.recuperaItens();
    tabelaHash32.imprime();
    java.lang.Object obj37 = tabelaHash32.pesquisa("");
    java.lang.Object[] obj_array38 = tabelaHash32.recuperaItens();
    java.lang.Object[] obj_array39 = tabelaHash32.recuperaItens();
    ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
    tabelaHash41.imprime();
    java.lang.Object[] obj_array43 = tabelaHash41.recuperaItens();
    tabelaHash32.insere("hi!", (java.lang.Object)tabelaHash41);
    tabelaHash41.retira("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test367"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    java.lang.Object[] obj_array5 = tabelaHash4.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash4);
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)1);
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    java.lang.Object obj13 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    java.lang.Object[] obj_array20 = tabelaHash19.recuperaItens();
    tabelaHash15.insere("hi!", (java.lang.Object)tabelaHash19);
    java.lang.Object obj23 = tabelaHash19.pesquisa("");
    java.lang.Object[] obj_array24 = tabelaHash19.recuperaItens();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    java.lang.Object[] obj_array30 = tabelaHash26.recuperaItens();
    tabelaHash26.imprime();
    tabelaHash26.retira("");
    tabelaHash26.retira("hi!");
    java.lang.Object[] obj_array36 = tabelaHash26.recuperaItens();
    ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
    tabelaHash38.imprime();
    ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
    tabelaHash41.imprime();
    java.lang.Object[] obj_array43 = tabelaHash41.recuperaItens();
    tabelaHash41.retira("hi!");
    java.lang.Object obj47 = tabelaHash41.pesquisa("");
    tabelaHash38.insere("hi!", (java.lang.Object)tabelaHash41);
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash38);
    java.lang.Object[] obj_array50 = tabelaHash38.recuperaItens();
    tabelaHash19.insere("", (java.lang.Object)tabelaHash38);
    tabelaHash38.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash38);
    java.lang.Object[] obj_array54 = tabelaHash38.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1+ "'", obj13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test368"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
    java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test369"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array7 = tabelaHash0.recuperaItens();
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    java.lang.Object[] obj_array11 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test370"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    java.lang.Object[] obj_array9 = tabelaHash8.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)obj_array9);
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    java.lang.Object[] obj_array18 = tabelaHash12.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)'a');
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    tabelaHash24.imprime();
    java.lang.Object[] obj_array26 = tabelaHash24.recuperaItens();
    tabelaHash24.imprime();
    java.lang.Object obj29 = tabelaHash24.pesquisa("");
    tabelaHash24.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array33 = tabelaHash24.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash24.recuperaItens();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash36.imprime();
    tabelaHash36.insere("", (java.lang.Object)10L);
    tabelaHash24.insere("", (java.lang.Object)"");
    tabelaHash12.insere("", (java.lang.Object)tabelaHash24);
    tabelaHash0.insere("", (java.lang.Object)"");
    java.lang.Object[] obj_array44 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
    tabelaHash46.imprime();
    tabelaHash46.retira("");
    java.lang.Object[] obj_array50 = tabelaHash46.recuperaItens();
    tabelaHash46.imprime();
    tabelaHash46.retira("");
    tabelaHash46.retira("");
    tabelaHash46.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test371"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    java.lang.Object[] obj_array9 = tabelaHash7.recuperaItens();
    tabelaHash7.imprime();
    java.lang.Object obj12 = tabelaHash7.pesquisa("");
    java.lang.Object[] obj_array13 = tabelaHash7.recuperaItens();
    java.lang.Object[] obj_array14 = tabelaHash7.recuperaItens();
    java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
    java.lang.Object[] obj_array17 = tabelaHash7.recuperaItens();
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.imprime();
    tabelaHash19.retira("");
    java.lang.Object[] obj_array23 = tabelaHash19.recuperaItens();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash19);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    tabelaHash27.retira("");
    java.lang.Object[] obj_array31 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    tabelaHash27.retira("");
    tabelaHash27.retira("hi!");
    java.lang.Object[] obj_array37 = tabelaHash27.recuperaItens();
    tabelaHash27.retira("");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    java.lang.Object[] obj_array41 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test372"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test373"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash7);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    java.lang.Object[] obj_array14 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    java.lang.Object obj17 = tabelaHash12.pesquisa("");
    java.lang.Object[] obj_array18 = tabelaHash12.recuperaItens();
    java.lang.Object[] obj_array19 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    java.lang.Object[] obj_array23 = tabelaHash21.recuperaItens();
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash21);
    java.lang.Object[] obj_array25 = tabelaHash12.recuperaItens();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    tabelaHash34.imprime();
    tabelaHash27.insere("hi!", (java.lang.Object)tabelaHash34);
    tabelaHash34.imprime();
    java.lang.Object[] obj_array38 = tabelaHash34.recuperaItens();
    tabelaHash12.insere("", (java.lang.Object)obj_array38);
    tabelaHash0.insere("", (java.lang.Object)obj_array38);
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.imprime();
    tabelaHash42.retira("");
    java.lang.Object[] obj_array46 = tabelaHash42.recuperaItens();
    tabelaHash42.imprime();
    tabelaHash42.imprime();
    tabelaHash42.imprime();
    ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
    tabelaHash51.imprime();
    tabelaHash51.insere("", (java.lang.Object)10L);
    tabelaHash42.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array57 = tabelaHash42.recuperaItens();
    java.lang.Object[] obj_array58 = tabelaHash42.recuperaItens();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash42);
    ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
    tabelaHash61.imprime();
    tabelaHash61.retira("");
    java.lang.Object[] obj_array65 = tabelaHash61.recuperaItens();
    tabelaHash61.imprime();
    tabelaHash61.retira("");
    tabelaHash61.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test374"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
    tabelaHash4.imprime();
    tabelaHash4.retira("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array14 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    tabelaHash10.retira("");
    java.lang.Object[] obj_array18 = tabelaHash10.recuperaItens();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array20 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    java.lang.Object[] obj_array24 = tabelaHash22.recuperaItens();
    tabelaHash22.retira("");
    tabelaHash22.retira("");
    java.lang.Object obj30 = tabelaHash22.pesquisa("");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.imprime();
    java.lang.Object[] obj_array34 = tabelaHash32.recuperaItens();
    tabelaHash32.imprime();
    java.lang.Object obj37 = tabelaHash32.pesquisa("");
    java.lang.Object[] obj_array38 = tabelaHash32.recuperaItens();
    java.lang.Object[] obj_array39 = tabelaHash32.recuperaItens();
    tabelaHash22.insere("hi!", (java.lang.Object)obj_array39);
    java.lang.Object[] obj_array41 = tabelaHash22.recuperaItens();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    java.lang.Object[] obj_array45 = tabelaHash43.recuperaItens();
    tabelaHash43.imprime();
    tabelaHash22.insere("hi!", (java.lang.Object)tabelaHash43);
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.imprime();
    java.lang.Object[] obj_array51 = tabelaHash49.recuperaItens();
    tabelaHash49.imprime();
    java.lang.Object obj54 = tabelaHash49.pesquisa("");
    java.lang.Object[] obj_array55 = tabelaHash49.recuperaItens();
    java.lang.Object[] obj_array56 = tabelaHash49.recuperaItens();
    ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
    tabelaHash58.imprime();
    java.lang.Object[] obj_array60 = tabelaHash58.recuperaItens();
    tabelaHash49.insere("hi!", (java.lang.Object)tabelaHash58);
    java.lang.Object obj63 = null;
    tabelaHash58.insere("", obj63);
    tabelaHash43.insere("", (java.lang.Object)"");
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash43);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash10);
    java.lang.Object obj69 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj71 = tabelaHash0.pesquisa("");
    java.lang.Object obj73 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!"+ "'", obj69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj73);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test375"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    tabelaHash6.retira("");
    java.lang.Object[] obj_array10 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    tabelaHash6.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    tabelaHash15.insere("", (java.lang.Object)10L);
    tabelaHash6.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array21 = tabelaHash6.recuperaItens();
    java.lang.Object obj23 = tabelaHash6.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 10L+ "'", obj23.equals(10L));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test376"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    java.lang.Object obj11 = tabelaHash6.pesquisa("");
    java.lang.Object[] obj_array12 = tabelaHash6.recuperaItens();
    java.lang.Object[] obj_array13 = tabelaHash6.recuperaItens();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash6.insere("hi!", (java.lang.Object)tabelaHash15);
    java.lang.Object obj20 = null;
    tabelaHash15.insere("", obj20);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test377"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    java.lang.Object[] obj_array9 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.insere("", (java.lang.Object)10L);
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.imprime();
    tabelaHash20.retira("");
    java.lang.Object[] obj_array24 = tabelaHash20.recuperaItens();
    tabelaHash20.imprime();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash27.imprime();
    java.lang.Object[] obj_array29 = tabelaHash27.recuperaItens();
    tabelaHash27.imprime();
    java.lang.Object obj32 = tabelaHash27.pesquisa("");
    java.lang.Object[] obj_array33 = tabelaHash27.recuperaItens();
    java.lang.Object[] obj_array34 = tabelaHash27.recuperaItens();
    java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
    java.lang.Object[] obj_array37 = tabelaHash27.recuperaItens();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash39.imprime();
    tabelaHash39.retira("");
    java.lang.Object[] obj_array43 = tabelaHash39.recuperaItens();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash27);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    java.lang.Object obj48 = tabelaHash0.pesquisa("hi!");
    java.lang.Object[] obj_array49 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false+ "'", obj48.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test378"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object[] obj_array1 = tabelaHash0.recuperaItens();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    java.lang.Object[] obj_array7 = tabelaHash5.recuperaItens();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    java.lang.Object[] obj_array10 = tabelaHash9.recuperaItens();
    tabelaHash5.insere("hi!", (java.lang.Object)tabelaHash9);
    java.lang.Object[] obj_array12 = tabelaHash5.recuperaItens();
    tabelaHash5.insere("", (java.lang.Object)1);
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    java.lang.Object[] obj_array19 = tabelaHash17.recuperaItens();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    java.lang.Object[] obj_array22 = tabelaHash21.recuperaItens();
    tabelaHash17.insere("hi!", (java.lang.Object)tabelaHash21);
    java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
    tabelaHash21.imprime();
    tabelaHash5.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash21.imprime();
    java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash21);
    tabelaHash21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test379"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)10.0f);
    tabelaHash0.retira("");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("hi!");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.retira("");
    java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
    java.lang.Object[] obj_array21 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test380"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.imprime();
    java.lang.Object[] obj_array12 = tabelaHash10.recuperaItens();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    java.lang.Object[] obj_array15 = tabelaHash14.recuperaItens();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object[] obj_array17 = tabelaHash10.recuperaItens();
    tabelaHash10.insere("", (java.lang.Object)1);
    tabelaHash10.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash10);
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array25 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test381"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object[] obj_array6 = tabelaHash0.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)'a');
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.retira("hi!");
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash16.imprime();
    tabelaHash16.retira("hi!");
    tabelaHash12.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash12.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array23 = tabelaHash12.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test382"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
    tabelaHash6.imprime();
    java.lang.Object[] obj_array8 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash6);
    java.lang.Object[] obj_array11 = tabelaHash6.recuperaItens();
    tabelaHash6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test383"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    java.lang.Object[] obj_array2 = tabelaHash0.recuperaItens();
    tabelaHash0.retira("");
    tabelaHash0.retira("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("");
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    tabelaHash12.retira("");
    java.lang.Object[] obj_array16 = tabelaHash12.recuperaItens();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.imprime();
    tabelaHash21.insere("", (java.lang.Object)10L);
    tabelaHash12.insere("hi!", (java.lang.Object)10L);
    java.lang.Object[] obj_array27 = tabelaHash12.recuperaItens();
    tabelaHash0.insere("hi!", (java.lang.Object)obj_array27);
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array33 = tabelaHash0.recuperaItens();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test384"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    java.lang.Object[] obj_array4 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    tabelaHash0.retira("");
    tabelaHash0.retira("hi!");
    java.lang.Object[] obj_array10 = tabelaHash0.recuperaItens();
    ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
    tabelaHash12.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.imprime();
    java.lang.Object[] obj_array17 = tabelaHash15.recuperaItens();
    tabelaHash15.retira("hi!");
    java.lang.Object obj21 = tabelaHash15.pesquisa("");
    tabelaHash12.insere("hi!", (java.lang.Object)tabelaHash15);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash12);
    java.lang.Object[] obj_array24 = tabelaHash0.recuperaItens();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

}
