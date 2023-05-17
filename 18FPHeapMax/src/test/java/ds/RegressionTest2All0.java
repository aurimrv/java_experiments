package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', 1);
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    fPHeapMax1.constroi();
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((-1), (int)(byte)10);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)10);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    java.lang.Object obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)1, obj8);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array17);
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int)(short)1);
    ds.Item item22 = fPHeapMax21.max();
    ds.Item item23 = null;
    ds.Item[] item_array24 = new ds.Item[] { item23 };
    fPHeapMax21.copia(item_array24);
    fPHeapMax21.constroi();
    ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int)(short)1);
    ds.Item item29 = fPHeapMax28.max();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMax28.copia(item_array31);
    fPHeapMax21.copia(item_array31);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)0, (java.lang.Object)fPHeapMax21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
    fPHeapMax9.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(0, (java.lang.Object)fPHeapMax9);
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)100, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test16"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    ds.Item item8 = fPHeapMax7.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)1);
    ds.Item item15 = fPHeapMax14.max();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMax14.copia(item_array17);
    fPHeapMax7.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    ds.Item item21 = fPHeapMax1.max();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)10, (int)'#');
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)1);
    ds.Item item14 = fPHeapMax13.max();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMax13.copia(item_array16);
    fPHeapMax13.constroi();
    ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int)(short)1);
    ds.Item item21 = fPHeapMax20.max();
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMax20.copia(item_array23);
    fPHeapMax13.copia(item_array23);
    fPHeapMax11.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)item_array23);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test20"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    ds.Item item7 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(short)1);
    ds.Item item10 = fPHeapMax9.max();
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMax9.copia(item_array12);
    fPHeapMax9.constroi();
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)(short)1);
    ds.Item item17 = fPHeapMax16.max();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    fPHeapMax16.copia(item_array19);
    fPHeapMax9.copia(item_array19);
    fPHeapMax3.copia(item_array19);
    ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int)(short)1);
    ds.Item item25 = fPHeapMax24.max();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    fPHeapMax24.copia(item_array27);
    fPHeapMax3.copia(item_array27);
    fPHeapMax1.copia(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    ds.Item item7 = fPHeapMax6.max();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax6.copia(item_array9);
    fPHeapMax6.constroi();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(short)1);
    ds.Item item14 = fPHeapMax13.max();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMax13.copia(item_array16);
    fPHeapMax6.copia(item_array16);
    fPHeapMax4.copia(item_array16);
    fPHeapMax1.copia(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)100);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((-1), (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
    fPHeapMax1.refaz((int)'#', 1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(byte)10);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    ds.Item item8 = fPHeapMax7.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax7.copia(item_array10);
    fPHeapMax5.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)fPHeapMax5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((-1), obj5);
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
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test28"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test29"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)(short)1);
    ds.Item item7 = fPHeapMax6.max();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax6.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)1);
    ds.Item item13 = fPHeapMax12.max();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMax12.copia(item_array15);
    fPHeapMax12.constroi();
    ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int)(short)1);
    ds.Item item20 = fPHeapMax19.max();
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    fPHeapMax19.copia(item_array22);
    fPHeapMax12.copia(item_array22);
    fPHeapMax6.copia(item_array22);
    ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int)(short)1);
    ds.Item item28 = fPHeapMax27.max();
    ds.Item item29 = null;
    ds.Item[] item_array30 = new ds.Item[] { item29 };
    fPHeapMax27.copia(item_array30);
    fPHeapMax6.copia(item_array30);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(0, (java.lang.Object)fPHeapMax6);
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
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array30);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item17 = fPHeapMax1.retiraMax();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array17);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)10L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    ds.Item item8 = fPHeapMax7.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)1);
    ds.Item item15 = fPHeapMax14.max();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMax14.copia(item_array17);
    fPHeapMax7.copia(item_array17);
    fPHeapMax1.copia(item_array17);
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    ds.Item item8 = fPHeapMax7.max();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMax7.copia(item_array10);
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)(short)1);
    ds.Item item15 = fPHeapMax14.max();
    ds.Item item16 = null;
    ds.Item[] item_array17 = new ds.Item[] { item16 };
    fPHeapMax14.copia(item_array17);
    fPHeapMax7.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax3.copia(item_array6);
    fPHeapMax3.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)(short)1);
    ds.Item item11 = fPHeapMax10.max();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMax10.copia(item_array13);
    fPHeapMax3.copia(item_array13);
    fPHeapMax1.copia(item_array13);
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array17);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    ds.Item[] item_array7 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.copia(item_array7);
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test40"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test41"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test42"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test43"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(byte)10);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)1);
    ds.Item item6 = fPHeapMax5.max();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMax5.copia(item_array8);
    fPHeapMax3.copia(item_array8);
    fPHeapMax1.copia(item_array8);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test44"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)(short)1);
    ds.Item item6 = fPHeapMax5.max();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMax5.copia(item_array8);
    fPHeapMax5.constroi();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(short)1);
    ds.Item item13 = fPHeapMax12.max();
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    fPHeapMax12.copia(item_array15);
    fPHeapMax5.copia(item_array15);
    fPHeapMax3.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test45"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);
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

}
