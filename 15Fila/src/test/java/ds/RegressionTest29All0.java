package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)0.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    fila1.item = obj_array2;
    boolean b4 = fila1.vazia();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    fila6.item = obj_array7;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    fila10.item = obj_array11;
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    fila13.item = obj_array14;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { obj_array7, 1, fila10, obj_array14, 'a' };
    fila0.item = obj_array7;
    boolean b19 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    fila1.item = obj_array2;
    boolean b4 = fila1.vazia();
    fila0.enfileira((java.lang.Object)fila1);
    int i6 = fila1.frente;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = fila1.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 1;
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    fila1.item = obj_array2;
    boolean b4 = fila1.vazia();
    fila0.enfileira((java.lang.Object)fila1);
    int i6 = fila1.frente;
    ds.Fila fila7 = new ds.Fila();
    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    fila7.item = obj_array8;
    boolean b10 = fila7.vazia();
    int i11 = fila7.tras;
    fila7.imprime();
    fila7.tras = (short)(-1);
    java.lang.Object[] obj_array15 = fila7.item;
    fila1.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.imprime();
    fila0.tras = (short)(-1);
    java.lang.Object[] obj_array8 = fila0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    int i2 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    java.lang.Object[] obj_array3 = null;
    fila0.item = obj_array3;
    boolean b5 = fila0.vazia();
    fila0.tras = '4';
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 1;
    int i4 = fila0.frente;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)(short)100);
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
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    fila8.item = obj_array9;
    boolean b11 = fila8.vazia();
    int i12 = fila8.tras;
    fila8.frente = '#';
    int i15 = fila8.tras;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)fila8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    ds.Fila fila7 = new ds.Fila();
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    fila8.item = obj_array9;
    boolean b11 = fila8.vazia();
    fila7.enfileira((java.lang.Object)fila8);
    ds.Fila fila13 = new ds.Fila();
    ds.Fila fila14 = new ds.Fila();
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    fila14.item = obj_array15;
    boolean b17 = fila14.vazia();
    fila13.enfileira((java.lang.Object)fila14);
    ds.Fila fila19 = new ds.Fila();
    ds.Fila fila20 = new ds.Fila();
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    fila20.item = obj_array21;
    boolean b23 = fila20.vazia();
    fila19.enfileira((java.lang.Object)fila20);
    ds.Fila fila25 = new ds.Fila();
    java.lang.Object[] obj_array26 = new java.lang.Object[] {  };
    fila25.item = obj_array26;
    ds.Fila fila29 = new ds.Fila();
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    fila29.item = obj_array30;
    ds.Fila fila32 = new ds.Fila();
    java.lang.Object[] obj_array33 = new java.lang.Object[] {  };
    fila32.item = obj_array33;
    java.lang.Object[] obj_array36 = new java.lang.Object[] { obj_array26, 1, fila29, obj_array33, 'a' };
    fila19.item = obj_array26;
    fila14.item = obj_array26;
    fila7.item = obj_array26;
    fila0.item = obj_array26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    java.lang.Object[] obj_array3 = null;
    fila0.item = obj_array3;
    ds.Fila fila5 = new ds.Fila();
    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    fila5.item = obj_array6;
    boolean b8 = fila5.vazia();
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)fila5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    fila0.item = obj_array1;
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    fila0.frente = '#';
    boolean b7 = fila0.vazia();
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
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

}
