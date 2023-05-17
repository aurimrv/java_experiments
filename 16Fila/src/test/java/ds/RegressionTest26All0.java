package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    ds.Fila fila7 = new ds.Fila();
    fila7.enfileira((java.lang.Object)'4');
    fila7.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj12 = fila7.desenfileira();
    fila7.imprime();
    boolean b14 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4'+ "'", obj6.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '4'+ "'", obj12.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(short)0);
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)'4');
    fila6.enfileira((java.lang.Object)10.0f);
    boolean b11 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    fila6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    fila0.imprime();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)'4');
    fila6.enfileira((java.lang.Object)10.0f);
    boolean b11 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    java.lang.Object obj13 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4'+ "'", obj13.equals('4'));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.imprime();
    boolean b7 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b5 = fila0.vazia();
    java.lang.Object obj6 = fila0.desenfileira();
    ds.Fila fila7 = new ds.Fila();
    fila7.enfileira((java.lang.Object)'4');
    fila7.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj12 = fila7.desenfileira();
    fila7.imprime();
    boolean b14 = fila7.vazia();
    fila0.enfileira((java.lang.Object)fila7);
    fila7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '4'+ "'", obj6.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '4'+ "'", obj12.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.imprime();
    boolean b7 = fila0.vazia();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)10.0f);
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)'4');
    fila6.enfileira((java.lang.Object)10.0f);
    boolean b11 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    fila6.enfileira((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

}
