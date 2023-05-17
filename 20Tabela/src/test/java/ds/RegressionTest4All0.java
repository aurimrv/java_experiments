package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


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

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = tabela0.pesquisa(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    ds.Item item7 = null;
    int i8 = tabela0.binaria(item7);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i10 = tabela0.pesquisa(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = tabela0.pesquisa(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = new ds.Item[] {  };
    tabela6.registros = item_array7;
    ds.Item[] item_array9 = tabela6.registros;
    tabela0.registros = item_array9;
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item11);
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
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Tabela tabela4 = new ds.Tabela();
    ds.Item[] item_array5 = new ds.Item[] {  };
    tabela4.registros = item_array5;
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    tabela4.registros = item_array8;
    tabela0.registros = item_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    ds.Item item7 = null;
    int i8 = tabela0.binaria(item7);
    tabela0.n = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    ds.Tabela tabela8 = new ds.Tabela();
    ds.Item[] item_array9 = new ds.Item[] {  };
    tabela8.registros = item_array9;
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    tabela8.registros = item_array12;
    tabela0.registros = item_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item4);
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item[] item_array7 = new ds.Item[] {  };
    tabela6.registros = item_array7;
    ds.Item[] item_array9 = tabela6.registros;
    tabela0.registros = item_array9;
    ds.Item item11 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i12 = tabela0.pesquisa(item11);
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
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
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
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    int i2 = tabela0.binaria(item1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    ds.Tabela tabela8 = new ds.Tabela();
    ds.Item[] item_array9 = new ds.Item[] {  };
    tabela8.registros = item_array9;
    ds.Tabela tabela11 = new ds.Tabela();
    ds.Item[] item_array12 = new ds.Item[] {  };
    tabela11.registros = item_array12;
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    tabela11.registros = item_array15;
    ds.Tabela tabela17 = new ds.Tabela();
    ds.Item[] item_array18 = new ds.Item[] {  };
    tabela17.registros = item_array18;
    ds.Item[] item_array20 = tabela17.registros;
    tabela11.registros = item_array20;
    tabela8.registros = item_array20;
    tabela0.registros = item_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test16"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
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
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test17"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    int i3 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test18"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item item4 = null;
    int i5 = tabela0.binaria(item4);
    ds.Item[] item_array6 = tabela0.registros;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test19"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item[] item_array1 = new ds.Item[] {  };
    tabela0.registros = item_array1;
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    tabela0.n = 10;
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item10);
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
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

}
