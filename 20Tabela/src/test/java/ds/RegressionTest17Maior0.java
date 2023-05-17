package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test1"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i2 = tabela0.pesquisa(item1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test2"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = tabela0.pesquisa(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    tabela0.n = (short)0;
    ds.Item item4 = null;
    int i5 = tabela0.binaria(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test4"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test5"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    tabela0.n = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17Maior0.test6"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

}
