package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
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

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila0.item = obj_array8;
    fila0.frente = 'a';
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila5.item = obj_array13;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)obj_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.frente = (byte)0;

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = 1;
    fila0.tras = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = fila0.item;
    int i3 = fila0.frente;
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    java.lang.Object[] obj_array7 = fila5.item;
    int i8 = fila5.frente;
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    fila0.tras = 0;
    ds.Fila fila6 = new ds.Fila();
    boolean b7 = fila6.vazia();
    java.lang.Object[] obj_array8 = null;
    fila6.item = obj_array8;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { fila6, fila10 };
    fila0.item = obj_array11;
    ds.Fila fila13 = new ds.Fila();
    boolean b14 = fila13.vazia();
    java.lang.Object[] obj_array15 = null;
    fila13.item = obj_array15;
    fila13.tras = 0;
    ds.Fila fila19 = new ds.Fila();
    boolean b20 = fila19.vazia();
    java.lang.Object[] obj_array27 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila19.item = obj_array27;
    ds.Fila fila30 = new ds.Fila();
    boolean b31 = fila30.vazia();
    java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila30.item = obj_array38;
    fila30.frente = 'a';
    java.lang.Object[] obj_array42 = fila30.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { 0, fila19, false, fila30 };
    fila0.item = obj_array43;
    java.lang.Object obj45 = null;
    fila0.enfileira(obj45);
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
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = 0;
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila5.item = obj_array13;
    fila5.frente = 'a';
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila17.item = obj_array25;
    fila5.item = obj_array25;
    fila0.enfileira((java.lang.Object)fila5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila0.item = obj_array8;
    fila0.frente = 'a';
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila12.item = obj_array20;
    fila12.frente = 'a';
    java.lang.Object[] obj_array24 = fila12.item;
    fila0.enfileira((java.lang.Object)fila12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila0.item = obj_array8;
    fila0.frente = 'a';
    java.lang.Object[] obj_array12 = fila0.item;
    int i13 = fila0.tras;
    java.lang.Object[] obj_array14 = fila0.item;
    fila0.tras = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = null;
    fila0.item = obj_array2;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila5.item = obj_array13;
    fila5.frente = 'a';
    ds.Fila fila17 = new ds.Fila();
    boolean b18 = fila17.vazia();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila17.item = obj_array25;
    fila5.item = obj_array25;
    fila0.item = obj_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test21"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 1L, '4', "", 10.0d, (short)10, (byte)1 };
    fila0.item = obj_array8;
    fila0.frente = 'a';
    java.lang.Object[] obj_array12 = fila0.item;
    int i13 = fila0.tras;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test22"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

}
