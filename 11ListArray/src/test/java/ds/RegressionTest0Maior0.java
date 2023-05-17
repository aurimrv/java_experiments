package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

}
