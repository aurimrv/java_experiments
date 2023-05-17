package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test02"); }


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

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item[] item_array4 = tabela3.registros;
    ds.Item[] item_array5 = tabela3.registros;
    tabela0.registros = item_array5;
    int i7 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    int i3 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Item[] item_array3 = tabela0.registros;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item[] item_array4 = tabela3.registros;
    ds.Item[] item_array5 = tabela3.registros;
    tabela0.registros = item_array5;
    ds.Tabela tabela7 = new ds.Tabela();
    tabela7.n = 0;
    ds.Tabela tabela10 = new ds.Tabela();
    ds.Item[] item_array11 = tabela10.registros;
    ds.Item[] item_array12 = tabela10.registros;
    tabela7.registros = item_array12;
    ds.Item[] item_array14 = tabela7.registros;
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    tabela7.registros = item_array16;
    tabela0.registros = item_array16;
    tabela0.n = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item[] item_array4 = tabela3.registros;
    ds.Item[] item_array5 = tabela3.registros;
    tabela0.registros = item_array5;
    ds.Item[] item_array7 = tabela0.registros;
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    tabela0.registros = item_array9;
    ds.Item[] item_array11 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test09"); }


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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    ds.Item[] item_array2 = tabela0.registros;
    ds.Item item3 = null;
    tabela0.insere(item3);
    ds.Item item5 = null;
    tabela0.insere(item5);
    tabela0.n = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Tabela tabela4 = new ds.Tabela();
    ds.Item[] item_array5 = tabela4.registros;
    tabela0.registros = item_array5;
    ds.Item item7 = null;
    tabela0.insere(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item item4 = null;
    tabela0.insere(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item[] item_array4 = tabela3.registros;
    ds.Item[] item_array5 = tabela3.registros;
    tabela0.registros = item_array5;
    tabela0.n = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    tabela1.n = 0;
    ds.Item[] item_array4 = tabela1.registros;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = tabela5.registros;
    tabela1.registros = item_array6;
    tabela0.registros = item_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

}
