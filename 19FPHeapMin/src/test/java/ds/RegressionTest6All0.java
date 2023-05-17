package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test01"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)(short)(-1), 100);
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test02"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)(short)10, (java.lang.Object)10.0f);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test03"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.Item item5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.insere(item5);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test04"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.Item item2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item2);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test05"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test07"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item4);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = fPHeapMin1.min();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item4);
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test09"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)(short)1, (java.lang.Object)0L);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test10"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin2.retiraMin();
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test11"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz(10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = fPHeapMin1.min();
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave(0, obj5);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
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

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test14"); }


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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)(-1), (java.lang.Object)"");
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

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test16"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test17"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item9 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test18"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.diminuiChave((-1), (java.lang.Object)100);
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test19"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
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
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test20"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.Item[] item_array9 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item14 = null;
    ds.Item[] item_array15 = new ds.Item[] { item14 };
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array15);
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    fPHeapMin16.copia(item_array18);
    fPHeapMin13.copia(item_array18);
    fPHeapMin1.copia(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test21"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int)'a');
    fPHeapMin8.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.diminuiChave((int)(byte)10, (java.lang.Object)fPHeapMin8);
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test22"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin5.copia(item_array7);
    fPHeapMin1.copia(item_array7);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item10 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test23"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    fPHeapMin1.refaz(1, 0);
    ds.Item item5 = fPHeapMin1.min();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test24"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    ds.Item item6 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test25"); }


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
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test26"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin1.retiraMin();
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
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test27"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test28"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test29"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin2.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)'4', (int)' ');
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
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test30"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    fPHeapMin1.refaz(1, 0);
    ds.Item item5 = fPHeapMin1.min();
    ds.Item item6 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test31"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin2.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test32"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin5.copia(item_array7);
    fPHeapMin1.copia(item_array7);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test33"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test34"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test35"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    ds.Item item2 = fPHeapMin1.min();
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin5.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)(-1), (java.lang.Object)fPHeapMin5);
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test36"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    fPHeapMin1.refaz(1, 0);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test37"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test38"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)10);
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

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test39"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test40"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array5 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)100, (java.lang.Object)fPHeapMin6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test41"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array5);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array5);
    fPHeapMin1.copia(item_array5);
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
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test42"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test43"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin6.copia(item_array8);
    fPHeapMin3.copia(item_array8);
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin3.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test44"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item7);
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
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test45"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.imprime();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

}
