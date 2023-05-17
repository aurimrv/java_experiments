package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
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
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
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
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = 0;
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila4.tras = (short)1;
    java.lang.Object obj7 = fila4.desenfileira();
    int i8 = fila4.tras;
    ds.Fila fila10 = new ds.Fila();
    fila10.tras = (short)1;
    java.lang.Object obj13 = fila10.desenfileira();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)10, obj13, (-1.0f) };
    fila4.item = obj_array15;
    fila0.item = obj_array15;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj18 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    int i4 = fila0.tras;
    ds.Fila fila6 = new ds.Fila();
    fila6.tras = (short)1;
    java.lang.Object obj9 = fila6.desenfileira();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, obj9, (-1.0f) };
    fila0.item = obj_array11;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj13 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    fila0.tras = (byte)10;

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    int i2 = fila0.frente;
    int i3 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    int i3 = fila0.tras;
    boolean b4 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    fila0.enfileira((java.lang.Object)(byte)10);
    fila0.frente = 1;

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    int i4 = fila0.tras;
    ds.Fila fila6 = new ds.Fila();
    fila6.tras = (short)1;
    java.lang.Object obj9 = fila6.desenfileira();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, obj9, (-1.0f) };
    fila0.item = obj_array11;
    java.lang.Object[] obj_array13 = fila0.item;
    fila0.frente = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    fila0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    fila0.enfileira((java.lang.Object)100);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    ds.Fila fila4 = new ds.Fila();
    fila4.tras = (short)1;
    java.lang.Object obj7 = fila4.desenfileira();
    int i8 = fila4.tras;
    ds.Fila fila10 = new ds.Fila();
    fila10.tras = (short)1;
    java.lang.Object obj13 = fila10.desenfileira();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)10, obj13, (-1.0f) };
    fila4.item = obj_array15;
    fila0.item = obj_array15;
    int i18 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    fila0.enfileira((java.lang.Object)1L);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    int i3 = fila0.tras;
    ds.Fila fila4 = new ds.Fila();
    fila4.tras = (short)1;
    java.lang.Object obj7 = fila4.desenfileira();
    int i8 = fila4.tras;
    ds.Fila fila10 = new ds.Fila();
    fila10.tras = (short)1;
    java.lang.Object obj13 = fila10.desenfileira();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)10, obj13, (-1.0f) };
    fila4.item = obj_array15;
    fila0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = 10;

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.imprime();
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test21"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    int i4 = fila0.tras;
    ds.Fila fila6 = new ds.Fila();
    fila6.tras = (short)1;
    java.lang.Object obj9 = fila6.desenfileira();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, obj9, (-1.0f) };
    fila0.item = obj_array11;
    java.lang.Object[] obj_array13 = fila0.item;
    java.lang.Object[] obj_array14 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test22"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    java.lang.Object obj3 = fila0.desenfileira();
    int i4 = fila0.tras;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test23"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test24"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    fila0.enfileira((java.lang.Object)(byte)10);
    int i5 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test25"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)1;
    int i3 = fila0.tras;
    fila0.enfileira((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

}
