package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test01"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
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

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test02"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test03"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
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
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test04"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
    int i6 = tabela0.n;
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i8 = tabela0.binaria(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test05"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
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
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test06"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Tabela tabela4 = new ds.Tabela();
    ds.Item item5 = null;
    tabela4.insere(item5);
    int i7 = tabela4.n;
    ds.Item[] item_array8 = new ds.Item[] {  };
    tabela4.registros = item_array8;
    tabela0.registros = item_array8;
    int i11 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test07"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item item4 = null;
    tabela0.insere(item4);
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    tabela6.insere(item7);
    ds.Item[] item_array9 = tabela6.registros;
    ds.Item[] item_array10 = tabela6.registros;
    ds.Item[] item_array11 = tabela6.registros;
    tabela0.registros = item_array11;
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Item item14 = null;
    tabela13.insere(item14);
    ds.Item[] item_array16 = tabela13.registros;
    ds.Item[] item_array17 = new ds.Item[] {  };
    tabela13.registros = item_array17;
    tabela0.registros = item_array17;
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
    tabela0.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test08"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item item4 = null;
    tabela0.insere(item4);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i7 = tabela0.binaria(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test09"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item item4 = null;
    tabela0.insere(item4);
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    tabela6.insere(item7);
    ds.Item[] item_array9 = tabela6.registros;
    ds.Item[] item_array10 = tabela6.registros;
    ds.Item[] item_array11 = tabela6.registros;
    tabela0.registros = item_array11;
    ds.Tabela tabela13 = new ds.Tabela();
    ds.Item item14 = null;
    tabela13.insere(item14);
    ds.Item[] item_array16 = tabela13.registros;
    ds.Item[] item_array17 = new ds.Item[] {  };
    tabela13.registros = item_array17;
    tabela0.registros = item_array17;
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
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test10"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item item3 = null;
    tabela0.insere(item3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test11"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item[] item_array4 = new ds.Item[] {  };
    tabela0.registros = item_array4;
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test12"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item item4 = null;
    tabela0.insere(item4);
    ds.Item[] item_array6 = tabela0.registros;
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
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test13"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    int i3 = tabela0.n;
    ds.Item item4 = null;
    tabela0.insere(item4);
    ds.Tabela tabela6 = new ds.Tabela();
    ds.Item item7 = null;
    tabela6.insere(item7);
    ds.Item[] item_array9 = tabela6.registros;
    ds.Item[] item_array10 = tabela6.registros;
    ds.Item[] item_array11 = tabela6.registros;
    tabela0.registros = item_array11;
    ds.Item item13 = null;
    tabela0.insere(item13);
    ds.Tabela tabela15 = new ds.Tabela();
    ds.Item item16 = null;
    tabela15.insere(item16);
    int i18 = tabela15.n;
    ds.Item item19 = null;
    tabela15.insere(item19);
    ds.Tabela tabela21 = new ds.Tabela();
    ds.Item item22 = null;
    tabela21.insere(item22);
    ds.Item[] item_array24 = tabela21.registros;
    ds.Item[] item_array25 = tabela21.registros;
    ds.Item[] item_array26 = tabela21.registros;
    tabela15.registros = item_array26;
    ds.Tabela tabela28 = new ds.Tabela();
    ds.Item item29 = null;
    tabela28.insere(item29);
    ds.Item[] item_array31 = tabela28.registros;
    ds.Item[] item_array32 = new ds.Item[] {  };
    tabela28.registros = item_array32;
    tabela15.registros = item_array32;
    tabela0.registros = item_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test14"); }


    ds.Tabela tabela0 = new ds.Tabela();
    ds.Item item1 = null;
    tabela0.insere(item1);
    ds.Item[] item_array3 = tabela0.registros;
    ds.Item item4 = null;
    tabela0.insere(item4);
    int i6 = tabela0.n;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

}
