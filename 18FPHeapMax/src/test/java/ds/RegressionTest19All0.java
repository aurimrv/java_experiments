package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test01"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test02"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test03"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test05"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test06"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz(1, (-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test07"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    fPHeapMax1.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test08"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item2 = fPHeapMax1.max();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test09"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test11"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array6 = new ds.Item[] {  };
    fPHeapMax5.copia(item_array6);
    fPHeapMax1.copia(item_array6);
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
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test12"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'#', (int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test13"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test14"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test15"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(byte)(-1), (int)(byte)0);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test16"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.Item item4 = fPHeapMax1.max();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test17"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)10, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test18"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
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
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test19"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
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
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test20"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array5 = new ds.Item[] {  };
    fPHeapMax4.copia(item_array5);
    ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array9 = new ds.Item[] {  };
    fPHeapMax8.copia(item_array9);
    fPHeapMax4.copia(item_array9);
    fPHeapMax1.copia(item_array9);
    fPHeapMax1.imprime();
    ds.Item item14 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item14);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test21"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    fPHeapMax1.imprime();

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test22"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test23"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.imprime();
    fPHeapMax1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test24"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(byte)10, (int)(byte)(-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test25"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'#', (int)(short)(-1));
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test26"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(byte)10, (int)(byte)(-1));
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array10 = new ds.Item[] {  };
    fPHeapMax9.copia(item_array10);
    ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array14 = new ds.Item[] {  };
    fPHeapMax13.copia(item_array14);
    fPHeapMax9.copia(item_array14);
    fPHeapMax6.copia(item_array14);
    fPHeapMax1.copia(item_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array14);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test27"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)'4', (int)' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test28"); }


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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test29"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(10);
    fPHeapMax7.imprime();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMax14.copia(item_array15);
    fPHeapMax10.copia(item_array15);
    fPHeapMax7.copia(item_array15);
    fPHeapMax4.copia(item_array15);
    fPHeapMax1.copia(item_array15);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test30"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)100);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test31"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMax1.refaz((int)(short)1, (int)'#');
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
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test32"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test33"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)1);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test34"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(short)(-1));
    fPHeapMax1.imprime();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test35"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    fPHeapMax1.constroi();
    fPHeapMax1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item6 = fPHeapMax1.max();
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
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test36"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array2 = new ds.Item[] {  };
    fPHeapMax1.copia(item_array2);
    ds.Item item4 = fPHeapMax1.max();
    ds.Item item5 = fPHeapMax1.max();
    ds.Item item6 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item6);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test37"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'4');
    ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int)'#');
    fPHeapMax3.imprime();
    ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(10);
    fPHeapMax6.imprime();
    ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
    fPHeapMax9.imprime();
    ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array13 = new ds.Item[] {  };
    fPHeapMax12.copia(item_array13);
    ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array17 = new ds.Item[] {  };
    fPHeapMax16.copia(item_array17);
    fPHeapMax12.copia(item_array17);
    fPHeapMax9.copia(item_array17);
    fPHeapMax6.copia(item_array17);
    fPHeapMax3.copia(item_array17);
    fPHeapMax1.copia(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test38"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'#');
    fPHeapMax1.refaz((int)(byte)10, (int)(byte)(-1));
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'#');
    fPHeapMax7.constroi();
    ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array11 = new ds.Item[] {  };
    fPHeapMax10.copia(item_array11);
    fPHeapMax7.copia(item_array11);
    fPHeapMax1.copia(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test39"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    fPHeapMax1.imprime();
    ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(10);
    fPHeapMax4.imprime();
    ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array8 = new ds.Item[] {  };
    fPHeapMax7.copia(item_array8);
    ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int)'#');
    ds.Item[] item_array12 = new ds.Item[] {  };
    fPHeapMax11.copia(item_array12);
    fPHeapMax7.copia(item_array12);
    fPHeapMax4.copia(item_array12);
    fPHeapMax1.copia(item_array12);
    fPHeapMax1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test40"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.refaz(0, (int)(short)(-1));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test41"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)'a');
    fPHeapMax1.constroi();
    ds.Item item3 = fPHeapMax1.max();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item3);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19All0.test42"); }


    ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int)(byte)100);
    fPHeapMax1.constroi();

  }

}
