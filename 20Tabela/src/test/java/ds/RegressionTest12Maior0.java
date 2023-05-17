package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test1"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test2"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = tabela0.pesquisa(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    int i11 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test4"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    ds.Item item11 = null;
    int i12 = tabela0.binaria(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

}
