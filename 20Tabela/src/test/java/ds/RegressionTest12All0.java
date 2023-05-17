package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    ds.Item item11 = null;
    int i12 = tabela0.binaria(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Item item5 = null;
    int i6 = tabela0.binaria(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    int i11 = tabela0.n;
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
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    tabela0.n = 'a';
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Item[] item_array14 = tabela13.registros;
    tabela0.registros = item_array14;
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i17 = tabela0.pesquisa(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    tabela0.n = 'a';
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    tabela0.n = '4';
    ds.Tabela tabela7 = new ds.Tabela();
    ds.Tabela tabela8 = new ds.Tabela();
    ds.Item[] item_array9 = tabela8.registros;
    tabela7.registros = item_array9;
    tabela0.registros = item_array9;
    ds.Item[] item_array12 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    tabela0.n = '4';
    ds.Tabela tabela7 = new ds.Tabela();
    ds.Tabela tabela8 = new ds.Tabela();
    ds.Item[] item_array9 = tabela8.registros;
    tabela7.registros = item_array9;
    tabela0.registros = item_array9;
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i13 = tabela0.binaria(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    ds.Item item4 = null;
    tabela0.insere(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    tabela0.n = 'a';
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Tabela tabela14 = new ds.Tabela();
    ds.Item[] item_array15 = tabela14.registros;
    tabela13.registros = item_array15;
    int i17 = tabela13.n;
    ds.Tabela tabela18 = new ds.Tabela();
    ds.Tabela tabela19 = new ds.Tabela();
    ds.Item[] item_array20 = tabela19.registros;
    tabela18.registros = item_array20;
    ds.Item[] item_array22 = tabela18.registros;
    tabela13.registros = item_array22;
    tabela13.n = 'a';
    ds.Tabela tabela26 = new ds.Tabela();
    ds.Item[] item_array27 = tabela26.registros;
    tabela13.registros = item_array27;
    tabela0.registros = item_array27;
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    tabela0.registros = item_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    tabela0.n = 'a';
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Item[] item_array14 = tabela13.registros;
    tabela0.registros = item_array14;
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    tabela0.n = 'a';
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Tabela tabela14 = new ds.Tabela();
    ds.Item[] item_array15 = tabela14.registros;
    tabela13.registros = item_array15;
    int i17 = tabela13.n;
    ds.Tabela tabela18 = new ds.Tabela();
    ds.Tabela tabela19 = new ds.Tabela();
    ds.Item[] item_array20 = tabela19.registros;
    tabela18.registros = item_array20;
    ds.Item[] item_array22 = tabela18.registros;
    tabela13.registros = item_array22;
    tabela13.n = 'a';
    ds.Tabela tabela26 = new ds.Tabela();
    ds.Item[] item_array27 = tabela26.registros;
    tabela13.registros = item_array27;
    tabela0.registros = item_array27;
    int i30 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    tabela0.n = '4';
    ds.Item[] item_array7 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    ds.Item[] item_array4 = tabela0.registros;
    tabela0.n = '4';
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = tabela0.registros;
    int i2 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Tabela tabela1 = new ds.Tabela();
    ds.Item[] item_array2 = tabela1.registros;
    tabela0.registros = item_array2;
    int i4 = tabela0.n;
    ds.Tabela tabela5 = new ds.Tabela();
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = tabela6.registros;
    tabela5.registros = item_array7;
    ds.Item[] item_array9 = tabela5.registros;
    tabela0.registros = item_array9;
    int i11 = tabela0.n;
    ds.Tabela tabela12 = new ds.Tabela();
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Item[] item_array14 = tabela13.registros;
    tabela12.registros = item_array14;
    tabela0.registros = item_array14;
    ds.Item item17 = null;
    int i18 = tabela0.binaria(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

}
