package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
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
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    fila8.imprime();
    fila0.enfileira((java.lang.Object)fila8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = 1;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)false);
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

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;
    int i5 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i7 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = 1;
    java.lang.Object obj5 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    fila0.frente = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    java.lang.Object[] obj_array3 = fila0.item;
    fila0.enfileira((java.lang.Object)(byte)1);
    int i6 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.frente;
    fila0.frente = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;
    fila0.tras = (byte)1;
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = 1;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    fila0.tras = 0;
    boolean b10 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    java.lang.Object[] obj_array7 = fila0.item;
    fila0.enfileira((java.lang.Object)1L);
    java.lang.Object obj10 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L+ "'", obj10.equals(1L));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 10;
    fila0.frente = (byte)10;
    fila0.frente = (byte)100;

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila8.item = obj_array13;
    fila0.item = obj_array13;
    fila0.enfileira((java.lang.Object)'4');
    ds.Fila fila18 = new ds.Fila();
    fila18.imprime();
    fila18.imprime();
    ds.Fila fila21 = new ds.Fila();
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila21.item = obj_array26;
    fila18.item = obj_array26;
    fila0.item = obj_array26;
    fila0.frente = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila0.item = obj_array5;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0f, 10.0d, 1.0f, (byte)10 };
    fila8.item = obj_array13;
    fila0.item = obj_array13;
    fila0.enfileira((java.lang.Object)'4');
    java.lang.Object[] obj_array18 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

}
