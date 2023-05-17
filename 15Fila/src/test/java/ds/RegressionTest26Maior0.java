package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    // The following exception was thrown during execution in test generation
    try {
    fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    fila0.frente = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.frente = ' ';
    int i18 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26Maior0.test8"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
