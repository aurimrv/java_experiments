package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    lista0.primeiro = 100;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    int i5 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
    lista0.pos = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    // The following exception was thrown during execution in test generation
    try {
    lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

}
