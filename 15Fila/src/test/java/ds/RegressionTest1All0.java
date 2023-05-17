package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
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
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila0.item = obj_array9;
    int i11 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test03"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    fila0.frente = (byte)0;
    int i5 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    fila0.frente = (byte)0;
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    boolean b7 = fila5.vazia();
    java.lang.Object[] obj_array8 = fila5.item;
    fila0.item = obj_array8;
    fila0.tras = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    fila0.frente = (byte)0;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array2 = fila0.item;
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = (byte)100;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)100.0d);
    int i4 = fila0.tras;
    fila0.tras = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila0.item = obj_array9;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    fila11.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila11.item = obj_array20;
    fila11.frente = (short)100;
    java.lang.Object[] obj_array24 = fila11.item;
    fila0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.tras;
    fila4.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila4.item = obj_array13;
    fila4.frente = (short)100;
    java.lang.Object[] obj_array17 = fila4.item;
    fila0.enfileira((java.lang.Object)fila4);
    java.lang.Object[] obj_array19 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (short)(-1);
    java.lang.Object[] obj_array4 = null;
    fila0.item = obj_array4;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    fila6.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila6.item = obj_array15;
    fila0.item = obj_array15;
    fila0.tras = (short)0;
    java.lang.Object[] obj_array20 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (short)(-1);
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.tras;
    fila4.frente = (short)(-1);
    java.lang.Object[] obj_array8 = null;
    fila4.item = obj_array8;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    fila10.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila10.item = obj_array19;
    fila4.item = obj_array19;
    fila4.tras = (short)0;
    fila0.enfileira((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.tras;
    fila4.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila4.item = obj_array13;
    fila4.frente = (short)100;
    java.lang.Object[] obj_array17 = fila4.item;
    fila0.enfileira((java.lang.Object)fila4);
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    fila19.frente = (short)(-1);
    fila0.enfileira((java.lang.Object)fila19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array2 = fila0.item;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila0.item = obj_array9;
    fila0.frente = (short)100;
    fila0.tras = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d, '4', (byte)(-1), '4', (byte)100 };
    fila0.item = obj_array9;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

}
