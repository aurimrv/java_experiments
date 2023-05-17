package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    fila1.item = obj_array2;
    boolean b4 = fila1.vazia();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    fila6.item = obj_array7;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    fila10.item = obj_array11;
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    fila13.item = obj_array14;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { obj_array7, 1, fila10, obj_array14, 'a' };
    fila0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

}
