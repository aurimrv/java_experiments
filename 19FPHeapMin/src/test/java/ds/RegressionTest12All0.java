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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)'a', (java.lang.Object)0.0d);
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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(short)100, (int)(byte)100);
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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin5.min();
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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMin5.retiraMin();
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    fPHeapMin5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
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
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    java.lang.Object obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)1, obj9);
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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item8 = fPHeapMin1.min();
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)100, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin5.refaz((int)(short)100, 0);
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


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    fPHeapMin3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((-1));
    fPHeapMin9.imprime();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin9.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave(10, (java.lang.Object)(short)1);
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
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz(1, (int)(byte)10);
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
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin2.min();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    fPHeapMin4.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
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
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test19"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    fPHeapMin3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((-1));
    fPHeapMin9.imprime();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin9.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)(short)10);
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
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test20"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    fPHeapMin3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)100, (java.lang.Object)1.0d);
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
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test21"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
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
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test22"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((-1));
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    fPHeapMin5.copia(item_array7);
    fPHeapMin3.copia(item_array7);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array7);
    fPHeapMin1.copia(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test23"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)10, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test24"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((-1));
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin6.copia(item_array8);
    fPHeapMin4.copia(item_array8);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave(10, (java.lang.Object)fPHeapMin4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test25"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
    fPHeapMin1.constroi();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test26"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    fPHeapMin4.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array6);
    fPHeapMin9.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test27"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)' ');
    fPHeapMin1.imprime();

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test28"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test29"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array3);
    ds.Item item6 = null;
    ds.Item[] item_array7 = new ds.Item[] { item6 };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin5.copia(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test30"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test31"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test32"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    fPHeapMin1.imprime();
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
    org.junit.Assert.assertNotNull(item_array5);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test33"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    fPHeapMin3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((-1));
    ds.Item item12 = null;
    ds.Item[] item_array13 = new ds.Item[] { item12 };
    fPHeapMin11.copia(item_array13);
    fPHeapMin9.copia(item_array13);
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array13);
    fPHeapMin1.copia(item_array13);
    ds.Item item18 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item18);
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
    org.junit.Assert.assertNotNull(item_array13);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test34"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array5);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((-1));
    fPHeapMin12.imprime();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMin12.copia(item_array14);
    fPHeapMin10.copia(item_array14);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((-1));
    fPHeapMin18.imprime();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMin18.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin8.copia(item_array20);
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array20);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin25.refaz((int)(short)10, (int)'#');
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
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test35"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    fPHeapMin4.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item10 = fPHeapMin1.min();
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test36"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)100);
    fPHeapMin1.refaz(0, (int)(byte)(-1));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test37"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.Item[] item_array3 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array3);
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((-1));
    fPHeapMin9.imprime();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin9.copia(item_array11);
    fPHeapMin7.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((-1));
    fPHeapMin15.imprime();
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMin15.copia(item_array17);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array17);
    fPHeapMin7.copia(item_array17);
    fPHeapMin1.copia(item_array17);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test38"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    fPHeapMin4.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMin4.copia(item_array6);
    fPHeapMin1.copia(item_array6);
    fPHeapMin1.imprime();
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((-1));
    ds.Item item15 = null;
    ds.Item[] item_array16 = new ds.Item[] { item15 };
    fPHeapMin14.copia(item_array16);
    fPHeapMin12.copia(item_array16);
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array16);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((-1));
    fPHeapMin23.imprime();
    ds.Item[] item_array25 = new ds.Item[] {  };
    fPHeapMin23.copia(item_array25);
    fPHeapMin21.copia(item_array25);
    ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((-1));
    fPHeapMin29.imprime();
    ds.Item[] item_array31 = new ds.Item[] {  };
    fPHeapMin29.copia(item_array31);
    ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(item_array31);
    fPHeapMin21.copia(item_array31);
    fPHeapMin19.copia(item_array31);
    fPHeapMin1.copia(item_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array31);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test39"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((-1));
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin6.copia(item_array8);
    fPHeapMin4.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array8);
    fPHeapMin1.copia(item_array8);
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item14 = fPHeapMin1.retiraMin();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test40"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    java.lang.Object obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)' ', obj9);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test41"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    ds.Item item4 = null;
    ds.Item[] item_array5 = new ds.Item[] { item4 };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array5);
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((-1));
    fPHeapMin12.imprime();
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMin12.copia(item_array14);
    fPHeapMin10.copia(item_array14);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((-1));
    fPHeapMin18.imprime();
    ds.Item[] item_array20 = new ds.Item[] {  };
    fPHeapMin18.copia(item_array20);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array20);
    fPHeapMin10.copia(item_array20);
    fPHeapMin8.copia(item_array20);
    ds.Item item25 = null;
    ds.Item[] item_array26 = new ds.Item[] { item25 };
    fPHeapMin8.copia(item_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array26);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test42"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)100);
    ds.Item item2 = null;
    ds.Item[] item_array3 = new ds.Item[] { item2 };
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(item_array3);
    fPHeapMin1.copia(item_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array3);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test43"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    fPHeapMin1.imprime();
    fPHeapMin1.refaz((int)(byte)0, (int)(short)(-1));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test44"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    fPHeapMin1.imprime();
    ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((-1));
    ds.Item item7 = null;
    ds.Item[] item_array8 = new ds.Item[] { item7 };
    fPHeapMin6.copia(item_array8);
    fPHeapMin4.copia(item_array8);
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array8);
    fPHeapMin1.copia(item_array8);
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((-1));
    fPHeapMin14.imprime();
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((-1));
    fPHeapMin17.imprime();
    ds.Item[] item_array19 = new ds.Item[] {  };
    fPHeapMin17.copia(item_array19);
    fPHeapMin14.copia(item_array19);
    ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(item_array19);
    fPHeapMin1.copia(item_array19);
    ds.Item item24 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item24);
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
    org.junit.Assert.assertNotNull(item_array19);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test45"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((-1));
    fPHeapMin3.imprime();
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMin3.copia(item_array5);
    fPHeapMin1.copia(item_array5);
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((-1));
    fPHeapMin9.imprime();
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMin9.copia(item_array11);
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array11);
    fPHeapMin1.copia(item_array11);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item17 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test46"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(byte)100);
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
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

}
