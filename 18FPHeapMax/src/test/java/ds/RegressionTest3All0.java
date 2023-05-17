package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.constroi();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(100, (java.lang.Object)100.0d);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    fPHeapMax5.copia(item_array8);
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array7);
    fPHeapMax4.copia(item_array7);
    fPHeapMax4.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)1, (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMax1.retiraMax();
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
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)10);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((-1), 100);
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)1, (int)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)(-1), (int)(byte)100);
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.Item item7 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    ds.Item item7 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax1.copia(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    fPHeapMax5.copia(item_array8);
    fPHeapMax1.copia(item_array8);
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    fPHeapMax5.copia(item_array8);
    fPHeapMax1.copia(item_array8);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax14.copia(item_array17);
    fPHeapMax14.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(100, (java.lang.Object)fPHeapMax14);
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
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)'a');
    ds.Item item5 = fPHeapMax4.max();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax9.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    fPHeapMax1.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(100, (java.lang.Object)(-1.0d));
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
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test28"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test29"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'a');
    ds.Item item8 = fPHeapMax7.max();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)'a');
    ds.Item item11 = fPHeapMax10.max();
    fPHeapMax10.constroi();
    fPHeapMax10.imprime();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array18 = new ds.Item[] {  };
    fPHeapMax17.copia(item_array18);
    fPHeapMax15.copia(item_array18);
    fPHeapMax10.copia(item_array18);
    fPHeapMax7.copia(item_array18);
    fPHeapMax1.copia(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    ds.Item item8 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item9 = fPHeapMax1.retiraMax();
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

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.refaz(0, (int)(short)(-1));
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.refaz(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, 0);
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
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    ds.Item item5 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
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
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'a');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.refaz(0, (int)(byte)(-1));
    ds.Item item10 = fPHeapMax1.max();
    ds.Item item11 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item11);

  }

}
