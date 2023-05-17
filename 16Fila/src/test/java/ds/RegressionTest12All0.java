package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
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
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '4'+ "'", obj4.equals('4'));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    java.lang.Object obj5 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '4'+ "'", obj5.equals('4'));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + '4'+ "'", obj4.equals('4'));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)'4');
    java.lang.Object obj16 = fila12.desenfileira();
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    java.lang.Object obj19 = fila6.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4'+ "'", obj16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '4'+ "'", obj19.equals('4'));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.enfileira((java.lang.Object)100L);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    boolean b12 = fila6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)'4');
    java.lang.Object obj16 = fila12.desenfileira();
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    boolean b19 = fila6.vazia();
    ds.Fila fila20 = new ds.Fila();
    fila20.imprime();
    fila20.enfileira((java.lang.Object)'4');
    fila20.imprime();
    boolean b25 = fila20.vazia();
    ds.Fila fila26 = new ds.Fila();
    fila26.imprime();
    fila26.enfileira((java.lang.Object)'4');
    fila26.imprime();
    fila20.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    fila32.imprime();
    fila32.enfileira((java.lang.Object)'4');
    java.lang.Object obj36 = fila32.desenfileira();
    fila32.imprime();
    fila26.enfileira((java.lang.Object)fila32);
    boolean b39 = fila26.vazia();
    fila26.imprime();
    fila26.imprime();
    fila6.enfileira((java.lang.Object)fila26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4'+ "'", obj16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '4'+ "'", obj36.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    ds.Fila fila12 = new ds.Fila();
    fila12.imprime();
    fila12.enfileira((java.lang.Object)'4');
    java.lang.Object obj16 = fila12.desenfileira();
    fila12.imprime();
    fila6.enfileira((java.lang.Object)fila12);
    boolean b19 = fila12.vazia();
    fila12.enfileira((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4'+ "'", obj16.equals('4'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)'4');
    fila6.imprime();
    fila0.enfileira((java.lang.Object)fila6);
    fila0.enfileira((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    fila0.imprime();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'4');
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

}
