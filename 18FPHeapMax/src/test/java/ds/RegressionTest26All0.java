package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(1, 100);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', 0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(short)10, (java.lang.Object)100);
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
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

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)1);
    ds.Item item5 = fPHeapMax4.max();
    ds.Item item6 = fPHeapMax4.max();
    fPHeapMax4.constroi();
    fPHeapMax4.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)10, (java.lang.Object)fPHeapMax4);
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
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

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array5);
    ds.Item item7 = fPHeapMax1.max();
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax7.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', (int)'a');
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
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test20"); }


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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.insere(item3);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test28"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test29"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    fPHeapMax1.refaz(10, (int)(short)10);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    ds.Item item6 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'4');
    fPHeapMax1.constroi();

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)(short)1);
    ds.Item item5 = fPHeapMax4.max();
    ds.Item item6 = fPHeapMax4.max();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    fPHeapMax1.constroi();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array3);
    fPHeapMax1.constroi();
    ds.Item item6 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)'#', (java.lang.Object)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave((int)(byte)100, (java.lang.Object)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test40"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)(-1));
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test41"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
    ds.Item item2 = fPHeapMax1.max();
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
    org.junit.Assert.assertNull(item2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test42"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)10);
    ds.Item item2 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test43"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)1);
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

}
