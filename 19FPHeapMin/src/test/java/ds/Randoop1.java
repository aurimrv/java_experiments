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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test002"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item8 = fPHeapMin6.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test003"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item16 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item16);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test004"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    fPHeapMin18.imprime();
    fPHeapMin18.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.constroi();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.imprime();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array43);
    fPHeapMin38.copia(item_array43);
    fPHeapMin32.copia(item_array43);
    fPHeapMin32.constroi();
    fPHeapMin32.imprime();
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
    fPHeapMin51.constroi();
    ds.Item item53 = null;
    ds.Item[] item_array54 = new ds.Item[] { item53 };
    fPHeapMin51.copia(item_array54);
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
    fPHeapMin59.imprime();
    ds.Item item61 = null;
    ds.Item[] item_array62 = new ds.Item[] { item61 };
    fPHeapMin59.copia(item_array62);
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(item_array62);
    fPHeapMin57.copia(item_array62);
    fPHeapMin51.copia(item_array62);
    fPHeapMin32.copia(item_array62);
    fPHeapMin26.copia(item_array62);
    fPHeapMin18.copia(item_array62);
    fPHeapMin1.copia(item_array62);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item71 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array62);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test005"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test006"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.constroi();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    fPHeapMin17.copia(item_array22);
    fPHeapMin11.copia(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    fPHeapMin1.copia(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test007"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test008"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(10, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test009"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item25 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test010"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test011"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array37);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin44.refaz((int)'4', (int)(short)1);
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
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test012"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array0);
    fPHeapMin3.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test013"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz(10, (int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)' ', (int)'4');
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test014"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test015"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    fPHeapMin34.constroi();
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin34.copia(item_array44);
    fPHeapMin25.copia(item_array44);
    fPHeapMin1.copia(item_array44);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.imprime();
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin53.copia(item_array59);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(item_array59);
    fPHeapMin51.copia(item_array59);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)fPHeapMin51);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test016"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.constroi();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.refaz(100, 10);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    fPHeapMin37.imprime();
    ds.Item item39 = null;
    ds.Item[] item_array40 = new ds.Item[] { item39 };
    fPHeapMin37.copia(item_array40);
    fPHeapMin34.copia(item_array40);
    fPHeapMin29.copia(item_array40);
    fPHeapMin25.copia(item_array40);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin25);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array40);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test017"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test018"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item25 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    fPHeapMin28.constroi();
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    fPHeapMin32.constroi();
    ds.Item item34 = null;
    ds.Item[] item_array35 = new ds.Item[] { item34 };
    fPHeapMin32.copia(item_array35);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.imprime();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array43);
    fPHeapMin38.copia(item_array43);
    fPHeapMin32.copia(item_array43);
    fPHeapMin28.copia(item_array43);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(item_array43);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'#', (java.lang.Object)fPHeapMin49);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test019"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item20 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test020"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.imprime();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin15.copia(item_array20);
    fPHeapMin9.copia(item_array20);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array20);
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    fPHeapMin25.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)fPHeapMin25);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test021"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)' ', (int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item28 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test022"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.refaz(100, 10);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    fPHeapMin10.copia(item_array16);
    fPHeapMin5.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    ds.Item item21 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test023"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    fPHeapMin10.copia(item_array15);
    fPHeapMin4.copia(item_array15);
    ds.Item item20 = fPHeapMin4.min();
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    fPHeapMin22.constroi();
    fPHeapMin22.imprime();
    fPHeapMin22.constroi();
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.constroi();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin22.copia(item_array34);
    fPHeapMin22.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    fPHeapMin22.copia(item_array45);
    fPHeapMin4.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test024"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item21 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test025"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    ds.Item item2 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test026"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin6.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test027"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin10.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item[] item_array15 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array15);
    fPHeapMin1.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array15);
    fPHeapMin18.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test028"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test029"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    fPHeapMin22.constroi();
    fPHeapMin22.imprime();
    fPHeapMin22.constroi();
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.constroi();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin22.copia(item_array34);
    fPHeapMin1.copia(item_array34);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.imprime();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    fPHeapMin40.constroi();
    fPHeapMin40.imprime();
    fPHeapMin40.constroi();
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    fPHeapMin49.constroi();
    ds.Item item51 = null;
    ds.Item[] item_array52 = new ds.Item[] { item51 };
    fPHeapMin49.copia(item_array52);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array52);
    fPHeapMin40.copia(item_array52);
    fPHeapMin40.constroi();
    ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
    fPHeapMin58.constroi();
    ds.Item item60 = null;
    ds.Item[] item_array61 = new ds.Item[] { item60 };
    fPHeapMin58.copia(item_array61);
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
    fPHeapMin66.imprime();
    ds.Item item68 = null;
    ds.Item[] item_array69 = new ds.Item[] { item68 };
    fPHeapMin66.copia(item_array69);
    ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(item_array69);
    fPHeapMin64.copia(item_array69);
    fPHeapMin58.copia(item_array69);
    ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(item_array69);
    ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(100);
    fPHeapMin76.imprime();
    ds.Item item78 = null;
    ds.Item[] item_array79 = new ds.Item[] { item78 };
    fPHeapMin76.copia(item_array79);
    fPHeapMin76.constroi();
    fPHeapMin76.imprime();
    fPHeapMin76.constroi();
    ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(100);
    fPHeapMin85.constroi();
    ds.Item item87 = null;
    ds.Item[] item_array88 = new ds.Item[] { item87 };
    fPHeapMin85.copia(item_array88);
    ds.FPHeapMin fPHeapMin90 = new ds.FPHeapMin(item_array88);
    fPHeapMin76.copia(item_array88);
    fPHeapMin74.copia(item_array88);
    fPHeapMin40.copia(item_array88);
    ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(item_array88);
    fPHeapMin1.copia(item_array88);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array88);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test030"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item21 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item23 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test031"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin10.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test032"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin16.copia(item_array22);
    fPHeapMin14.copia(item_array22);
    ds.Item item26 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.insere(item26);
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
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test033"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test034"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    fPHeapMin4.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin4.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    fPHeapMin1.imprime();
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item27);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test035"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array16);
    fPHeapMin11.copia(item_array16);
    fPHeapMin5.copia(item_array16);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array16);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array16);
    fPHeapMin1.copia(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test036"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array6);
    fPHeapMin10.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMin10.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test037"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    fPHeapMin11.copia(item_array17);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array17);
    fPHeapMin1.copia(item_array17);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array17);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin22.refaz(10, (int)(short)(-1));
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
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test038"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item10 = fPHeapMin1.min();
    java.lang.Object obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(0, obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test039"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.Item item59 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item59);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test040"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    fPHeapMin49.imprime();
    ds.Item item51 = null;
    ds.Item[] item_array52 = new ds.Item[] { item51 };
    fPHeapMin49.copia(item_array52);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array52);
    fPHeapMin47.copia(item_array52);
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.imprime();
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    fPHeapMin60.imprime();
    ds.Item item62 = null;
    ds.Item[] item_array63 = new ds.Item[] { item62 };
    fPHeapMin60.copia(item_array63);
    fPHeapMin57.copia(item_array63);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array63);
    fPHeapMin47.copia(item_array63);
    fPHeapMin1.copia(item_array63);
    fPHeapMin1.refaz(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array63);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test041"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin9.copia(item_array14);
    fPHeapMin3.copia(item_array14);
    fPHeapMin3.imprime();
    ds.Item item20 = fPHeapMin3.min();
    fPHeapMin3.refaz((int)(short)1, (int)(short)1);
    fPHeapMin3.constroi();
    fPHeapMin3.constroi();
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin40.copia(item_array45);
    fPHeapMin34.copia(item_array45);
    fPHeapMin34.constroi();
    fPHeapMin34.imprime();
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
    fPHeapMin53.constroi();
    ds.Item item55 = null;
    ds.Item[] item_array56 = new ds.Item[] { item55 };
    fPHeapMin53.copia(item_array56);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
    fPHeapMin61.imprime();
    ds.Item item63 = null;
    ds.Item[] item_array64 = new ds.Item[] { item63 };
    fPHeapMin61.copia(item_array64);
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array64);
    fPHeapMin59.copia(item_array64);
    fPHeapMin53.copia(item_array64);
    fPHeapMin34.copia(item_array64);
    fPHeapMin28.copia(item_array64);
    fPHeapMin28.imprime();
    fPHeapMin28.imprime();
    ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(100);
    fPHeapMin76.imprime();
    ds.Item item78 = null;
    ds.Item[] item_array79 = new ds.Item[] { item78 };
    fPHeapMin76.copia(item_array79);
    ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(item_array79);
    fPHeapMin74.copia(item_array79);
    ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(100);
    fPHeapMin84.imprime();
    ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(100);
    fPHeapMin87.imprime();
    ds.Item item89 = null;
    ds.Item[] item_array90 = new ds.Item[] { item89 };
    fPHeapMin87.copia(item_array90);
    fPHeapMin84.copia(item_array90);
    ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(item_array90);
    fPHeapMin74.copia(item_array90);
    fPHeapMin28.copia(item_array90);
    fPHeapMin3.copia(item_array90);
    fPHeapMin1.copia(item_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array90);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test042"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item8 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test043"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin25.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
    fPHeapMin45.imprime();
    ds.Item item47 = null;
    ds.Item[] item_array48 = new ds.Item[] { item47 };
    fPHeapMin45.copia(item_array48);
    fPHeapMin25.copia(item_array48);
    fPHeapMin1.copia(item_array48);
    fPHeapMin1.refaz((int)'a', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array48);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test044"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item39 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item39);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test045"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.constroi();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test046"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)(byte)10, (int)(byte)(-1));
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    fPHeapMin14.imprime();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMin14.copia(item_array17);
    fPHeapMin14.constroi();
    fPHeapMin14.imprime();
    fPHeapMin14.constroi();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
    ds.Item[] item_array24 = new ds.Item[] {  };
    fPHeapMin23.copia(item_array24);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array24);
    fPHeapMin14.copia(item_array24);
    ds.Item[] item_array28 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array28);
    fPHeapMin14.copia(item_array28);
    fPHeapMin1.copia(item_array28);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)10, (int)' ');
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
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test047"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array4);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item11 = fPHeapMin8.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test048"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item17 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin19.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    fPHeapMin19.copia(item_array42);
    fPHeapMin1.copia(item_array42);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item48 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item48);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test049"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin5.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
    fPHeapMin11.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    fPHeapMin11.copia(item_array14);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array14);
    fPHeapMin5.copia(item_array14);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array14);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test050"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item10 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)(byte)1);
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

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test051"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test052"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    fPHeapMin6.constroi();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item14 = fPHeapMin6.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test053"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    ds.Item item37 = fPHeapMin1.min();
    ds.Item item38 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), 0);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item38);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test054"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array6);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item10 = fPHeapMin9.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test055"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array33);
    fPHeapMin28.copia(item_array33);
    fPHeapMin22.copia(item_array33);
    fPHeapMin20.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin41.copia(item_array50);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test056"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test057"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.refaz((int)' ', (int)(byte)10);
    ds.Item item28 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item28);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test058"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
    fPHeapMin25.imprime();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    fPHeapMin25.copia(item_array28);
    fPHeapMin25.constroi();
    fPHeapMin25.imprime();
    fPHeapMin25.constroi();
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.constroi();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin25.copia(item_array37);
    fPHeapMin23.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array37);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item44 = fPHeapMin43.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test059"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = fPHeapMin1.min();
    ds.Item item4 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test060"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    fPHeapMin20.constroi();
    ds.Item item26 = fPHeapMin20.min();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    fPHeapMin28.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.imprime();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array38);
    fPHeapMin28.copia(item_array38);
    fPHeapMin20.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
    fPHeapMin49.imprime();
    ds.Item item51 = null;
    ds.Item[] item_array52 = new ds.Item[] { item51 };
    fPHeapMin49.copia(item_array52);
    fPHeapMin49.imprime();
    fPHeapMin49.imprime();
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.constroi();
    ds.Item item59 = null;
    ds.Item[] item_array60 = new ds.Item[] { item59 };
    fPHeapMin57.copia(item_array60);
    fPHeapMin49.copia(item_array60);
    fPHeapMin1.copia(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test061"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMin1.retiraMin();
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test062"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item[] item_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test063"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array18);
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin26.insere(item27);
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test064"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)10, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test065"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item20 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test066"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test067"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item2 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test068"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    ds.Item item2 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test069"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item25 = fPHeapMin1.min();
    fPHeapMin1.refaz(0, (int)(short)(-1));
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.constroi();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
    fPHeapMin39.imprime();
    ds.Item item41 = null;
    ds.Item[] item_array42 = new ds.Item[] { item41 };
    fPHeapMin39.copia(item_array42);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array42);
    fPHeapMin37.copia(item_array42);
    fPHeapMin31.copia(item_array42);
    fPHeapMin31.constroi();
    ds.Item item48 = fPHeapMin31.min();
    ds.Item item49 = fPHeapMin31.min();
    fPHeapMin31.refaz((int)'4', (int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)'4');
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item49);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test070"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item4 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test071"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    fPHeapMin4.constroi();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    fPHeapMin4.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test072"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item19 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item19);
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test073"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array20);
    ds.Item item25 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin24.insere(item25);
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
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test074"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    ds.Item item37 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item37);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test075"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    fPHeapMin19.constroi();
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.constroi();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin17.copia(item_array31);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array31);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
    fPHeapMin38.constroi();
    ds.Item item40 = null;
    ds.Item[] item_array41 = new ds.Item[] { item40 };
    fPHeapMin38.copia(item_array41);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
    fPHeapMin46.imprime();
    ds.Item item48 = null;
    ds.Item[] item_array49 = new ds.Item[] { item48 };
    fPHeapMin46.copia(item_array49);
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array49);
    fPHeapMin44.copia(item_array49);
    fPHeapMin38.copia(item_array49);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array49);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.imprime();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin56.constroi();
    fPHeapMin56.imprime();
    fPHeapMin56.constroi();
    ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
    fPHeapMin65.constroi();
    ds.Item item67 = null;
    ds.Item[] item_array68 = new ds.Item[] { item67 };
    fPHeapMin65.copia(item_array68);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array68);
    fPHeapMin56.copia(item_array68);
    fPHeapMin54.copia(item_array68);
    fPHeapMin36.copia(item_array68);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin36.refaz((int)(byte)1, (int)'#');
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array68);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test076"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (int)(byte)1);
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

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test077"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(byte)10, 0);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test078"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin17.insere(item18);
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test079"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    fPHeapMin3.copia(item_array9);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin1.copia(item_array18);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin26.refaz((int)(byte)0, (int)'4');
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

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test080"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
    fPHeapMin21.constroi();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMin21.copia(item_array24);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    fPHeapMin29.imprime();
    ds.Item item31 = null;
    ds.Item[] item_array32 = new ds.Item[] { item31 };
    fPHeapMin29.copia(item_array32);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(item_array32);
    fPHeapMin27.copia(item_array32);
    fPHeapMin21.copia(item_array32);
    fPHeapMin21.constroi();
    fPHeapMin21.imprime();
    fPHeapMin21.imprime();
    fPHeapMin21.constroi();
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.constroi();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.imprime();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(item_array51);
    fPHeapMin42.copia(item_array51);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.constroi();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin42.copia(item_array59);
    fPHeapMin42.imprime();
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
    fPHeapMin64.constroi();
    fPHeapMin64.constroi();
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
    fPHeapMin68.refaz(100, 10);
    ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(100);
    fPHeapMin73.imprime();
    ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(100);
    fPHeapMin76.imprime();
    ds.Item item78 = null;
    ds.Item[] item_array79 = new ds.Item[] { item78 };
    fPHeapMin76.copia(item_array79);
    fPHeapMin73.copia(item_array79);
    fPHeapMin68.copia(item_array79);
    fPHeapMin64.copia(item_array79);
    fPHeapMin42.copia(item_array79);
    fPHeapMin21.copia(item_array79);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(short)(-1), (java.lang.Object)item_array79);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array79);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test081"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array12);
    fPHeapMin17.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item19 = fPHeapMin17.min();
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test082"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin10.constroi();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
    fPHeapMin17.constroi();
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMin17.copia(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin1.copia(item_array20);
    fPHeapMin1.constroi();
    ds.Item item25 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test083"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)1, 1);
    fPHeapMin1.refaz(100, (int)'4');
    fPHeapMin1.refaz(100, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item12 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test084"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test085"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin9.copia(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array18);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item26 = fPHeapMin25.min();
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test086"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array33);
    fPHeapMin28.copia(item_array33);
    fPHeapMin22.copia(item_array33);
    fPHeapMin22.constroi();
    ds.Item item39 = fPHeapMin22.min();
    ds.Item item40 = fPHeapMin22.min();
    fPHeapMin22.imprime();
    fPHeapMin22.imprime();
    fPHeapMin22.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    fPHeapMin47.constroi();
    fPHeapMin47.imprime();
    fPHeapMin47.constroi();
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.constroi();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    fPHeapMin56.constroi();
    ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(100);
    fPHeapMin63.constroi();
    ds.Item item65 = null;
    ds.Item[] item_array66 = new ds.Item[] { item65 };
    fPHeapMin63.copia(item_array66);
    fPHeapMin56.copia(item_array66);
    fPHeapMin47.copia(item_array66);
    fPHeapMin22.copia(item_array66);
    fPHeapMin1.copia(item_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array66);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test087"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    fPHeapMin4.constroi();
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin4.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.imprime();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    fPHeapMin10.copia(item_array15);
    fPHeapMin4.copia(item_array15);
    ds.Item item20 = fPHeapMin4.min();
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.imprime();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    fPHeapMin22.constroi();
    fPHeapMin22.imprime();
    fPHeapMin22.constroi();
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.constroi();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin22.copia(item_array34);
    fPHeapMin22.refaz((int)' ', (int)(byte)0);
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.imprime();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    fPHeapMin22.copia(item_array45);
    fPHeapMin4.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test088"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.constroi();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin9.copia(item_array18);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array18);
    fPHeapMin7.copia(item_array18);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array18);
    fPHeapMin24.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test089"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array21);
    fPHeapMin12.copia(item_array21);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array21);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array21);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    fPHeapMin1.refaz((int)(short)100, 100);
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item32 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test090"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.constroi();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array19);
    fPHeapMin14.copia(item_array19);
    fPHeapMin8.copia(item_array19);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array19);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(item_array38);
    fPHeapMin26.copia(item_array38);
    fPHeapMin24.copia(item_array38);
    fPHeapMin1.copia(item_array38);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array38);
    ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test091"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)'4', (int)(short)0);
    ds.Item item23 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item23);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test092"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.refaz((int)(short)10, (int)(short)0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(short)(-1), (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test093"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    fPHeapMin1.imprime();
    ds.Item[] item_array45 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(item_array45);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(item_array45);
    fPHeapMin1.copia(item_array45);
    fPHeapMin1.refaz((int)'a', 10);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
    fPHeapMin54.constroi();
    ds.Item item56 = null;
    ds.Item[] item_array57 = new ds.Item[] { item56 };
    fPHeapMin54.copia(item_array57);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
    fPHeapMin62.imprime();
    ds.Item item64 = null;
    ds.Item[] item_array65 = new ds.Item[] { item64 };
    fPHeapMin62.copia(item_array65);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array65);
    fPHeapMin60.copia(item_array65);
    fPHeapMin54.copia(item_array65);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array65);
    ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(item_array65);
    fPHeapMin1.copia(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test094"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array33);
    fPHeapMin28.copia(item_array33);
    fPHeapMin22.copia(item_array33);
    fPHeapMin20.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin41.copia(item_array50);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item57 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test095"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item[] item_array8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.copia(item_array8);
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test096"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
    fPHeapMin6.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMin6.copia(item_array9);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array9);
    fPHeapMin4.copia(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test097"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)10);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
    fPHeapMin19.imprime();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMin19.copia(item_array22);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array22);
    fPHeapMin1.copia(item_array22);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
    fPHeapMin33.imprime();
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMin33.copia(item_array36);
    ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array36);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.constroi();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
    fPHeapMin47.imprime();
    ds.Item item49 = null;
    ds.Item[] item_array50 = new ds.Item[] { item49 };
    fPHeapMin47.copia(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    fPHeapMin41.copia(item_array50);
    ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(item_array50);
    fPHeapMin39.copia(item_array50);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    fPHeapMin1.imprime();
    ds.Item item59 = fPHeapMin1.min();
    ds.Item item60 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item60);
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
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item59);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test098"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)0, (-1));
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
    fPHeapMin8.imprime();
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array11);
    fPHeapMin14.imprime();
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    fPHeapMin18.constroi();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMin18.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(item_array29);
    fPHeapMin24.copia(item_array29);
    fPHeapMin18.copia(item_array29);
    fPHeapMin18.imprime();
    ds.Item item35 = fPHeapMin18.min();
    fPHeapMin18.refaz((int)(short)1, (int)(short)1);
    fPHeapMin18.constroi();
    fPHeapMin18.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin14.diminuiChave((int)(short)100, (java.lang.Object)fPHeapMin18);
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
    org.junit.Assert.assertNotNull(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item35);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test099"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    fPHeapMin22.constroi();
    ds.Item item24 = null;
    ds.Item[] item_array25 = new ds.Item[] { item24 };
    fPHeapMin22.copia(item_array25);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
    fPHeapMin30.imprime();
    ds.Item item32 = null;
    ds.Item[] item_array33 = new ds.Item[] { item32 };
    fPHeapMin30.copia(item_array33);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array33);
    fPHeapMin28.copia(item_array33);
    fPHeapMin22.copia(item_array33);
    fPHeapMin20.copia(item_array33);
    fPHeapMin1.copia(item_array33);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.refaz((int)(short)10, (int)(short)0);
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    fPHeapMin50.constroi();
    ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
    fPHeapMin57.constroi();
    ds.Item item59 = null;
    ds.Item[] item_array60 = new ds.Item[] { item59 };
    fPHeapMin57.copia(item_array60);
    fPHeapMin50.copia(item_array60);
    fPHeapMin41.copia(item_array60);
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(item_array60);
    ds.Item[] item_array65 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(item_array65);
    fPHeapMin64.copia(item_array65);
    fPHeapMin1.copia(item_array65);
    ds.Item item69 = fPHeapMin1.min();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item70 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item69);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test100"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
    fPHeapMin5.refaz(100, 10);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    fPHeapMin13.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin13.copia(item_array16);
    fPHeapMin10.copia(item_array16);
    fPHeapMin5.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    fPHeapMin1.refaz((int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test101"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item23 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item23);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test102"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item21 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
    fPHeapMin23.constroi();
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin23.copia(item_array26);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
    fPHeapMin31.imprime();
    ds.Item item33 = null;
    ds.Item[] item_array34 = new ds.Item[] { item33 };
    fPHeapMin31.copia(item_array34);
    ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(item_array34);
    fPHeapMin29.copia(item_array34);
    fPHeapMin23.copia(item_array34);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array34);
    ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
    fPHeapMin41.imprime();
    ds.Item item43 = null;
    ds.Item[] item_array44 = new ds.Item[] { item43 };
    fPHeapMin41.copia(item_array44);
    fPHeapMin41.constroi();
    fPHeapMin41.imprime();
    fPHeapMin41.constroi();
    ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
    fPHeapMin50.constroi();
    ds.Item item52 = null;
    ds.Item[] item_array53 = new ds.Item[] { item52 };
    fPHeapMin50.copia(item_array53);
    ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(item_array53);
    fPHeapMin41.copia(item_array53);
    fPHeapMin39.copia(item_array53);
    fPHeapMin1.copia(item_array53);
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(item_array53);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
    fPHeapMin62.imprime();
    ds.Item item64 = null;
    ds.Item[] item_array65 = new ds.Item[] { item64 };
    fPHeapMin62.copia(item_array65);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(item_array65);
    ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(item_array65);
    fPHeapMin60.copia(item_array65);
    ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(item_array65);
    ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(item_array65);
    ds.Item item72 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin71.insere(item72);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array65);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test103"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.refaz((int)(byte)(-1), 100);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test104"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.constroi();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin7.copia(item_array10);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
    fPHeapMin15.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin15.copia(item_array18);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin7.copia(item_array18);
    fPHeapMin7.constroi();
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.constroi();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
    fPHeapMin34.imprime();
    ds.Item item36 = null;
    ds.Item[] item_array37 = new ds.Item[] { item36 };
    fPHeapMin34.copia(item_array37);
    ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(item_array37);
    fPHeapMin32.copia(item_array37);
    fPHeapMin26.copia(item_array37);
    fPHeapMin7.copia(item_array37);
    fPHeapMin1.copia(item_array37);
    ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(item_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array37);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test105"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    ds.Item item9 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMin12.copia(item_array15);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.imprime();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array23);
    fPHeapMin18.copia(item_array23);
    fPHeapMin12.copia(item_array23);
    fPHeapMin12.imprime();
    ds.Item item29 = fPHeapMin12.min();
    fPHeapMin12.refaz((int)(short)1, (int)(short)1);
    fPHeapMin12.constroi();
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)fPHeapMin12);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test106"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
    fPHeapMin3.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin3.copia(item_array6);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item item10 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)'a', (int)'#');
    ds.Item item14 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test107"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
    fPHeapMin20.constroi();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMin20.copia(item_array23);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
    fPHeapMin28.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin28.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin26.copia(item_array31);
    fPHeapMin20.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
    fPHeapMin40.constroi();
    ds.Item item42 = null;
    ds.Item[] item_array43 = new ds.Item[] { item42 };
    fPHeapMin40.copia(item_array43);
    ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
    fPHeapMin48.imprime();
    ds.Item item50 = null;
    ds.Item[] item_array51 = new ds.Item[] { item50 };
    fPHeapMin48.copia(item_array51);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(item_array51);
    fPHeapMin46.copia(item_array51);
    fPHeapMin40.copia(item_array51);
    fPHeapMin40.imprime();
    fPHeapMin40.constroi();
    ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
    fPHeapMin61.constroi();
    ds.Item item63 = null;
    ds.Item[] item_array64 = new ds.Item[] { item63 };
    fPHeapMin61.copia(item_array64);
    ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
    fPHeapMin69.imprime();
    ds.Item item71 = null;
    ds.Item[] item_array72 = new ds.Item[] { item71 };
    fPHeapMin69.copia(item_array72);
    ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(item_array72);
    fPHeapMin67.copia(item_array72);
    fPHeapMin61.copia(item_array72);
    fPHeapMin59.copia(item_array72);
    fPHeapMin40.copia(item_array72);
    ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(100);
    fPHeapMin80.constroi();
    ds.Item item82 = null;
    ds.Item[] item_array83 = new ds.Item[] { item82 };
    fPHeapMin80.copia(item_array83);
    ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(100);
    fPHeapMin86.imprime();
    ds.Item item88 = null;
    ds.Item[] item_array89 = new ds.Item[] { item88 };
    fPHeapMin86.copia(item_array89);
    ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(item_array89);
    fPHeapMin80.copia(item_array89);
    ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(item_array89);
    fPHeapMin40.copia(item_array89);
    ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(item_array89);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)fPHeapMin95);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array89);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test108"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.imprime();
    ds.Item item18 = fPHeapMin1.min();
    fPHeapMin1.refaz((int)(short)1, (int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item25 = fPHeapMin1.min();
    fPHeapMin1.refaz(0, (int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item29 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test109"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(0, (int)(byte)(-1));
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int)(short)0);
    fPHeapMin9.constroi();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
    fPHeapMin12.constroi();
    fPHeapMin12.constroi();
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
    fPHeapMin16.constroi();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMin16.copia(item_array19);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
    fPHeapMin24.imprime();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMin24.copia(item_array27);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array27);
    fPHeapMin22.copia(item_array27);
    fPHeapMin16.copia(item_array27);
    fPHeapMin12.copia(item_array27);
    fPHeapMin9.copia(item_array27);
    ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(item_array27);
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(item_array27);
    fPHeapMin1.copia(item_array27);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test110"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)'a');
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    fPHeapMin7.imprime();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
    fPHeapMin10.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin10.copia(item_array13);
    fPHeapMin7.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin5.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.diminuiChave(100, (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test111"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
      ds.Item item4 = fPHeapMin2.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test112"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz(100, 10);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fPHeapMin1.insere(item8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test113"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
    fPHeapMin9.imprime();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin9.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin7.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    fPHeapMin1.constroi();
    ds.Item item18 = fPHeapMin1.min();
    ds.Item item19 = fPHeapMin1.min();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
    fPHeapMin26.imprime();
    ds.Item item28 = null;
    ds.Item[] item_array29 = new ds.Item[] { item28 };
    fPHeapMin26.copia(item_array29);
    fPHeapMin26.constroi();
    fPHeapMin26.imprime();
    fPHeapMin26.constroi();
    ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
    fPHeapMin35.constroi();
    ds.Item item37 = null;
    ds.Item[] item_array38 = new ds.Item[] { item37 };
    fPHeapMin35.copia(item_array38);
    fPHeapMin35.constroi();
    ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
    fPHeapMin42.constroi();
    ds.Item item44 = null;
    ds.Item[] item_array45 = new ds.Item[] { item44 };
    fPHeapMin42.copia(item_array45);
    fPHeapMin35.copia(item_array45);
    fPHeapMin26.copia(item_array45);
    fPHeapMin1.copia(item_array45);
    ds.Item[] item_array50 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(item_array50);
    ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(item_array50);
    ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(item_array50);
    fPHeapMin1.copia(item_array50);
    ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
    fPHeapMin56.constroi();
    ds.Item item58 = null;
    ds.Item[] item_array59 = new ds.Item[] { item58 };
    fPHeapMin56.copia(item_array59);
    ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
    ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
    fPHeapMin64.imprime();
    ds.Item item66 = null;
    ds.Item[] item_array67 = new ds.Item[] { item66 };
    fPHeapMin64.copia(item_array67);
    ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(item_array67);
    fPHeapMin62.copia(item_array67);
    fPHeapMin56.copia(item_array67);
    fPHeapMin1.copia(item_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array67);

  }

}
