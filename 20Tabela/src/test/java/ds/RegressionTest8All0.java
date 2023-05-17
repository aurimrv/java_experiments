package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    tabela0.n = (-1);
    ds.Item[] item_array5 = new ds.Item[] {  };
    tabela0.registros = item_array5;
    tabela0.n = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    tabela1.n = (byte)0;
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    tabela1.registros = item_array5;
    tabela0.registros = item_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    tabela0.n = (-1);
    int i5 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    tabela0.n = (-1);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i6 = tabela0.binaria(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    ds.Item item2 = null;
    tabela0.insere(item2);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i5 = tabela0.binaria(item4);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '4';
    tabela0.n = (byte)0;

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    int i3 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = '#';
    tabela0.n = 10;

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    tabela0.n = (short)10;
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
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test18"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = ' ';
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i6 = tabela0.binaria(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

}
