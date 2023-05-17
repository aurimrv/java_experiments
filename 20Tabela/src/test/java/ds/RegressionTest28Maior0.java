package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test1"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)1;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test2"); }


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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 'a';

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test4"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item item2 = null;
    tabela0.insere(item2);
    ds.Tabela tabela4 = new ds.Tabela();
    ds.Tabela tabela5 = new ds.Tabela();
    int i6 = tabela5.n;
    ds.Item item7 = null;
    tabela5.insere(item7);
    ds.Item[] item_array9 = tabela5.registros;
    tabela4.registros = item_array9;
    tabela0.registros = item_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test5"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item item2 = null;
    tabela0.insere(item2);
    ds.Item[] item_array4 = tabela0.registros;
    ds.Item[] item_array5 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

}
