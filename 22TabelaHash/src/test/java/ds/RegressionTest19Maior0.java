package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test1"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test2"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    tabelaHash0.insere("", (java.lang.Object)0.0f);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test3"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj11 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test4"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
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
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test5"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    java.lang.Object obj5 = new java.lang.Object();
    tabelaHash0.insere("hi!", obj5);
    tabelaHash0.insere("hi!", (java.lang.Object)'4');
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test6"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = null;
    tabelaHash0.insere("hi!", obj2);
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));
    tabelaHash0.insere("", (java.lang.Object)(byte)(-1));

  }

}
