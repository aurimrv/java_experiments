package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
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

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 100;
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    tabela0.n = (byte)(-1);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)1;
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

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = tabela0.binaria(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    ds.Item[] item_array3 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    tabela0.n = (byte)(-1);
    tabela0.n = '#';
    ds.Tabela tabela7 = new ds.Tabela();
    tabela7.n = (short)10;
    ds.Item[] item_array10 = new ds.Item[] {  };
    tabela7.registros = item_array10;
    tabela0.registros = item_array10;
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = tabela0.pesquisa(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)1;
    ds.Tabela tabela3 = new ds.Tabela();
    tabela3.n = 0;
    tabela3.n = (byte)(-1);
    tabela3.n = '#';
    ds.Item[] item_array10 = tabela3.registros;
    tabela0.registros = item_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    int i3 = tabela0.n;
    ds.Item[] item_array4 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    int i3 = tabela0.n;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    int i3 = tabela0.n;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = 0;
    tabela0.n = (byte)(-1);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i6 = tabela0.pesquisa(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (short)10;
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    int i2 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)1;
    ds.Item item3 = null;
    tabela0.insere(item3);

  }

}
