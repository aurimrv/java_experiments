package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)(-1), 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(100, (java.lang.Object)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item3);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'#');
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'#');
    fPHeapMax7.imprime();
    fPHeapMax7.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMax7.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item15 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item4 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'#');
    fPHeapMax5.imprime();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)'#');
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)'#');
    fPHeapMax11.imprime();
    fPHeapMax11.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMax11.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax5.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    java.lang.Object obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(0, obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'#');
    fPHeapMax3.imprime();
    fPHeapMax3.imprime();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMax3.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.Item item10 = fPHeapMax1.max();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMax1.copia(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

}
