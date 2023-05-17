package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test01"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test02"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test03"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.diminuiChave((int)(byte)1, (java.lang.Object)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test04"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.diminuiChave((-1), (java.lang.Object)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test05"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    ds.Item[] item_array7 = new ds.Item[] {  };
    fPHeapMin6.copia(item_array7);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)'#', (java.lang.Object)item_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test06"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    fPHeapMin2.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test07"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMin11.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin2.copia(item_array12);
    fPHeapMin2.imprime();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array18);
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMin19.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin2.copia(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test08"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin2.copia(item_array10);
    fPHeapMin2.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMin2.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test09"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item7 = fPHeapMin5.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test11"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    fPHeapMin2.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test12"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMin11.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin2.copia(item_array12);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item16 = fPHeapMin2.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test13"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    fPHeapMin2.copia(item_array10);
    fPHeapMin2.refaz((int)(short)0, (int)(byte)(-1));
    fPHeapMin2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test15"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMin11.copia(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    fPHeapMin2.copia(item_array12);
    fPHeapMin2.imprime();
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)'a', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test16"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));

  }

}
