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

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i3 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test5"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = ' ';

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test6"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test7"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)100.0d);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test8"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test9"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.tras = (short)10;
    java.lang.Object obj9 = fila0.desenfileira();
    fila0.tras = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0f+ "'", obj9.equals(10.0f));

  }

}
