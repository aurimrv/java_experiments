package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    tabela0.n = (short)0;
    ds.Item item4 = null;
    tabela0.insere(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    tabela0.n = (short)0;
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = tabela0.pesquisa(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    int i3 = tabela0.n;
    tabela0.n = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    tabela0.n = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    tabela0.n = (byte)10;
    tabela0.n = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    int i3 = tabela0.n;
    ds.Tabela tabela4 = new ds.Tabela();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    tabela4.registros = item_array6;
    tabela0.registros = item_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item item2 = null;
    tabela0.insere(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item[] item_array3 = null;
    tabela0.registros = item_array3;

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    tabela0.n = 0;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    ds.Item item5 = null;
    tabela0.insere(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    ds.Item item5 = null;
    int i6 = tabela0.binaria(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = tabela0.pesquisa(item6);
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test17"); }


    ds.Tabela tabela0 = new ds.Tabela();
    int i1 = tabela0.n;
    ds.Item[] item_array2 = tabela0.registros;
    int i3 = tabela0.n;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

}
