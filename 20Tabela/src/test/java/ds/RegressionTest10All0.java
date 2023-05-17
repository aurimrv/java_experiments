package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    int i6 = tabela0.n;
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = tabela0.pesquisa(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item item4 = null;
    int i5 = tabela3.binaria(item4);
    tabela3.n = '#';
    ds.Item[] item_array8 = tabela3.registros;
    tabela0.registros = item_array8;
    tabela0.n = (byte)10;
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i13 = tabela0.pesquisa(item12);
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
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)(-1);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Item[] item_array6 = null;
    tabela0.registros = item_array6;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    int i3 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    int i8 = tabela6.binaria(item7);
    ds.Tabela tabela9 = new ds.Tabela();
    ds.Item item10 = null;
    int i11 = tabela9.binaria(item10);
    tabela9.n = '#';
    ds.Item[] item_array14 = tabela9.registros;
    tabela6.registros = item_array14;
    tabela0.registros = item_array14;
    int i17 = tabela0.n;
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Item[] item_array6 = null;
    tabela0.registros = item_array6;
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item8);
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    ds.Tabela tabela3 = new ds.Tabela();
    ds.Item item4 = null;
    int i5 = tabela3.binaria(item4);
    tabela3.n = '#';
    ds.Item[] item_array8 = tabela3.registros;
    tabela0.registros = item_array8;
    tabela0.n = (byte)10;
    ds.Item[] item_array12 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    int i8 = tabela6.binaria(item7);
    ds.Tabela tabela9 = new ds.Tabela();
    ds.Item item10 = null;
    int i11 = tabela9.binaria(item10);
    tabela9.n = '#';
    ds.Item[] item_array14 = tabela9.registros;
    tabela6.registros = item_array14;
    tabela0.registros = item_array14;
    int i17 = tabela0.n;
    int i18 = tabela0.n;
    ds.Item[] item_array19 = tabela0.registros;
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i21 = tabela0.binaria(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    int i8 = tabela6.binaria(item7);
    ds.Tabela tabela9 = new ds.Tabela();
    ds.Item item10 = null;
    int i11 = tabela9.binaria(item10);
    tabela9.n = '#';
    ds.Item[] item_array14 = tabela9.registros;
    tabela6.registros = item_array14;
    tabela0.registros = item_array14;
    int i17 = tabela0.n;
    int i18 = tabela0.n;
    ds.Item[] item_array19 = tabela0.registros;
    ds.Tabela tabela20 = new ds.Tabela();
    ds.Item item21 = null;
    int i22 = tabela20.binaria(item21);
    tabela20.n = '#';
    ds.Item[] item_array25 = tabela20.registros;
    ds.Tabela tabela26 = new ds.Tabela();
    ds.Item item27 = null;
    int i28 = tabela26.binaria(item27);
    ds.Tabela tabela29 = new ds.Tabela();
    ds.Item item30 = null;
    int i31 = tabela29.binaria(item30);
    tabela29.n = '#';
    ds.Item[] item_array34 = tabela29.registros;
    tabela26.registros = item_array34;
    tabela20.registros = item_array34;
    tabela0.registros = item_array34;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    int i8 = tabela6.binaria(item7);
    ds.Tabela tabela9 = new ds.Tabela();
    ds.Item item10 = null;
    int i11 = tabela9.binaria(item10);
    tabela9.n = '#';
    ds.Item[] item_array14 = tabela9.registros;
    tabela6.registros = item_array14;
    tabela0.registros = item_array14;
    int i17 = tabela0.n;
    int i18 = tabela0.n;
    tabela0.n = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    int i8 = tabela6.binaria(item7);
    ds.Tabela tabela9 = new ds.Tabela();
    ds.Item item10 = null;
    int i11 = tabela9.binaria(item10);
    tabela9.n = '#';
    ds.Item[] item_array14 = tabela9.registros;
    tabela6.registros = item_array14;
    tabela0.registros = item_array14;
    int i17 = tabela0.n;
    int i18 = tabela0.n;
    int i19 = tabela0.n;
    int i20 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
    ds.Item[] item_array6 = null;
    tabela0.registros = item_array6;
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i9 = tabela0.binaria(item8);
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    tabela0.n = '#';
    ds.Item[] item_array5 = tabela0.registros;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

}
