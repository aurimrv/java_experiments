package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = fPHeapMax1.max();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(100, 100);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'#', (int)(short)10);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item8 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item8);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)10, (int)(short)100);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
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

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    fPHeapMax1.refaz((int)(short)0, (-1));
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = fPHeapMax1.max();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = fPHeapMax1.max();
    ds.Item item4 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)' ', (int)(short)0);
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
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
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
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test16"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)10.0d);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test20"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)10, 0);
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)10);
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMax1.imprime();
    fPHeapMax1.refaz(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
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
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    fPHeapMax1.refaz((int)(short)0, (-1));
    fPHeapMax1.constroi();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.refaz((int)(short)1, 1);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test28"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test29"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.refaz(0, (int)(short)(-1));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'a', (java.lang.Object)' ');
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
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax1.copia(item_array9);
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item13 = fPHeapMax12.max();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array14);
    fPHeapMax12.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item19 = null;
    ds.Item[] item_array20 = new ds.Item[] { item19 };
    fPHeapMax12.copia(item_array20);
    ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item24 = fPHeapMax23.max();
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMax23.copia(item_array25);
    fPHeapMax23.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMax23.copia(item_array31);
    fPHeapMax12.copia(item_array31);
    fPHeapMax1.copia(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item14 = fPHeapMax13.max();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax13.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    fPHeapMax13.copia(item_array21);
    fPHeapMax11.copia(item_array21);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)100, (java.lang.Object)fPHeapMax11);
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.constroi();
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item14 = fPHeapMax13.max();
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'4', (int)(byte)100);
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
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.refaz(1, (int)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)100, 10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test40"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)' ');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)' ');
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array4);
    fPHeapMax1.copia(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test41"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)(-1), (java.lang.Object)'4');
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
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test42"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test43"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)1.0d);
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
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test44"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item4 = fPHeapMax3.max();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax3.copia(item_array5);
    fPHeapMax3.refaz((int)(short)0, (int)(byte)(-1));
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    fPHeapMax3.copia(item_array11);
    fPHeapMax1.copia(item_array11);
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
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test45"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    fPHeapMax1.refaz((int)(short)0, (-1));
    ds.Item item5 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test46"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
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
