package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test1"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item item2 = null;
    tabela0.insere(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test2"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    ds.Item[] item_array3 = tabela0.registros;
    tabela0.n = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test3"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    tabela0.n = (-1);
    tabela0.n = (short)(-1);
    tabela0.n = (byte)1;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test4"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    tabela1.n = (short)10;
    ds.Item[] item_array4 = tabela1.registros;
    tabela0.registros = item_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

}
