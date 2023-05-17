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


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin2.retiraMin();
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item3 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.insere(item3);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave(100, (java.lang.Object)10L);
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz(10, (int)(short)0);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item9 = fPHeapMin2.min();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    fPHeapMin2.imprime();
    ds.Item item6 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.insere(item6);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
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

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item10 = fPHeapMin2.min();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)(byte)(-1), (int)(short)100);
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)' ', (java.lang.Object)'a');
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)' ');
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz(10, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item10 = fPHeapMin9.min();
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin4.constroi();
    fPHeapMin4.imprime();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    fPHeapMin4.copia(item_array8);
    fPHeapMin1.copia(item_array8);
    ds.Item item12 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item12);
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
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)(short)0, (java.lang.Object)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item[] item_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.copia(item_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin2.min();
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    fPHeapMin2.constroi();
    ds.Item item10 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.insere(item10);
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.imprime();
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz(1, (int)(byte)(-1));
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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)(byte)(-1), (java.lang.Object)(byte)1);
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test20"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)' ');
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array21);
    fPHeapMin17.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test21"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)' ');
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array21);
    fPHeapMin17.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array21);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin26.refaz((int)(byte)100, 0);
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
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test22"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)(short)(-1), (int)(byte)1);
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test23"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.imprime();
    fPHeapMin2.constroi();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int)' ');
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin12.constroi();
    fPHeapMin12.imprime();
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin12.copia(item_array16);
    fPHeapMin9.copia(item_array16);
    fPHeapMin7.copia(item_array16);
    ds.Item item21 = null;
    ds.Item[] item_array22 = new ds.Item[] { item21 };
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array22);
    fPHeapMin23.constroi();
    fPHeapMin23.imprime();
    ds.Item item26 = null;
    ds.Item[] item_array27 = new ds.Item[] { item26 };
    ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(item_array27);
    fPHeapMin23.copia(item_array27);
    ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(item_array27);
    fPHeapMin7.copia(item_array27);
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(item_array27);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((-1), (java.lang.Object)fPHeapMin32);
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
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array27);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test24"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin5.constroi();
    fPHeapMin5.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin5.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)fPHeapMin5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test25"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int)' ');
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    fPHeapMin9.constroi();
    fPHeapMin9.imprime();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array13);
    fPHeapMin9.copia(item_array13);
    fPHeapMin6.copia(item_array13);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array13);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave((int)'4', (java.lang.Object)fPHeapMin17);
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
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test26"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.constroi();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    fPHeapMin2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test27"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test28"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin5.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)0, (java.lang.Object)fPHeapMin5);
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test29"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)(-1));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test30"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)100);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test31"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin5.constroi();
    fPHeapMin5.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin5.copia(item_array9);
    fPHeapMin2.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item13 = fPHeapMin2.min();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test32"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test33"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)fPHeapMin5);
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
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test34"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array6);
    ds.Item item10 = null;
    ds.Item[] item_array11 = new ds.Item[] { item10 };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array14);
    fPHeapMin15.constroi();
    fPHeapMin15.imprime();
    ds.Item item18 = null;
    ds.Item[] item_array19 = new ds.Item[] { item18 };
    ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(item_array19);
    fPHeapMin15.copia(item_array19);
    fPHeapMin12.copia(item_array19);
    fPHeapMin9.copia(item_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test35"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin4.constroi();
    fPHeapMin4.imprime();
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    fPHeapMin4.copia(item_array8);
    fPHeapMin1.copia(item_array8);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item13 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test36"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.Item item3 = null;
    ds.Item[] item_array4 = new ds.Item[] { item3 };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin5.constroi();
    fPHeapMin5.imprime();
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin5.copia(item_array9);
    fPHeapMin2.copia(item_array9);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.diminuiChave(0, (java.lang.Object)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test37"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.imprime();
    ds.Item item5 = null;
    ds.Item[] item_array6 = new ds.Item[] { item5 };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin2.copia(item_array6);
    fPHeapMin2.constroi();
    fPHeapMin2.constroi();
    fPHeapMin2.constroi();
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array13);
    fPHeapMin14.constroi();
    fPHeapMin14.constroi();
    ds.Item item17 = null;
    ds.Item[] item_array18 = new ds.Item[] { item17 };
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array18);
    fPHeapMin14.copia(item_array18);
    fPHeapMin2.copia(item_array18);
    ds.Item item22 = null;
    ds.Item[] item_array23 = new ds.Item[] { item22 };
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array23);
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array26);
    fPHeapMin27.constroi();
    fPHeapMin27.imprime();
    ds.Item item30 = null;
    ds.Item[] item_array31 = new ds.Item[] { item30 };
    ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(item_array31);
    fPHeapMin27.copia(item_array31);
    fPHeapMin24.copia(item_array31);
    fPHeapMin2.copia(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test38"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test39"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.refaz((int)(byte)10, 0);
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int)' ');
    ds.Item item8 = null;
    ds.Item[] item_array9 = new ds.Item[] { item8 };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin10.constroi();
    fPHeapMin10.imprime();
    ds.Item item13 = null;
    ds.Item[] item_array14 = new ds.Item[] { item13 };
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array14);
    fPHeapMin10.copia(item_array14);
    fPHeapMin7.copia(item_array14);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array14);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)100, (java.lang.Object)item_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test40"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item4 = fPHeapMin2.retiraMin();
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
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test41"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item item4 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test42"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
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
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test43"); }


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
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test44"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)100);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test45"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test46"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)' ');
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array21);
    fPHeapMin17.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(item_array21);
    ds.Item item27 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin26.insere(item27);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test47"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    fPHeapMin2.constroi();
    fPHeapMin2.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMin2.min();
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
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test48"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int)' ');
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.constroi();
    fPHeapMin6.imprime();
    ds.Item item9 = null;
    ds.Item[] item_array10 = new ds.Item[] { item9 };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin6.copia(item_array10);
    fPHeapMin3.copia(item_array10);
    fPHeapMin1.copia(item_array10);
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin17.constroi();
    fPHeapMin17.imprime();
    ds.Item item20 = null;
    ds.Item[] item_array21 = new ds.Item[] { item20 };
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array21);
    fPHeapMin17.copia(item_array21);
    ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(item_array21);
    fPHeapMin1.copia(item_array21);
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array21);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test49"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)1);
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

}
