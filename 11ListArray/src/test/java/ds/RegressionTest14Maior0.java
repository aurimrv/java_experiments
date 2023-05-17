package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array6 = new java.lang.Object[] { ' ' };
    lista0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    int i7 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    java.lang.Object[] obj_array7 = lista0.item;
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

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array5 = lista0.item;
    int i6 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

}
