package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object obj3 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    int i4 = fila0.tras;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    fila0.enfileira((java.lang.Object)100L);
    fila0.tras = (short)(-1);
    java.lang.Object obj8 = fila0.desenfileira();
    java.lang.Object obj9 = fila0.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)fila10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    fila0.frente = (short)100;
    java.lang.Object[] obj_array10 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    fila0.frente = (short)100;
    fila0.frente = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    boolean b8 = fila0.vazia();
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
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    fila0.enfileira((java.lang.Object)100L);
    fila0.tras = (short)(-1);
    java.lang.Object obj8 = fila0.desenfileira();
    fila0.tras = (byte)10;
    fila0.frente = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    int i4 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    fila0.frente = (short)100;
    boolean b10 = fila0.vazia();
    int i11 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    fila0.frente = 10;
    fila0.frente = 1;
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = '#';
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila8.item = obj_array14;
    fila8.frente = (short)100;
    boolean b18 = fila8.vazia();
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)b18);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    boolean b8 = fila0.vazia();
    int i9 = fila0.frente;
    ds.Fila fila10 = new ds.Fila();
    fila10.frente = '#';
    int i13 = fila10.tras;
    ds.Fila fila14 = new ds.Fila();
    fila14.frente = '#';
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila14.item = obj_array20;
    fila10.item = obj_array20;
    fila0.item = obj_array20;
    fila0.tras = '#';
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    int i3 = fila0.tras;
    int i4 = fila0.tras;
    int i5 = fila0.frente;
    boolean b6 = fila0.vazia();
    fila0.enfileira((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = '#';
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila3.item = obj_array9;
    fila0.item = obj_array9;
    ds.Fila fila12 = new ds.Fila();
    fila12.frente = '#';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila12.item = obj_array18;
    fila12.frente = (short)100;
    java.lang.Object[] obj_array22 = fila12.item;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { fila12 };
    fila0.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = '#';
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila1.item = obj_array7;
    boolean b9 = fila1.vazia();
    int i10 = fila1.frente;
    ds.Fila fila11 = new ds.Fila();
    fila11.frente = '#';
    int i14 = fila11.tras;
    ds.Fila fila15 = new ds.Fila();
    fila15.frente = '#';
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila15.item = obj_array21;
    fila11.item = obj_array21;
    fila1.item = obj_array21;
    fila0.item = obj_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = '#';
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila0.item = obj_array6;
    boolean b8 = fila0.vazia();
    int i9 = fila0.frente;
    ds.Fila fila10 = new ds.Fila();
    fila10.frente = '#';
    int i13 = fila10.tras;
    ds.Fila fila14 = new ds.Fila();
    fila14.frente = '#';
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila14.item = obj_array20;
    fila10.item = obj_array20;
    fila0.item = obj_array20;
    ds.Fila fila24 = new ds.Fila();
    fila24.frente = '#';
    ds.Fila fila27 = new ds.Fila();
    fila27.frente = '#';
    java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, 10.0f, (byte)10 };
    fila27.item = obj_array33;
    fila24.item = obj_array33;
    fila0.item = obj_array33;
    int i37 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = 'a';

  }

}
