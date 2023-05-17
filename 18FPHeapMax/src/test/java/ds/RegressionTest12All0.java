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


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)(short)1);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMax5.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)item_array7);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    fPHeapMax9.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)' ', (java.lang.Object)fPHeapMax9);
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'#', (int)(short)100);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)1, (int)(short)1);
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    java.lang.Object obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)100, obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item10 = fPHeapMax1.retiraMax();
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMax1.max();
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    fPHeapMax7.imprime();
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)fPHeapMax7);
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
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item7 = fPHeapMax1.max();
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)"hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item8 = fPHeapMax1.retiraMax();
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
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test20"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.Item item9 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item9 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    java.lang.Object obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', obj6);
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((-1));
    fPHeapMax5.imprime();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
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
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test28"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)100);
    ds.Item item2 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test29"); }


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
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)0);
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
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
    fPHeapMax3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array5);
    fPHeapMax1.copia(item_array5);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMax14.copia(item_array16);
    fPHeapMax11.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)fPHeapMax11);
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
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax9.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((-1), (java.lang.Object)fPHeapMax9);
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)0, (int)(byte)1);
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
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test40"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    fPHeapMax14.imprime();
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(1, (java.lang.Object)item_array16);
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
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test41"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMax9.copia(item_array11);
    fPHeapMax6.copia(item_array11);
    fPHeapMax6.imprime();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMax21.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax6.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, (int)(byte)10);
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
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test42"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test43"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test44"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMax9.copia(item_array11);
    fPHeapMax6.copia(item_array11);
    fPHeapMax6.imprime();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMax21.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax6.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item28 = fPHeapMax1.max();
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
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test45"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)1, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test46"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)(-1), (java.lang.Object)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test47"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test48"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test49"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax7.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax4.imprime();
    fPHeapMax4.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'4', (java.lang.Object)fPHeapMax4);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test50"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.imprime();
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array8);
    fPHeapMax4.copia(item_array8);
    fPHeapMax1.copia(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test51"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((-1));
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMax4.copia(item_array6);
    fPHeapMax1.copia(item_array6);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
    fPHeapMax11.imprime();
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMax14.copia(item_array16);
    fPHeapMax11.copia(item_array16);
    fPHeapMax11.imprime();
    fPHeapMax11.constroi();
    fPHeapMax11.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)0, (java.lang.Object)fPHeapMax11);
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
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test52"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    fPHeapMax1.copia(item_array3);
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMax9.copia(item_array11);
    fPHeapMax6.copia(item_array11);
    fPHeapMax6.imprime();
    fPHeapMax6.constroi();
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((-1));
    fPHeapMax18.imprime();
    ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    fPHeapMax21.copia(item_array23);
    fPHeapMax18.copia(item_array23);
    fPHeapMax6.copia(item_array23);
    fPHeapMax1.copia(item_array23);
    ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMax29.copia(item_array31);
    ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
    ds.Item item35 = null;
    ds.Item[] item_array36 = new ds.Item[] { item35 };
    fPHeapMax34.copia(item_array36);
    ds.Item[] item_array38 = new ds.Item[] {  };
    fPHeapMax34.copia(item_array38);
    fPHeapMax29.copia(item_array38);
    fPHeapMax1.copia(item_array38);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, (int)'a');
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
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array38);

  }

}
