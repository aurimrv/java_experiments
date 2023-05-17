package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMax1.copia(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test04"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    ds.Item item2 = fPHeapMax1.max();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.aumentaChave(100, (java.lang.Object)(short)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.imprime();
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
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.imprime();
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax6.copia(item_array8);
    fPHeapMax1.copia(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    ds.Item item5 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    fPHeapMax1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'a', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test10"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    ds.Item item4 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.Item item3 = fPHeapMax1.max();
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(10);
    fPHeapMax5.imprime();
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array7);
    fPHeapMax1.copia(item_array7);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(10);
    fPHeapMax11.imprime();
    ds.Item item13 = fPHeapMax11.max();
    ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(10);
    fPHeapMax15.imprime();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax15.copia(item_array17);
    fPHeapMax11.copia(item_array17);
    fPHeapMax1.copia(item_array17);
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
    org.junit.Assert.assertNull(item3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

}
