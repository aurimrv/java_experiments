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


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (-1);
    lista0.pos = (byte)0;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.primeiro = ' ';

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)100.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    boolean b7 = lista0.vazia();
    lista0.pos = (short)10;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    java.lang.Object[] obj_array7 = lista0.item;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
