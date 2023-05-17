package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test1"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test2"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    ds.Item[] item_array2 = tabela0.registros;
    ds.Item item3 = null;
    tabela0.insere(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test4"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Tabela tabela2 = new ds.Tabela();
    tabela2.n = 0;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = tabela5.registros;
    ds.Item[] item_array7 = tabela5.registros;
    tabela2.registros = item_array7;
    tabela0.registros = item_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

}
