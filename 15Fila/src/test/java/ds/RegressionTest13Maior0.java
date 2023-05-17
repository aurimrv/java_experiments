package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
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
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)10;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.enfileira((java.lang.Object)'a');

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    java.lang.Object[] obj_array4 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    int i8 = fila0.tras;
    ds.Fila fila9 = new ds.Fila();
    fila9.enfileira((java.lang.Object)(-1.0d));
    boolean b12 = fila9.vazia();
    ds.Fila fila15 = new ds.Fila();
    fila15.enfileira((java.lang.Object)(-1.0d));
    fila15.tras = (short)0;
    fila15.imprime();
    fila15.enfileira((java.lang.Object)(short)0);
    java.lang.Object[] obj_array23 = new java.lang.Object[] { fila9, 0L, (-1), (short)0 };
    fila0.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

}
