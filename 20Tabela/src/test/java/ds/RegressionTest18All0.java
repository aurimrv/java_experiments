package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    tabela0.n = (byte)(-1);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i6 = tabela0.pesquisa(item5);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    tabela0.n = (byte)(-1);
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = null;
    tabela5.registros = item_array6;
    ds.Item[] item_array8 = tabela5.registros;
    ds.Item[] item_array9 = new ds.Item[] {  };
    tabela5.registros = item_array9;
    tabela0.registros = item_array9;
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i13 = tabela0.pesquisa(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
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
    org.junit.Assert.assertNull(item_array3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    ds.Item item4 = null;
    int i5 = tabela0.binaria(item4);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    tabela0.n = (byte)(-1);
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = null;
    tabela5.registros = item_array6;
    tabela5.n = (byte)(-1);
    ds.Tabela tabela10 = new ds.Tabela();
    ds.Item[] item_array11 = null;
    tabela10.registros = item_array11;
    ds.Item[] item_array13 = tabela10.registros;
    ds.Item[] item_array14 = new ds.Item[] {  };
    tabela10.registros = item_array14;
    tabela5.registros = item_array14;
    tabela0.registros = item_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item3);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    ds.Item[] item_array2 = new ds.Item[] { item1 };
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item item6 = null;
    int i7 = tabela0.binaria(item6);
    int i8 = tabela0.n;
    ds.Item[] item_array9 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item item6 = null;
    int i7 = tabela0.binaria(item6);
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item item6 = null;
    int i7 = tabela0.binaria(item6);
    int i8 = tabela0.n;
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i10 = tabela0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item[] item_array6 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    int i3 = tabela0.n;
    ds.Item[] item_array4 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    ds.Item item6 = null;
    int i7 = tabela0.binaria(item6);
    int i8 = tabela0.n;
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test17"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    tabela0.n = (byte)(-1);
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = null;
    tabela5.registros = item_array6;
    ds.Item[] item_array8 = tabela5.registros;
    ds.Item[] item_array9 = new ds.Item[] {  };
    tabela5.registros = item_array9;
    tabela0.registros = item_array9;
    ds.Tabela tabela12 = new ds.Tabela();
    ds.Item[] item_array13 = null;
    tabela12.registros = item_array13;
    ds.Item[] item_array15 = tabela12.registros;
    ds.Item[] item_array16 = new ds.Item[] {  };
    tabela12.registros = item_array16;
    tabela0.registros = item_array16;
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test18"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = null;
    tabela0.registros = item_array1;
    tabela0.n = (byte)(-1);
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Item[] item_array6 = null;
    tabela5.registros = item_array6;
    ds.Item[] item_array8 = tabela5.registros;
    ds.Item[] item_array9 = new ds.Item[] {  };
    tabela5.registros = item_array9;
    tabela0.registros = item_array9;
    int i12 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

}
