package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item[] item_array3 = tabela0.registros;
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item[] item_array3 = null;
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = tabela0.pesquisa(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = tabela0.binaria(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    ds.Item item3 = null;
    tabela0.insere(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    ds.Item[] item_array3 = tabela0.registros;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item item3 = null;
    tabela0.insere(item3);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item[] item_array3 = null;
    tabela0.registros = item_array3;
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item item3 = null;
    tabela0.insere(item3);
    int i5 = tabela0.n;
    ds.Item[] item_array6 = tabela0.registros;
    ds.Item[] item_array7 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item[] item_array3 = null;
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    ds.Item[] item_array6 = tabela0.registros;
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = tabela0.binaria(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item[] item_array3 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)1;
    ds.Item[] item_array3 = tabela0.registros;
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
    org.junit.Assert.assertNotNull(item_array3);

  }

}
