package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    fPHeapMin1.constroi();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


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

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)10);
    ds.Item item2 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item7 = fPHeapMin1.min();
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item6);
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
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    fPHeapMin3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


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
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array1);
    fPHeapMin4.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin4.min();
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)'a', (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.imprime();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test22"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item7 = fPHeapMin1.retiraMin();
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test23"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.imprime();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test24"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.imprime();

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test25"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test26"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.refaz((int)(short)10, (int)(short)10);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)(-1), (int)'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test27"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(10);
    fPHeapMin3.refaz((int)(short)10, (int)(short)10);
    fPHeapMin3.imprime();
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array8);
    fPHeapMin1.copia(item_array8);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)(-1), (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test28"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array4);
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin6.copia(item_array8);
    fPHeapMin1.copia(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test29"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin1.copia(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test30"); }


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
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test31"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array8);
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array8);
    fPHeapMin1.copia(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test32"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test33"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'#');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)(byte)1);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(10);
    fPHeapMin5.refaz((int)(short)10, (int)(short)10);
    fPHeapMin5.imprime();
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMin5.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test34"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test35"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test36"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)100, (int)(byte)10);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test37"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'#');
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
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test38"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int)' ');
    ds.Item item11 = null;
    ds.Item[] item_array12 = new ds.Item[] { item11 };
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array12);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array12);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin14.copia(item_array16);
    fPHeapMin10.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((-1), (java.lang.Object)fPHeapMin10);
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
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test39"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test40"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int)(byte)1);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(10);
    fPHeapMin11.refaz((int)(short)10, (int)(short)10);
    fPHeapMin11.imprime();
    ds.Item[] item_array16 = new ds.Item[] {  };
    fPHeapMin11.copia(item_array16);
    fPHeapMin9.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test41"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test42"); }


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
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(0);
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array23);
    fPHeapMin21.copia(item_array23);
    fPHeapMin21.constroi();
    ds.Item item27 = null;
    ds.Item[] item_array28 = new ds.Item[] { item27 };
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array28);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array28);
    ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(item_array28);
    fPHeapMin21.copia(item_array28);
    fPHeapMin1.copia(item_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array28);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test43"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin4.copia(item_array6);
    fPHeapMin4.constroi();
    fPHeapMin4.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int)(byte)1);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(10);
    fPHeapMin14.refaz((int)(short)10, (int)(short)10);
    fPHeapMin14.imprime();
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMin14.copia(item_array19);
    fPHeapMin12.copia(item_array19);
    fPHeapMin4.copia(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int)' ');
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array27);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(item_array27);
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    fPHeapMin29.copia(item_array31);
    fPHeapMin25.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

}
