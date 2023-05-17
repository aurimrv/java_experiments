package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1, lista2, 10L, (-1), 10 };
    lista0.item = obj_array7;
    int i9 = lista0.ultimo;
    lista0.ultimo = (byte)10;
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
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1, lista2, 10L, (-1), 10 };
    lista0.item = obj_array7;
    int i9 = lista0.ultimo;
    lista0.ultimo = (byte)10;
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
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)(-1));
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1, lista2, 10L, (-1), 10 };
    lista0.item = obj_array7;
    int i9 = lista0.ultimo;
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    lista0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1, lista2, 10L, (-1), 10 };
    lista0.item = obj_array7;
    int i9 = lista0.ultimo;
    lista0.pos = 'a';
    java.lang.Object[] obj_array14 = new java.lang.Object[] { '#', 10.0d };
    lista0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

}
