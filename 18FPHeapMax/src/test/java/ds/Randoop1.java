package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test001"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test002"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax5.copia(item_array9);
    ds.Item item12 = fPHeapMax5.max();
    ds.Item item13 = fPHeapMax5.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    fPHeapMax15.constroi();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((-1));
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax20.copia(item_array23);
    fPHeapMax20.imprime();
    ds.Item item27 = fPHeapMax20.max();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
    fPHeapMax32.constroi();
    fPHeapMax32.constroi();
    fPHeapMax32.imprime();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    fPHeapMax32.copia(item_array40);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax45.constroi();
    fPHeapMax45.imprime();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((-1));
    fPHeapMax49.constroi();
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array51);
    fPHeapMax45.copia(item_array51);
    fPHeapMax32.copia(item_array51);
    fPHeapMax29.copia(item_array51);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax59.copia(item_array60);
    fPHeapMax57.copia(item_array60);
    ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax(10);
    fPHeapMax64.constroi();
    ds.Item item66 = fPHeapMax64.max();
    ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array69 = new ds.Item[] {  };
    fPHeapMax68.copia(item_array69);
    fPHeapMax64.copia(item_array69);
    fPHeapMax57.copia(item_array69);
    fPHeapMax29.copia(item_array69);
    fPHeapMax20.copia(item_array69);
    fPHeapMax15.copia(item_array69);
    fPHeapMax5.copia(item_array69);
    fPHeapMax1.copia(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test003"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test004"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item18 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test005"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(byte)1, 0);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test006"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax5.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array18);
    fPHeapMax12.copia(item_array18);
    fPHeapMax5.copia(item_array18);
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMax24.copia(item_array28);
    fPHeapMax5.copia(item_array28);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int)(short)100);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax38.copia(item_array40);
    fPHeapMax34.copia(item_array40);
    fPHeapMax34.constroi();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    fPHeapMax45.constroi();
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
    fPHeapMax48.constroi();
    ds.Item item50 = fPHeapMax48.max();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array53 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array53);
    fPHeapMax48.copia(item_array53);
    fPHeapMax45.copia(item_array53);
    fPHeapMax34.copia(item_array53);
    fPHeapMax32.copia(item_array53);
    fPHeapMax5.copia(item_array53);
    fPHeapMax1.copia(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test007"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test008"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)100);
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    ds.Item item15 = fPHeapMax12.max();
    ds.Item item16 = fPHeapMax12.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)0, (java.lang.Object)item16);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test009"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax1.copia(item_array64);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item72 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test010"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    fPHeapMax9.copia(item_array17);
    fPHeapMax9.constroi();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax9.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    fPHeapMax34.constroi();
    fPHeapMax34.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMax34.copia(item_array38);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array42);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    fPHeapMax45.constroi();
    ds.Item[] item_array47 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array47);
    fPHeapMax41.copia(item_array47);
    fPHeapMax34.copia(item_array47);
    fPHeapMax1.copia(item_array47);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item52 = fPHeapMax1.max();
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
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array47);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test011"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item12 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test012"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test013"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test014"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.constroi();
    ds.Item item9 = fPHeapMax7.max();
    fPHeapMax7.constroi();
    ds.Item item11 = fPHeapMax7.max();
    fPHeapMax7.imprime();
    fPHeapMax7.constroi();
    ds.Item item14 = fPHeapMax7.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)item14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test015"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test016"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item58 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item58);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test017"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test018"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)(short)100);
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
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test019"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test020"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test021"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
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
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test022"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    ds.Item item20 = fPHeapMax14.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array25);
    fPHeapMax22.copia(item_array25);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array28);
    fPHeapMax14.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    fPHeapMax1.imprime();
    ds.Item item33 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item33);
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
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test023"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array18);
    fPHeapMax12.copia(item_array18);
    fPHeapMax5.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.imprime();
    fPHeapMax23.imprime();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax23.copia(item_array29);
    fPHeapMax5.copia(item_array29);
    fPHeapMax1.copia(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test024"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array29);
    fPHeapMax23.copia(item_array29);
    fPHeapMax10.copia(item_array29);
    fPHeapMax7.copia(item_array29);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((-1));
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax35.copia(item_array38);
    fPHeapMax7.copia(item_array38);
    fPHeapMax1.copia(item_array38);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test025"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item7 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'a', (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test026"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMax1.retiraMax();
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test027"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax8.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    fPHeapMax19.imprime();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    fPHeapMax23.constroi();
    ds.Item item27 = fPHeapMax23.max();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    fPHeapMax23.copia(item_array31);
    fPHeapMax19.copia(item_array31);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((-1));
    fPHeapMax36.constroi();
    fPHeapMax36.constroi();
    fPHeapMax36.imprime();
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    fPHeapMax36.copia(item_array44);
    fPHeapMax19.copia(item_array44);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)item_array44);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test028"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax8.copia(item_array12);
    ds.Item item15 = fPHeapMax8.max();
    ds.Item item16 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax23.imprime();
    ds.Item item30 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    fPHeapMax32.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    fPHeapMax35.constroi();
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
    ds.Item[] item_array43 = new ds.Item[] {  };
    fPHeapMax42.copia(item_array43);
    fPHeapMax40.copia(item_array43);
    fPHeapMax35.copia(item_array43);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax48.constroi();
    fPHeapMax48.imprime();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
    fPHeapMax52.constroi();
    ds.Item[] item_array54 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array54);
    fPHeapMax48.copia(item_array54);
    fPHeapMax35.copia(item_array54);
    fPHeapMax32.copia(item_array54);
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array63 = new ds.Item[] {  };
    fPHeapMax62.copia(item_array63);
    fPHeapMax60.copia(item_array63);
    ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax(10);
    fPHeapMax67.constroi();
    ds.Item item69 = fPHeapMax67.max();
    ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array72 = new ds.Item[] {  };
    fPHeapMax71.copia(item_array72);
    fPHeapMax67.copia(item_array72);
    fPHeapMax60.copia(item_array72);
    fPHeapMax32.copia(item_array72);
    fPHeapMax23.copia(item_array72);
    fPHeapMax18.copia(item_array72);
    fPHeapMax8.copia(item_array72);
    fPHeapMax1.copia(item_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test029"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test030"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test031"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax6.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    fPHeapMax21.constroi();
    fPHeapMax21.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    fPHeapMax21.copia(item_array29);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax34.constroi();
    fPHeapMax34.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax38.copia(item_array40);
    fPHeapMax34.copia(item_array40);
    fPHeapMax21.copia(item_array40);
    fPHeapMax18.copia(item_array40);
    fPHeapMax15.copia(item_array40);
    fPHeapMax1.copia(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test032"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test033"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test034"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    ds.Item item41 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item41);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test035"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    fPHeapMax28.copia(item_array31);
    fPHeapMax28.imprime();
    ds.Item item35 = fPHeapMax28.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    fPHeapMax37.imprime();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
    fPHeapMax40.constroi();
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((-1));
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    fPHeapMax40.copia(item_array48);
    ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax53.constroi();
    fPHeapMax53.imprime();
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
    fPHeapMax57.constroi();
    ds.Item[] item_array59 = new ds.Item[] {  };
    fPHeapMax57.copia(item_array59);
    fPHeapMax53.copia(item_array59);
    fPHeapMax40.copia(item_array59);
    fPHeapMax37.copia(item_array59);
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array68 = new ds.Item[] {  };
    fPHeapMax67.copia(item_array68);
    fPHeapMax65.copia(item_array68);
    ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax(10);
    fPHeapMax72.constroi();
    ds.Item item74 = fPHeapMax72.max();
    ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array77 = new ds.Item[] {  };
    fPHeapMax76.copia(item_array77);
    fPHeapMax72.copia(item_array77);
    fPHeapMax65.copia(item_array77);
    fPHeapMax37.copia(item_array77);
    fPHeapMax28.copia(item_array77);
    fPHeapMax23.copia(item_array77);
    fPHeapMax1.copia(item_array77);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array77);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test036"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item13 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    fPHeapMax19.constroi();
    ds.Item item21 = fPHeapMax19.max();
    fPHeapMax19.constroi();
    ds.Item item23 = fPHeapMax19.max();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax19.copia(item_array27);
    fPHeapMax15.copia(item_array27);
    ds.Item item31 = fPHeapMax15.max();
    fPHeapMax15.constroi();
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax36.copia(item_array37);
    fPHeapMax36.constroi();
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    fPHeapMax36.copia(item_array44);
    fPHeapMax34.copia(item_array44);
    fPHeapMax15.copia(item_array44);
    fPHeapMax1.copia(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test037"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    ds.Item item57 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test038"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    fPHeapMax12.imprime();
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)fPHeapMax12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test039"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test040"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax14.constroi();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    fPHeapMax14.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    fPHeapMax33.constroi();
    ds.Item item35 = fPHeapMax33.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax33.copia(item_array38);
    fPHeapMax26.copia(item_array38);
    fPHeapMax26.constroi();
    fPHeapMax26.constroi();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    fPHeapMax45.constroi();
    ds.Item item49 = fPHeapMax45.max();
    fPHeapMax45.imprime();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
    fPHeapMax52.constroi();
    ds.Item[] item_array54 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array54);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax57.imprime();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array61 = new ds.Item[] {  };
    fPHeapMax60.copia(item_array61);
    fPHeapMax57.copia(item_array61);
    fPHeapMax52.copia(item_array61);
    fPHeapMax45.copia(item_array61);
    fPHeapMax26.copia(item_array61);
    fPHeapMax1.copia(item_array61);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test041"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.refaz((int)(byte)10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test042"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.Item item22 = fPHeapMax16.max();
    fPHeapMax16.constroi();
    ds.Item item24 = fPHeapMax16.max();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    fPHeapMax33.constroi();
    ds.Item item35 = fPHeapMax33.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax33.copia(item_array38);
    fPHeapMax26.copia(item_array38);
    fPHeapMax16.copia(item_array38);
    fPHeapMax1.copia(item_array38);
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    ds.Item item52 = fPHeapMax46.max();
    fPHeapMax46.constroi();
    ds.Item item54 = fPHeapMax46.max();
    fPHeapMax46.imprime();
    fPHeapMax46.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)fPHeapMax46);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item54);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test043"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item13 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test044"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    fPHeapMax8.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMax8.copia(item_array12);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array16);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    fPHeapMax19.constroi();
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array21);
    fPHeapMax15.copia(item_array21);
    fPHeapMax8.copia(item_array21);
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMax27.copia(item_array31);
    fPHeapMax8.copia(item_array31);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)100);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((-1));
    fPHeapMax41.constroi();
    ds.Item[] item_array43 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array43);
    fPHeapMax37.copia(item_array43);
    fPHeapMax37.constroi();
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    fPHeapMax48.constroi();
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(10);
    fPHeapMax51.constroi();
    ds.Item item53 = fPHeapMax51.max();
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array56 = new ds.Item[] {  };
    fPHeapMax55.copia(item_array56);
    fPHeapMax51.copia(item_array56);
    fPHeapMax48.copia(item_array56);
    fPHeapMax37.copia(item_array56);
    fPHeapMax35.copia(item_array56);
    fPHeapMax8.copia(item_array56);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)1, (java.lang.Object)item_array56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test045"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test046"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test047"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax10.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax5.copia(item_array18);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.imprime();
    fPHeapMax25.constroi();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax29.constroi();
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax25.copia(item_array35);
    fPHeapMax5.copia(item_array35);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    ds.Item item47 = fPHeapMax41.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array52 = new ds.Item[] {  };
    fPHeapMax51.copia(item_array52);
    fPHeapMax49.copia(item_array52);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array55);
    fPHeapMax41.copia(item_array55);
    fPHeapMax5.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.Item item60 = fPHeapMax1.max();
    ds.Item item61 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item61);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item60);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test048"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.constroi();
    ds.Item item13 = fPHeapMax11.max();
    fPHeapMax11.constroi();
    ds.Item item15 = fPHeapMax11.max();
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax23.copia(item_array27);
    fPHeapMax18.copia(item_array27);
    fPHeapMax11.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    ds.Item item33 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item33);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test049"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test050"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item13 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test051"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(0, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test052"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item item15 = fPHeapMax9.max();
    fPHeapMax9.constroi();
    ds.Item item17 = fPHeapMax9.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax19.copia(item_array22);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    fPHeapMax26.constroi();
    ds.Item item28 = fPHeapMax26.max();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    fPHeapMax26.copia(item_array31);
    fPHeapMax19.copia(item_array31);
    fPHeapMax9.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test053"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.constroi();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array11);
    fPHeapMax5.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax16.copia(item_array19);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    fPHeapMax23.constroi();
    ds.Item item25 = fPHeapMax23.max();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax23.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    fPHeapMax1.copia(item_array28);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item33 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test054"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMax14.copia(item_array18);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array27);
    fPHeapMax21.copia(item_array27);
    fPHeapMax14.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test055"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test056"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax21.imprime();
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array31);
    fPHeapMax25.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    ds.Item item43 = fPHeapMax37.max();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array51);
    fPHeapMax37.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'4', (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test057"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)1);
    ds.Item item48 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((-1));
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax47.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = fPHeapMax1.max();
    ds.Item item56 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item56);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item55);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test058"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item3 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test059"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test060"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item11 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test061"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)' ', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test062"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array16);
    fPHeapMax13.copia(item_array16);
    fPHeapMax13.imprime();
    ds.Item item20 = fPHeapMax13.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(10);
    fPHeapMax22.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    fPHeapMax25.constroi();
    fPHeapMax25.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array33);
    fPHeapMax30.copia(item_array33);
    fPHeapMax25.copia(item_array33);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
    fPHeapMax42.constroi();
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax42.copia(item_array44);
    fPHeapMax38.copia(item_array44);
    fPHeapMax25.copia(item_array44);
    fPHeapMax22.copia(item_array44);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array53 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array53);
    fPHeapMax50.copia(item_array53);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax(10);
    fPHeapMax57.constroi();
    ds.Item item59 = fPHeapMax57.max();
    ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array62 = new ds.Item[] {  };
    fPHeapMax61.copia(item_array62);
    fPHeapMax57.copia(item_array62);
    fPHeapMax50.copia(item_array62);
    fPHeapMax22.copia(item_array62);
    fPHeapMax13.copia(item_array62);
    fPHeapMax8.copia(item_array62);
    fPHeapMax4.copia(item_array62);
    fPHeapMax1.copia(item_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test063"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    fPHeapMax16.constroi();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax25.copia(item_array28);
    fPHeapMax25.imprime();
    ds.Item item32 = fPHeapMax25.max();
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(10);
    fPHeapMax34.imprime();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((-1));
    fPHeapMax37.constroi();
    fPHeapMax37.constroi();
    fPHeapMax37.imprime();
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    ds.Item[] item_array45 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array45);
    fPHeapMax42.copia(item_array45);
    fPHeapMax37.copia(item_array45);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax50.constroi();
    fPHeapMax50.imprime();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((-1));
    fPHeapMax54.constroi();
    ds.Item[] item_array56 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array56);
    fPHeapMax50.copia(item_array56);
    fPHeapMax37.copia(item_array56);
    fPHeapMax34.copia(item_array56);
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array65 = new ds.Item[] {  };
    fPHeapMax64.copia(item_array65);
    fPHeapMax62.copia(item_array65);
    ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax(10);
    fPHeapMax69.constroi();
    ds.Item item71 = fPHeapMax69.max();
    ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array74 = new ds.Item[] {  };
    fPHeapMax73.copia(item_array74);
    fPHeapMax69.copia(item_array74);
    fPHeapMax62.copia(item_array74);
    fPHeapMax34.copia(item_array74);
    fPHeapMax25.copia(item_array74);
    fPHeapMax20.copia(item_array74);
    fPHeapMax16.copia(item_array74);
    fPHeapMax1.copia(item_array74);
    ds.Item item83 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item83);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test064"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((-1));
    fPHeapMax61.constroi();
    fPHeapMax61.imprime();
    fPHeapMax61.imprime();
    fPHeapMax61.constroi();
    ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array68 = new ds.Item[] {  };
    fPHeapMax67.copia(item_array68);
    fPHeapMax67.constroi();
    ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((-1));
    ds.Item[] item_array75 = new ds.Item[] {  };
    fPHeapMax74.copia(item_array75);
    fPHeapMax72.copia(item_array75);
    fPHeapMax67.copia(item_array75);
    ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((-1));
    ds.Item[] item_array83 = new ds.Item[] {  };
    fPHeapMax82.copia(item_array83);
    fPHeapMax80.copia(item_array83);
    ds.Item item86 = fPHeapMax80.max();
    ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax90 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array91 = new ds.Item[] {  };
    fPHeapMax90.copia(item_array91);
    fPHeapMax88.copia(item_array91);
    ds.Item[] item_array94 = new ds.Item[] {  };
    fPHeapMax88.copia(item_array94);
    fPHeapMax80.copia(item_array94);
    fPHeapMax67.copia(item_array94);
    fPHeapMax61.copia(item_array94);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)item_array94);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array94);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test065"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test066"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.imprime();
    fPHeapMax23.constroi();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax23.copia(item_array33);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax23.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
    fPHeapMax57.constroi();
    ds.Item[] item_array59 = new ds.Item[] {  };
    fPHeapMax57.copia(item_array59);
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax62.imprime();
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax62.copia(item_array66);
    fPHeapMax57.copia(item_array66);
    fPHeapMax1.copia(item_array66);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item71 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test067"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test068"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item14 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test069"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test070"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item11 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test071"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz(100, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test072"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test073"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test074"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test075"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax29.imprime();
    ds.Item item36 = fPHeapMax29.max();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(10);
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((-1));
    fPHeapMax41.constroi();
    fPHeapMax41.constroi();
    fPHeapMax41.imprime();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    fPHeapMax41.copia(item_array49);
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax54.constroi();
    fPHeapMax54.imprime();
    ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((-1));
    fPHeapMax58.constroi();
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax58.copia(item_array60);
    fPHeapMax54.copia(item_array60);
    fPHeapMax41.copia(item_array60);
    fPHeapMax38.copia(item_array60);
    ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array69 = new ds.Item[] {  };
    fPHeapMax68.copia(item_array69);
    fPHeapMax66.copia(item_array69);
    ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax(10);
    fPHeapMax73.constroi();
    ds.Item item75 = fPHeapMax73.max();
    ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array78 = new ds.Item[] {  };
    fPHeapMax77.copia(item_array78);
    fPHeapMax73.copia(item_array78);
    fPHeapMax66.copia(item_array78);
    fPHeapMax38.copia(item_array78);
    fPHeapMax29.copia(item_array78);
    ds.Item item84 = fPHeapMax29.max();
    ds.Item item85 = fPHeapMax29.max();
    ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax((-1));
    ds.Item[] item_array88 = new ds.Item[] {  };
    fPHeapMax87.copia(item_array88);
    fPHeapMax29.copia(item_array88);
    ds.Item item91 = fPHeapMax29.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)item91);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item91);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test076"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    fPHeapMax19.constroi();
    ds.Item item21 = fPHeapMax19.max();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax19.copia(item_array24);
    fPHeapMax16.copia(item_array24);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    fPHeapMax29.constroi();
    fPHeapMax29.constroi();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMax29.copia(item_array33);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax36.copia(item_array37);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
    fPHeapMax40.constroi();
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array42);
    fPHeapMax36.copia(item_array42);
    fPHeapMax29.copia(item_array42);
    fPHeapMax16.copia(item_array42);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax48.copia(item_array51);
    ds.Item[] item_array54 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array54);
    fPHeapMax16.copia(item_array54);
    fPHeapMax1.copia(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test077"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)1);
    ds.Item item6 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item8 = fPHeapMax5.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test078"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item25 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test079"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    ds.Item item37 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item37);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test080"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)(short)1);
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
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test081"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.constroi();
    fPHeapMax7.constroi();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax12.constroi();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax17.copia(item_array20);
    fPHeapMax12.copia(item_array20);
    fPHeapMax7.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item27 = fPHeapMax1.retiraMax();
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
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test082"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    fPHeapMax8.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array20);
    fPHeapMax8.copia(item_array20);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)item_array20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test083"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item18 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)(-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test084"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)1);
    ds.Item item48 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((-1));
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax47.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = fPHeapMax1.max();
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)'a');
    ds.Item item61 = fPHeapMax60.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)item61);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test085"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.constroi();
    ds.Item item13 = fPHeapMax11.max();
    fPHeapMax11.constroi();
    ds.Item item15 = fPHeapMax11.max();
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax23.copia(item_array27);
    fPHeapMax18.copia(item_array27);
    fPHeapMax11.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)(-1), (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test086"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    fPHeapMax11.copia(item_array21);
    fPHeapMax1.copia(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test087"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test088"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test089"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test090"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test091"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax19.imprime();
    fPHeapMax19.constroi();
    fPHeapMax19.constroi();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(10);
    fPHeapMax28.constroi();
    ds.Item item30 = fPHeapMax28.max();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array33);
    fPHeapMax28.copia(item_array33);
    fPHeapMax25.copia(item_array33);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    fPHeapMax38.constroi();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMax38.copia(item_array42);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((-1));
    fPHeapMax49.constroi();
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array51);
    fPHeapMax45.copia(item_array51);
    fPHeapMax38.copia(item_array51);
    fPHeapMax25.copia(item_array51);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax59.copia(item_array60);
    fPHeapMax57.copia(item_array60);
    ds.Item[] item_array63 = new ds.Item[] {  };
    fPHeapMax57.copia(item_array63);
    fPHeapMax25.copia(item_array63);
    fPHeapMax19.copia(item_array63);
    fPHeapMax1.copia(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test092"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item59 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item59);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test093"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test094"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test095"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)1);
    ds.Item item48 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((-1));
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax47.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = fPHeapMax1.max();
    ds.Item item56 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item57 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test096"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    fPHeapMax7.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test097"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax18.constroi();
    ds.Item item25 = fPHeapMax18.max();
    fPHeapMax18.constroi();
    ds.Item item27 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    fPHeapMax29.constroi();
    fPHeapMax29.constroi();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax18.copia(item_array35);
    fPHeapMax1.copia(item_array35);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test098"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)1, (-1));
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
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test099"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item13 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test100"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test101"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax4.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax22.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax25.copia(item_array28);
    ds.Item item31 = fPHeapMax25.max();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    ds.Item[] item_array39 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array39);
    fPHeapMax25.copia(item_array39);
    fPHeapMax22.copia(item_array39);
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax44.imprime();
    fPHeapMax44.constroi();
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax48.constroi();
    fPHeapMax48.imprime();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
    fPHeapMax52.constroi();
    ds.Item[] item_array54 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array54);
    fPHeapMax48.copia(item_array54);
    fPHeapMax44.copia(item_array54);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array62 = new ds.Item[] {  };
    fPHeapMax61.copia(item_array62);
    fPHeapMax59.copia(item_array62);
    ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(10);
    fPHeapMax66.constroi();
    ds.Item item68 = fPHeapMax66.max();
    ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array71 = new ds.Item[] {  };
    fPHeapMax70.copia(item_array71);
    fPHeapMax66.copia(item_array71);
    fPHeapMax59.copia(item_array71);
    fPHeapMax44.copia(item_array71);
    fPHeapMax22.copia(item_array71);
    ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((-1));
    fPHeapMax78.constroi();
    ds.Item[] item_array80 = new ds.Item[] {  };
    fPHeapMax78.copia(item_array80);
    ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax83.imprime();
    ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array87 = new ds.Item[] {  };
    fPHeapMax86.copia(item_array87);
    fPHeapMax83.copia(item_array87);
    fPHeapMax78.copia(item_array87);
    fPHeapMax22.copia(item_array87);
    fPHeapMax1.copia(item_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array87);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test102"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.constroi();
    ds.Item item8 = fPHeapMax6.max();
    fPHeapMax6.constroi();
    ds.Item item10 = fPHeapMax6.max();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax18.copia(item_array22);
    fPHeapMax13.copia(item_array22);
    fPHeapMax6.copia(item_array22);
    fPHeapMax1.copia(item_array22);
    ds.Item item28 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item28);
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
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test103"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item14 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test104"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    ds.Item item16 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array24);
    fPHeapMax10.copia(item_array24);
    fPHeapMax7.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    fPHeapMax33.imprime();
    fPHeapMax33.imprime();
    ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
    fPHeapMax42.constroi();
    fPHeapMax42.constroi();
    fPHeapMax42.imprime();
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((-1));
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax47.copia(item_array50);
    fPHeapMax42.copia(item_array50);
    fPHeapMax33.copia(item_array50);
    fPHeapMax31.copia(item_array50);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test105"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test106"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax7.constroi();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    fPHeapMax11.constroi();
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array13);
    fPHeapMax7.copia(item_array13);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    fPHeapMax17.constroi();
    ds.Item item19 = fPHeapMax17.max();
    fPHeapMax17.constroi();
    ds.Item item21 = fPHeapMax17.max();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array26);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax29.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array33);
    fPHeapMax29.copia(item_array33);
    fPHeapMax24.copia(item_array33);
    fPHeapMax17.copia(item_array33);
    fPHeapMax7.copia(item_array33);
    fPHeapMax1.copia(item_array33);
    ds.Item item40 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item40);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test107"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test108"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item58 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test109"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item18 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item20 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test110"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.imprime();
    fPHeapMax7.imprime();
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)1);
    ds.Item item18 = fPHeapMax17.max();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax20.copia(item_array23);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array26);
    fPHeapMax17.copia(item_array26);
    fPHeapMax7.copia(item_array26);
    fPHeapMax1.copia(item_array26);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)10, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test111"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.constroi();
    ds.Item item6 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMax14.copia(item_array18);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    fPHeapMax25.constroi();
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array27);
    fPHeapMax21.copia(item_array27);
    fPHeapMax14.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax33.copia(item_array36);
    ds.Item[] item_array39 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array39);
    fPHeapMax1.copia(item_array39);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array39);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test112"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item item17 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax25.constroi();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array33);
    fPHeapMax30.copia(item_array33);
    fPHeapMax25.copia(item_array33);
    fPHeapMax20.copia(item_array33);
    fPHeapMax20.constroi();
    fPHeapMax20.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)fPHeapMax20);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test113"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test114"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test115"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax43.imprime();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    ds.Item item52 = fPHeapMax46.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax56.copia(item_array57);
    fPHeapMax54.copia(item_array57);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array60);
    fPHeapMax46.copia(item_array60);
    fPHeapMax43.copia(item_array60);
    fPHeapMax1.copia(item_array60);
    fPHeapMax1.refaz((int)(byte)10, (int)(byte)0);
    fPHeapMax1.imprime();
    ds.Item item69 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item69);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test116"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test117"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.constroi();
    ds.Item item14 = fPHeapMax7.max();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax16.constroi();
    fPHeapMax16.constroi();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(10);
    fPHeapMax22.constroi();
    fPHeapMax22.constroi();
    fPHeapMax22.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    fPHeapMax27.constroi();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    fPHeapMax22.copia(item_array35);
    fPHeapMax16.copia(item_array35);
    fPHeapMax7.copia(item_array35);
    fPHeapMax1.copia(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test118"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test119"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test120"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test121"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test122"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test123"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test124"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax20.copia(item_array33);
    fPHeapMax7.copia(item_array33);
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array42);
    fPHeapMax39.copia(item_array42);
    ds.Item[] item_array45 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array45);
    fPHeapMax7.copia(item_array45);
    fPHeapMax1.copia(item_array45);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test125"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test126"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test127"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax4.imprime();
    ds.Item item6 = fPHeapMax4.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test128"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    ds.Item item2 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test129"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test130"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item24 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test131"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array17);
    fPHeapMax5.copia(item_array17);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    fPHeapMax21.constroi();
    ds.Item item23 = fPHeapMax21.max();
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax21.copia(item_array26);
    fPHeapMax5.copia(item_array26);
    fPHeapMax1.copia(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test132"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test133"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array17);
    fPHeapMax11.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test134"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.constroi();
    ds.Item item17 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array20);
    fPHeapMax15.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.Item item35 = fPHeapMax29.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array40 = new ds.Item[] {  };
    fPHeapMax39.copia(item_array40);
    fPHeapMax37.copia(item_array40);
    ds.Item[] item_array43 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array43);
    fPHeapMax29.copia(item_array43);
    fPHeapMax26.copia(item_array43);
    fPHeapMax26.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(1, (java.lang.Object)fPHeapMax26);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test135"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.constroi();
    ds.Item item9 = fPHeapMax7.max();
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax21.copia(item_array24);
    fPHeapMax21.imprime();
    fPHeapMax21.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    fPHeapMax30.constroi();
    fPHeapMax30.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((-1));
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax35.copia(item_array38);
    fPHeapMax30.copia(item_array38);
    fPHeapMax21.copia(item_array38);
    fPHeapMax19.copia(item_array38);
    fPHeapMax12.copia(item_array38);
    fPHeapMax7.copia(item_array38);
    fPHeapMax7.constroi();
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax49.imprime();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((-1));
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.Item item58 = fPHeapMax52.max();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array63 = new ds.Item[] {  };
    fPHeapMax62.copia(item_array63);
    fPHeapMax60.copia(item_array63);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax60.copia(item_array66);
    fPHeapMax52.copia(item_array66);
    fPHeapMax49.copia(item_array66);
    fPHeapMax7.copia(item_array66);
    fPHeapMax1.copia(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test136"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    fPHeapMax8.constroi();
    ds.Item item12 = fPHeapMax8.max();
    fPHeapMax8.imprime();
    ds.Item item14 = fPHeapMax8.max();
    ds.Item item15 = fPHeapMax8.max();
    fPHeapMax8.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)fPHeapMax8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test137"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax4.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    fPHeapMax21.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMax21.copia(item_array25);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
    fPHeapMax32.constroi();
    ds.Item[] item_array34 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array34);
    fPHeapMax28.copia(item_array34);
    fPHeapMax21.copia(item_array34);
    fPHeapMax1.copia(item_array34);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item39 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test138"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item7 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test139"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test140"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array9);
    fPHeapMax3.copia(item_array9);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(10);
    fPHeapMax17.constroi();
    ds.Item item19 = fPHeapMax17.max();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax17.copia(item_array22);
    fPHeapMax14.copia(item_array22);
    fPHeapMax3.copia(item_array22);
    fPHeapMax1.copia(item_array22);
    ds.Item item28 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test141"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test142"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.imprime();
    ds.Item item20 = fPHeapMax1.max();
    ds.Item item21 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test143"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.Item item17 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax19.copia(item_array22);
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax19.copia(item_array25);
    fPHeapMax11.copia(item_array25);
    fPHeapMax1.copia(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test144"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.Item item58 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test145"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array10);
    fPHeapMax4.copia(item_array10);
    fPHeapMax4.constroi();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax15.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test146"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.Item item46 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item46);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test147"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax43.imprime();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    ds.Item item52 = fPHeapMax46.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax56.copia(item_array57);
    fPHeapMax54.copia(item_array57);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array60);
    fPHeapMax46.copia(item_array60);
    fPHeapMax43.copia(item_array60);
    fPHeapMax1.copia(item_array60);
    fPHeapMax1.refaz((int)(byte)10, (int)(byte)0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item69 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test148"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test149"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test150"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax43.imprime();
    ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
    ds.Item[] item_array49 = new ds.Item[] {  };
    fPHeapMax48.copia(item_array49);
    fPHeapMax46.copia(item_array49);
    ds.Item item52 = fPHeapMax46.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax56.copia(item_array57);
    fPHeapMax54.copia(item_array57);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array60);
    fPHeapMax46.copia(item_array60);
    fPHeapMax43.copia(item_array60);
    fPHeapMax1.copia(item_array60);
    ds.Item item65 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax(10);
    fPHeapMax67.constroi();
    fPHeapMax67.constroi();
    fPHeapMax67.imprime();
    fPHeapMax67.constroi();
    fPHeapMax67.imprime();
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax74.constroi();
    fPHeapMax74.imprime();
    ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((-1));
    fPHeapMax78.constroi();
    ds.Item[] item_array80 = new ds.Item[] {  };
    fPHeapMax78.copia(item_array80);
    fPHeapMax74.copia(item_array80);
    fPHeapMax67.copia(item_array80);
    ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax85.imprime();
    fPHeapMax85.imprime();
    fPHeapMax85.imprime();
    ds.FPHeapMax fPHeapMax90 = new ds.FPHeapMax((-1));
    ds.Item[] item_array91 = new ds.Item[] {  };
    fPHeapMax90.copia(item_array91);
    fPHeapMax85.copia(item_array91);
    fPHeapMax67.copia(item_array91);
    fPHeapMax1.copia(item_array91);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array91);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test151"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    fPHeapMax5.copia(item_array8);
    fPHeapMax5.imprime();
    ds.Item item12 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    fPHeapMax5.constroi();
    ds.Item item15 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)fPHeapMax5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test152"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax18.constroi();
    ds.Item item25 = fPHeapMax18.max();
    fPHeapMax18.constroi();
    ds.Item item27 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    fPHeapMax29.constroi();
    fPHeapMax29.constroi();
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax18.copia(item_array35);
    fPHeapMax1.copia(item_array35);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((-1), (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test153"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.Item item8 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test154"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)'a');
    fPHeapMax9.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)fPHeapMax9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test155"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax11.copia(item_array15);
    ds.Item item18 = fPHeapMax11.max();
    ds.Item item19 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(10);
    fPHeapMax21.constroi();
    fPHeapMax21.constroi();
    fPHeapMax21.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    fPHeapMax26.imprime();
    ds.Item item33 = fPHeapMax26.max();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(10);
    fPHeapMax35.imprime();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((-1));
    fPHeapMax38.constroi();
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    fPHeapMax38.copia(item_array46);
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax51.constroi();
    fPHeapMax51.imprime();
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((-1));
    fPHeapMax55.constroi();
    ds.Item[] item_array57 = new ds.Item[] {  };
    fPHeapMax55.copia(item_array57);
    fPHeapMax51.copia(item_array57);
    fPHeapMax38.copia(item_array57);
    fPHeapMax35.copia(item_array57);
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax63.copia(item_array66);
    ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(10);
    fPHeapMax70.constroi();
    ds.Item item72 = fPHeapMax70.max();
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array75 = new ds.Item[] {  };
    fPHeapMax74.copia(item_array75);
    fPHeapMax70.copia(item_array75);
    fPHeapMax63.copia(item_array75);
    fPHeapMax35.copia(item_array75);
    fPHeapMax26.copia(item_array75);
    fPHeapMax21.copia(item_array75);
    fPHeapMax11.copia(item_array75);
    fPHeapMax1.copia(item_array75);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array75);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test156"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test157"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.constroi();
    ds.Item item7 = fPHeapMax5.max();
    fPHeapMax5.constroi();
    ds.Item item9 = fPHeapMax5.max();
    fPHeapMax5.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax5.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    fPHeapMax1.copia(item_array26);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test158"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test159"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test160"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test161"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    fPHeapMax59.imprime();
    fPHeapMax59.imprime();
    ds.Item item63 = fPHeapMax59.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)fPHeapMax59);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item63);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test162"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    ds.Item item12 = fPHeapMax10.max();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    fPHeapMax20.constroi();
    fPHeapMax20.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax20.copia(item_array24);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array28);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax20.copia(item_array33);
    fPHeapMax7.copia(item_array33);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)item_array33);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test163"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    fPHeapMax18.constroi();
    ds.Item item20 = fPHeapMax18.max();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    fPHeapMax1.refaz((int)(short)10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test164"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test165"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test166"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    fPHeapMax8.constroi();
    ds.Item item12 = fPHeapMax8.max();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array17);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax20.copia(item_array24);
    fPHeapMax15.copia(item_array24);
    fPHeapMax8.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test167"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    fPHeapMax8.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    fPHeapMax14.constroi();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.Item[] item_array22 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array22);
    fPHeapMax19.copia(item_array22);
    fPHeapMax14.copia(item_array22);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax14.copia(item_array33);
    fPHeapMax11.copia(item_array33);
    fPHeapMax8.copia(item_array33);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test168"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array10);
    fPHeapMax1.copia(item_array10);
    ds.Item item13 = fPHeapMax1.max();
    fPHeapMax1.imprime();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test169"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)1);
    ds.Item item9 = fPHeapMax8.max();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax11.copia(item_array14);
    fPHeapMax11.imprime();
    ds.Item item18 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(10);
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    fPHeapMax23.constroi();
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array31);
    fPHeapMax28.copia(item_array31);
    fPHeapMax23.copia(item_array31);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax36.constroi();
    fPHeapMax36.imprime();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
    fPHeapMax40.constroi();
    ds.Item[] item_array42 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array42);
    fPHeapMax36.copia(item_array42);
    fPHeapMax23.copia(item_array42);
    fPHeapMax20.copia(item_array42);
    ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax48.copia(item_array51);
    ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(10);
    fPHeapMax55.constroi();
    ds.Item item57 = fPHeapMax55.max();
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array60 = new ds.Item[] {  };
    fPHeapMax59.copia(item_array60);
    fPHeapMax55.copia(item_array60);
    fPHeapMax48.copia(item_array60);
    fPHeapMax20.copia(item_array60);
    fPHeapMax11.copia(item_array60);
    ds.Item item66 = fPHeapMax11.max();
    ds.Item item67 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((-1));
    ds.Item[] item_array70 = new ds.Item[] {  };
    fPHeapMax69.copia(item_array70);
    fPHeapMax11.copia(item_array70);
    ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax(10);
    fPHeapMax74.constroi();
    fPHeapMax74.constroi();
    fPHeapMax74.imprime();
    fPHeapMax74.constroi();
    fPHeapMax74.imprime();
    fPHeapMax74.constroi();
    ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax82.constroi();
    fPHeapMax82.imprime();
    ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((-1));
    fPHeapMax86.constroi();
    ds.Item[] item_array88 = new ds.Item[] {  };
    fPHeapMax86.copia(item_array88);
    fPHeapMax82.copia(item_array88);
    fPHeapMax74.copia(item_array88);
    fPHeapMax11.copia(item_array88);
    fPHeapMax8.copia(item_array88);
    fPHeapMax1.copia(item_array88);
    ds.Item item95 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item95);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test170"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test171"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    fPHeapMax9.imprime();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
    fPHeapMax13.constroi();
    ds.Item item15 = fPHeapMax13.max();
    fPHeapMax13.constroi();
    ds.Item item17 = fPHeapMax13.max();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    fPHeapMax9.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    fPHeapMax26.constroi();
    ds.Item item33 = fPHeapMax26.max();
    fPHeapMax26.constroi();
    ds.Item item35 = fPHeapMax26.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
    fPHeapMax37.constroi();
    fPHeapMax37.constroi();
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((-1));
    fPHeapMax41.constroi();
    ds.Item[] item_array43 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array43);
    fPHeapMax37.copia(item_array43);
    fPHeapMax26.copia(item_array43);
    fPHeapMax9.copia(item_array43);
    fPHeapMax1.copia(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test172"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    fPHeapMax10.imprime();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    fPHeapMax19.constroi();
    fPHeapMax19.constroi();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax24.copia(item_array27);
    fPHeapMax19.copia(item_array27);
    fPHeapMax10.copia(item_array27);
    fPHeapMax8.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item36 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item36);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test173"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test174"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test175"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test176"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test177"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax3.imprime();
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.constroi();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(10);
    fPHeapMax12.constroi();
    ds.Item item14 = fPHeapMax12.max();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax12.copia(item_array17);
    fPHeapMax9.copia(item_array17);
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((-1));
    fPHeapMax22.constroi();
    fPHeapMax22.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMax22.copia(item_array26);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array30 = new ds.Item[] {  };
    fPHeapMax29.copia(item_array30);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((-1));
    fPHeapMax33.constroi();
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax33.copia(item_array35);
    fPHeapMax29.copia(item_array35);
    fPHeapMax22.copia(item_array35);
    fPHeapMax9.copia(item_array35);
    ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array44 = new ds.Item[] {  };
    fPHeapMax43.copia(item_array44);
    fPHeapMax41.copia(item_array44);
    ds.Item[] item_array47 = new ds.Item[] {  };
    fPHeapMax41.copia(item_array47);
    fPHeapMax9.copia(item_array47);
    fPHeapMax3.copia(item_array47);
    fPHeapMax1.copia(item_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array47);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test178"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    ds.Item item10 = fPHeapMax8.max();
    fPHeapMax8.constroi();
    ds.Item item12 = fPHeapMax8.max();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((-1));
    fPHeapMax15.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array17);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax20.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array24);
    fPHeapMax20.copia(item_array24);
    fPHeapMax15.copia(item_array24);
    fPHeapMax8.copia(item_array24);
    fPHeapMax3.copia(item_array24);
    fPHeapMax1.copia(item_array24);
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
    fPHeapMax32.constroi();
    ds.Item[] item_array34 = new ds.Item[] {  };
    fPHeapMax32.copia(item_array34);
    fPHeapMax32.constroi();
    fPHeapMax32.imprime();
    fPHeapMax32.constroi();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
    fPHeapMax40.constroi();
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((-1));
    ds.Item[] item_array48 = new ds.Item[] {  };
    fPHeapMax47.copia(item_array48);
    fPHeapMax45.copia(item_array48);
    fPHeapMax40.copia(item_array48);
    fPHeapMax40.constroi();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(10);
    fPHeapMax54.constroi();
    ds.Item item56 = fPHeapMax54.max();
    ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array59 = new ds.Item[] {  };
    fPHeapMax58.copia(item_array59);
    fPHeapMax54.copia(item_array59);
    fPHeapMax40.copia(item_array59);
    fPHeapMax32.copia(item_array59);
    fPHeapMax1.copia(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test179"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = fPHeapMax1.max();
    ds.Item item13 = fPHeapMax1.max();
    ds.Item item14 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test180"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(1, 0);
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax1.copia(item_array10);
    ds.Item item12 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test181"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    fPHeapMax8.constroi();
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.Item item12 = fPHeapMax8.max();
    ds.Item item13 = fPHeapMax8.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)0, (java.lang.Object)fPHeapMax8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test182"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test183"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax5.imprime();
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax5.copia(item_array15);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array23);
    fPHeapMax20.copia(item_array23);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(10);
    fPHeapMax27.constroi();
    ds.Item item29 = fPHeapMax27.max();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax27.copia(item_array32);
    fPHeapMax20.copia(item_array32);
    fPHeapMax5.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    ds.Item item38 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item38);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test184"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test185"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(10);
    fPHeapMax12.constroi();
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    fPHeapMax12.constroi();
    fPHeapMax12.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax19.constroi();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((-1));
    fPHeapMax23.constroi();
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array25);
    fPHeapMax19.copia(item_array25);
    fPHeapMax12.copia(item_array25);
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax30.imprime();
    fPHeapMax30.imprime();
    fPHeapMax30.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    ds.Item[] item_array36 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array36);
    fPHeapMax30.copia(item_array36);
    fPHeapMax12.copia(item_array36);
    fPHeapMax1.copia(item_array36);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test186"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax38.imprime();
    fPHeapMax38.constroi();
    fPHeapMax38.constroi();
    fPHeapMax38.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(10);
    fPHeapMax47.constroi();
    ds.Item item49 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array52 = new ds.Item[] {  };
    fPHeapMax51.copia(item_array52);
    fPHeapMax47.copia(item_array52);
    fPHeapMax44.copia(item_array52);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((-1));
    fPHeapMax57.constroi();
    fPHeapMax57.constroi();
    ds.Item item60 = null;
    ds.Item[] item_array61 = new ds.Item[] { item60 };
    fPHeapMax57.copia(item_array61);
    ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array65 = new ds.Item[] {  };
    fPHeapMax64.copia(item_array65);
    ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((-1));
    fPHeapMax68.constroi();
    ds.Item[] item_array70 = new ds.Item[] {  };
    fPHeapMax68.copia(item_array70);
    fPHeapMax64.copia(item_array70);
    fPHeapMax57.copia(item_array70);
    fPHeapMax44.copia(item_array70);
    ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array79 = new ds.Item[] {  };
    fPHeapMax78.copia(item_array79);
    fPHeapMax76.copia(item_array79);
    ds.Item[] item_array82 = new ds.Item[] {  };
    fPHeapMax76.copia(item_array82);
    fPHeapMax44.copia(item_array82);
    fPHeapMax38.copia(item_array82);
    fPHeapMax1.copia(item_array82);
    ds.Item item87 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item87);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test187"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax14.constroi();
    fPHeapMax14.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array20);
    fPHeapMax14.copia(item_array20);
    fPHeapMax1.copia(item_array20);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax28.copia(item_array29);
    fPHeapMax26.copia(item_array29);
    ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
    fPHeapMax33.constroi();
    ds.Item item35 = fPHeapMax33.max();
    ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax37.copia(item_array38);
    fPHeapMax33.copia(item_array38);
    fPHeapMax26.copia(item_array38);
    fPHeapMax26.constroi();
    fPHeapMax26.constroi();
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    fPHeapMax45.constroi();
    ds.Item item49 = fPHeapMax45.max();
    fPHeapMax45.imprime();
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
    fPHeapMax52.constroi();
    ds.Item[] item_array54 = new ds.Item[] {  };
    fPHeapMax52.copia(item_array54);
    ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax57.imprime();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array61 = new ds.Item[] {  };
    fPHeapMax60.copia(item_array61);
    fPHeapMax57.copia(item_array61);
    fPHeapMax52.copia(item_array61);
    fPHeapMax45.copia(item_array61);
    fPHeapMax26.copia(item_array61);
    fPHeapMax1.copia(item_array61);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test188"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    fPHeapMax7.copia(item_array10);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
    fPHeapMax14.constroi();
    ds.Item item16 = fPHeapMax14.max();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMax18.copia(item_array19);
    fPHeapMax14.copia(item_array19);
    fPHeapMax7.copia(item_array19);
    fPHeapMax5.copia(item_array19);
    fPHeapMax1.copia(item_array19);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)'#', (int)(byte)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test189"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax8.copia(item_array11);
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    ds.Item item16 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test190"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item4);
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
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test191"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.constroi();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array5);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item19);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test192"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test193"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test194"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    ds.Item item57 = fPHeapMax1.max();
    ds.Item item58 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax60.imprime();
    fPHeapMax60.imprime();
    fPHeapMax60.imprime();
    ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((-1));
    ds.Item[] item_array66 = new ds.Item[] {  };
    fPHeapMax65.copia(item_array66);
    fPHeapMax60.copia(item_array66);
    fPHeapMax1.copia(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test195"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test196"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.Item item9 = fPHeapMax1.max();
    ds.Item item10 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test197"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test198"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.Item item2 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test199"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.constroi();
    fPHeapMax23.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    ds.Item[] item_array29 = new ds.Item[] {  };
    fPHeapMax27.copia(item_array29);
    fPHeapMax23.copia(item_array29);
    fPHeapMax10.copia(item_array29);
    fPHeapMax1.copia(item_array29);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test200"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.imprime();
    ds.Item item13 = fPHeapMax6.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.constroi();
    fPHeapMax18.constroi();
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((-1));
    ds.Item[] item_array26 = new ds.Item[] {  };
    fPHeapMax25.copia(item_array26);
    fPHeapMax23.copia(item_array26);
    fPHeapMax18.copia(item_array26);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax31.constroi();
    fPHeapMax31.imprime();
    ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
    fPHeapMax35.constroi();
    ds.Item[] item_array37 = new ds.Item[] {  };
    fPHeapMax35.copia(item_array37);
    fPHeapMax31.copia(item_array37);
    fPHeapMax18.copia(item_array37);
    fPHeapMax15.copia(item_array37);
    ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax45.copia(item_array46);
    fPHeapMax43.copia(item_array46);
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(10);
    fPHeapMax50.constroi();
    ds.Item item52 = fPHeapMax50.max();
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax50.copia(item_array55);
    fPHeapMax43.copia(item_array55);
    fPHeapMax15.copia(item_array55);
    fPHeapMax6.copia(item_array55);
    fPHeapMax1.copia(item_array55);
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((-1));
    fPHeapMax67.constroi();
    ds.Item[] item_array69 = new ds.Item[] {  };
    fPHeapMax67.copia(item_array69);
    fPHeapMax63.copia(item_array69);
    fPHeapMax1.copia(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test201"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
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
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test202"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(byte)100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test203"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    fPHeapMax13.constroi();
    fPHeapMax13.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
    ds.Item[] item_array21 = new ds.Item[] {  };
    fPHeapMax20.copia(item_array21);
    fPHeapMax18.copia(item_array21);
    fPHeapMax13.copia(item_array21);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax26.constroi();
    fPHeapMax26.imprime();
    ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
    fPHeapMax30.constroi();
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax30.copia(item_array32);
    fPHeapMax26.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax10.copia(item_array32);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax10.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    ds.Item item56 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.refaz((int)(byte)10, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test204"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    fPHeapMax10.copia(item_array13);
    fPHeapMax10.imprime();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((-1));
    fPHeapMax19.constroi();
    fPHeapMax19.constroi();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax24.copia(item_array27);
    fPHeapMax19.copia(item_array27);
    fPHeapMax10.copia(item_array27);
    fPHeapMax8.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    fPHeapMax1.imprime();
    ds.Item item35 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test205"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    ds.Item item12 = fPHeapMax1.max();
    ds.Item item13 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item12);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test206"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test207"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.imprime();
    ds.Item item8 = fPHeapMax6.max();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave(10, (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test208"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.constroi();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax17.constroi();
    fPHeapMax17.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    fPHeapMax21.constroi();
    ds.Item[] item_array23 = new ds.Item[] {  };
    fPHeapMax21.copia(item_array23);
    fPHeapMax17.copia(item_array23);
    fPHeapMax4.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(10);
    fPHeapMax36.constroi();
    ds.Item item38 = fPHeapMax36.max();
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax36.copia(item_array41);
    fPHeapMax29.copia(item_array41);
    fPHeapMax1.copia(item_array41);
    ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int)(short)1);
    ds.Item item48 = fPHeapMax47.max();
    ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((-1));
    ds.Item[] item_array51 = new ds.Item[] {  };
    fPHeapMax50.copia(item_array51);
    fPHeapMax47.copia(item_array51);
    fPHeapMax1.copia(item_array51);
    ds.Item item55 = fPHeapMax1.max();
    ds.Item item56 = fPHeapMax1.max();
    fPHeapMax1.refaz(1, (int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item60 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item56);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test209"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test210"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(10);
    fPHeapMax3.constroi();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    fPHeapMax3.constroi();
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array16);
    fPHeapMax10.copia(item_array16);
    fPHeapMax3.copia(item_array16);
    fPHeapMax1.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test211"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)'#');
    fPHeapMax24.constroi();
    fPHeapMax24.refaz((int)'#', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test212"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test213"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.constroi();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test214"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'#');
    fPHeapMax7.constroi();
    fPHeapMax7.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test215"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item9 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test216"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test217"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz((int)(short)10, (-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test218"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item6 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test219"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax9.constroi();
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((-1));
    fPHeapMax13.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax9.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test220"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((-1));
    ds.Item[] item_array27 = new ds.Item[] {  };
    fPHeapMax26.copia(item_array27);
    fPHeapMax24.copia(item_array27);
    fPHeapMax10.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item32 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test221"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.insere(item6);
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test222"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test223"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.constroi();
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
    fPHeapMax10.constroi();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    ds.Item item22 = fPHeapMax15.max();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(10);
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
    fPHeapMax27.constroi();
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item[] item_array35 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array35);
    fPHeapMax32.copia(item_array35);
    fPHeapMax27.copia(item_array35);
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax40.constroi();
    fPHeapMax40.imprime();
    ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((-1));
    fPHeapMax44.constroi();
    ds.Item[] item_array46 = new ds.Item[] {  };
    fPHeapMax44.copia(item_array46);
    fPHeapMax40.copia(item_array46);
    fPHeapMax27.copia(item_array46);
    fPHeapMax24.copia(item_array46);
    ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array55 = new ds.Item[] {  };
    fPHeapMax54.copia(item_array55);
    fPHeapMax52.copia(item_array55);
    ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(10);
    fPHeapMax59.constroi();
    ds.Item item61 = fPHeapMax59.max();
    ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array64 = new ds.Item[] {  };
    fPHeapMax63.copia(item_array64);
    fPHeapMax59.copia(item_array64);
    fPHeapMax52.copia(item_array64);
    fPHeapMax24.copia(item_array64);
    fPHeapMax15.copia(item_array64);
    fPHeapMax10.copia(item_array64);
    fPHeapMax6.copia(item_array64);
    fPHeapMax6.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(byte)1, (java.lang.Object)fPHeapMax6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test224"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax23.imprime();
    fPHeapMax23.constroi();
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax27.constroi();
    fPHeapMax27.imprime();
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    fPHeapMax31.constroi();
    ds.Item[] item_array33 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array33);
    fPHeapMax27.copia(item_array33);
    fPHeapMax23.copia(item_array33);
    ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array41 = new ds.Item[] {  };
    fPHeapMax40.copia(item_array41);
    fPHeapMax38.copia(item_array41);
    ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(10);
    fPHeapMax45.constroi();
    ds.Item item47 = fPHeapMax45.max();
    ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array50 = new ds.Item[] {  };
    fPHeapMax49.copia(item_array50);
    fPHeapMax45.copia(item_array50);
    fPHeapMax38.copia(item_array50);
    fPHeapMax23.copia(item_array50);
    fPHeapMax1.copia(item_array50);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item56 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test225"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    ds.Item item10 = fPHeapMax4.max();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array18);
    fPHeapMax4.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item22 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test226"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item11 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.refaz((int)(short)10, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test227"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.Item item13 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
    fPHeapMax16.constroi();
    fPHeapMax16.imprime();
    fPHeapMax16.imprime();
    fPHeapMax16.imprime();
    ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int)(short)(-1));
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)(short)0);
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array25);
    fPHeapMax22.copia(item_array25);
    ds.Item[] item_array28 = new ds.Item[] {  };
    fPHeapMax22.copia(item_array28);
    fPHeapMax16.copia(item_array28);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)item_array28);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test228"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(short)10, (int)(short)(-1));
    fPHeapMax1.imprime();
    ds.Item item6 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item7 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test229"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax8.constroi();
    fPHeapMax8.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
    fPHeapMax12.constroi();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax8.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)0);
    fPHeapMax19.imprime();
    fPHeapMax19.imprime();
    fPHeapMax19.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax24.copia(item_array25);
    fPHeapMax19.copia(item_array25);
    fPHeapMax1.copia(item_array25);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item31 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test230"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item9 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item9);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test231"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax15.imprime();
    fPHeapMax15.imprime();
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
    fPHeapMax24.constroi();
    fPHeapMax24.constroi();
    fPHeapMax24.imprime();
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(10);
    ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((-1));
    ds.Item[] item_array32 = new ds.Item[] {  };
    fPHeapMax31.copia(item_array32);
    fPHeapMax29.copia(item_array32);
    fPHeapMax24.copia(item_array32);
    fPHeapMax15.copia(item_array32);
    fPHeapMax13.copia(item_array32);
    fPHeapMax6.copia(item_array32);
    fPHeapMax1.copia(item_array32);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);

  }

}
