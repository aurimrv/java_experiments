package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    java.lang.Object obj4 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10+ "'", obj4.equals(10));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();
    java.lang.Object obj4 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10+ "'", obj4.equals(10));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10+ "'", obj6.equals(10));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10+ "'", obj6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)10);
    java.lang.Object obj7 = fila0.desenfileira();
    java.lang.Object obj8 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10+ "'", obj7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10+ "'", obj8.equals(10));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10+ "'", obj5.equals(10));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    ds.Fila fila3 = new ds.Fila();
    fila3.enfileira((java.lang.Object)10);
    fila3.imprime();
    boolean b7 = fila3.vazia();
    fila0.enfileira((java.lang.Object)fila3);
    fila3.imprime();
    fila3.enfileira((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    ds.Fila fila4 = new ds.Fila();
    fila4.enfileira((java.lang.Object)10);
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    boolean b3 = fila0.vazia();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    java.lang.Object obj7 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10+ "'", obj7.equals(10));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
