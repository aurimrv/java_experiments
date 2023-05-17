package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test1"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test2"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = new ds.Item[] {  };
    tabela1.registros = item_array2;
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    tabela1.registros = item_array5;
    ds.Tabela tabela7 = new ds.Tabela();
    ds.Item[] item_array8 = new ds.Item[] {  };
    tabela7.registros = item_array8;
    ds.Item[] item_array10 = tabela7.registros;
    tabela1.registros = item_array10;
    tabela0.registros = item_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item item4 = null;
    int i5 = tabela0.binaria(item4);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = tabela0.pesquisa(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

}
