package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test01"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item5);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test02"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)100, 10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test03"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test04"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test05"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin1.min();
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test07"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)(short)100, (java.lang.Object)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test08"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item4 = fPHeapMin3.retiraMin();
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test09"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin3.refaz((int)'4', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    fPHeapMin1.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array8);
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    fPHeapMin10.copia(item_array12);
    fPHeapMin1.copia(item_array12);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array16);
    fPHeapMin1.copia(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    fPHeapMin1.constroi();

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test15"); }


    ds.Item[] item_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
