package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila4);
    java.lang.Object obj6 = null;
    fila0.enfileira(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila4);
    fila4.imprime();
    boolean b7 = fila4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.enfileira((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)false);
    java.lang.Object obj9 = fila6.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    fila6.enfileira((java.lang.Object)fila10);
    fila0.enfileira((java.lang.Object)fila6);
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false+ "'", obj9.equals(false));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    ds.Fila fila3 = new ds.Fila();
    fila3.enfileira((java.lang.Object)false);
    java.lang.Object obj6 = fila3.desenfileira();
    fila3.imprime();
    fila0.enfileira((java.lang.Object)fila3);
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false+ "'", obj6.equals(false));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.enfileira((java.lang.Object)false);
    java.lang.Object obj4 = fila1.desenfileira();
    ds.Fila fila5 = new ds.Fila();
    fila1.enfileira((java.lang.Object)fila5);
    boolean b7 = fila5.vazia();
    fila0.enfileira((java.lang.Object)b7);
    fila0.imprime();
    boolean b10 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)false);
    java.lang.Object obj9 = fila6.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    fila6.enfileira((java.lang.Object)fila10);
    fila0.enfileira((java.lang.Object)fila6);
    boolean b13 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false+ "'", obj9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)false);
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila4);
    boolean b6 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

}
