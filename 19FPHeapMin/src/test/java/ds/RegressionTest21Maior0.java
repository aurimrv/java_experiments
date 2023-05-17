package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test01"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz(0, 10);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test02"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)0, (java.lang.Object)'4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test03"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((-1), (int)'a');
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test04"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((-1), (java.lang.Object)100L);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test05"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item2 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test07"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test09"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)100);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)'#', (int)(byte)0);
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array2);
    java.lang.Object obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin4.diminuiChave((int)(short)1, obj6);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMin1.retiraMin();
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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);
    fPHeapMin1.refaz((int)'#', 10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array2);
    fPHeapMin1.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin1.copia(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test16"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)(short)(-1));
    ds.Item[] item_array4 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array4);
    fPHeapMin1.copia(item_array4);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test17"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();

  }

}
