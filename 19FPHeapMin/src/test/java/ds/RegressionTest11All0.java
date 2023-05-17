package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave(10, (java.lang.Object)0.0d);
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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(short)100, (int)' ');
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int)'#');
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)100, (java.lang.Object)'#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMin1.min();
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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin2.refaz((int)(byte)10, 1);
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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)' ', (java.lang.Object)1.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item item15 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item15);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin15.diminuiChave((-1), (java.lang.Object)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test12"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(short)1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test13"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item16 = fPHeapMin15.retiraMin();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test14"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'4');
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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test15"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)'#', (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test16"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item item7 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item7);
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

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test17"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item3 = fPHeapMin1.min();
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test18"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array5 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.imprime();
    fPHeapMin6.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    ds.Item[] item_array12 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array12);
    fPHeapMin13.imprime();
    fPHeapMin13.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin13.copia(item_array16);
    fPHeapMin6.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array16);
    ds.Item item22 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin21.insere(item22);
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
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test19"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.Item item16 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin15.insere(item16);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test20"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array6 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin7.imprime();
    fPHeapMin7.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(short)10, (java.lang.Object)fPHeapMin7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test21"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
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
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test22"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
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
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test23"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'#');
    fPHeapMin1.constroi();
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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test24"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    fPHeapMin3.constroi();
    fPHeapMin3.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test25"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item item4 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item4);
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
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test26"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin15.diminuiChave((-1), (java.lang.Object)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test27"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array5 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.imprime();
    fPHeapMin6.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    ds.Item[] item_array12 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array12);
    fPHeapMin13.imprime();
    fPHeapMin13.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin13.copia(item_array16);
    fPHeapMin6.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item21 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test28"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test29"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array15);
    ds.Item item17 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.insere(item17);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test30"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    fPHeapMin3.constroi();
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item5 = fPHeapMin3.retiraMin();
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
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test31"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array8 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(item_array8);
    fPHeapMin9.imprime();
    fPHeapMin9.constroi();
    fPHeapMin9.constroi();
    ds.Item[] item_array13 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array13);
    fPHeapMin14.imprime();
    fPHeapMin14.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array17);
    fPHeapMin14.copia(item_array17);
    ds.Item[] item_array20 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(item_array20);
    fPHeapMin21.imprime();
    fPHeapMin21.constroi();
    ds.Item[] item_array24 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(item_array24);
    fPHeapMin21.copia(item_array24);
    fPHeapMin14.copia(item_array24);
    fPHeapMin9.copia(item_array24);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.diminuiChave((int)(byte)10, (java.lang.Object)item_array24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array24);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test32"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test33"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(item_array11);
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin15.diminuiChave((int)(short)100, (java.lang.Object)fPHeapMin18);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test34"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
    ds.Item item2 = fPHeapMin1.min();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(item2);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test35"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test36"); }


    ds.Item item0 = null;
    ds.Item[] item_array1 = new ds.Item[] { item0 };
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array1);
    ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(item_array1);
    fPHeapMin3.constroi();
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin3.refaz((int)(short)(-1), (int)'4');
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
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test37"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test38"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test39"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.Item[] item_array6 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin7.imprime();
    fPHeapMin7.constroi();
    fPHeapMin7.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin12.imprime();
    fPHeapMin12.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array15);
    fPHeapMin12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array18);
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.Item[] item_array22 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array22);
    fPHeapMin19.copia(item_array22);
    fPHeapMin12.copia(item_array22);
    fPHeapMin7.copia(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    fPHeapMin1.copia(item_array22);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item30 = fPHeapMin1.min();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test40"); }


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
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test41"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.refaz((int)(byte)100, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test42"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(item_array0);
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
    org.junit.Assert.assertNotNull(item_array0);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test43"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    ds.Item[] item_array6 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin7.imprime();
    fPHeapMin7.constroi();
    fPHeapMin7.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin12.imprime();
    fPHeapMin12.constroi();
    ds.Item[] item_array15 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(item_array15);
    fPHeapMin12.copia(item_array15);
    ds.Item[] item_array18 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(item_array18);
    fPHeapMin19.imprime();
    fPHeapMin19.constroi();
    ds.Item[] item_array22 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(item_array22);
    fPHeapMin19.copia(item_array22);
    fPHeapMin12.copia(item_array22);
    fPHeapMin7.copia(item_array22);
    ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(item_array22);
    fPHeapMin5.copia(item_array22);
    fPHeapMin1.copia(item_array22);
    // The following exception was thrown during execution in test generation
    try {
    ds.Item item30 = fPHeapMin1.retiraMin();
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
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array22);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test44"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test45"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    ds.Item[] item_array4 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(item_array4);
    fPHeapMin1.copia(item_array4);
    ds.Item[] item_array7 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(item_array7);
    fPHeapMin8.imprime();
    fPHeapMin8.constroi();
    ds.Item[] item_array11 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(item_array11);
    fPHeapMin8.copia(item_array11);
    fPHeapMin1.copia(item_array11);
    ds.Item[] item_array15 = new ds.Item[] {  };
    fPHeapMin1.copia(item_array15);
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array15);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test46"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)(short)(-1));
    fPHeapMin1.imprime();

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test47"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    fPHeapMin1.imprime();
    ds.Item[] item_array6 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(item_array6);
    fPHeapMin7.imprime();
    fPHeapMin7.constroi();
    ds.Item[] item_array10 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(item_array10);
    fPHeapMin7.copia(item_array10);
    ds.Item[] item_array13 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(item_array13);
    fPHeapMin14.imprime();
    fPHeapMin14.constroi();
    ds.Item[] item_array17 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(item_array17);
    fPHeapMin14.copia(item_array17);
    fPHeapMin7.copia(item_array17);
    fPHeapMin1.copia(item_array17);
    ds.Item[] item_array22 = null;
    // The following exception was thrown during execution in test generation
    try {
    fPHeapMin1.copia(item_array22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array17);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test48"); }


    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int)'a');
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test49"); }


    ds.Item[] item_array0 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(item_array0);
    fPHeapMin1.imprime();
    fPHeapMin1.constroi();
    fPHeapMin1.constroi();
    ds.Item[] item_array5 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(item_array5);
    fPHeapMin6.imprime();
    fPHeapMin6.constroi();
    ds.Item[] item_array9 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(item_array9);
    fPHeapMin6.copia(item_array9);
    ds.Item[] item_array12 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(item_array12);
    fPHeapMin13.imprime();
    fPHeapMin13.constroi();
    ds.Item[] item_array16 = new ds.Item[] {  };
    ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(item_array16);
    fPHeapMin13.copia(item_array16);
    fPHeapMin6.copia(item_array16);
    fPHeapMin1.copia(item_array16);
    fPHeapMin1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(item_array16);

  }

}
