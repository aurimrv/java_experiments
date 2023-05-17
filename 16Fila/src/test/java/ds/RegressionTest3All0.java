package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj11 = fila6.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    fila6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    fila0.enfileira((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.imprime();
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    java.lang.Object obj11 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = new java.lang.Object();
    fila0.enfileira(obj1);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)(short)1);
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f+ "'", obj5.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    boolean b4 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1.0f);
    java.lang.Object obj5 = null;
    fila0.enfileira(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = new java.lang.Object();
    fila0.enfileira(obj1);
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.enfileira((java.lang.Object)1.0f);
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object obj9 = new java.lang.Object();
    fila8.enfileira(obj9);
    boolean b11 = fila8.vazia();
    fila3.enfileira((java.lang.Object)fila8);
    java.lang.Object obj13 = fila8.desenfileira();
    fila0.enfileira((java.lang.Object)fila8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = new java.lang.Object();
    fila0.enfileira(obj1);
    java.lang.Object obj3 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj3);

  }

}
