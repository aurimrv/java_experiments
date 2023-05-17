package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila2);
    boolean b4 = fila2.vazia();
    fila2.enfileira((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila2.enfileira((java.lang.Object)fila4);
    java.lang.Object obj6 = fila2.desenfileira();
    fila0.enfileira((java.lang.Object)fila2);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila2);
    boolean b4 = fila2.vazia();
    boolean b5 = fila2.vazia();
    boolean b6 = fila2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila2);
    java.lang.Object obj4 = fila0.desenfileira();
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
    org.junit.Assert.assertNotNull(obj4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    fila2.imprime();
    ds.Fila fila4 = new ds.Fila();
    fila2.enfileira((java.lang.Object)fila4);
    java.lang.Object obj6 = fila2.desenfileira();
    fila0.enfileira((java.lang.Object)fila2);
    fila2.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila2 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila2);
    boolean b4 = fila2.vazia();
    fila2.enfileira((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = null;
    fila0.enfileira(obj1);
    // The following exception was thrown during execution in test generation
    try {
    fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    boolean b5 = fila0.vazia();
    fila0.enfileira((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    fila3.enfileira((java.lang.Object)(byte)1);
    fila0.enfileira((java.lang.Object)(byte)1);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(byte)1);
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)1+ "'", obj4.equals((byte)1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    java.lang.Object obj3 = null;
    fila0.enfileira(obj3);
    ds.Fila fila5 = new ds.Fila();
    fila5.imprime();
    ds.Fila fila7 = new ds.Fila();
    fila5.enfileira((java.lang.Object)fila7);
    java.lang.Object obj9 = fila5.desenfileira();
    fila0.enfileira(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

}
