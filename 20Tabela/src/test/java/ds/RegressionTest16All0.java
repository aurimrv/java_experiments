package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item item3 = null;
    tabela0.insere(item3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    ds.Item[] item_array5 = null;
    tabela0.registros = item_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    int i6 = tabela0.n;
    int i7 = tabela0.n;
    ds.Tabela tabela8 = new ds.Tabela();
    tabela8.n = (byte)0;
    ds.Item[] item_array11 = new ds.Item[] {  };
    tabela8.registros = item_array11;
    int i13 = tabela8.n;
    ds.Item[] item_array14 = tabela8.registros;
    tabela0.registros = item_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    ds.Item[] item_array6 = tabela0.registros;
    ds.Item[] item_array7 = new ds.Item[] {  };
    tabela0.registros = item_array7;
    ds.Item item9 = null;
    int i10 = tabela0.binaria(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    int i5 = tabela0.n;
    ds.Item[] item_array6 = tabela0.registros;
    ds.Item[] item_array7 = new ds.Item[] {  };
    tabela0.registros = item_array7;
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    int i3 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item[] item_array3 = new ds.Item[] {  };
    tabela0.registros = item_array3;
    ds.Item[] item_array5 = tabela0.registros;
    int i6 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    ds.Tabela tabela5 = new ds.Tabela();
    tabela5.n = (byte)0;
    ds.Item[] item_array8 = new ds.Item[] {  };
    tabela5.registros = item_array8;
    int i10 = tabela5.n;
    ds.Item[] item_array11 = tabela5.registros;
    ds.Item item12 = null;
    int i13 = tabela5.binaria(item12);
    tabela5.n = (short)100;
    ds.Tabela tabela16 = new ds.Tabela();
    tabela16.n = (byte)0;
    ds.Item[] item_array19 = new ds.Item[] {  };
    tabela16.registros = item_array19;
    int i21 = tabela16.n;
    int i22 = tabela16.n;
    ds.Item[] item_array23 = tabela16.registros;
    tabela5.registros = item_array23;
    tabela0.registros = item_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test15"); }


    ds.Tabela tabela0 = new ds.Tabela();
    tabela0.n = (byte)0;
    ds.Item item3 = null;
    int i4 = tabela0.binaria(item3);
    tabela0.n = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

}
