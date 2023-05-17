package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100L+ "'", obj8.equals(100L));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100L+ "'", obj8.equals(100L));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    fila0.imprime();
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(-1L));
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    java.lang.Object obj7 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L+ "'", obj7.equals(100L));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(-1L));
    boolean b11 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)10);
    java.lang.Object obj4 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short)10+ "'", obj4.equals((short)10));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100.0f);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    boolean b7 = fila0.vazia();
    fila0.enfileira((java.lang.Object)false);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)100L);
    fila0.enfileira((java.lang.Object)100L);
    java.lang.Object obj6 = fila0.desenfileira();
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));

  }

}
